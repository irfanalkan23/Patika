package pratik.ogrenciBilgiSistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;
    int verbalNotePercent;

    public Course(String name, String code, String prefix, int verbalNotePercent) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
        setVerbalNotePercent(verbalNotePercent);    //Sözlü notunun ortalamaya etki yüzdesi setter ile atanır
    }

    //Setter: Sözlü notunun ortalamaya etki yüzdesi 0-100 dışında girilmesi durumunda hata mesajı verir
    public void setVerbalNotePercent(int verbalNotePercent) {
        if (verbalNotePercent >= 0 && verbalNotePercent <=100){
            this.verbalNotePercent = verbalNotePercent;
        } else {
            System.out.println("Hatalı sözlü notu etki yüzdesi girdiniz!\n" +
                    "Sözlü notu 0 ile 100 arasında olmalıdır.\n" +
                    this.name.toUpperCase() + " dersi için sözlü notunun ortalamaya etkisi %0 kabul edilmiştir.");
        }
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }



}
