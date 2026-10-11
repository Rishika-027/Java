package List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// public class ArrayListEg {

//     public static void main(String args[]){
//         ArrayList al = new ArrayList();
//         // System.out.println(al);

//         al.add(10);
//         al.add(20);
//         al.add(30);
//         al.add(40);
//         al.add(50);
//         System.out.println(al);
//         System.out.println(al.get(0));

//         System.out.println(al.remove(2));
//         System.out.println(al);
//     }
// }

// PREDEFINE METHODS OF ARRAYLIST

//1) add()
// public class ArrayListEg{
//     public static void main(String arg[]){

//         ArrayList<Integer> al = new ArrayList<>();
//         al.add(10);
//         al.add(29);
//         al.add(30);
//         al.add(10);
//         System.out.println(al);

//         //2) addAll()
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(27);
//         list.add(29);
//         list.addAll(al);
//         System.out.println(list);
//     }
// }

//3) get()
// public class ArrayListEg{
//     public static void main(String arg[]){

//         ArrayList<Integer> al = new ArrayList<>();
//         al.add(10);
//         al.add(20);
//         al.add(30);
//         al.add(40);
//         System.out.println(al.get(3));//40
//     }
// }

//4) set()
// public class ArrayListEg{
//     public static void main(String arg[]){

//         ArrayList<Integer> al = new ArrayList<>();
//         al.add(10);
//         al.add(20);
//         al.add(30);
//         al.set(0, 40);
//         System.out.println(al);//[40,20,30]
//     }
// }

//5) size()
// public class ArrayListEg{
//     public static void main(String arg[]){

//         ArrayList<Integer> al = new ArrayList<>();
//         al.add(10);
//         al.add(20);
//         al.add(30);
//         al.add(40);
//         System.out.println(al.size());//4
//     }
// }

//sort()
// public class ArrayListEg{
//     public static void main(String arg[]){

//         ArrayList<Integer> al = new ArrayList<>();
//         al.add(55);
//         al.add(23);
//         al.add(10);
//         al.add(34);
//         Collections.sort(al);
//         System.out.println(al);
//     }
// }

// reverse()
// public class ArrayListEg{
//     public static void main(String arg[]){

//         ArrayList<Integer> al = new ArrayList<>();
//         al.add(10);
//         al.add(20);
//         al.add(30);
//         al.add(40);

//         Collections.reverse(al);
//         System.out.println(al);

//     }
// }

// max()
// public class ArrayListEg{
//     public static void main(String arg[]){

//         ArrayList<Integer> al = new ArrayList<>();
//         al.add(55);
//         al.add(23);
//         al.add(20);
//         al.add(183);

//         int maxVal = Collections.max(al);
//         System.out.println(maxVal);

//     }
// }

// min()
// public class ArrayListEg{
//     public static void main(String arg[]){

//         ArrayList<Integer> al = new ArrayList<>();
//         al.add(55);
//         al.add(23);
//         al.add(20);
//         al.add(183);

//         int minVal = Collections.min(al);
//         System.out.println(minVal);

//     }
// }

//frequency()
// public class ArrayListEg{
//     public static void main(String arg[]){

//         ArrayList<Integer> al = new ArrayList<>();
//         al.add(55);
//         al.add(23);
//         al.add(20);
//         al.add(183);
//         al.add(20);
//         al.add(20);

//         int val = Collections.frequency(al,20);
//         System.out.println(val);

//     }
// }

//clone()
// public class ArrayListEg{
//     public static void main(String arg[]){

//         ArrayList<Integer> al = new ArrayList<>();
//         al.add(10);
//         al.add(20);
//         al.add(30);
//         al.add(40);
//         // System.out.println("al :" + al);

//         // Shallow copy
//         // ArrayList al2 = new ArrayList<>();
//         // al2 = (ArrayList)al.clone();
//         // al2.set(3, 27);
//         // // System.out.println("al2 :" + al2);
//         // System.out.println(al2);
//         // System.out.println(al);

//         //Deep copy
//         ArrayList al2 = al;
//         System.out.println(al2);
//         al2.set(2, 27);
//         System.out.println("al :" + al);
//         System.out.println("al2 :" + al2);

//     }
// }

//equals()
// public class ArrayListEg{
//     public static void main(String arg[]){

//         ArrayList<Integer> al = new ArrayList<>();
//         ArrayList al2 = new ArrayList<>();

//         al.add(10);
//         al.add(20);
//         al.add(30);

//         al2.add(10);
//         al2.add(20);
//         al2.add(30);

//         boolean val = al.equals(al2);
//         System.out.println(val);

//     }
// }

//asList()
public class ArrayListEg {
    public static void main(String arg[]) {

        List al = Arrays.asList(10, 20, 30);
        System.out.println(al);

    }
}