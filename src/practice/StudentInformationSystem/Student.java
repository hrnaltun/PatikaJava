package practice.StudentInformationSystem;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;
    double c1avg;
    double c2avg;
    double c3avg;
    Student(String name,String stuNo,String classes,Course c1,Course c2, Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }
    void addBulkExamNote(int note1, int note2,int note3,int note1verb,int note2verb,int note3verb){
        if (note1>=0&&note1<=100){
            this.c1.note=note1;
        }
        if (note1verb>=0&&note1verb<=100){
            this.c1.verbal=note1verb;
        }
        if (note2>=0&&note2<=100){
            this.c2.note=note2;
        }
        if (note2verb>=0&&note2verb<=100){
            this.c2.verbal=note2verb;
        }

        if (note3>=0&&note3<=100){
            this.c3.note=note3;
        }
        if (note3verb>=0&&note3verb<=100){
            this.c3.verbal=note3verb;        }

    }
    void printNote(){
        System.out.println(this.c1.name+" ortalaması:"+this.c1avg);
        System.out.println(this.c2.name+" ortalaması:"+this.c2avg);
        System.out.println(this.c3.name+" ortalaması:"+this.c3avg);
        System.out.println("Ortalamanız: "+this.avarage);

    }
    void calcAvarage(){
        this.c1avg= (this.c1.note*0.8)+(this.c1.verbal*0.2);
        this.c2avg= (this.c3.note*0.8)+(this.c2.verbal*0.2);
        this.c3avg= (this.c3.note*0.8)+(this.c3.verbal*0.2);

        this.avarage=(this.c1avg+this.c2avg+this.c3avg)/3.0;
        isPass();
    }
    void isPass(){
        System.out.println("=============");
        if (this.avarage>55){
            System.out.println("Hababam sınıfı uyanıyor");
            this.isPass=true;
        }else {
            System.out.println("Hababam sınıfı sınıfta kaldı");
            this.isPass=false;
        }
        printNote();
    }
}
