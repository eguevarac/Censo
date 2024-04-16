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

    /**
     * Convierte el String de población en un int
     * @param populationString La población que figura en el archivo
     * @return int con la población
     */
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
