public class Main {
    public static void main(String[] args) {

        Booking booking = new Booking();

        Room r1 = new Room(101, 1, false, 1);
        Room r2 = new Room(202, 2, true, 1);
        Room r3 = new Room(103, 1, false, 1);

        booking.addRoom(r1);
        booking.addRoom(r2);
        booking.addRoom(r3);

        Guest g1 = new Guest("Shera", "Batya", 20);
        Guest g2 = new Guest("Beks", "Sharabeks", 22);

        booking.addGuest(g1);
        booking.addGuest(g2);

        g1.bookRoom(r2, 3);

        System.out.println("Available rooms:");
        for (Room r : booking.getAvailableRooms()) {
            System.out.println(r);
        }

        System.out.println("\nSorted rooms:");
        booking.sortRoomsByNumber();
        booking.showAllRooms();

        System.out.println("\nSearch room 202:");
        System.out.println(booking.findRoomByNumber(202));

        System.out.println("\nRoom comparison:");
        System.out.println(r1.equals(r3));
    }
}
