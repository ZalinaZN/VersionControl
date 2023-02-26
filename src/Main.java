public class Main {
    public static void main(String[] args) {
        int[] sales = new int[]{1, 5, 10, 6, 4};
        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        System.out.println(max);

    }
}