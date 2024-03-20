public class Studi {
    
    String program_studi;
    int jumlah_mahasiswa;

    Studi(String program_studi,int jumlah_mahasiswa){
        this.program_studi = program_studi;
        this.jumlah_mahasiswa = jumlah_mahasiswa;
    }

    //Overloading
    Studi(){

    }

    void setProgram(String prodi){
        program_studi = prodi;
    }

    void setJumlah(int jumlah_mahasiswa){
        this.jumlah_mahasiswa = jumlah_mahasiswa;
    }

    String getProgram(){
        return program_studi;
    }

    int getJumlah(){
        return jumlah_mahasiswa;
    }

    void infoStudi(){
        System.out.println("-----------------------------------");
        System.out.println("1.Program Studi: " + getProgram());
        System.out.println("2.Jumlah Mahasiswa: " + getJumlah());
        
    }


}
