public class Main {
    public static void main(String[] args) {
        System.out.println("Application started");
        System.out.println("--- Registering student 1 ---");
        UNE student1 = new UNE("Kabagambe", "Benjamin", "25/450/BIT-J", "East Africa school");
        student1.displayStudentInfo();
    }
}