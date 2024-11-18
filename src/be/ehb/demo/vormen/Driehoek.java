package be.ehb.demo.vormen;

public class Driehoek {
    //eigenschappen driehoek -> datamember
    int hoogte;
    int basis;

    //functies, wat kan je met een driehoek
    //hoe maak ik een driehoek -> Constructor
    public Driehoek(int basis, int hoogte){
        //this verwijst naar eigen datamembers
        this.basis = basis;
        this.hoogte = hoogte;
    }

    //hoe pas ik een waarde aan -> setter
    public void setHoogte(int hoogte){
        this.hoogte = hoogte;
    }

    public float opppervlakte(){
        return (this.basis * this.hoogte) / 2.0f;
    }
}
