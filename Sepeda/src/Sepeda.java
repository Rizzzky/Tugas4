public class Sepeda {
    
    String merk;
    int ukuran_ban;
    int harga;

    Sepeda(String merk, int ukuran_ban, int harga){
        this.merk =  merk;
        this.ukuran_ban = ukuran_ban;
        this.harga = harga;

    }

    //Overloading
    Sepeda(){

    }

    void setMerk(String brand){
        merk = brand;
    }

    void setUkuran(int ukuran_ban){
        this.ukuran_ban = ukuran_ban;
    }

    void setHarga(int harga){
        this.harga = harga;
    }

    String getMerk(){
        return merk;
    }

    int getUkuran(){
        return ukuran_ban;
    }

    int getHarga(){
        return harga;
    }

    void infoSepeda(){
        System.out.println("1.Merk Sepeda: " + getMerk());
        System.out.println("2.Ukuran Ban: " + getUkuran());
        System.out.println("3.Harga Sepeda: " + getHarga());
        System.out.println("---------------------------------------");
    }
}
