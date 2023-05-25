public class Car extends Vehicle {
    int numOfSeat = 0;
    String string = "subclass";
    protected String licensePlate = null;
    public int getNumberOfSeats(){
        return this.numOfSeat;
    }
    @Override
    public String getLicensePlate(){
        return this.licensePlate;
    }

    public void updateLicense(String license){
        this.licensePlate = license;
    }
    @Override
    public void hehe(){
        super.hehe();
    }
}
