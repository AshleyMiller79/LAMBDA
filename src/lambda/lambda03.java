package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambda03 {
    public static void main(String[] args) {
        List<Integer>l=new ArrayList<>(Arrays.asList(7,12,14,4,9,2,4,12,16));
        ilkDortEleman(l);
        System.out.println();
        ilkDortElemanGec(l);
        System.out.println();
        ucElemanYazdir(l);


    }




    //1) küçükten büyüğe sırala sonra ilk 4 elemanı yazdır
    public static void ilkDortEleman(List<Integer> l) {
        l.stream().sorted().limit(4).forEach(metodLambda2::bosluklaYazdir);
    }
    //2) küçükten büyüğe sırala ilk 4 elemanı atla
    public static void ilkDortElemanGec(List<Integer> l) {
        l.stream().sorted().skip(4).forEach(metodLambda2::bosluklaYazdir);
    }

    //3)küçükten büyüğe sıralı, 4. 5. ve 6. elemanı yazdır.7,12,14,4,9,2,4,12,16
                                                       //    2 4 4 7 9 12 12 14 16
    public static void ucElemanYazdir(List<Integer> l) {
        l.stream().sorted().skip(3).limit(3).forEach(metodLambda2::bosluklaYazdir);
        System.out.println();
        l.stream().sorted().limit(6).skip(3).forEach(metodLambda2::bosluklaYazdir);
    }


}
