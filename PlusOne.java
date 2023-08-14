import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter an integer positive :");
        // int input = scanner.nextInt();

        int[] nums = { 1, 2, 3, 0 };

        int pow = 1; // ....power

        int number = 0;
        int i;
        int j;

        for (i = nums.length - 1; i >= 0; i--) {
            number += nums[i] * pow;
            pow *= 10;
        }
        number++;
        System.out.println(number);

        int[] a = new int[number / pow > 0 ? nums.length + 1 : nums.length];

        if (a.length == nums.length)
            pow /= 10;

        for (j = 0; j < a.length; j++) {
            a[j] = number / pow;
            number %= pow;
            pow /= 10;
        }

        System.out.println(Arrays.toString(a));

    }
}