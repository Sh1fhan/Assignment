public class Guest extends Person {
    private int residenceTime;
    private Room room;

    public Guest(String name, String surname, int age) {
        super(name, surname, age);
    }

    public void bookRoom(Room room, int days) {
        this.room = room;
        this.residenceTime = days;
        room.assignOwner(this);
    }

    public Room getRoom() {
        return room;
    }

    @Override
    public String getRole() {
        return "Guest";
    }

    @Override
    public String toString() {
        return super.toString() +
                ", role=" + getRole() +
                ", days=" + residenceTime;
    }
}
