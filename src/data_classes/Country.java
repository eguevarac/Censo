package data_classes;

import java.util.ArrayList;

public class Country {

    ArrayList<Comunity> comunities;

    public Country(){
        comunities = new ArrayList<>();
    }

    public void addComunity(Comunity comunity){
        comunities.add(comunity);
    }
}
