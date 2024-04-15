package data_classes;

import java.util.ArrayList;

public class Comunity {

    ArrayList<Province> provinces;
    String name;

    public Comunity(String name){
        this.name = name;
        this.provinces = new ArrayList<>();
    }

    public Comunity(String name, ArrayList<Province> provinces){
        this.name = name;
        this.provinces = provinces;
    }

    public ArrayList<Province> getProvinces() {
        return provinces;
    }

    public void setProvinces(ArrayList<Province> provinces) {
        this.provinces = provinces;
    }

    public void addProvince(Province province){
        provinces.add(province);
    }

}
