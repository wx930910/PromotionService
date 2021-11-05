package Services;

import DataObjects.Client;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SendPromotionServiceTest
{

  private final Client client = Client.builder().address("Phsical Address").emailAddress("emailAddress@gmail.com")
      .name("Name").build();

  /**
   * Check that sendPromotion(Client) should return false for the clients who
   * are not eligible for promotion.
   * 
   */
  @Test
  public void testSendPromotionWithIneligibleClient()
  {

  }

  /**
   * Check that sendPromotion(Client) should return false for the clients who
   * are not eligible for promotion.
   * 
   */
  @Test
  public void testSendPromotionWithInvalidEmailAddress()
  {

  }

  /**
   * Check that SendPromotionService.sendPromotion(Client) should execute
   * ServiceUtilities.sendPromotion(Client) to send a promotion to the valid
   * client and return true.
   */
  @Test
  public void testSendPromotionWithValidClient()
  {

  }

}
