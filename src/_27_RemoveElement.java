public class _27_RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length; ) {
            if (nums[i] == val) {
                // dịch vị trí của các phần tử  qua phải ( Lưu ý là move từ phải qua trái
                for (int j = 0; j <= (length - 2); j++) {
                    nums[j] = nums[j + 1];
                }
                length--;
            } else {
                i++;
            }
        }
        return length;
    }

    public static int removeElement2(int[] a, int x) {
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != x) {
                a[k] = a[i];
                k++;
            }
        }

        return k;
    }


    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        System.out.println(removeElement2(nums, 2));
    }
}
