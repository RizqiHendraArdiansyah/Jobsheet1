public class LaptopMain {
    public static void main(String[] args) throws Exception{
    Laptop lp1 = new Laptop();
    Laptop lp2 = new Laptop();

    lp1.merek("Asus Rog");
    lp1.pemilik("Rizqi Hendra");
    lp1.ukuran(14);
    lp1.cetakStatus();

    lp2.merek("Lenovo B40");
    lp2.pemilik("Wisang Garnies");
    lp2.ukuran(14);
    lp2.cetakStatus();
    }
}