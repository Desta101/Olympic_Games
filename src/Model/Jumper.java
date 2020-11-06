package Model;
//Shimon Desta-203670286
import Listener.SystamListener;

public  class Jumper extends Athlete implements SystamListener {
    private int topJump;

    public Jumper(String name, int age, String gender, int highestJumping) {
        super(name, age, gender);
        this.topJump = highestJumping;
    }

    public Jumper(String name, int age, String gender, int highestJumping,int numOfMedals) {
        super(name, age, gender);
        this.topJump = highestJumping;
        numOfMedals = getNumOfMedals();
    }

    public int  getTopjump() {
        return topJump;
    }

    public void setHighestJumping(int highestJumping) {
        this.topJump = highestJumping;
    }

    @Override
    public String toString() {
        return "Jumper: "  + super.toString() + ",Jump: " + topJump + " M "  + '\n';
    }
   
    @Override
    public String getJumpData() {
        return  "Jump: " + topJump   + " M " ;
    }
    public String getCompetitionData() {
  		return null;
  	}

	@Override
	public String getRunData() {
		return null;
	}

	@Override
	public int getTopSpeed() {
		return 0;
	}
      
    
}
