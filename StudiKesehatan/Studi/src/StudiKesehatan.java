public class StudiKesehatan extends Studi{
    String jurusan_kesehatan;
    String gelar;
    
    public StudiKesehatan(String program_studi,int semester){
        super(program_studi, semester);
        jurusan_kesehatan = "KEPERAWATAN";
        gelar = "STRATA SATU(S1)";
    }
    
    @Override
    void infoStudi(){
        super.infoStudi();
        System.out.println("4.Jurusan: " + jurusan_kesehatan);
        System.out.println("5.Gelar: " + gelar);
    }
}
