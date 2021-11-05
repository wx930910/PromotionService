package Services;

import DataObjects.Client;
import Utils.ServiceUtilities;

import javax.inject.Inject;

public class SendPromotionService
{

  @Inject
  private ServiceUtilities clientUtilities;

  /**
   * Set ServiceUtilities
   * 
   * @param clientUtilities
   */
  public void setServiceUtilities(ServiceUtilities clientUtilities)
  {
    this.clientUtilities = clientUtilities;
  }

  /**
   * 
   * Return true if successfully send out the promotion, return false otherwise.
   * 
   * @param client
   *          Client
   * @throws IneligiblePromotionException
   *           throw exception if client is not eligible for the promotion
   * @throws InvalidEmailAddressException
   *           throw exception if client's email address is invalid
   */
  public boolean sendPromotion(Client client)
  {
    if (!this.clientUtilities.eligibleForPromotion(client)) {
      return false;
    }
    if (!this.clientUtilities.validateEmailAddress(client)) {
      return false;
    }
    this.clientUtilities.sendPromotion(client);
    return true;
  }
}
