package vl3_und_vl6;


class Human {
    String name;
    int alter;
    char geschlect;


    // Konstruktor 1
    Human() {
    }

    // Konstruktor 2
    Human(String name) {
        this.name = name;
    }

    // Konstruktor 2
    Human(String name, int alter, char geschlect) {
        this.name = name;
        this.alter = alter;
        this.geschlect = geschlect;
    }


}
//-----------------------------------------------------


class Car{
    String farbe;
}


//-----------------------------------------------------

public class OOP2 {
    public static void main(String[] args) {

        Human human_objekt_1 = new Human("Joudi", 21, 'W');
        Human human_objekt_2 = new Human("Mohammad", 20, 'M');
        Human human_objekt_3 = new Human();
        Human human_objekt_4 = new Human("Ali");


        System.out.println(human_objekt_1.name); // null
        System.out.println(human_objekt_1.alter); // 0
        System.out.println(human_objekt_1.geschlect); // \u0000

        human_objekt_3.name = "Ahmad";
        human_objekt_3.alter = 22;
        human_objekt_3.geschlect = 'M';



        Car car_objekt_1 = new Car();
        car_objekt_1.farbe = "rot";

        System.out.println(human_objekt_1.name); // Joudi
        System.out.println(car_objekt_1.farbe); // rot

    }
}
