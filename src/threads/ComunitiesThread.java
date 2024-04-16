package threads;

import data_classes.Comunity;
import data_classes.Country;

public class ComunitiesThread extends Thread{

    private Comunity comunity;

    public ComunitiesThread(Comunity comunity){
        this.comunity = comunity;
    }

    @Override
    public void run() {
        super.run();
        comunity.setProvinces(FilesRW.readProvincesFromComunity(comunity.getName()));

    }
}
