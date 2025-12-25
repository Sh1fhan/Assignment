import java.util.Objects;

public class Room {
    private int roomNumber;
    private int floor;
    private boolean vip;
    private int block;
    private boolean available;
    private Guest owner;

    public Room(int roomNumber, int floor, boolean vip, int block) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.vip = vip;
        this.block = block;
        this.available = true;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean isVip() {
        return vip;
    }

    public void assignOwner(Guest guest) {
        this.owner = guest;
        this.available = false;
    }

    public void freeRoom() {
        this.owner = null;
        this.available = true;
    }

    @Override
    public String toString() {
        return "Room{" +
                "number=" + roomNumber +
                ", floor=" + floor +
                ", vip=" + vip +
                ", available=" + available +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return roomNumber == room.roomNumber &&
                block == room.block;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber, block);
    }
}
