package Model;
//Shimon Desta-203670286

public abstract class Referee extends Person {
    private int Experience;

    public Referee(String name, int age, String gender, int Experience) {
        super(name, age, gender);
        this.Experience=Experience;
    }

    public int getExperience() {

        return Experience;
    }

    public void setExperience(int experience) {
    	Experience = experience;
    }


    @Override
    public String toString() {
     return  super.toString() +" Experience: "+ Experience + " years" ;
    }
    
    
}
