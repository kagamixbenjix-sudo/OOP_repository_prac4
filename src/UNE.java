public class UNE {
    String StudentfirstName;
    String StudentlastName;
    String StudentID;
    String StudentSchool;
    String registrationStatus;
    String examCenter;
    static int examYear;
    static double registrationFee;
    static String gradingPolicy;

    static {
        System.out.println(">> STATIC BLOCK: Loading central configuration...");
        examYear = 2026;
        registrationFee = 150.00;
        gradingPolicy = "Standard Grading Policy";
    }

    {
        System.out.println(">> INSTANCE BLOCK: Setting default values...");
        registrationStatus = "Pending";
        examCenter = "To be assigned";
    }

    public UNE(String firstName, String lastName, String id, String school) {
        System.out.println(">> CONSTRUCTOR: Registering " + firstName);
        this.StudentfirstName = firstName;
        this.StudentlastName = lastName;
        this.StudentID = id;
        this.StudentSchool = school;
        this.registrationStatus = "Registered";
        this.examCenter = "City Exam Center Namirembe";

    }

    public UNE(String firstName, String lastName, String id) {
        System.out.println(">> CONSTRUCTOR (short): Registering " + firstName);
        this.StudentfirstName = firstName;
        this.StudentlastName = lastName;
        this.StudentID = id;
        this.StudentSchool = "Not specified";
    }
}
