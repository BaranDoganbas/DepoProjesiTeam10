public class UrunBilgisi {

    //urunun ismi, ureticisi ve birimi girilecek. id  alınacak

    private String urunIsmi;
    private String urunUreticisi;
    private String urunBirimi;

    @Override
    public String toString() {
        return "UrunBilgisi{" +
                "urunIsmi='" + urunIsmi + '\'' +
                ", urunUreticisi='" + urunUreticisi + '\'' +
                ", urunBirimi='" + urunBirimi + '\'' +
                '}';
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUrunUreticisi() {
        return urunUreticisi;
    }

    public void setUrunUreticisi(String urunUreticisi) {
        this.urunUreticisi = urunUreticisi;
    }

    public String getUrunBirimi() {
        return urunBirimi;
    }

    public void setUrunBirimi(String urunBirimi) {
        this.urunBirimi = urunBirimi;
    }
}

