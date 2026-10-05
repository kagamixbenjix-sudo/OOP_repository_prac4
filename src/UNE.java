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
}
