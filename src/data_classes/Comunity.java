package data_classes;

import java.util.ArrayList;

public class Comunity {

    private ArrayList<Province> provinces;
    private String name;
    private int population;


    public Comunity(String name){
        this.name = name;
        this.provinces = new ArrayList<>();
        this.population = 0;
    }

    public ArrayList<Province> getProvinces() {
        return provinces;
    }

    public int getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

    public void setProvinces(ArrayList<Province> provinces) {
        this.provinces = provinces;
    }


    /**
     * Actualiza la población de la comunidad
     */
    public void updatePopulation(){
        for (Province pro :
                provinces) {
            population += pro.getPopulation();
        }
    }

    /**
     * Muestra los datos de la comunidad
     */
    public void showData(){
        System.out.println(this.name.toUpperCase()+ ": (pob -> "+population+")");
        System.out.println("--------------------------------");
        for (Province pro :
                provinces) {
            pro.showData();
        }
        System.out.println("\n");
    }
}
