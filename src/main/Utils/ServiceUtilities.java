package Utils;

import DataObjects.Client;

public abstract class ServiceUtilities
{

  /**
   * Validate client's email address
   * 
   * @param client
   *          client to be validated
   * @return true if client's email address is valid, otherwise return false
   */
  public abstract boolean validateEmailAddress(Client client);

  /**
   * Check with EligibilityService to see if the client is eligible for getting
   * promotion
   * 
   * @param client
   *          client to be checked
   * @return true if the client is eligible for promotion, otherwise return
   *         false
   */
  public abstract boolean eligibleForPromotion(Client client);

  /**
   * Send promotion to client
   * 
   * @param client
   */
  public abstract void sendPromotion(Client client);

}
