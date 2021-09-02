package lambda;

public class metodLambda2 {
    public static void bosluklaYazdir(Object o)  {
        System.out.print(o+" ");

    }
    public static boolean ciftMi(int x) {
     return   x%2==0;
    }
    public static boolean tekMi(int x) {
        return   x%2==1;
    }
    public static int kareAl(int x){
        return x*x;
    }
    public static int kupAl(int x){
        return x*x*x;
    }
    public static int rakamlarToplami(int x) {
        int toplam=0;
        while (x!=0){
        toplam=toplam+x%10;
        x=x/10;}
      return toplam;

    }


}
