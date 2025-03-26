import java.util.Scanner;

public class Project_denali_miao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input of all attributes
        System.out.print("Please enter the Policy Number: ");
        String policyNumber = scanner.nextLine();

        System.out.print("Please enter the Provider Name: ");
        String providerName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double height = Double.parseDouble(scanner.nextLine());

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double weight = Double.parseDouble(scanner.nextLine());

        // Calls the Policy class
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        // Display information about the policy
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder’s First Name: " + policy.getFirstName());
        System.out.println("Policyholder’s Last Name: " + policy.getLastName());
        System.out.println("Policyholder’s Age: " + policy.getAge());
        System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder’s Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder’s Weight: " + policy.getWeight() + " pounds");

        // Calculate and display BMI and price
        double bmi = policy.calculateBMI();
        double price = policy.calculatePolicyPrice();

        System.out.println("Policyholder’s BMI: " + String.format("%.2f", bmi));
        System.out.println("Policy Price: $" + String.format("%.2f", price));
    }
}
