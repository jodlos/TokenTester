package pl.edu.wszib.jwd;

public class Loops {
    public static void main(String[] args) {

   /*     int x = 2;
        if(x >2) {
            System.out.println("Jest większe od 2");
        } else if (x <2) {
            System.out.println("Nie jest większe od 2");
        } else {
            System.out.println("Jest równe 2");*/

    /*    char grade = 'pl.edu.wszib.jwd.A';

        switch (grade) {
            case 'pl.edu.wszib.jwd.A':
                System.out.println("Wspaniale");
                break;
                case 'pl.edu.wszib.jwd.B';
                    System.out.println("Dobrze!");
                    break;
                    case 'D';
                        System.out.println("Mogło być lepiej");
                        break;*/

       // for (;; ) {
         //   System.out.println("pętla nieskończona");

       /* for (int i = 1; i < 10; i++) {

            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i);
            System.out.print(" ");
        }*/

        out: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.println(i + " " + j);
                continue ;
            }
        }





        }


        }

