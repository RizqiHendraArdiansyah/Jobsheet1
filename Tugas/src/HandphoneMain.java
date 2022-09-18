public class HandphoneMain {
    public static void main(String[] args) throws Exception{
        Handphone hp1 = new Handphone();
        Handphone hp2 = new Handphone();
        Handphone hp3 = new Handphone();
    
        hp1.merk("Samsung galaxy s22");
        hp1.milik("Rizqi Hendra");
        hp1.harga(22000000);
        hp1.cetakStatus();
    
        hp2.merk("Iphone 14");
        hp2.milik("Rasyid Razeka");
        hp2.harga(23000000);
        hp2.cetakStatus();

        hp3.merk("Xiaomi Redmi 9 5G");
        hp3.milik("Bangkit Maulana");
        hp3.harga(5000000);
        hp3.cetakStatus();
        }
}
