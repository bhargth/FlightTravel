public class Passengerdetails {
    String passengerName;

    int age;
    String passportNumber;
    String bookingNumber;



    public Passengerdetails(String passengerName, int age, String passportNumber, String bookingNumber) {
        this.passengerName = passengerName;
        this.age = age;
        this.passportNumber = passportNumber;
        this.bookingNumber = bookingNumber;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public int age() {
        return age;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public void setage(int age) {
        this.age = age;
    }
}
