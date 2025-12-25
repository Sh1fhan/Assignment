public class Guest extends Person {
    private boolean haveRoom;
    private int residenceTime;
    private Room room;

    public Guest(String name, String surname, int age) {
        super(name, surname, age);
        this.haveRoom = false;
    }

    public void assignRoom(Room room, int residenceTime) {
        this.room = room;
        this.residenceTime = residenceTime;
        this.haveRoom = true;
        room.setOwner(this);
    }

    public Room getRoom() {
        return room;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", haveRoom=" + haveRoom +
                ", residenceTime=" + residenceTime;
    }
}
