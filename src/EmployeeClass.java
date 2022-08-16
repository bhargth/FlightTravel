public class EmployeeClass {

    public static void main(String[] args) {
        EmployeeRecord employeeRecord = new EmployeeRecord("Bharghavi", 3456);
        System.out.println(employeeRecord.name()); // No need of getName and an automatic constructor is generated along with the parameters
        // toString, equals and hashCode methods also will be created
        System.out.println(employeeRecord);// toString method
        //DOESNOT GENERATE SET METHODS
        //CANNOT CHANGE THE OBJECT ONCE CREATED WITH A CERTAIN NAME AND NUMBER , WE CANNOT CHANGE.
        // RECORDS CANNOT EXTEND ANY CLASS






    }
}
