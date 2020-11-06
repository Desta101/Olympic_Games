package Model;
//Shimon Desta-203670286
import Listener.SystamListener;

public class RunnerAndJumper extends Athlete implements SystamListener {
    private Runner run;
    private Jumper jump;

    public RunnerAndJumper(String name, int age, String gender, int TopSpeed, int Topjump) {
        super(name, age, gender);
        run = new Runner(name, age, gender, TopSpeed);
        jump = new Jumper(name, age, gender, Topjump);
    }

    public RunnerAndJumper(String name, int age, String gender, int TopSpeed, int Topjump ,int Medals) {
        super(name, age, gender);
        run = new Runner(name, age, gender, TopSpeed);
        jump = new Jumper(name, age, gender, Topjump);
        Medals = getNumOfMedals();
    }

    @Override
    public String getJumpData(){
        return jump.getJumpData();
    }

    @Override
    public int  getTopjump(){
        return jump. getTopjump();
    }

    @Override
    public String getRunData(){
        return run.getRunData();
    }

    @Override
    public int getTopSpeed() {
        return run.getTopSpeed();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("RunnerAndJumper ");
        sb.append( "Name: " + super.getName() + " ,Age: "+ super.getAge()+", Gender: " + super.getGender() + ", Medals: " + getNumOfMedals()+ " ,");
        sb.append(getRunData() + " ");
        sb.append(getJumpData()+"\n");
        return sb.toString();
    }

	@Override
	public String getCompetitionData() {
		return null;
	}
    
     
    
}




