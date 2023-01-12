import java.util.ArrayList;
import java.util.List;

public class Holidays {
  private List<String> holidayDates = new ArrayList<>();
  private List<String> holidayNames = new ArrayList<>();

  public void creatingList() {
    holidayDates.add("01/01/2023");
    holidayNames.add("Confraternização mundial");
    holidayDates.add("21/02/2023");
    holidayNames.add("Carnaval");
    holidayDates.add("17/04/2023");
    holidayNames.add("Páscoa");
    holidayDates.add("21/04/2023");
    holidayNames.add("Tiradentes");
    holidayDates.add("01/05/2023");
    holidayNames.add("Dia do Trabalho");
    holidayDates.add("08/06/2023");
    holidayNames.add("Corpus Christi");
    holidayDates.add("07/09/2023");
    holidayNames.add("Independência do Brasil");
    holidayDates.add("12/10/2023");
    holidayNames.add("Nossa Senhora Aparecida");
    holidayDates.add("02/11/2023");
    holidayNames.add("Finados");
    holidayDates.add("15/11/2023");
    holidayNames.add("Proclamação da República");
    holidayDates.add("25/12/2023");
    holidayNames.add("Natal");
  }

  public String getDate(String date) {
    for (int i = 0; i < holidayDates.size(); i++) {
      if (holidayDates.contains(date)) {
        return holidayNames.get(i);
      }
    }
    return "Este existe feriado com esta data";
  }

  public List<String> allHolidaysNames() {
    return holidayNames;
  }

  public List<String> allHolidaysDates() {
    return holidayDates;
  }

  public void allHolidays() {
    for (int i = 0; i < holidayDates.size(); i++) {
      System.out.println(holidayDates.get(i) + " => " + holidayNames.get(i));
    }
  }
}
