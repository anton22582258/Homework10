public class Main {
    public static void main(String[] args) {

        System.out.println(" Задача 1 ");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = " Ivanov Ivan Ivanovich ";
        System.out.print(" Ф. И. О. сотрудника - " + firstName + " " + middleName + " "
                + lastName + ".");
        System.out.println();

        System.out.println(" Задача 2 ");
        fullName = "Ivanov Ivan Ivanovich";
        System.out.println(" Данные Ф. И. О. сотрудника для заполнения отчета - "
                + fullName.toUpperCase() + ".");

        System.out.println(" Задача 3 ");
        String fullName1 = "Иванов Семён Семёнович";
        System.out.println(" Данные Ф. И. О. сотрудника - "
                + fullName1.replace("ё", "е") + ".");
    }
}
