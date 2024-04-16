package data_classes;

import java.util.ArrayList;

public class Country {

    private ArrayList<Comunity> comunities;
    private int population;
    private String name;


    public Country(String name){
        this.comunities = new ArrayList<>();
        this.population = 0;
        this.name = name;
    }

    public void setComunities(ArrayList<Comunity> comunities) {
        this.comunities = comunities;
    }

    public ArrayList<Comunity> getComunities() {
        return comunities;
    }

    /**
     * Actualiza la población del país
     */
    public void updatePopulation(){
        for (Comunity com :
                comunities) {

            for (Province pro :
                    com.getProvinces()) {

                pro.updatePopulation();
            }
            com.updatePopulation();

            population += com.getPopulation();
        }
    }

    /**
     * Muestra los datos del país
     */
    public void showData(){
        System.out.println(this.name.toUpperCase()+ ": (pob -> "+population+")");
        System.out.println("\n");
        for (Comunity com :
                comunities) {
            com.showData();
        }
    }
}
