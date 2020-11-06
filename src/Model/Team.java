package Model;
//Shimon Desta-203670286

import java.util.ArrayList;
import java.util.List;

public class Team {
	public enum Sport_Types {RUNNING, JUMPING};
	private List<Athlete> stateTeam;
	private int numOfTeamsMedals;
	private Sport_Types sportTypes;
	private String teamName;

	public Team(String teamName, Sport_Types sportTypes) {
		this.teamName = teamName;
		this.numOfTeamsMedals = 0;
		this.sportTypes = sportTypes;
		stateTeam = new ArrayList<Athlete>();
	}
	public Team(String teamName, Sport_Types sportTypes,int numOfTeamsMedals) {
		this.teamName = teamName;
		this.sportTypes = sportTypes;
		stateTeam = new ArrayList<Athlete>();
		this.numOfTeamsMedals = numOfTeamsMedals;
	}

	public Exception addAthlete(Athlete newAthlete) throws Exception {
		if ((sportTypes == Sport_Types.RUNNING)
				& ((newAthlete instanceof Runner) || (newAthlete instanceof RunnerAndJumper))) {
			stateTeam.add(newAthlete);
		} else if (((sportTypes == Sport_Types.JUMPING)
				& ((newAthlete instanceof Jumper) || (newAthlete instanceof RunnerAndJumper)))) {
			stateTeam.add(newAthlete);
		}
		return new Exception("You cant add this type of athlete to this team");
	}

	public void addNumOfMedals() {
		this.numOfTeamsMedals++;
	}

	
	public String getTeamName() {
		 return teamName;
		
	}

	public List<Athlete> getStateTeam() {
		return stateTeam;
	}

	public void setStateTeam(List<Athlete> stateTeam) {
		this.stateTeam = stateTeam;
	}

	public int getNumOfTeamsMedals() {
		return numOfTeamsMedals;
	}

	public Sport_Types getSportTypes() {
		return sportTypes;
	}
	public void addNumOfMedalsToTeam() {
		this.numOfTeamsMedals++;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("Team: " + getTeamName() + '\n');
		sb.append("Medals: " + numOfTeamsMedals + '\n');
		for (int i = 0; i < stateTeam.size(); i++) {
			sb.append(stateTeam.get(i).toString());
		}
		sb.append("---------------------------------------");
		return sb.toString();
	}
}
