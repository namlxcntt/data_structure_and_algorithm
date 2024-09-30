public class _1672_Richest_customer_wheal {

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int max = maximumWealth(a);
        System.out.println(max);
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int amount = 0;
            for (int i : account) {
                amount += i;
            }
            if (amount > max) {
                max = amount;
            }
        }
        return max;
    }
}
