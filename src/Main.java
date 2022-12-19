public class Main {
    public static void main(String[] args)
    {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }

    public static void task3()
    {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    }
    public static void task4()
    {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5()
    {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);
    }
    public static void task6()
    {
        System.out.println("Задача 6");
        var weightBoxer1 = 78.2;
        System.out.println("Вес первого боксера "+ weightBoxer1 +" КГ");
        var weightBoxer2 = 82.7;
        System.out.println("Вес второго боксера "+ weightBoxer2 +" КГ");
        var weightAll = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес бойцов "+ weightAll +" КГ");
        var weightDifference = Math.abs(weightBoxer1 - weightBoxer2);
        System.out.println("Разница в весе "+weightDifference+" КГ");
    }
    public static  void task7()
    {
        System.out.println("Задача 7");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightDifferenceOne = Math.abs(weightBoxer1 - weightBoxer2);
        System.out.println("Разница в весе вариант 1 "+weightDifferenceOne+" КГ");
        var weightDifferenceTwo = weightBoxer2 % weightBoxer1;
        System.out.println("Разница в весе вариант 2 "+weightDifferenceTwo+" КГ");
    }

}