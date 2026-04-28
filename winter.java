import java.util.Scanner;


interface Mango {
    void showSeason();
    void showTaste();
}


class Winter implements Mango {

    public void showSeason() {
        System.out.println("Mango available in Winter season.");
    }

    public void showTaste() {
        System.out.println("Winter Mango Taste: Sweet and Juicy.");
    }
}


class Summer implements Mango {

    public void showSeason() {
        System.out.println("Mango available in Summer season.");
    }

    public void showTaste() {
        System.out.println("Summer Mango Taste: Very Sweet and Fresh.");
    }
}


public class Main {
    public static void main(String args[]) {

        Winter w = new Winter();
        Summer s = new Summer();

        System.out.println("---- Winter Mango ----");
        w.showSeason();
        w.showTaste();

        System.out.println("\n---- Summer Mango ----");
        s.showSeason();
        s.showTaste();
    }
}