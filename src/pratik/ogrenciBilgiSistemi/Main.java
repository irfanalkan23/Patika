package pratik.ogrenciBilgiSistemi;

public class Main {

    public static void main(String[] args) {

        //Ders object'lerini oluştururken o ders için 'sözlü notunun ders ortalamasına etki yüzdesi'ni de giriyoruz
        Course mat = new Course("Matematik", "MAT101", "MAT", 10);
        Course fizik = new Course("Fizik", "FZK101", "FZK", 20);
        Course kimya = new Course("Kimya", "KMY101", "KMY", 30);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        //İlave olarak sözlü notu giriyoruz
        s1.addBulkVerbalNote(70,50, 90);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        //İlave olarak sözlü notu giriyoruz
        s2.addBulkVerbalNote(100,60, 50);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        //İlave olarak sözlü notu giriyoruz
        s3.addBulkVerbalNote(60,40, 70);
        s3.isPass();

    }
}
