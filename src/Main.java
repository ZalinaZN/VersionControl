public class Main {
    public static void main(String[] args) {
        int[] sales = new int[]{1, 5, 10, 6, 4};
        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        int min = salesManager.min();
        int averege = salesManager.average();

        System.out.println(max);
        System.out.println(min);
        System.out.println(averege);

    }
}