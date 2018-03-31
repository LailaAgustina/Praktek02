package praktek02;
public class PenjualanTasAksi {
    public static void main(String[] args) {
        PenjualanTas r1 = new PenjualanTas();
        r1.hrgtas = 150000;
        r1.jmlbeli = 3;
        
        r1.cetakInfo();
        System.out.println("Total PenjualanTas = "+r1.hitungTotal());
        r1.cetakTotal();
        
        
        PenjualanTas r2 = new PenjualanTas();
        r2.cetakInfo();
        
        PenjualanTas r3 = new PenjualanTas(300000,2);
        r3.cetakInfo();
    }
}
