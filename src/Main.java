public class Main {
    public static void main(String[] args) {
        System.out.println("Application started");
        System.out.println("--- Registering student 1 ---");
        UNE student1 = new UNE("Kabagambe", "Benjamin", "25/450/BIT-J", "East Africa school");
        student1.displayStudentInfo();
        System.out.println("--- Registering student 2 ---");
        UNE student2 = new UNE("Nabukenya", "Sarah", "25/451/BIT-J", "Makerere high-School");
        student2.displayStudentInfo();
        System.out.println("--- Registering student 3 ---");
        UNE student3 = new UNE("Kato", "Michael", "25/452/BIT-J", "Kyambogo parent school");
        student3.displayStudentInfo();
    }
}