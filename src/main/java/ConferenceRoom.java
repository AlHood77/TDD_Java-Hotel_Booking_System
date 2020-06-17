import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> guests;
    private String name;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.name = name;
    }

    public int getRoomCapacity(){
        return capacity;
    }

    public String getRoomName() {
        return name;
    }

    public int getGuestCount(){
        return this.guests.size();
    }

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest){
      this.guests.remove(guest);
    }


}
