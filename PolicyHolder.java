public class PolicyHolder {
   //Variables
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   // Setting the default values using a no-arg constructor
    public PolicyHolder() {
        firstName = "";
        lastName = "";
        age = 0;
        smokingStatus = "non-smoker";
        height = 0;
        weight = 0;
    }
    
    /*The copy constructor creates a copy of the PolicyHolder class that it is passed as a parameter.
     To avoid secuirty holes
     @param policy2 - the policy to copy
    */
    public PolicyHolder(PolicyHolder policy2) {
       firstName = policy2.firstName;
       lastName = policy2.lastName;
       age = policy2.age;
       smokingStatus = policy2.smokingStatus;
       height = policy2.height;
       weight = policy2.weight;
    }

    
    /* 
        Constructor using arguments to apply values to private values
        @param firstNameSent the first name from the user
        @param lastNameSent the last name from the user
        @param ageSent the age from the user
        @param smokingStatusSent the smoking status from the user
        @param heightSent the height from the user
        @param weightSent the weight from the user
    */
    public PolicyHolder(String firstNameSent, String lastNameSent, int ageSent, String smokingStatusSent, double heightSent, double weightSent) {
        firstName = firstNameSent;
        lastName = lastNameSent;
        age = ageSent;
        smokingStatus = smokingStatusSent;
        height = heightSent;
        weight = weightSent;
    }
    
    // All necessary getter and setter methods
    
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
    public double getHeight() {
        return height;
    }

    /*
     * Sets the height
     * @param setHeight the height back to user
     */
    public void setHeight(double heightSent) {
        height = heightSent;
    }

    /*
     * Gets the weight
     * @return the weight back to user
     */
    public double getWeight() {
        return weight;
    }

    /*
     * Gets the weight
     * @param setWeight the weight from to user
     */
    public void setWeight(double weightSent) {
        weight = weightSent;
    }

    /*
     * Calculating the BMI
     * @return the BMI back to user
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }
    
    /*
     * Calculates the price of the insurance policy
     * @return the total insurance policy price
     */
    public double calculatePolicyPrice() {
        final double BASEPRICE = 600.0;
        double ADDITIONALFEE = 0.0;

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
            ADDITIONALFEE += ((bmi - 35) * 20);
        }

        // Adding everything together to get a total
        return (BASEPRICE + ADDITIONALFEE);
    }

    
    /*
     * Formats all information into a string
     * @return the information about the policy as a string
     */
    public String toString() {
      double bmi = calculateBMI();
      return String.format("Policyholder's First Name: " + firstName 
                           + "\nPolicyholder's Last Name: " + lastName 
                           + "\nPolicyholder's Age: " + age
                           + "\nPolicyholder's Smoking Status: " + smokingStatus 
                           + "\nPolicyholder's Height: " + height 
                           + "\nPolicyholder's Weight: " + weight
                           + "\nPolicyholder's BMI: %.2f"
                           + "\nPolicy Price: $%.2f", bmi, calculatePolicyPrice());
    }

}