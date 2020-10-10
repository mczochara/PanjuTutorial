/**
 * Created by mczochar on 11.03.2017.
 */
public class Motorrad {
    private String marke;
    private int ps;

    public Motorrad(){
        this("Junak",100);
    }

    public Motorrad(String marke){
        this(marke, 100);
    }

    public Motorrad(String marke, int ps){
        setMotorrad(marke,ps);
    }

    public void setMotorrad(String marke, int ps){
        setMarke(marke);
        setPs(ps);
    }

    public void setMarke(String marke){
        this.marke=marke;
    }

    public void setPs(int ps){
        this.ps=ps;
    }

    public String getMarke(){
        return this.marke;
    }

    public int getPs(){
        return this.ps;
    }

    public void printMarkePs(){
        System.out.println("Die Daten lauten: " + this.marke + " und " + this.ps);
    }
}
