import java.util.ArrayList;
import java.util.List;

public class Task26 {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(15);
        lst.add(7);
        System.out.println(sum(lst));

    }

    static int sum(List<Integer> list){
        int sum = 0;

        return sum;
    }
}

//Which lines must be put in the blank line to receive 24 as result
//
//Select one or more:
//#1 sum=sum+list
//#2 for(Integer k : list){sum++=k;}
//#3 for(Integer k : list){sum+ ++k;}
//#4 for(Integer k : list){sum+k++;}
//#4 for(Integer k : list){sum+k;}
//#5 for(Integer k : list){sum = sum+ ++k;}
