import java.util.Date;

public class Booking {
    private int bookingId;
    private Customer customer;
    private Room bookedRoom;
    private Date checkInDate;
    private Date checkOutDate;

    public Booking(int bookingId, Customer customer, Room r, Date checkInDate, Date checkOutDate) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.bookedRoom = r;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public boolean isOverlapping(Booking otherBooking) {
        return checkInDate.before(otherBooking.getCheckOutDate()) &&
                otherBooking.getCheckInDate().before(checkOutDate);

    }

    public boolean isValid() {
        Date currentDate = new Date();
        return currentDate.before(checkInDate);
    }

    public boolean isLongStay() {
        long duration = checkOutDate.getTime() - checkInDate.getTime();
        return duration >= 7 * 24 * 60 * 60 * 1000;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getBookedRoom() { // customer booked the room
        return bookedRoom;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }
}
