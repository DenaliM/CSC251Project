public class Policy {
    // Variables
    private int policyNumber;
    private String providerName;

    // Setting the default values using a no-arg constructor
    public Policy() {
        policyNumber = 0;
        providerName = "";
    }

    /* 
        Constructor using arguments to apply values to private values
        @param policyNumberSent the policy number from the user
        @param providerNameSent the provider name from the user
    */
    public Policy(int policyNumberSent, String providerNameSent) {
        policyNumber = policyNumberSent;
        providerName = providerNameSent;
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
        double bmi = calculateBMI();
        if (bmi > 35) {
            ADDITIONALFEE += (bmi - 35) * 20;
        }

        // Adding everything together to get a total
        return BASEPRICE + ADDITIONALFEE;
    }
}
