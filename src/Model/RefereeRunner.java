package Model;
//Shimon Desta-203670286

public class RefereeRunner extends Referee {
    private int numOfContests;


    public RefereeRunner(String name, int age, String gender, int Experience, int numOfContests) {
        super(name, age, gender, Experience );
        this.numOfContests = numOfContests;
    }

    public int getNumOfRunningContestsRefereed() {
        return numOfContests;
    }

    public void setNumOfRunningContestsRefereed(int numOfContests) {
        this.numOfContests = numOfContests;
    }

    @Override
    public String toString() {
        return  super.toString() + "\n" ;
    }

}
