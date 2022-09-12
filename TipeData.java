package tipedata;
public class TipeData {
    public static void main(String[] args) {
    //Non Primitif
        String Nama = "Hijrana";
        String NIM = "D0221082";
        String Prodi = "Teknik Informatika";
        String Fakultas = "Teknik";
    
    //Primitif
        byte Angkatan = 21;
        short Umur = 19;
        int BB = 45;
        long TB = 150;
        float IP = 3.44f;
        double IPK = 3.66;
        boolean Status_Mahasiswa = true;
        char Kelas ='F';
        
        System.out.println("Nama: "+Nama);
        System.out.println("NIM: "+NIM);
        System.out.println("Prodi: "+Prodi);
        System.out.println("Fakultas: "+Fakultas);
        
        System.out.println("Saya Adalah Angkatan:"+Angkatan);
        System.out.println("Umur Saya Sekarang:"+Umur);
        System.out.println("Berat Badan Saya:"+BB);
        System.out.println("Tinggi Badan Saya:"+TB);
        System.out.println("Sekarang IP Saya Yaitu:"+IP);
        System.out.println("Sedangkan IPK Saya Ada:"+IPK);
        System.out.println("Dan Status Saya Yaitu Sebagai Mahasiswa "+Status_Mahasiswa);
        System.out.println("Saat Ini Saya Berada Dikelas:"+Kelas);
        
    }
    
}
