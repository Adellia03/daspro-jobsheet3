import java.util.Scanner; 
public class LatihanQuiz {
    public static void main (String [] args) {
        Scanner uang = new Scanner(System.in);
        int uang_saku_harian,uang_jajan,uang_saku_bulanan,selisih,total_pengeluaran,pengeluaran,pendapatan,jumlah_hari;

        System.out.println("Masukkan uang saku harian");
        uang_saku_harian = uang.nextInt();
        System.out.println("Masukkan uang jajan");
        uang_jajan = uang.nextInt();
        System.out.println("Masukkan jumlah hari");
        jumlah_hari = uang.nextInt();        
    

        uang_saku_bulanan = (uang_saku_harian + uang_jajan) * 30;
        selisih = uang_saku_harian - uang_jajan;
        pengeluaran = (uang_jajan * jumlah_hari);
        total_pengeluaran = uang_saku_bulanan - pengeluaran;
        System.out.println("uang saku harian adalah " + uang_saku_harian);
        System.out.println("uang saku jajan adalah " + uang_jajan);
        System.out.println("uang bulanan adalah" + uang_saku_bulanan);
        System.out.println("selisih uang jajan adalah" + selisih);
        System.out.println("pengeluaran uang jajan adalah" + pengeluaran);


    }
}
