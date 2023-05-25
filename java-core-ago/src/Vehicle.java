public class Vehicle {
    String string = "superclass";
    protected String licensePlate = null;
    public void setLicensePlate(String license) {
        this.licensePlate = license;
    }
    public String getLicensePlate(){
        return this.licensePlate;
    }
    public void hehe(){
        System.out.println("hehe from super class");
    }
}
