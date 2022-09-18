public class Motormain {
        public static void main(String[] args) throws Exception 
        {
            // Buat dua buah objek motor
            Motormatic mtr1 = new Motormatic();
            Motormanual mtr2 = new Motormanual();
    
            // Panggil method didalam objek motor
            mtr1.setMerek("Beat");
            mtr1.nyalakanMesin();
            mtr1.tambahKecepatan();
            mtr1.kurangiKecepatan();
            mtr1.printStatus();
            
            mtr2.setMerek("Supra");
            mtr2.nyalakanMesin();
            mtr2.tambahKecepatan();
            mtr2.kurangiKecepatan();
            mtr2.tambahGear(2);
            mtr2.kurangGear(0);
            mtr2.printStatus();
    }
}
