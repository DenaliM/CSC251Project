public class Policy {
    // Variables
    private String policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    // Setting the default values using a no-arg constructor
    public Policy() {
        policyNumber = "";
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0.0;
        weight = 0.0;
    }

    // Constructor using arguments to apply values to private values
    public Policy(String policyNumberSent, String providerNameSent, String firstNameSent, String lastNameSent, int ageSent, String smokingStatusSent, double heightSent, double weightSent) {
        policyNumber = policyNumberSent;
        providerName = providerNameSent;
        firstName = firstNameSent;
        lastName = lastNameSent;
        age = ageSent;
        smokingStatus = smokingStatusSent;
        height = heightSent;
        weight = weightSent;
    }

    // All necessary getter and setter methods
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumberSent) {
        policyNumber = policyNumberSent;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerNameSent) {
        providerName = providerNameSent;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstNameSent) {
        firstName = firstNameSent;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastNameSent) {
        lastName = lastNameSent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int ageSent) {
        age = ageSent;
    }

    public String getSmokingStatus() {
        return smokingStatus;
    }

    public void setSmokingStatus(String smokingStatusSent) {
        smokingStatus = smokingStatusSent;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double heightSent) {
        height = heightSent;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weightSent) {
        weight = weightSent;
    }

    // Calculating the BMI
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    // Calculates the price of the insurance policy
    public double calculatePolicyPrice() {
        double basePrice = 600;
        double additionalFee = 0;

        // Checking if age is over 50, if so apply fee
        if (age > 50) {
            additionalFee += 75;
        }

        // Checking if smoking status is smoker, if so apply fee
        if (smokingStatus.equals("smoker")) {
            additionalFee += 100;
        }

        // Calculating BMI and check if BMI is greater than 35, if so apply fee
        double bmi = calculateBMI();
        if (bmi > 35) {
            additionalFee += (bmi - 35) * 20;
        }

        // Adding everything together to get a total
        return basePrice + additionalFee;
    }
}
