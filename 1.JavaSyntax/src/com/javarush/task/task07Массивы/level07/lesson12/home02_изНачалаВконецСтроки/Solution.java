package com.javarush.task.task07Массивы.level07.lesson12.home02_изНачалаВконецСтроки;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++)
        {
            list.add(reader.readLine());
        }
        for (int i = 0; i < m; i++)
        {
            String a = list.get(0);
            list.remove(0);
            list.add(a);

        }
        for (String in : list)
            System.out.println(in);
    }
}
