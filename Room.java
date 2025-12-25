public class Room {
    private int roomNumber;
    private int floor;
    private boolean isVip;
    private int block;
    private boolean isAvailable;
    private Guest owner;

    public Room(int roomNumber, int floor, boolean isVip, int block) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.isVip = isVip;
        this.block = block;
        this.isAvailable = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setOwner(Guest owner) {
        this.owner = owner;
        this.isAvailable = (owner == null);
    }

    public Guest getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber +
                ", floor=" + floor +
                ", VIP=" + isVip +
                ", available=" + isAvailable;
    }
}
