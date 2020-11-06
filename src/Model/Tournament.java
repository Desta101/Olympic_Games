package Model;
//Shimon Desta-203670286
import javax.swing.Spring;

import Listener.SystamListener;

public abstract class Tournament implements SystamListener {
	private Stadium stadium;
	private Referee referee;
	private Team.Sport_Types sportTypes;
	private Date startDate;

	public Tournament(Referee referee, Team.Sport_Types sportTypes, Date startDate, Stadium stadium) throws Exception {
		this.sportTypes = sportTypes;
		this.startDate = startDate;
		this.referee=referee;
		this.stadium = stadium;
		if(checkRefereeType()) {}
		
	}
/*
 	public Exception addAthleteToPersonalCompetition(Athlete newAthlete) {
		if (getSportTypes() == Team.Sport_Types.RUNNING){
			if((newAthlete instanceof Runner) || (newAthlete instanceof RunnerAndJumper)) {
				personalCompetitionAthletes.add(newAthlete);
			}
		}
		 else if (getSportTypes() == Team.Sport_Types.JUMPING) {
				if((newAthlete instanceof Jumper) || (newAthlete instanceof RunnerAndJumper)) {
			personalCompetitionAthletes.add(newAthlete);
				}
		}
		return new Exception("You cant add this type of athlete to this team");
}
 */
	public Referee getReferee() {
		return referee;
	}

	public Team.Sport_Types getSportTypes() {
			return sportTypes;
	}

	public Date getStartDate() {
		return startDate;
	}
	

	public Stadium getStadium() {
		return stadium;
	}
	public  boolean checkRefereeType() throws Exception {
		if((sportTypes == sportTypes.RUNNING)&(referee instanceof RefereeRunner)) {
			return true;
		}
		else if((sportTypes == sportTypes.JUMPING)&(referee instanceof RefereeJumping)){
			return true;
		}	
			throw new Exception("Error:The Referee is not suitable for the competition");
		}
	


	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("");
		sb.append("Tournament start Date: " + getStartDate() + "\nStadium: " + stadium + "Referee: " + getReferee()  + getSportTypes()+ " Competition" + "\n"  );
		return sb.toString();
	}


}
