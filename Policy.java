public class Policy {
    // Variables
    private int policyNumber;
    private String providerName;
    private PolicyHolder policyHolder; //Instance of the PolicyHolder class
    private static int policyCount;

    // Setting the default values using a no-arg constructor
    public Policy() {
        policyNumber = 0;
        providerName = "";
        policyCount = 0;
    }

    /* 
        Constructor using arguments to apply values to private values
        @param policyNumberSent the policy number from the user
        @param providerNameSent the provider name from the user
    */
    public Policy(int policyNumberSent, String providerNameSent, PolicyHolder holder) {
        policyNumber = policyNumberSent;
        providerName = providerNameSent;
        policyHolder = new PolicyHolder(holder);
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
    * Gets the policy count
    * @return the number of times it made a policy
    */
    public static int getPolicyCount() {
      return policyCount;
    }
    
    /*
     * Formats all information into a string
     * @return the information about the policy as a string
     */
    public String toString() {
      policyCount++;
      return "Policy Number: " + policyNumber + "\nProvider Name: " + providerName + "\n" + policyHolder.toString();
    }
}
