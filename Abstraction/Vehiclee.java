
// Abstract Class
public abstract class Vehiclee implements Transport{
    
    private int noOfTires;

    public abstract void makeStartSound();

    @Override
    public void getSetGo() {
        System.out.println("going to place...."); 
    }

    public Vehiclee(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public void commute() {
        System.out.println("Going....");
    }
}
