package com.javarush.task.task05.level05.lesson07Инициализация.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //напишите тут ваш код
    private String name;
    private int growth;
    private String color;

    public void initialize (String name){
        this.name = name;
    }

    public void initialize (String name,int growth){
        this.name = name;
        this.growth = growth;
    }

    public void initialize (String name,int growth,String color){
        this.name = name;
        this.growth = growth;
        this.color = color;
    }

}
