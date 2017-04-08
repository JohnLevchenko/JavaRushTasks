package com.javarush.task.task05.level05.lesson09Инициализация.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //напишите тут ваш код
    private String name;
    private int weight;
    private int age;
    private String color;
    private String adress;

    public Cat(String name){
        this.name=name;
    }

    public Cat(String name,int weight,int age){
        this.name=name+weight+age;
    }

    public Cat(String name,int age){
        this.name=name+age;
    }

    public Cat(int weight,String color){
        this.weight=weight;
        this.color=color;
    }

    public Cat(int weight,String color,String adress){
        this.weight=weight;
        this.color=color;
        this.adress=adress;
    }

}
