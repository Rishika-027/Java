package List.ArrayList.Qts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int sizeOfArr = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < sizeOfArr; i++) {
            nums.add(sc.nextInt());// 13 45 23 76 96
        }
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        int maxVal = Collections.max(nums);
        System.out.println("maxVal: " + maxVal);// 96
    }
}
