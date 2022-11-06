public class HalfDollars {
    public static void main(String[] args) {

        int[] denver = {1_700_000,4_600_000,2_100_000};
        int[] philladelphia = new int[denver.length];
        int[] total = new int[denver.length];
        int average;

        philladelphia[0] = 1_800_000;
        philladelphia[1] = 5_000_000;
        philladelphia[2] = 2_500_000;

        total[0] = denver[0] + philladelphia[0];
        total[1] = denver[1] + philladelphia[1];
        total[2] = denver[2] + philladelphia[2];

        average = (total[0] + total[1] + total[2]) / total.length;

        System.out.print( "Produkcja 2012: ");
        System.out.printf("%,d%n", total[0]);
        System.out.print( "Produkcja 2013: ");
        System.out.printf("%,d%n", total[1]);
        System.out.print( "Produkcja 2014: ");
        System.out.printf("%,d%n", total[2]);



    }

}
