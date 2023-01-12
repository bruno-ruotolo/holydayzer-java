public class App {
    public static void main(String[] args) {
        Holidays holidays = new Holidays();
        holidays.creatingList();

        System.out.println(holidays.getDate("01/01/2023"));
        System.out.println(holidays.getDate("03/08/2023"));

        holidays.allHolidays();
    }
}
