package pl.edu.wszib.jwd;

import java.awt.*;
public class FourdDPoint extends Point {
    FourdDPoint create(int x, int y, int z, int t) {
        FourdDPoint fourdDPoint = new FourdDPoint();
        fourdDPoint.x = x;
        fourdDPoint.y = y;
      //  fourdDPoint.z = z;
      //  fourdDPoint.t = t;

        return null;
    }
    void show() {
        System.out.printf("x wynosi " + this.x);
        System.out.printf("y wynosi " + this.y);
      //  System.out.printf("z wynosi " + this.z);
      //  System.out.printf("t wynosi " + this.t);


    }

}
