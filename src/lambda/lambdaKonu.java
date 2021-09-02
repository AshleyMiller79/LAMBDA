package lambda;



    public class lambdaKonu {
        //slayt2 =>filter a kadar


 /* Lambda "Functional Programming"                                  Java "Structured Programming"
     1) "nasıl yaparım" değil " ne yaparım"                     ne yaparımdan çok nasıl yaparım düşünülür
     2) kod kısalığı kod okunabilirliği ve                     kod genelde uzundur, başkası sizin ne yaptığınızı
     hatasız kod yazma bakımından çok faydalıdır.              anlayamayabilir, özellikle parantez hatası yapma
     3) Lambda sadece collecions larda (List Queue, Set)        olasılığı yükselir
     ve Arraylerde kullanılabilir
        */
        //javada Lambda fonksiyonları (metodları) sadece Fonksiyonel Interface ler (lambda da bulunan metodlar=> filter, reduce  ...gibi)
        //kullanıcı isterse kendi fonksiyonel interface sini (metodunu) yazabilir =>mesela bir çift sayı belirleme metodu
        // oluşturup lambda da onu kullanabiliriz
        //Stream (akış) bir API'dir ve nesne koleksiyonlarını işlemek için kullanılır.API:Uygulama programlama arayüzü
        // (İngilizce: Application Programming Interface, kısaca API), bir yazılımın başka bir yazılımda tanımlanmış işlevlerini
        // kullanabilmesi için oluşturulmuş bir tanım bütünüdür.API, yazılım bileşeniyle olan etkileşimlerin bir özelliğidir.
        //Bu da örnek olarak şu anlama gelir. Bir arabanın bir yazılımı olduğunu hayal edin. Bu arabanın API'si arabanın neler
        // yapabileceği hakkında bilgi içerir; hızlanma, frenleme, camları açma, vs. Ayrıca bunların nasıl yapabileceğine dair bilgiler de içerir.
        //Örneğin hızlanmak için ayağınızı gaz pedalına koyup itersiniz. API, ayağınızı gaza bastığınızda motorun içinde neler
        // olduğunu açıklamak zorunda değildir.Bu nedenle, içten yanmalı motorlu bir araba kullanmayı öğrendiyseniz, tamamen
        // yeni bir dizi beceri öğrenmek zorunda kalmadan API sayesinde elektrikli bir arabayı rahatlıkla kullanabilirsiniz.

        // foreEach(), map(), filter(), reduce() gibi HOF'lar(higher-order function) fonksiyonel interfaceler ile çalıştığı için
// içerisinde Lambda fonksiyonları yazmak mümkündür
        // mesela google ın görünen yüzü var, birde arkada bilgilerin olduğu bir yer var.
// google, kullanıcı ile bilgiler arasında bir arayüz.Lambda bizim için bir arayüz, kütüphanesinde metodlar var,
// Javada genelde bu gibi fonksiyonlar üzerinden Lambda ifadeleri kullanıyoruz

    /*foreach:
     Stream içindeki tek tek tüketmek için oluşturulmuş bir yapıdır.stream işlemi artık tüketilmiş olarak kabul edilir ve
     sonrasında birşey yazılamaz*/






           /*filter:
           dizimiz veya collection ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda filtreleme işlemi yapar
           Bu işlem sonrasında belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılmazlar    */
        //filter(t-> t%2==0 && t<15)==> elemanlar içinde filtreleme yapar, örneğin çift ve 15 ten küçük sayılar

        // map() metodu collection üzerinde bir transformation işlemi sağlayan ara işlem metodudur.
        // Eğer bir collection'ın verilerininin değişik hallerini hesaplamak istersek map() kullanabiliriz.
        //örneğin:elemanların karesini almak... map(t-> t*t)(4 elemanını=>16 yapar)
        //  map ile Math class ındaki metodları kullanabiliriz...map(Math::sqrt)==> burada elemanların karesini almışız
        //map(String::toUpperCase)==> String class ından metod çağırabiliriz...list imizin data type ının class ındaki metodları
        // kullanabiliriz.

        // reduce() bir terminal işlemidir. Stream hattını kapatır ve tek bir sonuç üretir.
        // Collection'ı indirgeme işlemini lambda fonksiyonu veya metot referansı ile yapabiliriz.
        // reduce(); eleman sayısını azaltmak demek, tek sonuç istendiğinde kullanılır.


        //  sorted(): list i natural order a göre sıralar.
        //sorted(Comparator.reverseOrder()):büyükten küçüğe sıralamak istersek, Comparator class ından reverseOrder() metoduyla
        //terse çevirip sorted() ile büyükten küçüğe sıralamış oluyoruz
        // sorted(Comparator.comparing(t-> t.length())):elemanları kendi istediğimiz bir duruma göre sıralamak istediğimizde
        //    örneğin burada elemanların length() ine göre sıralamışız

        //distinct(): list in elemanlarını tekrarsız yaz

        /////List olarak verilmeyen sorularda, istenen sayı aralığını belirtmek için range(başlangıçdeğeri, bitiş değeri+1)
        // mesela==> 0 dan 15 e kadar olan sayıları toplamak için ==>IntStream.range(0, 16).sum() kullanılır.
        // sayı aralığı substring de olduğu gibi başlangıç (sol) dahil, bitiş (sağ) dahil değil

        // 1 den n'e  kadar olan sayıların çarpılması istendiğinde
        //                              int çarpım=1; yazıp for içinde çarpım=çarpım*sayı yaparak (ve sayı yı birer arttırarak)
        // çözdüğümüz soruyu ===IntStream.range(1,n+1).reduce(Math::multiplyExact); (1 den n e kadar bütün sayıları çarp)
        // ya da             ===IntStream.range(1,n+1).reduce(1, (m,n) ->m*n)...(m=1, n=2==>m=1*2
        //                                                                          m=2, n=3==>m=2*3.....
        //                                                              .      .    .     ) şeklinde de çözebiliriz

        //reduce(ilkDeğer,Integer::min)==> Integer class ından metod çağırabiliriz (örneğin min sayı bulma metodu)
        // reduce(ilkDeğer,Math::max)==>(örneğin list in max elemanı istenirse kullanılır ve Math class ından metod çağırabiliriz)

        //bazen reduce CTE verir, üstüne tıklayınca list imizi optional yapar (örneğin max yoksa diye CTE verdiğinde Optional
        // yapınca düzeldi(cevapta Optional sayı olarak çıkar.)
        // reduce bize tek cevap vereceği için foreach ile yazdıramayız, komutlandırdığımız list i (list.stream().reduce...)
        // syso nun içine alıp yazdırabiliriz

        //allMatch(): bütün elemanlarda olmasını istediğimiz şeyleri yazarız sonuç boolean verir
        //örneğin String bir list için==> allMatch(t -> t.length() < 7)==elemanların hepsinin uzunluğu 7 den küçükse true,
        // biri bile değilse false

        //noneMatch():hiçbir elemanda olmasın istersek kullanırız, elemanların tümünde yoksa true,
        // bir tane elemanda bile varsa false
        //örneğin==>noneMatch(t-> t.startsWith("X"))==hiçbiri X ile başlamıyorsa true

        //anyMatch(): en az bir elemanda olmasını istediğimiz bir özellik varsa kullanırız,sonuç boolean dır
        // örneğin==>anyMatch(t-> t.endsWith("R"))== en az bir eleman R ile bitiyorsa true,yoksa false

        //findFirst():listedeki ilk elemanı verir. (tek eleman vereceği için, foreach ile yazdırılmaz.
        // bütün soru syso nun içine alınarak yazdırılabilir)

        //limit(a):ilk a kadar elemanı verir.
        //skip(a):ilk a elemanı pas geç diğerlerini yazdır

        //mapToInt yada mapToDouble yapınca toplama için direk sum() metodunu kullanabiliyoruz,
        // reduce e gidip Integer classtan sum(), average(), max(), min() metodlarını ı çağırmaya gerek kalmıyor

        //contains() : kapsıyormu sorusuna boolean yanıt verir, count(): istenen elemanın sayısını buluyor
        //örneğin:list.stream().contains("Day")).count();==> list teki Day içeren elemanların sayısını verir


        //iterate():başlangıç değeri ve artış miktarı belli olan sorularda kullanılır
        // mesela==> iterate(5, t->t+3)===5 ten başla 3 er 3 er devam et

        // daha önceden yazdığımız bir files ı (dosyayı) okuyup, Console'a yazdirmak için;
        //      Files.lines(Paths.get("src/Lambda/FileForLambda")).forEach(System.out::println);

        //Files daki metinin içindeki kelimelerle tek tek işlem yapmak istediğimizde;
        ////mesela FileForLambda isimli dosyadaki tum farkli kelimeleri bir listin icinde ekrana yazdiriniz.
        //  System.out.println(Files.lines(Paths.get("src/Lambda/FileForLambda")).
        //  map(t->t.split(" ")).flatMap(Arrays::stream).//boşluklardan virgülle ayırıp Array yaptı,sonra array leri şelale gibi yazdırdı
        //      distinct().
        //      collect(Collectors.toList()));
        //harf harf incelemek istersek split("")

        // bazı noktalama işaretlerini şu şekilde silebiliriz==> map(t->t.replaceAll("^[a-zA-Z]", ""): harflerin dışındakiler
        // ya da
        //map(t->t.replaceAll("\\W", "")     \\W :harf ve rakam dışındakiler




    }
