package List.Vector;

import java.util.ArrayList;
import java.util.Vector;

// public class VectorEg {
//     public static void main(String args[]){

//         Vector vec = new Vector<>();
//         vec.add(10);
//         vec.add(null);
//         vec.add("hello");
//         vec.add(true);
//         vec.add(null);
//         vec.add(null);

//         System.out.println(vec);
//     }

// }

// ThreadSafety Demo
public class VectorEg {

    public static void main(String args[]) throws InterruptedException {
        int totalThreads = 5;
        int elementsPerThreads = 1000;
        int finalElements = totalThreads * elementsPerThreads; // 5000

        ArrayList al = new ArrayList<>();
        Vector vec = new Vector<>();

        // Creating array of threads
        Thread threads[] = new Thread[totalThreads];

        // adding elements into the both the collections
        Runnable task = () -> {
            for (int i = 0; i < elementsPerThreads; i++) {
                al.add(i);
                vec.add(i);
            }
        };

        for (int i = 0; i < totalThreads; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("FinalElements:" + finalElements);
        System.out.println("elements in Arraylist:" + al.size());
        System.out.println("elements in Vector:" + vec.size());

    }
}