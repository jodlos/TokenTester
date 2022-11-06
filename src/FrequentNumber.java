import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class FrequentNumber {
    public static void main(String[] args) {

        int[] arr = {3, 5, 6, 6, 6, 7, 2, 0, 6};
        int[] counters = new int[10];


        for (int i = 0; i < arr.length; i++) {
            counters[arr[i]]++;
        }

        int mostFrequent = 0;

        for (int i = 0; i < counters.length; i++) {
            if(counters[i] > counters[mostFrequent]) {
                mostFrequent = i;
        }


        }

        System.out.print("Najczęściej występującą cyfrą jest cyfra " + mostFrequent);
        System.out.println(", wystąpiła " + counters[mostFrequent] + " razy.");

    }
}
