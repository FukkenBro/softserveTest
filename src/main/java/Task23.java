import java.util.Arrays;

// Which statement concerning the code below are correct?
public class Task23 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[1] = 2;
        a[a[1]++] = 3;
        System.out.println(Arrays.toString(a));
    }
}
//Select one or more:
//#1 "a" is an array of ints
//#2 After this code fragment execution the second element of "a" equeals "2"
//#3 "a" is Object
//#4 "a" is an object
//#5 This code fragment contains one or more errors
//#6 After this code fragment execution the second element of "a" equals "3"
//#7 After this code fragment execution the first element of "a" equals "2"
//#8 After this code fragment execution the third element of "a" equals "3"
//#9 After this code fragment execution the one fourth element of "a" equals "3"
//#10 "a" is an array of primitives
