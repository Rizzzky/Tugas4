public class StudiKebidanan extends Studi {
    String jurusan_kesehatan;
    String gelar;
    
    public StudiKebidanan(String program_studi,int semester){
        super(program_studi, semester);
        jurusan_kesehatan = "KEBIDANAN";
        gelar = "DIPLOMA(D3)";
    }
    
    @Override
    void infoStudi(){
        super.infoStudi();
        System.out.println("4.Jurusan: " + jurusan_kesehatan);
        System.out.println("5.Gelar: " + gelar);
    }
}
