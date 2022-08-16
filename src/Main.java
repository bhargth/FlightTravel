

import java.util.Scanner;
import java.util.Random;

public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        getUserDetails();

    }

    static void getUserDetails(){
        System.out.println("Please enter the Passenger details \n\t Name: ");
        String name = scanner.nextLine();
        System.out.println("Age: ");
        int age = scanner.nextInt();

        if(age < 12){
            System.out.println("You are not allowed to travel alone");
            return;
        }
        scanner.nextLine();

        System.out.println("Passport Number :");
        String passportNumber = scanner.nextLine();

        System.out.println("Booking Number :");
        String bookingNumber = scanner.nextLine();

        Passengerdetails passenger = new Passengerdetails(name, age, passportNumber, bookingNumber);
        System.out.println("Below are the Passenger Details");
        System.out.println("Name: " + passenger.passengerName + "\nAge: " + passenger.age + "\nPassport NUmber: " + passenger.passportNumber);
        checkIn();

    }

    static void checkIn(){
        Random random = new Random();

        char randomizedCharacter = (char) (random.nextInt(5) + 'A');
        int randomNumber = random.nextInt(1,30);
        String s = Integer.toString(randomNumber);
        String b = Character.toString(randomizedCharacter);
        String seatNumber = s.concat(b);

        System.out.println("CheckIn Process Completed");
        System.out.println("Your seatNumber is " + seatNumber);
        refreshments();

    }
    static void refreshments(){
        System.out.println("Would you like to have some Refreshments :");
        System.out.println("\t 1 Coffee \n\t 2 Sandwich \n\t 3 Hot Chocolate \n\t 4 No,Thanks");
        System.out.println("Please choose one of the option :");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.println("Here is your Coffee");
        }
        else if (option == 2) {
            System.out.println("Here is your Sandwich");
        } else if (option == 3) {
            System.out.println("Here is your Hot Chocolate");
        } else if (option == 4) {
            System.out.println("Please let me know if you need something");
            return;

        }

        }
    }
