import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferencerooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferencerooms = new ArrayList<ConferenceRoom>();
    }


    public void checkInGuest(Bedroom bedroom, Guest guest){
            bedroom.addGuest(guest);
    }

    public void checkOutGuest(Bedroom bedroom, Guest guest){
      bedroom.removeGuest(guest);
    }



}
