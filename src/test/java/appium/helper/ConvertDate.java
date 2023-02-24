package appium.helper;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static java.lang.String.valueOf;

public class ConvertDate {

    public static String getDateToday() {
        String output = null;
        Locale locale = new Locale("id", "ID");
        DateFormat sdf1 = new SimpleDateFormat("dd", locale);
        Date date = new Date();
        try {
            output = sdf1.format(date);
            System.out.println(output);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }

    public static String getDateYesterday() {
        String output = null;
        LocalDate date = LocalDate.from(LocalDate.now().minusDays(1));
        try {
            output = valueOf(date);
            System.out.println(output);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("" + date);
        return output.split("-")[2];

    }

    public static String getDateTommorow() {
        String output = null;
        LocalDate date = LocalDate.from(LocalDate.now().plusDays(1));
        try {
            output = valueOf(date);
            System.out.println(output);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("" + date);
        return output.split("-")[2];
    }

    @Test
    public void test() {
        System.out.println(getDateTommorow());
    }

    @Test
    public void test1(){
        List<String>e = new ArrayList<>();
        e.add("tesst1");
        e.add("test2");
        e.add("test3");
        for(int i =0; i< e.size(); i++){
            if(e.get(i).contains("tesst1")){
                System.out.println("hasil"+e.get(i));
            }
        }


    }
}
