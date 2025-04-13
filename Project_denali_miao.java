import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Project_denali_miao {
    public static void main(String[] args) throws IOException {

        File policyFile = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(policyFile);

        ArrayList<Policy> policyHolder = new ArrayList<Policy>();

        String policyNumber = "";
        String providerName = "";
        String firstName = "";
        String lastName = "";
        int age = 0;
        String smokingStatus = "";
        double height = 0.0;
        double weight = 0.0;

        // Calls the Policy class
        Policy policy = new Policy();

        if(!policyFile.exists()) {
            System.out.println("Unable to find file.");
            System.exit(0);
        }


        // Runs while loop thats displays all information in file

        while(inputFile.hasNext()) {
            policyNumber = inputFile.nextLine();
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = inputFile.nextInt();
            smokingStatus = inputFile.nextLine();
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();

            policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
            policyHolder.add(policy);
        }
        
        for(int i = 0; i < policyHolder.size(); i++) {
            // Display information about the policy
            System.out.println("\nPolicy Number: " + policyHolder.get(i).getPolicyNumber());
            System.out.println("Provider Name: " + policyHolder.get(i).getProviderName());
            System.out.println("Policyholder’s First Name: " + policyHolder.get(i).getFirstName());
            System.out.println("Policyholder’s Last Name: " + policyHolder.get(i).getLastName());
            System.out.println("Policyholder’s Age: " + policyHolder.get(i).getAge());
            System.out.println("Policyholder’s Smoking Status: " + policyHolder.get(i).getSmokingStatus());
            System.out.println("Policyholder’s Height: " + policyHolder.get(i).getHeight() + " inches");
            System.out.println("Policyholder’s Weight: " + policyHolder.get(i).getWeight() + " pounds");

            // Calculate and display BMI and price
            double bmi = policyHolder.get(i).calculateBMI();
            double price = policyHolder.get(i).calculatePolicyPrice();

            System.out.println("Policyholder’s BMI: " + String.format("%.2f", bmi));
            System.out.println("Policy Price: $" + String.format("%.2f", price));   
        }

        inputFile.close();
    }
}
