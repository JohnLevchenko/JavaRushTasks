
package com.javarush.task.task06.level06.lesson11_ещеStaticИсортировкаЧисел.bonus01Макс_из_2хЧисел;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде «Max is 25»
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static int max = 100;
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        String max = "Max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        Solution.max = a > b ? a : b;

        System.out.println(max + Solution.max);
    }

}
