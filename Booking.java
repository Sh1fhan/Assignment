public class Booking {
    private Room[] allRooms;
    private Guest[] allGuests;

    public Booking(Room[] allRooms, Guest[] allGuests) {
        this.allRooms = allRooms;
        this.allGuests = allGuests;
    }

    public void showAvailableRooms() {
        for (Room room : allRooms) {
            if (room.isAvailable()) {
                System.out.println(room);
            }
        }
    }
}
