package be.ehb.demo.vormen;

public class Cirkel {

    int straal;
    public static int teller = 0;
    public final static float PI = 3.1415f;

    public Cirkel(int straal){
        this.straal = straal;
        teller++;
    }

    public float oppervlakte(){
        return this.straal * this.straal * PI;
    }



}
