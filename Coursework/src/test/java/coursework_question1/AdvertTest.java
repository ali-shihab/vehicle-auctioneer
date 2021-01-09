package coursework_question1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdvertTest {
  Car car = new Car(1234, "Ferrari F12", 200000.00, Condition.NEW);
  Advert ad = new Advert(car);
  
  @Test
  public void coursework_testGetCar() {
	  assertEquals(car, ad.getCar());
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void coursework_testInvalidCar() {
	  Advert ad1 = new Advert(null);
  }
  
  @Test
  public void coursework_testPlaceOffer() {
	  User elonMusk = new User("Elon Musk");
	  assertTrue(ad.placeOffer(elonMusk, 180000.00));
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void coursework_testPlaceInvalidOffer() {
	  User elonMusk = new User("Elon Musk");
	  ad.placeOffer(elonMusk, -180000.00);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void coursework_testPlaceDoubleOffer() {
	  User leo = new User("Leonardo DiCaprio");
	  ad.placeOffer(leo, 1650000.00);
	  ad.placeOffer(leo, 1650000.00);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void coursework_testNullBuyerOffer() {
	  ad.placeOffer(null, 1.00);
  }
 
  @Test
  public void coursework_testGetHighestOffer() {
	  User me = new User("Richest Guy");
	  ad.placeOffer(me, 200000.00);
	  assertEquals("Richest Guy offered £200000.0", ad.getHighestOffer().toString());
  }
  
  @Test
  public void coursework_testToString() {
	  car.setColour("Red");
	  car.setGearbox(CarType.MANUAL);
	  car.setBody(CarBody.SUPERCAR);
	  car.setNumberOfSeats(4);
	  assertEquals("Ad: 1234 - Ferrari F12 (£200000.00)\n\t Type: MANUAL\n\t Style: SUPERCAR\n\t Colour: Red\n\t No. of Seats: 4\n\t Condition: NEW", ad.toString());
  }
}
