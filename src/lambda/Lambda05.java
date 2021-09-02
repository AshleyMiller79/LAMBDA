package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda05 {
    public static void main(String[] args) {
//1)1 den 20 ye kadar olan sayıları yazdır
        IntStream.rangeClosed(1,20).forEach(System.out::print);
        System.out.println();
//2) functional programlamayı kullanarak 3 den ile 98 e kadar olan çift tam sayıların toplamını bulun
        System.out.println(IntStream.rangeClosed(3, 98).filter(t -> t % 2 == 0).sum());
        //3) functional programming kullanarak 9! i bul (9!=1*2*3...*9)
        System.out.println(IntStream.rangeClosed(1, 9).reduce(1, Math::multiplyExact));
// 4) İlk 7 çift sayma sayısının çarpımını bulun (2,4,6,8,10,12,14)
        System.out.println(IntStream.rangeClosed(2, 14).filter(t -> t % 2 == 0).reduce(1, Math::multiplyExact));
        //5)  6'dan büyük ilk 150 tek sayma sayısının toplamını bulun ==> 7, 9, 11, 13, 15, 17, 19
        System.out.println(IntStream.iterate(7, t -> t + 2).limit(150).sum());
        //6) İlk 23 çift sayma sayısının toplamını bulun

        System.out.println(IntStream.iterate(2, t -> t + 2).limit(23).sum());
        //7)  11 den 33 e kadar  her tam sayının rakamlarının toplamını hesaplamak için bir metod oluşturun
        IntStream.rangeClosed(11,33).map(metodLambda2::rakamlarToplami).forEach(metodLambda2::bosluklaYazdir);
    }
}
