package pl.edu.wszib;

public class VisitCounterTester {
    public static void main(String[] args) {

    VisitCounter visitCounter = new VisitCounter();
        visitCounter.increment();
        visitCounter.increment();
        visitCounter.increment();
   // visitCounter.counter++;
        System.out.println(visitCounter.getCounter());
    }
}
