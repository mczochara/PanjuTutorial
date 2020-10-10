/**
 * Created by mczochar on 24.02.17.
 */
import java.util.Random;
import java.util.Scanner;

public class mainclass {
    public static void main (String[] args) {
        System.out.println("Hello World :)");

        int zahl1 = 5;
        String zahl2 = "5";

        // Parsen eines Strings in einen Integer
        int zahl3 = Integer.parseInt(zahl2);

        int sum = zahl1 + zahl3;
        System.out.println(sum);

        // Parsen eines Integers zum String
        String zahl4 = String.valueOf(sum);
        System.out.println(zahl4);

        // Casten von Datentypen int nach double
        int zahl5 = 5;
        // zahl5 ist eine zahl vom typ integer, damit die berechnung funktioniert muss der datentyp gewandelt werden
        double zahl6 = (double) zahl5;
        double zahl7 = 5.6;
        System.out.println(zahl6 + zahl7);

        // Aufruf von Methoden ohne und mit Rückgabewert
        schreibeText("Benutze jetzt eine Methode");
        System.out.println(schreibeTextUndGibZuück( 3,  4));

        // User input und Ausgabe mit der importierten Klasse Scanner
//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Your input was: " + userInput.nextLine());

        altersCheck(20);
        switcher(25);
        increment(2);
        schleife();
        konditionelleroperator(99999);

        internet wurst = new internet();
        wurst.verbunden();
        System.out.println("Sie waren " + wurst.onlinezeit(3,5) + " Min online");
        wurst.trennen();

        // Confirm und Message Dialog
        //wurst.dialog("Was antwortest Du?");

        // try and catch
        //wurst.tryandcatch();

        //Getter und Setter
        GetterUndSetter getUndSet = new GetterUndSetter();
        getUndSet.setBossname("Pavel");
        System.out.println(getUndSet.getBossname());

        for (int var1=0; var1 < 5 ; var1++){
            System.out.println(var1 + " " + getUndSet.getBossname());
        }

        do_while();

        Internet2 object1 = new Internet2("Hugo");
        Internet2 object2 = new Internet2("Willy");
        object1.printName();
        object2.printName();

        enhancedLoop();

        randomZahlen();

        auto();

        // eine Klasse mit mehreren verschiedenen Konstruktoren
        motorrad();
        // Vererbung
        vererbungMotorrad();

    }

    public static void schreibeText(String text) {
        System.out.println(text);
    }

    public static int schreibeTextUndGibZuück(int zahl1, int zahl2) {
        System.out.println("Ausgabe der Summe: " + (zahl1+zahl2));
        return (zahl1+zahl2);
    }

    public static void altersCheck(int alter){
        if (alter < 16){
            System.out.println("Kein Alk");
        } else if (alter == 16) {
            System.out.println("Nur Bier unf Wein");
        } else {
            System.out.println("Alles gibts");
        }
    }

    public static void switcher(int text){
        switch (text){
            case 15:{
                System.out.println("Die übergabe war: 15 " + text);
                break;
            }
            case 17: {
                System.out.println("Die übergabe war: 17 " + text);
                break;
            }
            case 25: {
                System.out.println("Die übergabe war: 25 " + text);
                break;
            }
            default: {
                System.out.println("Die übergabe war: default");
                break;
            }
        }
    }

    public static void increment(int zahl){
        ++zahl;
        System.out.println(zahl);
        zahl++;
        System.out.println(zahl);
        zahl+=10;
        System.out.println(zahl);
    }

    public static void schleife(){
        int zahl = 0;
        while (zahl<= 10){
            System.out.println("Zahl: " + zahl);
            zahl++;
        }
    }

    public static void konditionelleroperator(int zahl){
        // wenn Bedingung erfüllt ? DANN : SONST
        System.out.println(zahl > 10000 ? "Große Zahl" : "Kleine Zahl");
    }

    public static void do_while(){
        GetterUndSetter getUsetObject = new GetterUndSetter();
        getUsetObject.setBossname("Hugo");
        int var2 = 1;
        do{
            System.out.println(var2 + " " + getUsetObject.getBossname());
            var2++;
        }while (var2 < 5);
    }

    public static void enhancedLoop(){
        String[] tierchen = {"Hund","Katze","Maus"};
        for (String pets : tierchen){
            System.out.println(pets);
        }

        int[][] namen = {{1,2},{3,4,5},{6}};

        for (int[] index : namen){
            for (int i : index)
            System.out.println(i);
        }
    }

    public static void randomZahlen(){
        Random zahl = new Random();
        for (int i=0; i<10; i++){
            int a = zahl.nextInt(1000000);
            System.out.println(a);

        }
    }

    public static void auto(){
        Auto obj1 = new Auto("Blau",200);
        Auto obj2 = new Auto("grau", 100);
        System.out.println(obj1.getFarbe() + "/" + obj1.getPs() +"/" + obj1.getTür());
        System.out.println(obj2.getFarbe() + "/" + obj2.getPs() +"/"+ obj2.getTür());
        obj1.updateTür(3);
        System.out.println(obj1.getFarbe() + "/" + obj1.getPs() +"/" + obj1.getTür());
        System.out.println(obj2.getFarbe() + "/" + obj2.getPs() +"/"+ obj2.getTür());

    }

    public static void motorrad(){
        Motorrad moto1 = new Motorrad("Honda", 200);
        Motorrad moto2 = new Motorrad();
        System.out.println("Das Motorrad der Marke " + moto1.getMarke() + " hat " + moto1.getPs() + "PS");
        System.out.println("Das Motorrad der Marke " + moto2.getMarke() + " hat " + moto2.getPs() + "PS");

    }

    public static void vererbungMotorrad(){
        Honda h1 = new Honda();
        h1.printMarkePs();
    }


}
