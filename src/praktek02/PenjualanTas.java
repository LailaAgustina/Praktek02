package praktek02;
public class PenjualanTas {
  int hrgtas;
  int jmlbeli;
  
  void cetakInfo(){
     System.out.println("=====================");
     System.out.println("hrgtas   : "+hrgtas);
     System.out.println("jmlbeli  : "+jmlbeli);
     System.out.println("=====================");
  }
  
  int hitungTotal(){
      int total;
      total=hrgtas*jmlbeli;
      return total;
  }
}
