public class Policy {
    // Variables
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    // Setting the default values using a no-arg constructor
    public Policy() {
        policyNumber = 0;
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0;
        weight = 0;
    }

    /* 
        Constructor using arguments to apply values to private values
        @param policyNumberSent the policy number from the user
        @param providerNameSent the provider name from the user
        @param firstNameSent the first name from the user
        @param lastNameSent the last name from the user
        @param ageSent the age from the user
        @param smokingStatusSent the smoking status from the user
        @param heightSent the height from the user
        @param weightSent the weight from the user
    */
    public Policy(int policyNumberSent, String providerNameSent, String firstNameSent, String lastNameSent, int ageSent, String smokingStatusSent, double heightSent, double weightSent) {
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

    /*
     * Gets the policy number
     * @return the policy number back to user
     */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /*
     * Sets the policy number
     * @param policyNumberSent the policy number from to user
     */
    public void setPolicyNumber(int policyNumberSent) {
        policyNumber = policyNumberSent;
    }

    /*
     * Gets the provider name
     * @return the provider name back to user
     */
    public String getProviderName() {
        return providerName;
    }

    /*
     * Sets the provider name
     * @param providerNameSent the provider name from to user
     */
    public void setProviderName(String providerNameSent) {
        providerName = providerNameSent;
    }

    /*
     * Gets the first name
     * @return the first name back to user
     */
    public String getFirstName() {
        return firstName;
    }

    /*
     * Sets the first name
     * @param firstNameSent the first name from to user
     */
    public void setFirstName(String firstNameSent) {
        firstName = firstNameSent;
    }

    /*
     * Gets the last name
     * @return the last name back to user
     */
    public String getLastName() {
        return lastName;
    }

    /*
     * Sets the last name
     * @param lastNameSent the last name back to user
     */
    public void setLastName(String lastNameSent) {
        lastName = lastNameSent;
    }

    /*
     * Gets the age
     * @return the age back to user
     */
    public int getAge() {
        return age;
    }

    /*
     * Sets the age
     * @param ageSent the age from to user
     */
    public void setAge(int ageSent) {
        age = ageSent;
    }

    /*
     * Gets the smoking status
     * @return the smoking status back to user
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /*
     * Sets the smoking status
     * @param setSmokingStatus the smoking status from to user
     */
    public void setSmokingStatus(String smokingStatusSent) {
        smokingStatus = smokingStatusSent;
    }

    /*
     * Gets the height
     * @return the height back to user
     */
    public int getHeight() {
        return height;
    }

    /*
     * Sets the height
     * @param setHeight the height back to user
     */
    public void setHeight(int heightSent) {
        height = heightSent;
    }

    /*
     * Gets the weight
     * @return the weight back to user
     */
    public int getWeight() {
        return weight;
    }

    /*
     * Gets the weight
     * @param setWeight the weight from to user
     */
    public void setWeight(int weightSent) {
        weight = weightSent;
    }

    /*
     * Calculating the BMI
     * @return the BMI back to user
     */
    public int calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /*
     * Calculates the price of the insurance policy
     * @return the total insurance policy price
     */
    public int calculatePolicyPrice() {
        final int BASEPRICE = 600;
        int ADDITIONALFEE = 0;

        // Checking if age is over 50, if so apply fee
        if (age > 50) {
            ADDITIONALFEE += 75;
        }

        // Checking if smoking status is smoker, if so apply fee
        if (smokingStatus.equals("smoker")) {
            ADDITIONALFEE += 100;
        }

        // Calculating BMI and check if BMI is greater than 35, if so apply fee
        int bmi = calculateBMI();
        if (bmi > 35) {
            ADDITIONALFEE += (bmi - 35) * 20;
        }

        // Adding everything together to get a total
        return BASEPRICE + ADDITIONALFEE;
    }
}
