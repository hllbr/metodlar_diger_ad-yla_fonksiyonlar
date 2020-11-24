
import java.util.Scanner;

/*
metodlar diğer adıyla fonksiyonlar 
metodlar ne anlama gelir...
metodlar belirli bir işi yapan ve sürekli kullanılabilen yapılardır
metodları bir defa tanımlarız her kullanmak istediğimizde çağırırız
JAVA DA fonksiyonlara genellikle metot denir.
metodlar classlara özgü oluyor
her class'ın belirli metodları oluyor.
Bunlara Metod demek daha doğru 
örnek olarak system.out.println() bizim fonksiyonlarımızdan biri
bu javada belirli bir yerde tanımlanmış ve biz bunu her yerde kullanabiliyoruz.
bu metodun işi ekrana değer yazdırmaktır.
********************************************************************************
********************************************************************************
system.out.println = system paketinin içindeki out'un içindeki println fonksiyonudur.
********************************************************************************
********************************************************************************
neden metodlara ihtiyaç duyuyoruz...???
büyük projelerde aynı işlemi farklı yerlerde sürekli yapmamız gerek durumlar için kullanıyoruz.
********************************************************************************
Metodlar programlamadaki en önemli konseptir.
Metod tanımlarken değişik özellikler var public olması private olması protect olması yada static bir yapıda olması vs.....
********************************************************************************
Fonksiyonların genel yapısı = 
**bir adet erişim belirleyici(bizim main methodumuzdaki public buna iyi bir örnektir.)bu opsiyonel bir gösterimdir kendi methodunuzda bu olmaya bilir

yada private ,protect de kullanabilirsiniz.

**extra özelliklerimiz var static buna örnektir.Bunu kullanmaya bilirsiniz 

**Dönüş_Tipi bu ise fonksiyondan gelen çıktı anlamını taşıyor(Fonksiyondan gelen değer olarakta tanımlayabliriz.)
örnek olarak void verebiliriz.

**ASIL ÖNEMLİ KISIM = fonksiyon adı ve parametreler kısmıdır.Fonksiyon adını herhangi bir isimle tanımlayabiliriz.
Ancak yazılan code ile alakalı olursa çok daha iyi olur.
Fonksiyonlarımız belirli parametreler alabilir. Örnek oalrak System.out.println() fonksiyonumuzda biz içeri bir değer gönderiyouz ve gönderdiğimz değer çıktımız oluyordu...
Parametre kısmını boş bırakabiliriz/Parametresiz fonksiyonlarda yazabilirsiniz.
*/
public class Main {
    //fonksiyonu bu alana yazıp main içerisinde ihtiyacımız olan zamanlarda çağıracağız...
    public static void selamlama(){//parametresiz standart bir fonksiyonumuz oldu bu şekilde
        System.out.println("Merhaba nasılsınız ? ");
        System.out.println("Umarım iyisinizdir.");
        System.out.println("Selamlar");
    }
    public static void selamlar(String isim){//parametreli fonksiyonumuzu yazdık 
        System.out.println("https://www.twitch.tv/durubtr SİZİ SELAMLIYOR ");
        //ı know streamers and  war of stream
        System.out.println("Hoşgeldin leeeen "+isim+"\n"
                + "tamam leen "+ isim);
        
        
    }
    public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);

        selamlama();
        while(true){
            System.out.println("selamlama yapmak için s\n"
                    + "çıkmak için q veya Q A basınız ");
            String b = scn.nextLine();
            
            if(b.equals("s")){
                System.out.println("*****************************************************");
                     System.out.println("kimi selamlamak istiyorsanız ismini giriniz : ");
        
        String a = scn.nextLine();
        selamlar(a);
                    }

        else if(b.equals("q") || b.equals("Q")){
                System.out.println("Sistemden çıkış işleminiz gerçekleşti\n"
                        + "iyi ve sağlıklı günler dileriz.");
                break;
                }
         
        
            
        }
      
    }
    
}
