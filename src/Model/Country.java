package Model;
//Shimon Desta-203670286
import java.util.ArrayList;
import java.util.List;

public class Country {
	private String countryName;
	private int Medals;
	private List<Team> countryTeams;
	private List<Athlete> allAthletes;
	private Referee referee;

	public Country(String countryName) {
		this.countryName = countryName;
		this.allAthletes = new ArrayList<Athlete>();
		this.countryTeams = new ArrayList<Team>();
	}



	public boolean addAthlete(Athlete newAthlete) throws Exception {
		if (newAthlete instanceof Runner) {
			allAthletes.add((Runner) newAthlete);
			return true;
		} else if (newAthlete instanceof Jumper) {
			allAthletes.add((Jumper) newAthlete);
			return true;
		} else if(newAthlete instanceof RunnerAndJumper) {
			allAthletes.add((RunnerAndJumper) newAthlete);
			return true;
		}
		throw new Exception("You cant add this athlete");
	}


	public void addTeams(Team newTeams) throws Exception {
		countryTeams.add(newTeams);
	}

	public List<Team> getCountryTeams() {
		return countryTeams;
	}

	

	public List<Athlete> getAllAthletes() {
		return allAthletes;
	}

	public Country(Country other) {
		this.countryName = other.countryName;
		this.Medals = other.Medals;
	}
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}


	
	public int getMedals() {
		return Medals;
	}


	public void setMedals(int Medals) {
		this.Medals = Medals;
	}

	public void addMedals() {
		this.Medals++;
	}
	

	public Referee getReferee() {
		return referee;
	}

	public void setReferee(Referee referee) {
		this.referee = referee;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer();
		sb.append(countryName);
		sb.append(" Numbers of Medals To The Country : " + Medals + "\n");
		return sb.toString();
	}


}
