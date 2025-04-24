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

}