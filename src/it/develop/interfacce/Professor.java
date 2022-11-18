package it.develop.interfacce;

public class Professor extends  CollegePerson implements ITeachingPerson{

public String teachingSubject;


    @Override
    public void teachToOtherPeople() {
        System.out.println(name+" "+surname+" sta insegnando");
    }

    public Professor(String name, String surname, int iD, String subject ){
        this.name=name;
        this.surname=surname;
        this.collegeId=iD;
        this.teachingSubject=subject;
}



}
