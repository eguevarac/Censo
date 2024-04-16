import data_classes.Comunity;
import data_classes.Country;
import data_classes.Province;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Country country = new Country("España");
        country.setComunities(FilesRW.readComunities());


        setComunities(country);
        setProvinces(country);

        country.updatePopulation();

        country.showData();
    }


    /**
     * establece las comunidades del país
     * @param country el objeto Country en el que añadiremos las comunidades
     */
    private static void setComunities(Country country) {
        ArrayList<ComunitiesThread> comThreads = new ArrayList<>();
        for (Comunity com :
                country.getComunities()) {
            ComunitiesThread comThread = new ComunitiesThread(com);
            comThreads.add(comThread);
        }

        for (ComunitiesThread comThread :
                comThreads) {
            comThread.start();
        }

        for (ComunitiesThread comThread :
                comThreads) {
            try {
                comThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * establece las provincias de cada comunidad
     * @param country el objeto Country donde serán añadidas las provincias
     */
    private static void setProvinces(Country country) {
        ArrayList<ProvincesThread> proThreads = new ArrayList<>();
        for (Comunity com :
                country.getComunities()) {
            for (Province pro :
                    com.getProvinces()) {
                ProvincesThread proThread = new ProvincesThread(pro);
                proThreads.add(proThread);
            }
        }

        for (ProvincesThread proThread :
                proThreads) {
            proThread.start();
        }

        for (ProvincesThread proThread :
                proThreads) {
            try {
                proThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}