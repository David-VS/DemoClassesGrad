package be.ehb.demo.vormen;

public class Cirkel {

    int straal;

    public Cirkel(int straal){
        this.straal = straal;
    }

    public float oppervlakte(){
        return this.straal * this.straal * 3.14f;
    }

}
