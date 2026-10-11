package List.ArrayList.Qts;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int sizeOfArr = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < sizeOfArr; i++) {
            nums.add(sc.nextInt());
        }
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i) + " ");
        }

        // OR

        for (int val : nums) {
            System.out.println(val + " ");
        }
    }
}
