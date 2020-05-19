//What would be result of following code
public class Task12 {
    public static void main(String[] args) {
        C c = new C();
        c.print();
    }
}

class A{
    public void print() {
        System.out.println("A print()");
    }
}

class B extends A {
    public void print(){
        System.out.println("B print()");
    }
}

class C extends B {
    public void print(){
        System.out.println("C print()");
    }
}

//Select one:
//#1      A print()
//        B print()
//        C print()
//#2      C print()
//#3      A print()
//#4      Runtime error
//#4      Compile error
