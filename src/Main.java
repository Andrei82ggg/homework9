public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println(" ");
    }

    private static void task1() {
        task2();
        System.out.println(" ");
    }

    private static void task2() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("ФИО сотрудника " + fullName);
    }
}