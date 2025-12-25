import java.util.*;

public class Booking {
    private List<Room> rooms = new ArrayList<>();
    private List<Guest> guests = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public List<Room> getAvailableRooms() {
        List<Room> result = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable()) {
                result.add(room);
            }
        }
        return result;
    }

    public Room findRoomByNumber(int number) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == number) {
                return room;
            }
        }
        return null;
    }

    public void sortRoomsByNumber() {
        rooms.sort(Comparator.comparingInt(Room::getRoomNumber));
    }

    public void showAllRooms() {
        for (Room room : rooms) {
            System.out.println(room);
        }
    }
}
