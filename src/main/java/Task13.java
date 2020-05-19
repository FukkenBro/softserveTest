//Evaluate value of variable s
public class Task13 {
    public static void main(String[] args) {
        int s = 1;
        int k = 0;
        while (k<10){
             k+=2;
             if (k!=6){
                 continue;
             }
             s+=k;
        }
        System.out.println("s = "+s);
    }
}
//Select one:
//#1 6
//#2 7
//#3 25
//#4 1
//#5 31