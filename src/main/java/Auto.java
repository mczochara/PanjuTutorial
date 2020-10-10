/**
 * Created by mczochar on 04.03.2017.
 */
public class Auto {
    private String farbe;
    private int ps;
    static int tür;

    public Auto(String farbe, int ps) {
        this.farbe = farbe;
        this.ps = ps;
    }

    public void updateTür(int tür) {
        this.tür = tür;
    }

    public int getTür() {
        return tür;
    }

    public String getFarbe() {
        return farbe;
    }

    public int getPs() {
        return ps;
    }
}
