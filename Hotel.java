import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {
    private List<Room> rooms;
    private Map<Integer, Customer> guest;
    private List<Booking> bookings;

    public Hotel() {
        rooms = new ArrayList<>();
        guest = new HashMap<>();
        bookings = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
        System.out.println("Room " + room.getRoomNumber() + " has been added in the hotel.");
    }

    public void assignRoom(int roomNumber, Customer guest) {

        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                if (!room.isOccupied()) {
                    room.AssignTo(guest);
                    guest.put(guest.getID(), guest);
                    System.out.println(
                            "Room " + roomNumber + "(" + room.getRoomType() + ") " + "assigned to " + guest.getName()
                                    + ".");
                } else {
                    System.out.println("Room " + roomNumber + " is already booked.");
                }
                return;
            }
        }
        System.out.println("Room " + roomNumber + "does not exist in te Hotel.");
    }

    public void displayAvailableRoooms() {
        System.out.println("\nAvailable Rooms are:");
        for (Room room : rooms) {
            if (!room.isOccupied()) {
                System.out.println(
                        "Room " + room.getRoomNumber() + " (" + room.getRoomType() + ")" + " for $" + room.getRate());
            }
        }
    }

    public void computerPayements() {
        System.out.println("\n\npayments pending: ");
        for (Booking booking : bookings) {
            Customer customer = booking.getCustomer();
            Room room = booking.getBookedRoom();

            double rate = room.getRate();
            Date CheckInDate = booking.getCheckInDate();
            Date CheckOutDate = booking.getCheckOutDate();

            Long duration = CheckOutDate.getTime() - CheckInDate.getTime();
            duration = duration / (1000 * 60 * 60 * 24);

            double totalPayement = duration * rate;

            System.out.println(customer.getName() + " has to pay $" + totalPayement + " (The rent for " + duration
                    + " days for room " + room.getRoomType() + ")");
        }
    }

    public void makeBooking(Booking booking) {

        bookings.add(booking);
    }

    public void displayBookings() {
        System.out.println();
        System.out.println("Bookings :");
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        for (Booking booking : bookings) {
            Customer customer = booking.getCustomer();
            Room room = booking.getBookedRoom();
            String checkInDate = dateformat.format(booking.getCheckInDate());
            String checkOutDate = dateformat.format(booking.getCheckOutDate());
            System.out.println(customer.getName() + " has booked room "
                    + room.getRoomNumber() + " from " + checkInDate + " to " + checkOutDate + ".");

        }
        System.out.println();
    }
}