public class SepedaLipat extends Sepeda {
    String tipe;
    int speed;

    public SepedaLipat(String merk, int ukuran_ban, int harga){
        super(merk, ukuran_ban,harga );
        tipe = "Sepeda Lipat Kota";
    }

    void setSpeed(int speed){
        this.speed = speed;
    }

    int getSpeed(){
        return speed;
    }

    @Override
    void infoSepeda(){
        super.infoSepeda();
        System.out.println("Tipe: " + tipe);
        System.out.println("Speed: " + getSpeed());
        System.out.println("---------------------------------------");
    }
}
