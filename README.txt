
Bu bir Eclipse projesi olup, "Java Nesne Merkezli Programlamaya Giriş"
eğitimimin kodlarını içermektedir. Bu projedeki kaynak kodlar "src"
dizini altındadır ve isterseniz Netbeans vb. farklı IDEler içinde
kullanabileceğiniz gibi basit bir editor ile de kodları
görüntüleyebilirsiniz.

Ben kodları yayınlamadan önce temizlemeye çalıştım ama bu proje MacOS'ın 
araya sokuşturduğu ".DS_Store" gibi bazı istenmeyen dosyaları içerebilir. 
Projeyi Eclispe'e import etmeden önce bu dosyaları temizleyin.

Projeyi Eclipse'e import ettikten sonra projenizde bazı ayarların
yapılamsı gerekli. Aksi taktirde projenizin üzerinde kırmızı ünlem ve
bazı kaynak kodlarda örneğin
org.javaturk.oop.ch03.TurkceKarakterlerDemo, kırmızı çarpı işareti
görebilirsiniz: Kırmızı ünlem JRE probemi, kırmızı çarpı ise derleme
hatasına işaret eder.

Bu Eclipse projesi sadece Java SE 1.8 ile çalışır. Projede Java 1.8 ile
gelen özellikler kullanılmasa bile örneğin
org.javaturk.oop.ch03.PrimitesDemo sınıfında TL sembolü olan "₺"
kullanılmıştır ve bu sembol Java karakter setine 1.8 ile gelmiştir. 
Bu yüzden makinanıznda Java SE 1.8'e ihtiyacınız vardır.

Projeyi Eclipse'e import ettikten sonra üzerinde sağ-tık yaparak
özelliklerine (Properties) gidin. Daha sonra da Java Build Path menusüne
gidip Libraries sekmesinin altındaki JRE System Library problemli ise,
yani üzerinde kırmızı ünlem var ise sağdaki Edit düğmesine tıklayıp bir 
Java SE 1.8 JDK ya da JRE gösterin.

Ayrıca projenin encoding ayarını da UTF-8 yapmanız gereklidir. Bu amaçla
en yukarıdaki Resources menusunde Text File Encoding'in UTF-8 olmasını
sağlayın.

Bu projenin en güncel haline http://www.javaturk.org/java-dersleri/ adresinden
ulaşabilirsiniz.

Bu kodları eğitim amaçlı olarak kullanabilir ve çevrenizdekilerle
paylaşabilirsiniz. Kullanırken ve paylaşırken kodların bana ait olduğunu
bilmeniz/bildirmeniz gereklidir. Ayrıca buradaki kodları lütfen benden
izinsiz hiç bir şekilde ve yerde yayınlamayın.

Ayrıca her türlü geri bildirim için bana akin@javaturk.org adresinden
ulaşabilirsiniz.

Akin Kaldiroglu
