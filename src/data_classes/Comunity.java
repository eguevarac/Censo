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



    public void addProvince(Province province){
        provinces.add(province);
    }

    public void updatePopulation(){
        for (Province pro :
                provinces) {
            population += pro.getPopulation();
        }
    }

    public void showProvinces(){
        System.out.println(this.name.toUpperCase()+ ": (pob -> "+population+")");
        System.out.println("--------------------------------");
        for (Province pro :
                provinces) {
            pro.showMunicipies();
        }
        System.out.println("\n");
    }

    public void showPopulation(){
        System.out.println("Población de " + name + " = " + population);
    }
}
