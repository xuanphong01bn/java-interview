public class Recur {
    public int recurFac(int a) {
        if(a==0) return 1;
        if(a==1) return 1;
        return a*recurFac(a-1);
    }

    public int fibo(int a){
        //a: index of fibo
        if(a==0) return 1;
        if (a==1) return 1;
        if(a==2) return 2;
        return fibo(a-1)+fibo(a-2);
    }

    // reverseString
    public String reStr(String a){
        if(a.length()==1) return a;
        if(a.length()==2) return a.substring(1)+ a.charAt(0);
        else return reStr(a.substring(1)) + a.charAt(0);
    }
    // countDown
    public int countDown(int a){
        if (a==0) return 0;
        System.out.print(a+" ");
        return countDown(a-1);
    }

}
