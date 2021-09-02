package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda06 {
    public static void main(String[] args) {

        UniversiteLambda6 edebiyatBolum = new UniversiteLambda6("FenEdebiyat", "Edebiyat", 97, 128);
        UniversiteLambda6 iktisatBolum = new UniversiteLambda6("IIBF", "Iktisat", 98, 134);
        UniversiteLambda6 matematikBolum = new UniversiteLambda6("FenEdebiyat", "Matematik", 95, 142);
        UniversiteLambda6 ingilizceBolum = new UniversiteLambda6("IngilizDili", "Ingilizce", 93, 154);

        List<UniversiteLambda6> uniList=new ArrayList<>(Arrays.asList(edebiyatBolum,iktisatBolum,matematikBolum,
                ingilizceBolum));


        //1)Tüm ortalama puanların (91)'den büyük olup olmadığını kontrol etmek için bir yöntem oluşturun
        System.out.println(uniList.stream().allMatch(t -> t.getNotOrtalama()>91));
        //2)Ders adlarından en az birinin "Matem" kelimesini içerip içermediğini kontrol etmek için bir yöntem oluşturun
        System.out.println(uniList.stream().anyMatch(t -> t.getBolum().contains("Matem")));

        //3)Ortalama puanı en yüksek olan kursu yazdırmak için bir yöntem oluşturun
        System.out.println(uniList.stream().sorted(Comparator.comparing(UniversiteLambda6::getNotOrtalama).reversed()).findFirst());

        //4)Not ortalamasına göre artan sıralama yapıp ilk elemanı atla ve list olarak yazdır
        System.out.println(uniList.stream().sorted(Comparator.comparing(UniversiteLambda6::getNotOrtalama)).skip(1).collect(Collectors.toList()));
    }
}
