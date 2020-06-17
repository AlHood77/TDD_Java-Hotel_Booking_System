import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BedroomTest {

  private Bedroom bedroom;
  private Guest guest1;
  private Guest guest2;
  private Guest guest3;

  @Before
  public void before(){
    bedroom = new Bedroom(101, 3, "double");
    guest1 = new Guest("Dave");
    guest2 = new Guest("Sandra");
    guest3 = new Guest("Brian");
  }

  @Test
  public void canGetRoomNumber(){
    assertEquals(101, bedroom.getRoomNumber());
  }

  @Test
  public void canGetCapacity(){
    assertEquals(3, bedroom.getRoomCapacity());
  }

  @Test
  public void canGetRoomType(){
    assertEquals("double", bedroom.canGetRoomType());
  }

  @Test
  public void roomStartEmpty(){
    assertEquals(0, bedroom.guestCount());
  }



  @Test public void canAddGuestToRoom(){
    bedroom.addGuest(guest1);
    assertEquals(1, bedroom.guestCount());
  }

  @Test public void canRemoveGuestFromRoom(){
    bedroom.addGuest(guest1);
    bedroom.removeGuest(guest1);
    assertEquals(0, bedroom.guestCount());
  }

  @Test
  public void canCheckRoomIsFull(){
    bedroom.addGuest(guest1);
    bedroom.addGuest(guest2);
    bedroom.addGuest(guest3);
    assertTrue(bedroom.bedroomFull());
  }






}
