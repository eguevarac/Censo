package data_classes;

public class Province {

    private String name;
    private String population;

    public Province(String name, String population){
        this.name = name;
        this.population = population;
    }

    public Province(String name){
        this.name = name;
    }


    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}
