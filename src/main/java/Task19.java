
import java.util.Arrays;
import java.util.List;

//What would be output of the following code
public class Task19 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,4,3,2,1);
        list.stream()
                .filter((n) -> n >3)
                .forEach(System.out::print);
    }
}

//Select one:
//#1  12345
//#2  54
//#3  123
//#4  45
//#5  5432
