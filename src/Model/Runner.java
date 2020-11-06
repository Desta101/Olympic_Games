package Model;
//Shimon Desta-203670286
import Listener.SystamListener;

public class Runner extends Athlete implements  SystamListener {
    private int topSpeed;

    public Runner(String name, int age, String gender , int topSpeed) {
        super(name, age, gender);
        this.topSpeed = topSpeed;
    }

    public Runner(String name, int age, String gender , int topSpeed,int numOfMedals,Country country) {
        super(name,age,gender,country);
        numOfMedals = getNumOfMedals();
        this.topSpeed = topSpeed;
    }



    public int getTopSpeed() {
        return topSpeed;
    }

    public void setHighestSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
    public String getRunData() {
        return  "Speed: " + topSpeed  ;
    }


    @Override
    public String toString() {
        return  "Runner: "   + super.toString() + ", Speed: " + topSpeed  + " kmh"  +'\n' ;
    }
    public String getCompetitionData() {
		return null;
	}

	@Override
	public String getJumpData() {
		return null;
	}

	@Override
	public int getTopjump() {
		return 0;
	}
    
  


}
