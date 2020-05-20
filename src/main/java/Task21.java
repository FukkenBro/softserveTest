//What would be the result of following code
public class Task21 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a == true) {
            if (b == true) {
                if (c == true) {
                    System.out.println("1");
                } else System.out.println("2");
            } else if (a && (b=c)) {
                System.out.println("3");
            }
        } else {
            System.out.println("4");
        }
    }
}
//Select one
//        #1 "2" will be printed
//        #2 Runtime error
//        #3 "3"  will be printed
//        #4 "1"  will be printed
//        #5 Compiler erorr
//        #6 "4"  will be printed

