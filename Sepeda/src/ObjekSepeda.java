
public class ObjekSepeda {
    public static void main(String[] args) {
        Sepeda s1 = new Sepeda("Polygon",16,2500000);
        SepedaLipat s2 = new SepedaLipat("Pacific",20,6000000);
        Sepeda s3 = new Sepeda();

        s2.setSpeed(6);

        s3.setMerk("Element");
        s3.setUkuran(16);
        s3.setHarga(1500000);

        s1.infoSepeda();
        s2.infoSepeda();
        s3.infoSepeda();

    }
}
