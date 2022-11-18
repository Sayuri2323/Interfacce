package it.develop.interfacce;

public class Student extends  CollegePerson implements ILearningPerson{

    public int academicYear;


        @Override
        public void studyAtHome() {


        System.out.println(name+" "+surname+" matricola numero; "+collegeId+", "+"sta imparando!");
    }

    public Student(String name, String surname, int iD, int year ){
        this.name=name;
        this.surname=surname;
        this.collegeId=iD;
        this.academicYear=year;

    }



}
