public class Room extends Accomodation {
    private Boolean occupied;
    private Customer occupant;

    // Default constructor
    public Room(int roomNumber, String roomtype, String status, double rate) {
        super(roomNumber, roomtype, status, rate);
        this.occupied = false;
        this.occupant = new Customer(0, "");
    }

    // Getters and setters
    public Boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    public Customer getOccupant() {
        return occupant;
    }

    public void AssignTo(Customer customer) {
        this.occupant = customer; // customers assigns the room
        this.occupied = true;
    }// assignto

    public void print() {
        System.out.println();
        System.out.println("occupied:" + occupied);
        System.out.println("occupant: " + occupant.getName());
    }

}
