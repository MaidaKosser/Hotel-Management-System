import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelManagementSystem {
    public static void main(String[] args) throws ParseException {
        System.out.println("\n________Welcome to Hotel Management________\n");

        Customer customer1 = new Customer(1, "Jenny");
        Customer customer2 = new Customer(2, "izlan");
        Customer customer3 = new Customer(2, "izlan");

        Room room101 = new Room(101, "Standard", "LowerClass", 50.0);
        Room room102 = new Room(102, "Luxury", "MiddleClass", 100.0);
        Room room103 = new Room(103, "Delux", "HighClass", 150.0);

        Hotel hotel = new Hotel();

        hotel.addRoom(room101);
        hotel.addRoom(room102);
        hotel.addRoom(room103);

        hotel.displayAvailableRoooms();

        SimpleDateFormat daterformat = new SimpleDateFormat("dd-mm-yyyy");
        Date CheckInDate1 = daterformat.parse("21-08-2023");
        Date CheckOutDate1 = daterformat.parse("25-08-2023");
        Date CheckInDate2 = daterformat.parse("13-08-2023");
        Date CheckOutDate2 = daterformat.parse("16-08-2023");

        Booking booking1 = new Booking(1, customer1, room101, CheckInDate1, CheckOutDate1);
        Booking booking2 = new Booking(2, customer2, room102, CheckInDate2, CheckOutDate2);

        hotel.makeBooking(booking1);
        hotel.makeBooking(booking2);
        hotel.displayBookings();

        hotel.assignRoom(101, customer1);
        hotel.assignRoom(103, customer2);

        hotel.computerPayements();

        hotel.displayAvailableRoooms();
    }
}
