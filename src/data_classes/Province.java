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

    public int getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

    public void setMunicipies(ArrayList<Municipy> municipies) {
        this.municipies = municipies;
    }

    /**
     * Muestra los datos de la provincia
     */
    public void showData(){
        System.out.println("  - " + this.name + ": (pob -> "+population+")");
        for (Municipy mun :
                municipies) {
            System.out.println("    * " + mun.getName() + ": (pob -> " + mun.getPopulation() + ")");
        }
    }

    /**
     * Actualiza la población de la provincia
     */
    public void updatePopulation(){
        for (Municipy mun :
                municipies) {
            population += mun.getPopulation();
        }
    }
}
