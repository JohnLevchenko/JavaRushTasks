package com.javarush.task.task10.ПреобразованиеТипов;

/* 
Задача №3 на преобразование целых типов
Добавить одну операцию по преобразованию типа, чтобы получался ответ: b=0
float f = (float)128.50;
int i = (int)f;
int b = (int)(i + f);
*/

public class SolutionДобавьОперацию {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (int)(byte) (i + f);
        System.out.println(b);

    }
}
