    public class Motormatic {
        private String merek; 
        private int kecepatan = 0;
        private boolean kontakOn = false;

    public void setMerek(String newMerek){
            merek = newMerek;

        }
    public void nyalakanMesin(){
            kontakOn = true;
        }
    public void matikanMesin(){
            kontakOn = false;
            kecepatan = 0;
        }
          
    public void tambahKecepatan(){
        if (kontakOn == true){
            kecepatan += 50;
        }
        else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
        if(kecepatan > 100){
            kecepatan = 100;
            System.out.println("Kecepatan motor maksimum adalah 100km!!!");
        }
    }
    
    public void kurangiKecepatan(){
        if(kontakOn == true){
            kecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
   
    public void printStatus(){
        System.out.println("merek montor    : " +merek);
        if (kontakOn == true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan+"\n");
    }
}
    
 