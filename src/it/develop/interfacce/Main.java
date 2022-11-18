package it.develop.interfacce;

public class Main {
    public static void main(String[] args) {

        Student s1=new Student("Harry","Potter", 2323, 92);
        s1.goToCollege();
        s1.studyAtHome();


        Professor p1=new Professor("Severus","Piton", 6661, "Pozioni");
        p1.goToCollege();
        p1.teachToOtherPeople();


        Assistant a1=new Assistant("Argus","Gazza", 9754, true);
        a1.goToCollege();
        a1.studyAtHome();
        a1.teachToOtherPeople();

    }
}