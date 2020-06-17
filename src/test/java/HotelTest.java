import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;

    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private ConferenceRoom conferenceRoom3;

    private Guest guest1;
    private Guest guest2;
    private Guest guest3;


    @Before
    public void setUp(){
        hotel = new Hotel();

        bedroom1 = new Bedroom(101, 2, "double");
        bedroom2 = new Bedroom(102, 1, "Single");
        bedroom3 = new Bedroom(103, 4, "family");

        conferenceRoom1 = new ConferenceRoom(5, "Jacaranda");
        conferenceRoom2 = new ConferenceRoom(10, "Beobab");
        conferenceRoom3 = new ConferenceRoom(6, "Mopane");

        guest1 = new Guest("Mike");
        guest2 = new Guest("Paul");
        guest3 = new Guest("Hazel");

    }


    @Test
    public void roomStartEmpty(){
    assertEquals(0, bedroom1.guestCount());
    }


    @Test
    public void canCheckInGuestToRoom(){
    hotel.checkInGuest(bedroom1, guest1);
    assertEquals(1, bedroom1.guestCount());
  }

  @Test
  public void canCheckGuestOUtOfRoom() {
      hotel.checkInGuest(bedroom2, guest2);
      hotel.checkOutGuest(bedroom2, guest2);
      assertEquals(0, bedroom2.guestCount());


  }

}
