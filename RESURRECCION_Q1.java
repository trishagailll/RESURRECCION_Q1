import java.util.Scanner;

public class Lastname_Q1 {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for student information
        String studentName;
        String course;
        String courseCode;
        double numberOfUnits; // Changed to double
        double totalFee;
        double paymentAmount;

        // Input student information
        System.out.print("Enter Student Name: ");
        studentName = scanner.nextLine();

        System.out.print("Enter Course: ");
        course = scanner.nextLine();

        System.out.print("Enter Course Code: ");
        courseCode = scanner.nextLine();

        // Input number of units with validation
        do {
            System.out.print("Enter Number of Units (Max 10): ");
            numberOfUnits = scanner.nextDouble(); // Changed to nextDouble()
            scanner.nextLine(); // Consume newline character
            if (numberOfUnits <= 0 || numberOfUnits > 10) {
                System.out.println("Invalid number of units. Please enter a value between 1 and 10.");
            }
        } while (numberOfUnits <= 0 || numberOfUnits > 10);

        // Compute total enrollment fee
        totalFee = calculateEnrollmentFee(numberOfUnits);

        // Display student information and total fee
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Total Enrollment Fee: " + totalFee);

        // Input payment amount
        System.out.print("Enter Payment Amount: ");
        paymentAmount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        // Process payment and display payment status
        processPayment(totalFee, paymentAmount);

        // Close the scanner after all inputs are read
        scanner.close(); 
    }

    // Method to calculate enrollment fee
    public static double calculateEnrollmentFee(double numberOfUnits) { // Changed parameter type to double
        return numberOfUnits * 1000; // Fee per unit is 1000
    }

    // Method to process payment
    public static void processPayment(double totalFee, double paymentAmount) {
        if (paymentAmount == totalFee) {
            System.out.println("Fully Paid");
        } else if (paymentAmount < totalFee) {
            System.out.println("Partial Payment");
            System.out.println("Amount Paid: " + paymentAmount);
        }
    }
}