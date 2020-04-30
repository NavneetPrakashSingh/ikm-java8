import com.sun.org.apache.xpath.internal.operations.Bool;

import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//        String a = null;
//        Optional<String> b = Optional.empty();
//        try{
//            System.out.print(a.length());
//            System.out.print(b.orElse("").length());
//        }catch (Exception ex){
//            System.out.print(ex);
//        }
//        finally {
//            a="String";
//            System.out.print(a.length());
//            b=Optional.ofNullable("");
//            System.out.print(b.get().length());
//        }

//        Supplier<String> i = () -> "Car";
//        Consumer<String> c = x -> System.out.print(x.toLowerCase());
//        Consumer<String> d = x-> System.out.print(x.toUpperCase());
//        c.andThen(d).accept(i.get());
//        System.out.println();

//            String str1="My String";
//            String str2 = new String ("My String");
//        System.out.println(str1.hashCode() == str2.hashCode());

//        System.out.println(Element.helium.toString());

//        Boolean c = false;
//        System.out.println((c instanceof Boolean)? "true":"false");
//        YearMonth ym1 = YearMonth.now();
////        System.out.println(ym1.getMonth());
////        YearMonth ym2 = YearMonth.of(2016, Month.FEBRUARY);
//////        System.out.println(ym1.minus(Period.ofMonths(4)).getMonthValue());
//////        System.out.println(ym1.until(ym2, ChronoUnit.MONTHS));
////        System.out.println(ym1.compareTo(ym2));

//        Double d = new Double("1.2d");
////        System.out.println(d);

//        System.out.println(Math.round(Math.random()*10));
//        System.out.println(Math.random(10));

//        System.out.println(String.format("Local Time:%tT", Calendar.getInstance().toString()));
        int x = 1;
        x = x >> 32;
        System.out.println(x);
    }
}
