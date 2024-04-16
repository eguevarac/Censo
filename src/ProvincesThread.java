import data_classes.Comunity;
import data_classes.Province;

public class ProvincesThread extends Thread{

    private Province province;

    public ProvincesThread(Province province){
        this.province = province;
    }

    @Override
    public void run() {
        super.run();
        province.setMunicipies(FilesRW.readMunicipies(province.getName()));

    }
}
