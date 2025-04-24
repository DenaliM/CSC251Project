import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Project_denali_miao {
    public static void main(String[] args) throws IOException {

        File policyFile = new File("PolicyInformation.txt");
        Scanner inputFile = new Scanner(policyFile);

        ArrayList<Policy> policyHolder = new ArrayList<Policy>();

        int policyNumber = 0;
        String providerName = "";
        String firstName = "";
        String lastName = "";
        int age = 0;
        String smokingStatus = "";
        double height = 0;
        double weight = 0;
        
        int smokerCount = 0;
        int nonSmokerCount = 0;

        // Calls the Policy class
        Policy policy = new Policy();
        PolicyHolder policyHolderJava = new PolicyHolder();

        if(!policyFile.exists()) {
            System.out.println("Unable to find file.");
            System.exit(0);
        }


        // Runs while loop thats displays all information in file

        while(inputFile.hasNext()) {
            policyNumber = inputFile.nextInt();
            inputFile.nextLine();
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = inputFile.nextInt();
            inputFile.nextLine();
            smokingStatus = inputFile.nextLine();
            height = inputFile.nextDouble();
            inputFile.nextLine();
            weight = inputFile.nextDouble();
            
            if(inputFile.hasNext()) {
               inputFile.nextLine();            
            }
            
            if(smokingStatus.equals("smoker")) {
               smokerCount++;
            } else {
               nonSmokerCount++;
            }

            policyHolderJava = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
            
            policy = new Policy(policyNumber, providerName, policyHolderJava);
            policyHolder.add(policy);
        }
        
        int policyCount = 0;
        
        for(int i = 0; i < policyHolder.size(); i++) {
            // Display information about the policy
            System.out.println(policyHolder.get(i));
            System.out.println("\n"); 
            policyCount = policyHolder.get(i).getPolicyCount();
        }
        
        System.out.println("There were " + policyCount + " Policy objects created.");
        System.out.println("\nThe number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);

        inputFile.close();
    }
}
