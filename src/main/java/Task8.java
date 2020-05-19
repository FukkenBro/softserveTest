//What would be the output of the following code?

public class Task8 {
    public static void main(String[] args) {
        int x = 6;
        int n1 = 5 < x-- ? 5 : 7;
        switch (n1) {
            default:
                System.out.println("NAN");
            case 1:
                System.out.println("1");
            case 3:
                System.out.println("3");
            case 7:
                System.out.println("2");
                break;
        }
    }
}
//}
//Select one
//        #1 3
//        #2 13
//        #3 2
//        #4 NAN132
//        #5 NAN
