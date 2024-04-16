package data_classes;

public class Municipy {

    private String name;
    private int population;

    public Municipy(String name, String population){
        this.name = name;
        this.population = convertPopulationToInt(population);
    }

    public int getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }

    private int convertPopulationToInt(String populationString){
        String newPopulationString;
        if(populationString.contains(".")){
            newPopulationString = populationString.replace(".","");
        }else{
            newPopulationString = populationString;
        }
        return Integer.parseInt(newPopulationString);
    }

}
