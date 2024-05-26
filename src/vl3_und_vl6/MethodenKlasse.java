package vl3_und_vl6;


public class MethodenKlasse {
    static void printSomething(){
        System.out.println("I love java");
        System.out.println("I love java");
        System.out.println("I love java");
        System.out.println("I love java");
        System.out.println("I love java");
        System.out.println("I love java");
        System.out.println("I love java");
        System.out.println("I love java");
        System.out.println("I love java");
        System.out.println("-----------");
    }

    static int berechneFlaeche(int mylaenge, int mybreite){
        int flaeche = mylaenge * mybreite;
        int x = 7;
        System.out.println(flaeche);
        return flaeche;
    }

    public static void main(String[] args) {

//        printSomething();

//        int laenge1 = 6;
//        int breite1 = 3;
//        berechneFlaeche(laenge1, breite1);
//
        int laenge2 = 2;
        int breite2 = 4;
//        berechneFlaeche(laenge2, breite2);
//
//        berechneFlaeche(6, 7);
//        berechneFlaeche(16, 37);
//        berechneFlaeche(6, 74);
//        berechneFlaeche(66, 75);
//        berechneFlaeche(67, 87);
//        int ergebnis = berechneFlaeche(2, 3);
        System.out.println(berechneFlaeche(2, 3));

        double ergebnis2 = Math.pow(2, 3);
        System.out.println(ergebnis2);

        String name = "Bayan";
        int ergebnis3 = name.length();
        System.out.println(ergebnis3);
    }
}
