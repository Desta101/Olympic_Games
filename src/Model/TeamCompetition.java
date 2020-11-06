package Model;
//Shimon Desta-203670286
import java.util.*;
import Listener.SystamListener;


public class TeamCompetition extends Tournament implements SystamListener{
	private List<Athlete> personalCompetitionAthletes;
	private List<Athlete> winners;
	public TeamCompetition(Referee referee, Team.Sport_Types sportTypes, Date startDate, Stadium stadium) throws Exception {
		super(referee, sportTypes, startDate,stadium);
		this.personalCompetitionAthletes = new ArrayList<Athlete>();
		winners = new ArrayList<Athlete>();
	}

	public List<Athlete> getPersonalCompetitionAthletes() {
		return personalCompetitionAthletes;
	}

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

public List<Athlete> getWinnersInCompetition() {
	int numOfWinners = 0;
	while (numOfWinners != 3) {
		int randomWinners = (int) (Math.random() * personalCompetitionAthletes.size());
		if (checkIfNoRepeatWinner(winners, personalCompetitionAthletes.get(randomWinners))) {
			winners.add(personalCompetitionAthletes.get(randomWinners));
			personalCompetitionAthletes.get(randomWinners).addNumOfMedals();
			numOfWinners++;
		}
	}
	sortByNumOfmedals();
	return winners;
}

	public List<Athlete> getWinners() {
		return winners;
	}

	public static boolean checkIfNoRepeatWinner(List<Athlete> allWinners, Athlete winner) {
	for (int i = 0; i < allWinners.size(); i++) {
		if (allWinners.get(i).equals(winner)) {
			return false;
		}
	}
	return true;

}

public void sortByNumOfmedals() {
	Comparator<Athlete> compareByMedals = new Comparator<Athlete>() {
		public int compare(Athlete o1, Athlete o2) {
			if (o1.getNumOfMedals() < o2.getNumOfMedals())
				return 1;
			else if (o1.getNumOfMedals() == o2.getNumOfMedals())
				return 0;
			return -1;
		}
	};
	Collections.sort(personalCompetitionAthletes, compareByMedals);

}

@Override
public String toString() {
	StringBuffer sb = new StringBuffer("================================\n");
	sb.append("Contenders: " + personalCompetitionAthletes.size() + "\n");
	sb.append("-------------------------------------------------------\n");
	for (int i = 0; i < personalCompetitionAthletes.size(); i++) {
		sb.append(personalCompetitionAthletes.get(i) );
	}
	sb.append("\n");
	return super.toString() +  sb.toString(); 
	}

	@Override
	public String getCompetitionData() {
		return super.toString();
	}
	public String getRunData() {
	       return null;
	 }

	@Override
	public int getTopSpeed() {
		return 0;
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
