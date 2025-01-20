public class AtheleteThread extends Thread{

    private int bigNumber;

    public AtheleteThread(int bigNumber){
        this.bigNumber = bigNumber;
    }
    public int getBigNumber(){
        return this.bigNumber;
    }
    public void setBigNumber(int bigNumber){
        this.bigNumber = bigNumber;
    }
    @Override
    public void run(){
        double distanceKm = 10;
        double steps = 0.00000001;
        for(double i = 0;i<=distanceKm;i+=steps){
            if(Math.abs(i-distanceKm)<steps){
                System.out.println("\nAthelete number" + bigNumber + "has finished the race. \n");
                break;
            }
        }
    }

    
}