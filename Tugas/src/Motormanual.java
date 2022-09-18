public class Motormanual extends Motormatic{
 
    private int gear = 1;
   
    public void tambahGear(int newGear){
        if(gear>6){
            System.out.println("Gear sudah mencapai maksimum");
        }
        else{
            gear+=newGear;
        }
    }

    public void kurangGear(int newGear){
        if(gear<1){
            System.out.println("Gear masih rendah");
        }
        else{
            gear-=newGear;
        }
    }

    public void printStatus(){
        super.printStatus();
        System.out.println("Jumlah gear sekarang : "+ gear);
    }
}
