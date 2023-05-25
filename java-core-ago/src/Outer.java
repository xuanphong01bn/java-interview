public class Outer {

    private static String text = "I am private!";

    public static class Inner {

        public void printText() {
            System.out.println(text);
        }
    }
}