public class Main {
    public static void main(String[] args) {

        Room room1 = new Room(101, 1, false, 1);
        Room room2 = new Room(202, 2, true, 2);

        Guest guest1 = new Guest("Shera", "Batya", 20);
        Guest guest2 = new Guest("Beks", "Sharabeks", 22);

        guest1.assignRoom(room1, 5);

        System.out.println(room1);
        System.out.println(room2);

        System.out.println(guest1);
        System.out.println(guest2);

        if (room1.isAvailable() == room2.isAvailable()) {
            System.out.println("Rooms have same availability");
        } else {
            System.out.println("Rooms have different availability");
        }
    }
}
