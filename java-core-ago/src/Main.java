public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Car car = new Car();
        car.setLicensePlate("123");
        car.updateLicense("abc");

        System.out.println("license :" + car.getLicensePlate());
    }

}
