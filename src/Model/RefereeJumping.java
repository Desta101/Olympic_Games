package Model;
//Shimon Desta-203670286

public class RefereeJumping extends Referee {
    private int numOfContests;

    public RefereeJumping(String name, int age, String gender, int Experience, int numOfContests) {
        super(name, age, gender, Experience);
        this.numOfContests = numOfContests;
    }

    public int getNumOfJumpingContestsRefereed() {
        return numOfContests;
    }

    public void setNumOfJumpingContestsRefereed(int numOfJumpingContestsRefereed) {
        this.numOfContests = numOfContests;
    }

    @Override
    public String toString() {
        return  super.toString()  + "\n" ;
    }
}
