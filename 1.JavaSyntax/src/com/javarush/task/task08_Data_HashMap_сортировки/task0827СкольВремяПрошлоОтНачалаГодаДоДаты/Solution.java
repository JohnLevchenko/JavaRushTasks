package com.javarush.task.task08_Data_HashMap_сортировки.task0827СкольВремяПрошлоОтНачалаГодаДоДаты;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года — нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 2 2013"));

    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat formater = new SimpleDateFormat("MMM d yyyy", Locale.US);
        Date givenDate = formater.parse(date);
        Date yearStart = new Date(givenDate.getYear(), 0, 0);
        long interval = givenDate.getTime() - yearStart.getTime();

        int dayCounter = (int) (interval/(24*60*60*1000));
        if ((dayCounter % 2) == 1){
            return true;
        }
        else return false;
    }
}
