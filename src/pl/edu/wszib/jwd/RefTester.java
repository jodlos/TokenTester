package pl.edu.wszib.jwd;

import java.awt.*;

public class RefTester {
    public static void main(String[] args) {

        //String str1 = "jakiś tekst";
        //System.out.println(str1.getClass().getName());

       // Object obj = new Object();

       // System.out.println(obj instanceof String);

        Point pt1, pt2;
        pt1 = new Point(100, 100);
        pt2 = pt1;

        pt1.x = 200;
        pt1.y = 200;
        System.out.println(pt1);
        System.out.println(pt2);
    }
}
