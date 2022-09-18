public class Handphone {
    private String merk;
    private String milik;
    private int harga;

    public void merk(String newValue){
        merk = newValue;
    }
    public void milik(String newValue){
        milik = newValue;
    }  
    public void harga(int newValue){
        harga = newValue;
    }
    public void cetakStatus(){
        System.out.println("Merek Handphone : " + merk);
        System.out.println("Pemilik Handphone : " + milik);
        System.out.println("Harga Handphone : " + harga);
        System.out.println();
    }
}
