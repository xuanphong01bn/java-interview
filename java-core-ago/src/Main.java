public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        SubInterface sub = new SubInterface();
        sub.sayHello();
        System.out.println("hello "+InterfaceClass.hello);
    }
}
