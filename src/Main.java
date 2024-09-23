public class Main {
    public  static  void main (String[] args)
    {
    //Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog + ", cat = " + cat + ", paper = " + paper);

    //Задача 2
        System.out.println("Задача 2");
        dog = dog+4;
        cat = cat+4;
        paper = paper+4;
        System.out.println("dog = " + dog + ", cat = " + cat + ", paper = " + paper);

    //Задача 3
        System.out.println("Задача 3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog + ", cat = " + cat + ", paper = " + paper);

    //Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.print("friend = "+friend);
        friend += 2;
        System.out.print(" friend = "+friend);
        friend /= 7;
        System.out.println(" friend = "+friend);

        //Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.print("frog = "+frog);
        frog *= 10;
        System.out.print(" frog = "+frog);
        frog /=3.5;
        System.out.print(" frog = "+frog);
        frog += 4;
        System.out.println(" frog = "+frog);

        //Задача 6
        System.out.println("Задача 6");
        var massFirstBoxer = 78.2;
        var massSecondBoxer = 82.7;
        var totalMass = massFirstBoxer + massSecondBoxer;
        System.out.print("Общая масса двух бойцов - "+totalMass+"кг.");
        var massDifference = Math.abs(massFirstBoxer - massSecondBoxer);
        System.out.println(" Разницу между массами бойцов - "+massDifference+"кг.");

        //Задача 7
        System.out.println("Задача 7");
        var massRemainderFromDivision = totalMass%massDifference;
        System.out.println("Остаток от деления между двумя весами - "+massRemainderFromDivision+"кг.");

        //Задача 8
        System.out.println("Задача 8");
        var totalHours = 640;
        var durationWorkingDay = 8;
        var totalEmployees = totalHours/durationWorkingDay;
        System.out.println("Всего работников в компании — "+totalEmployees+" человек");

        totalEmployees += 94;
        totalHours = totalEmployees*durationWorkingDay;
        System.out.println("Если в компании работает — "+totalEmployees+" человек, то всего "+totalHours+
                " часов работы может быть поделено между сотрудниками");
    }
}

