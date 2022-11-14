package pratik.ogrenciBilgiSistemi;

import java.text.DecimalFormat;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    //Yazdırma işlemi yaparken double sonuçları noktadan sonra iki hane olacak şekilde yazdırmak için
    DecimalFormat df = new DecimalFormat();

    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    //Derslere için sözlü notu girmek için ilave bir metot
    public void addBulkVerbalNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.verbalNote = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.verbalNote = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.verbalNote = kimya;
        }

    }

    public void isPass() {
        df.setMaximumFractionDigits(2);

        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + df.format(this.avarage));
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    //Derslerin ortalamasının hesaplarken sözlü notların ortalamaya etkisini de ilave ediyoruz
    public void calcAvarage() {
        this.avarage = (courseAverage(this.mat)+ courseAverage(this.fizik) + courseAverage(this.kimya)) / 3.0;
    }

    //Dersin not ortalaması: (sınav notu * ortalamaya etki yüzdesi) + (sözlü notu * ortalamaya etki yüzdesi)
    public double courseAverage(Course course){
        return (course.note * (1 - course.verbalNotePercent/100.0)) + (course.verbalNote * (course.verbalNotePercent / 100.0));
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        df.setMaximumFractionDigits(2);

        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        //Ders notlarını yazdırırken sınav notu ve sözlü notunu dikkate alarak ders ortalamasını yazdırıyoruz
        System.out.println("Matematik Notu : " + df.format(courseAverage(this.mat)));
        System.out.println("Fizik Notu : " + df.format(courseAverage(this.fizik)));
        System.out.println("Kimya Notu : " + df.format(courseAverage(this.kimya)));
    }

}
