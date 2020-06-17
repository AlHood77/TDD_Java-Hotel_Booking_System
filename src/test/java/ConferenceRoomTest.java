import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;

    @Before
    public void setUp(){
        conferenceRoom = new ConferenceRoom(5, "Bennett");
        guest1 = new Guest("Helen");
        guest2 = new Guest("Bob");
        guest3 = new Guest("Elliot");
    }

    @Test
    public void canGetCapacity(){
        assertEquals(5, conferenceRoom.getRoomCapacity());
    }

    @Test
    public void canGetName(){
        assertEquals("Bennett", conferenceRoom.getRoomName());
    }

    @Test
    public void conferenceRoomStartsEmpty(){
        assertEquals(0, conferenceRoom.getGuestCount());
    }


}
