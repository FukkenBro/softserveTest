//What would be output of following code

package Task11;

public class ChildClass extends ParentClass {
    private int x;
    private int y;

    private ChildClass(int x, int y) {
        super(x);
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        ParentClass pc = new ParentClass(10);
        ChildClass cc = new ChildClass(20, 10);

        System.out.println(cc.x + " " + cc.y);
    }
}

//Select one:
//#1 Runtime error
//#2 0 10
//#3 Compile error
//#4 10 20
//#5 20 10

