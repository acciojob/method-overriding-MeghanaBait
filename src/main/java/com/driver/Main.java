package com.driver;

public class Main {
    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B extends A{
        @Override
        public String meth(){
            return "Method is overridden in Extended class B";
        }

        public String callSuperMeth() {
            // Using super to call the method from the parent class (class A)
            return super.meth();
        }
    }


    public static void main(String[] args) {
        B obj1 = new B();
        obj1.callSuperMeth();

        B obj2 = new B();
        obj2.meth();
    }
}