/**
 * Yash Patel
 * HeartTransplant class
 * 
 * @author Ana Paula Centeno
 * @author Haolin (Daniel) Jin
 */
public class HeartTransplant {

    // patient array, each Patient is read from the data file
    private Patient[] patients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause survivabilityByCause;

    /*
     * Default constructor
     * Initializes patients to null.
     * Initializes survivabilityByAge to null.
     * Initializes survivabilityByCause to null. 
     */
    public HeartTransplant() {

        // WRITE YOUR CODE HERE
        this.patients = null;
        this.survivabilityByAge = null;
        this.survivabilityByCause = null;
    }

    /*
     * Returns patients
     */
    public Patient[] getPatients() {

        // WRITE YOUR CODE HERE
        return this.patients;
     } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge getSurvivabilityByAge() {
        // WRITE YOUR CODE HERE
        return this.survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause getSurvivabilityByCause() {
        // WRITE YOUR CODE HERE
        return this.survivabilityByCause;
    }

    /*
     * 1) Initialize the instance variable patients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file, use StdIn.readInt() to read an integer.
     *    File Format: 
     *      ID, ethnicity, Gender, Age, Cause, Urgency, State of health
     * 
     *    Each line refers to one Patient, all values are integers.
     * 
     */
    public void readPatients (int numberOfLines) {
        // WRITE YOUR CODE HERE
        this.patients = new Patient [numberOfLines];
        for(int i = 0; i < numberOfLines; i++){
            int id = StdIn.readInt();
            int ethnicity = StdIn.readInt();
            int gender = StdIn.readInt();
            int age = StdIn.readInt();
            int cause = StdIn.readInt();
            int urgency = StdIn.readInt();
            int stateOfHealth = StdIn.readInt();
            Patient check = new Patient (id, ethnicity, gender, age, cause, urgency, stateOfHealth);
            this.patients[i] = check;

        }

    }

    /*
     * 1) Initialize the instance variable survivabilityByAge with a new survivabilityByAge object.
     * 
     * 2) Reads from the command line file to populate the object. 
     *    Use StdIn.readInt() to read an integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     */
    public void readSurvivabilityByAge (int numberOfLines) {
        // WRITE YOUR CODE HERE
        this.survivabilityByAge = new SurvivabilityByAge();
        for(int i = 0; i < numberOfLines; i++){
            int age = StdIn.readInt();
            int year = StdIn.readInt();
            double rate = StdIn.readDouble();
            this.survivabilityByAge.addData(age,year,rate);
        }
    }

    /*
     * 1) Initialize the instance variable survivabilityByCause with a new survivabilityByCause object.
     * 
     * 2) Reads from the command line file to populate the object. Use StdIn.readInt() to read an 
     *    integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     */
    public void readSurvivabilityByCause (int numberOfLines) {
        // WRITE YOUR CODE HERE
        this.survivabilityByCause = new SurvivabilityByCause();
        for(int i = 0; i < numberOfLines; i++){
            int cause = StdIn.readInt();
            int year = StdIn.readInt();
            double rate = StdIn.readDouble();
            this.survivabilityByCause.addData(cause,year,rate);
        }
    }
    
    /*
     * Returns a Patient array containing the patients, 
     * from the patients array, that have age above the parameter age.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with age above the parameter age.
     * 
     * Return null if there is no Patient with age above the 
     * parameter age.
     */ 
    public Patient[] getPatientsWithAgeAbove(int age) {
        // WRITE YOUR CODE HERE
        int number = 0;
        for(int i = 0; i < patients.length; i++){
            if(patients[i].getAge() >= age){
                number++;
            }
        }
            if(number != 0){
                Patient[] patientsWithAgeAbove = new Patient[number];
                int z = 0;
                for (int j = 0; z < number; j++){
                    if(patients[j].getAge() >= age){
                    patientsWithAgeAbove[z] = patients[j];
                    z++;
                }
            }
            return patientsWithAgeAbove;
        }
  
        return null;
    }

    /*
     * Returns a Patient array containing the patients, from the patients array, 
     * that have the heart condition cause equal to the parameter cause.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Patient with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Patient[] getPatientsByHeartConditionCause(int cause) {

        // WRITE YOUR CODE HERE
        int number = 0;
        for(int i = 0; i < patients.length; i++){
            if(patients[i].getCause() >= cause){
                number++;
            }
        }
            if(number != 0){
                Patient [] patientsByHeartConditionCause = new Patient[number];
                int z = 0;
                for(int j = 0; z < number; j++){
                    if(patients[j].getCause() >= cause){
                        patientsByHeartConditionCause[z] = patients[j];
                        z++;
                    }
                }
                return patientsByHeartConditionCause;
        }
        return null;
    }

    /*
     * Returns a Patient array containing patients, from the patients array,
     * that have the state of health equal to the parameter state.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the state of health equal to the parameter state.
     * 
     * Return null if there is no Patient with the state of health 
     * equal to the parameter state.
     */ 
    public Patient[] getPatientsByUrgency(int urgency) {

        // WRITE YOUR CODE HERE
        int number = 0;
        for(int i = 0; i < patients.length; i++){
            if(patients[i].getUrgency() >= urgency){
                number++;
            }
        }
            if(number != 0){
                Patient [] patientsByUrgency = new Patient[number];
                int z = 0;
                for(int j = 0; z < number; j++){
                    if(patients[j].getCause() >= urgency){
                        patientsByUrgency[z] = patients[j];
                        z++;
                    }
                }
                return patientsByUrgency;
        }

	return null;
    }

    /*
     * Assume there is a heart available for transplantation surgery.
     * Also assume that the heart is of the same blood type as the
     * Patients on the patients array.
     * This method finds the Patient to be the recepient of this
     * heart.
     * 
     * The method returns a Patient from the patients array with
     * he highest potential for survivability after the transplant.
     * 
     * Assume the patient returned by this method will receive a heart,
     * therefore the Patient will no longer need a heart.
     * 
     * There is no correct solution, you may come up with any 
     * function to find the patient with the highest potential 
     * for survivability after the transplant.
     */ 
    public Patient getPatientForTransplant () {

	// WRITE YOUR CODE HERE
    double bestpatient = 0;
    int begin = 0;
    for(int i = 0; i < patients.length; i++){
        double element= survivabilityByAge.getRate(patients[i].getAge(), 5);
        double element2  = survivabilityByCause.getRate(patients[i].getAge(), 5);
        double high = (element + element2) / 2;
        if(high > bestpatient && patients[i].getNeedHeart() == true){
            bestpatient = high;
            begin = i;
        }
    }    
    this.patients[begin].setNeedHeart(false);
    return this.patients[begin];
}
}
