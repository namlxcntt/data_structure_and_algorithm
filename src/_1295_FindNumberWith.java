public class _1295_FindNumberWith {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            int digitOfNumber = calculateDigit(num);
            if(digitOfNumber % 2 == 0) {
                count ++;
            }
        }
        return count;
    }

    private static int calculateDigit(int num) {
        int result = num;
        int countDigit = 0;
        while (result != 0) {
             result = result / 10;
             countDigit ++;
        }
        return countDigit;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
//        for (int num : nums) {
//            System.out.println("num + " + num);
//        }

        System.out.println(findNumbers(nums));
    }
}
