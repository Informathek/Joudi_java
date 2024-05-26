package vl3_und_vl6;

class Mensch{
    String name;
    int alter;
    char geschlecht;

    Mensch (String myName, int myAlter, char myGeschlecht){
        name = myName;
        alter = myAlter;
        geschlecht = myGeschlecht;
    }

    static int berechneFlaeche(int mylaenge, int mybreite){
        int flaeche = mylaenge * mybreite;
        int x = 7;
        System.out.println(flaeche);
        return flaeche;
    }
}


public class OOP {
    static int berechneFlaeche(int mylaenge, int mybreite){
        int flaeche = mylaenge * mybreite;
        int x = 7;
        System.out.println(flaeche);
        return flaeche;
    }
    public static void main(String[] args) {
        Mensch mensch1 = new Mensch("Mo", 13, 'M');
        Mensch mensch2 = new Mensch("Bayan", 14, 'W');

        System.out.println(mensch2.alter);

//        mensch1.name = "Mo";
//        mensch1.alter = 13;
//        mensch1.geschlecht = 'M';


//        mensch2.name = "Bayan";
//        mensch2.alter = 14;
//        mensch2.geschlecht = 'W';




    }
}
