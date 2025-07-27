public class Book {

    String ad;
    String muellif;
    int sehifeSayi;

    public Book(String ad, String muellif, int sehifeSayi) {
        this.ad = ad;
        this.muellif = muellif;
        this.sehifeSayi = sehifeSayi;
    }

    void melumatCap() {
        System.out.println(" Ad : " + ad + " Muellif :" + muellif + " Sehife Sayi : " + sehifeSayi);
    }
}

// Book adlı class yarat, ad, muellif, səhifəSayi property-ləri olsun. Constructor və məlumat çap metodu əlavə et.