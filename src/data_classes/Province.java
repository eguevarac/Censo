package data_classes;

import java.util.ArrayList;

public class Province {

    private String name;
    private int population;
    private ArrayList<Municipy> municipies;

    public Province(String name){
        this.name = name;
        this.population = 0;
        this.municipies = new ArrayList<>();
    }

    public ArrayList<Municipy> getMunicipies() {
        return municipies;
    }

    public int getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

    public void setMunicipies(ArrayList<Municipy> municipies) {
        this.municipies = municipies;
    }

    public void showMunicipies(){
        System.out.println("  - " + this.name + ": (pob -> "+population+")");
        for (Municipy mun :
                municipies) {
            System.out.println("    * " + mun.getName() + ": (pob -> " + mun.getPopulation() + ")");
        }
    }
    public void updatePopulation(){
        for (Municipy mun :
                municipies) {
            population += mun.getPopulation();
        }
    }
}
