public class Main {
    public static void main(String[] args) {
        long[] sales = new long[]{100, 5000, 10000, 60000, 40000};
        SalesManager salesManager = new SalesManager(sales);
        long max = salesManager.max();
        System.out.println(max);

    }
}