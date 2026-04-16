class Outer {
    int x = 10;

    // Inner class
    class Inner {
        void display() {
            System.out.println("Value of x is: " + x);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer obj = new Outer();

        // Creating object of inner class
        Outer.Inner in = obj.new Inner();
        in.display();
    }
}