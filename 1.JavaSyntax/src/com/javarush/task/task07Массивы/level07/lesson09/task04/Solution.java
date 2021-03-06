package com.javarush.task.task07Массивы.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list.add("люда"); //2
        list = fix(list);


    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++)
        {
            char[] chars = list.get(i).toCharArray();
            boolean l = false;
            boolean r = false;

            for (int j = 0; j < chars.length; j++)
            {
                if (chars[j]=='л')
                    l = true;
                if (chars[j]=='р')
                    r = true;
            }

            if (l==true & r==true)
                System.out.println(list.get(i));
            else if (l==true & r!=true)
            {
                System.out.println(list.get(i));
                System.out.println(list.get(i));
            }
            else if (r==true & l!=true)
                list.remove(i);


        }
        return list;
    }
}