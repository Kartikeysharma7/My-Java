import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.*;
public class localeDemo {
    static void printTotal(Locale locale){
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        System.out.println(nf.format(45320));
    }
    static void printDate(Loacale locale){
        Date date = new Date();
        DateFormat dtf = DateFormat.getDateInstance(DateFormat.FULL,locale);
        System.out.println(dtf.format(date));
    }
        public static void main(String[] args) 
            Locale locale = locale.of("en","US");
            printTotal(locale);
            printDate(locale);
}

