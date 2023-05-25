public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Outer.Inner inner = new Outer.Inner();
        inner.printText();
    }
}
