package utils;

import data_classes.Comunity;
import data_classes.Municipy;
import data_classes.Province;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Almacena todos los métodos referentes a la lectura y/o escritura de ficheros
 */
public class FilesRW {

    /**
     * Extrae todas las comunidades del archivo de comunidades
     * @return ArrayList con cada una de las comunidades
     */
    public static ArrayList<Comunity> readComunities() {

        String line;
        ArrayList<Comunity> comunities = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/arxius/Comunitats.csv"))) {

            while ((line = br.readLine()) != null) {
                comunities.add(new Comunity(line));
            }

        } catch (FileNotFoundException e) {

            System.out.println("NO SE HA ENCONTRADO EL FICHERO");

        } catch (IOException e) {

            System.out.println("ERROR DURANTE LA LECTURA DEL FICHERO");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("INFORMACIÓN MAL GUARDADA EN EL FICHERO");
        }
        return comunities;
    }

    /**
     * Extrae todas las provincias de una comunidad de su archivo pertinente
     * @param nameComunity el nombre de la comunidad a la que le añadiremos las provincias
     * @return ArrayList con las provincias
     */
    public static ArrayList<Province> readProvincesFromComunity(String nameComunity) {

        String line;
        ArrayList<Province> provinces = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/arxius/Comunitats/"+nameComunity+".csv"))) {

            while ((line = br.readLine()) != null) {
                provinces.add(new Province(line));
            }

        } catch (FileNotFoundException e) {

            System.out.println("NO SE HA ENCONTRADO EL FICHERO");

        } catch (IOException e) {

            System.out.println("ERROR DURANTE LA LECTURA DEL FICHERO");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("INFORMACIÓN MAL GUARDADA EN EL FICHERO");
        }
        return provinces;
    }


    /**
     * Extrae los datos de una provincia de su archivo pertinente
     * @return ArrayList con todas las provincias
     */
    public static ArrayList<Municipy> readMunicipies(String nameProvince) {

        String fileURL = "src/arxius/Provincies/"+ nameProvince + ".csv";
        String line;
        String[] data;
        ArrayList<Municipy> municipies = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileURL))) {

            while ((line = br.readLine()) != null) {

                data = line.split(";");
                municipies.add(new Municipy(data[0], data[1]));
            }

        } catch (FileNotFoundException e) {

            System.out.println("NO SE HA ENCONTRADO EL FICHERO");

        } catch (IOException e) {

            System.out.println("ERROR DURANTE LA LECTURA DEL FICHERO");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("INFORMACIÓN MAL GUARDADA EN EL FICHERO");
        }
        return municipies;
    }




}
