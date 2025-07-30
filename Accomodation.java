public class Accomodation {
	private int roomNumber;
	private String roomtype;
	private String status;
	private double rate;

	// overloaded constructor
	public Accomodation(int roomNumber, String roomtype, String status, double rate) {
		this.roomtype = roomtype;
		this.roomNumber = roomNumber;
		this.rate = rate;
		this.status = status;

	}// Accomodation
		// getter and setter Method

	public int getRoomNumber() {
		return roomNumber;
	}// getroomnumber

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}// getroomnumber

	public String getRoomType() {
		return roomtype;
	}// get room type

	public String getStatus() {
		return status;
	}// getStatus

	public double getRate() {
		return rate;
	}// getrate

	public void setStatus(String status) {
		this.status = status;
	}// setstatus
}
