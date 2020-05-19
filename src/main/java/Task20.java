import java.util.function.Function;

// Which oh of the following are correct lambda expressions which returns the product of two numbers?
public class Task20 {
    public static void main(String[] args) {
//        System.out.println(product());
    }

//    static int product() {
//        Operationable operation;
//        operation = ... ;
//        int result = operation.calculate(10,20);
//        return result;
//    }

    interface Operationable{
        int calculate(int x, int y);
    }

}

//Select one or more:
//#1 x,y->x*y;
//#2 (x,y)->x * y;
//#3 (x,y)->return x * y;
//#4 (int x, int y)->{return x*y;}
//#5 (x,y)->{return x*y;}
//#6 ()->{return x*y;}