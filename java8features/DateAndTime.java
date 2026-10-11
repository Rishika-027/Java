package java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTime {
    // public static void main(String[] args) {
    //     LocalDate ld = LocalDate.now();
    //     System.out.println(ld);//2026-08-31

    //     LocalTime lt = LocalTime.now();
    //     System.out.println(lt);//16:04:54.441022400

    //     LocalDateTime ldt = LocalDateTime.now();
    //     System.out.println(ldt);//2026-08-31T16:05:35.233758500
    // }

    public static void main(String[] args) {
        // LocalDate ld = LocalDate.now();
        // System.out.println(ld.getDayOfMonth());//31
        // System.out.println(ld.getDayOfYear());//243
        // System.out.println(ld.getMonthValue());//8
        // System.out.println(ld.getYear());//2026
        // System.out.println(ld.getClass());//class java.time.LocalDate
        // System.out.println(ld.getDayOfWeek());//MONDAY
        // System.out.println(ld.getMonth());//AUGUST
        // System.out.println(ld.getChronology());//ISO

        LocalTime lt = LocalTime.now();
        System.out.println(lt.getHour());//16
        System.out.println(lt.getMinute());//15
        System.out.println(lt.getNano());//863398800
        System.out.println(lt.getSecond());//38
    }
}
