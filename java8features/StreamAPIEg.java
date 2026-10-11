package java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamAPIEg {
    public static void main(String[] args) {

        //Stream.of
        // Stream<Integer> s1 = Stream.of(10,20,30,40,50);
        // System.out.println(s1);//java.util.stream.ReferencePipeline$Head@7ad041f3

        // s1.forEach(val->System.out.println(val));// 10 20 30 40 50 (in vertical)


        //stream()
        ArrayList al = new ArrayList<>();
        al.add(1);
        al.add(12);
        al.add(21);
        al.add(4);
        al.add(7);
        // System.out.println(al);//[10, 20, 30, 40, 100]

        //Stream Methods
        // count()
        // System.out.println(s2.count());//5
        // System.out.println(s2);//java.util.stream.ReferencePipeline$Head@7ad041f3
        // s2.forEach(val->System.out.println(val));// 10 20 30 40 100 (in vertical)

        //sorted()- ascending order
        // Stream<Integer> s2 = al.stream();
        // Stream<Integer> s3 = s2.sorted();
        // s3.forEach(val->System.out.println(val));//1 4 7 12 21 (in vertical)

        // sorted()- descending order
        // Stream<Integer> s3 = s2.sorted(Comparator.reverseOrder());
        // s3.forEach(val->System.out.println(val));// 21 12 7 4 1 (in vertical)

        //collect()
        Stream<String> users = Stream.of("html","css","js","java");
        users.forEach(val->System.out.println(val));//html css js java (in vertical)
        Set<String> l1 = users.collect(Collectors.toSet());
        System.out.println(l1);//[html, css, js, java]

        //filter()
        Stream<Integer> num = Stream.of(1,4,7,8,10,12);
        Stream<Integer> n = num.filter(val->val%2==0);
        n.forEach(val->System.out.println(val));//4 8 10 12 (in vertical)
        
        //reduce()
        Stream<Integer> s1 = Stream.of(1,4,7,10);
        Integer x = s1.reduce((a,b)->a+b).get();
        System.out.println(x);//22

        //max() and min()
        // Stream<Integer> s1 = Stream.of(1,4,7,10);
        // System.out.println(s1.max(Comparator.naturalOrder()));//Optional[10]
        // System.out.println(s1.min(Comparator.naturalOrder()));//Optional[1]
    }
}
