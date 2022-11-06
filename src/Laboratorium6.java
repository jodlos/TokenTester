import java.util.StringTokenizer;

public class Laboratorium6 {
    public static void main(String[] args) {
        StringTokenizer data;

        String quote1 = "DD/MM/RRRR";

        data = new StringTokenizer(quote1, "/");
        System.out.println("Token 1: " + data.nextToken());
        System.out.println("Token 2: " + data.nextToken());
        System.out.println("Token 3: " + data.nextToken());

        System.out.println(".....................");

        ZmienneEgzemplarza  jeden = new ZmienneEgzemplarza();

        System.out.println("Wysokość to: " + jeden.height);
        System.out.println("Szerokość to: " + jeden.width);
        System.out.println("Głębokość to: " + jeden.depth);



    }
}
