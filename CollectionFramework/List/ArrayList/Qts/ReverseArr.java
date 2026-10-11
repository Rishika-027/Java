package List.ArrayList.Qts;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int sizeOfArr = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < sizeOfArr; i++) {
            nums.add(sc.nextInt());
        }
        for (int i = nums.size() - 1; i >= 0; i--) {
            System.out.println(nums.get(i) + " ");
        }

    }
}
