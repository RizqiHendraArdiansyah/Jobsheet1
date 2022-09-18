public class Laptop {
    private String pemilik;
    private String merek;
    private int ukuranLayar;

    public void pemilik(String newValue){
        pemilik = newValue;
    }
    public void merek(String newValue){
        merek = newValue;
      }
    public void ukuran(int newValue){
        ukuranLayar= newValue;
    }
    public void cetakStatus(){
        System.out.println("Pemilik laptop : " + pemilik);
        System.out.println("Merek laptop : " + merek);
        System.out.println("Ukuran laptop : " + ukuranLayar);
    }
}