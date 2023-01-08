package pl.edu.wszib.jwd;

public class TextFormat {
    public static void main(String[] args) {

        int accountBalance = 15_005;
        System.out.printf("Saldo: %,d zł%n",accountBalance);

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.11fn",pi);






    }
}
