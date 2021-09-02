package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class LambdaFile07 {
    public static void main(String[] args) {
        //functional programming kullanarak bir dosya nasıl okunur

        try {
            Files.lines(Paths.get("C:\\Users\\ipek\\IdeaProjects\\untitled2\\src\\lambda\\LambdaFile")).forEach(t->System.out.println(t));
        } catch (IOException e) {
            System.out.println(e);;
        }

        //Tüm karakterleri büyük harfe dönüştürün ve okuyun

        try {
            Files.lines(Paths.get("C:\\Users\\ipek\\IdeaProjects\\untitled2\\src\\lambda\\LambdaFile")).map(String::toUpperCase).forEach(t->System.out.println(t));
        } catch (IOException e) {
            System.out.println(e);
        }

          //metindeki farklı kelimeleri yazdır
        try {
            Files.lines(Paths.get("C:\\Users\\ipek\\IdeaProjects\\untitled2\\src\\lambda\\LambdaFile")).map(t->t.split(" ")).
                    flatMap(Arrays::stream).map(t->t.replaceAll("\\W","")).distinct().forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }
        // metinde "e" içeren tüm kelimeleri yazdırın. (sayısınıda yazdırabilirsin)


        try {
            Files.lines(Paths.get("C:\\Users\\ipek\\IdeaProjects\\untitled2\\src\\lambda\\LambdaFile")).
                    map(t->t.split(" ")).flatMap(Arrays::stream).filter(t->t.contains("e")).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
