package it.develop.interfacce;

public class Assistant extends CollegePerson implements ILearningPerson, ITeachingPerson{

    public boolean isGoingToBeAPhD;


    @Override
    public void studyAtHome() {
        System.out.println("la persona "+name+" "+surname+" è l'assistente e oggi studia! Vuole prendere il dottorato? "+isGoingToBeAPhD);

    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("la persona "+name+" "+surname+" è l'assistente e oggi insegna! Vuole prendere il dottorato? "+isGoingToBeAPhD);
    }

    public Assistant(String name, String surname, int iD, boolean willBeAPhD){

        this.name=name;
        this.surname=surname;
        this.collegeId=iD;
        this.isGoingToBeAPhD=willBeAPhD;

    }
}
