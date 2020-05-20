//What would be the ouptup of the follwoing code?
public class Task25 {
    private  static  final int RED = 0;
    private  static  final int GREEN = 1;
    private  static  final int Yellow = 2;

    public static void main(String[] args) {
        int color = 2;
        switch (color) {
            case RED:
                System.out.println("Red");
                break;
            default:
                System.out.println("Yellow");
            case GREEN:
                System.out.println("Green");
        }
    }
}

//Select one:
//#1 Error
//#2 Red
//#3 Green
//#4 Yellow Green
//#5 Yellow
