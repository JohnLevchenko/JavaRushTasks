package com.javarush.task.task12АбстрактныеКлассыПолиморфизмИнтерфейсы.task12ПереопределениеМетодов.task1201;

/* 
Я не корова, Я - кит
Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:

Я не корова, Я - кит.
*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public  String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        public  String getName() {
            return "Я не корова, Я - кит.";
        }

    }
}
