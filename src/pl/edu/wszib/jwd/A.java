package pl.edu.wszib.jwd;

public class A {
    public A() {
        System.out.println("Działa konstruktor pl.edu.wszib.jwd.A()");
    }

}

   // class pl.edu.wszib.jwd.B extends pl.edu.wszib.jwd.A {


        class Test {
            public static void main(String[] args) {
                A a = new A();

            }
        }

