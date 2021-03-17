package TasksFromChap4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Chapter 4, task 4.15
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите месяц и год рождения:");
        int monthNumb = Integer.parseInt(reader.readLine());
        int yearNumb = Integer.parseInt(reader.readLine());
        System.out.println("введите текущий месяц и год:");
        int currentMonth = Integer.parseInt(reader.readLine());
        int currentYear = Integer.parseInt(reader.readLine());

        int year = currentYear - yearNumb;
        int month = currentMonth - monthNumb;
        if (month < 1) {
            year -= 1;
            month += 12;
        }
        System.out.println("Чуваку " + year + " лет " + month + " месяцев\n" );

        /** С помощью Date  */
        Date dateOne = null;
        Date dateTwo = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String date1 = "01.02.2018";
        String date2 = "02.11.2019";

        try {
            dateOne = simpleDateFormat.parse(date1);
            dateTwo = simpleDateFormat.parse(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long diff = dateTwo.getTime() - dateOne.getTime();
        long years = diff / (1000*60*60*24*365);
        System.out.println(diff);
        System.out.println(years);

    }
}
