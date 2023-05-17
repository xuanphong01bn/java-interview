public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Recur recur = new Recur();
        System.out.println(recur.recurFac(5));
        //fibo
        System.out.println(recur.fibo(5));
        //reverse string
        String a = "ABCD";
        System.out.println(recur.reStr(a));
        System.out.println(a.substring(a.length()-1));
        //countdown
        System.out.println(recur.countDown(4));
    }
}
