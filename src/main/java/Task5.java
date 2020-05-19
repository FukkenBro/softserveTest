import java.time.LocalDate;
import java.time.Month;
// what would be an output of the following code
public class Task5 {
    public static void main(String[] args) {
        LocalDate day = LocalDate.of(2020, Month.FEBRUARY,27);
        day.plusDays(2);
        System.out.println(day);
    }
}

//Select one:
//#1 None of below
//#2 2020-02-29
//#3 2020-02-27
//#4 2020-03-01
