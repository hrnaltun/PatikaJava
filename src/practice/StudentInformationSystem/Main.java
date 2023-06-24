package practice.StudentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1= new Teacher("Mahmut Hoca","905500000000","TRH");
        Teacher t2= new Teacher("Graham Bell","905500000000","FZK");
        Teacher t3= new Teacher("Külyutmaz","905500000000","BIO");


        Course tarih=new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik=new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo=new Course("Biyoloji","102","BIO");
        biyo.addTeacher(t3);

        Student s1=new Student("İnek Şaban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,78,50,70,60,50);
        s1.calcAvarage();

        Student s2=new Student("Düdük Necmi","444","4",tarih,fizik,biyo);
        s2.addBulkExamNote(50,30,70,40,30,80);
        s2.calcAvarage();

    }
}
