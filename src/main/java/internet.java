import javax.swing.*;

/**
 * Created by mczochar on 25.02.17.
 */
public class internet {
    public void verbunden(){
        System.out.println("Sie sind verbunden");
    }

    public void trennen(){
        System.out.println("Sie werden getrennt");
    }

    public int onlinezeit(int zahl1, int zahl2){
        onlinzeitgestern();
        return (zahl1 + zahl2);
    }

    public static void onlinzeitgestern(){
        System.out.println("Gerstern waren es 8 min");
    }

    public static void dialog(String text){
        int rückgabe = JOptionPane.showConfirmDialog(null,text);
        System.out.println(rückgabe);
        //return rückgabe;

        if (rückgabe == 0){
            JOptionPane.showMessageDialog(null,"Die Eingabe war JA");
        } else if (rückgabe == 1){
            JOptionPane.showMessageDialog(null,"Die Eingabe war NEIN");
        } else if (rückgabe == 2) {
            JOptionPane.showMessageDialog(null,"Die Eingabe war Abbruch");
        }
    }

    public static void tryandcatch(){
        String input = JOptionPane.showInputDialog(null,"Gib eine Zahl ein");
        try{
            int zahl = Integer.parseInt(input);
            JOptionPane.showMessageDialog(null, "Deine Eingabe war: " + zahl);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Deine Eingabe war keine zahl. Eingabe war: " + input);
        }finally {
            JOptionPane.showMessageDialog(null, "Programm mit Fehler abgelaufen ...");
        }
    }
}
