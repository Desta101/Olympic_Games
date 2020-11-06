package Model;
//Shimon Desta-203670286
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.*;

import Model.Date;
import Model.Stadium;

public class OlympicGame {
	private List<Country> allCountries;
	private List<Tournament> competitions;
	private List<Athlete> allAthletes; // divide countries to athletes and to teams
	private List<Team> allTeams;
	private List<Referee> allReferees;
	private String Location;
	private Date start;
	private Date End;
	private boolean[] Winners;


	public OlympicGame(String Location, Date start, Date End) {
		this.Location = Location;
		this.start = start;
		this.End = End;
		this.competitions = new ArrayList<Tournament>();
		this.allCountries = new ArrayList<Country>();
		this.allAthletes = new ArrayList<Athlete>();
		this.allTeams = new ArrayList<Team>();
		this.allReferees = new ArrayList<Referee>();
		Winners = new boolean[4];
	}

	public OlympicGame() {
		this.Location = "OlympicGames";
		this.start = new Date(1, 12, 2020);
		this.End =  new Date(16, 12, 2020);
		this.competitions = new ArrayList<Tournament>();
		this.allCountries = new ArrayList<Country>();
		this.allAthletes = new ArrayList<Athlete>();
		this.allTeams = new ArrayList<Team>();
		this.allReferees = new ArrayList<Referee>();
		Winners = new boolean[4];
	}

	public void addCompetitons(Tournament newCompetition) {
		competitions.add(newCompetition);
	}

	public void inPutData() throws Exception {
		int numOfCountries = 0;
		int numOfTeams = 0;
		//===================================Israel===============================================		
		Country newCountry1 = new Country("Israel");
		allCountries.add(newCountry1);
		
		
		Athlete newAthlete1 = new RunnerAndJumper("Eran Zeavi", 29, "Male", 35, 8);
	    Athlete newAthlete2 = new RunnerAndJumper("Diego Khizverg", 40, "Male", 20, 9);
	    Athlete newAthlete3 = new Jumper("Asaf Choen", 18, "Male", 10);
	    Athlete newAthlete4 = new Jumper("Mosh Adam", 21, "Male", 9);
	    allAthletes.add(newAthlete1);
	    allAthletes.add(newAthlete2);
	    allAthletes.add(newAthlete3);
	    allAthletes.add(newAthlete4);
	    allCountries.get(numOfCountries).addAthlete(newAthlete1);
	    allCountries.get(numOfCountries).addAthlete(newAthlete2);
	    allCountries.get(numOfCountries).addAthlete(newAthlete3);
	    allCountries.get(numOfCountries).addAthlete(newAthlete4);
	    
	    Team.Sport_Types sportType_1 = Team.Sport_Types.RUNNING;
		Team newTeam_1 = new Team("Israel", sportType_1);
		allTeams.add(newTeam_1);
		allCountries.get(numOfCountries).addTeams(newTeam_1);
		allCountries.get(numOfCountries).addAthlete(newAthlete1);
		allCountries.get(numOfCountries).addAthlete(newAthlete2);
		allTeams.get(numOfTeams).addAthlete(newAthlete1);
		allTeams.get(numOfTeams).addAthlete(newAthlete2);
		numOfTeams++;
		
		Team.Sport_Types sportType_2 = Team.Sport_Types.JUMPING;
		Team newTeam_2 = new Team("Israel", sportType_2);
		allTeams.add(newTeam_2);
		allCountries.get(numOfCountries).addTeams(newTeam_2);
		allCountries.get(numOfCountries).addAthlete(newAthlete1);
		allCountries.get(numOfCountries).addAthlete(newAthlete2);
		allCountries.get(numOfCountries).addAthlete(newAthlete3);
		allCountries.get(numOfCountries).addAthlete(newAthlete4);
		allTeams.get(numOfTeams).addAthlete(newAthlete1);
		allTeams.get(numOfTeams).addAthlete(newAthlete2);
		allTeams.get(numOfTeams).addAthlete(newAthlete3);
		allTeams.get(numOfTeams).addAthlete(newAthlete4);
		numOfTeams++;
		numOfCountries++;
		
		
		//====================================USA=============================================
        Country newCountry2 = new Country("USA");
        allCountries.add(newCountry2);
        
		Athlete newAthlete5 = new RunnerAndJumper("Tomi Gal", 25, "Male", 35, 9);
	    Athlete newAthlete6 = new RunnerAndJumper("Avner Havi", 30, "Male", 20, 10);
	    Athlete newAthlete7 = new Jumper("Adam Yovni", 21, "Male", 10);
	    Athlete newAthlete8 = new Jumper("hviva Lolan", 28, "Male", 9);
	    Athlete newAthlete9 = new Runner("Moti Ben", 26, "Male", 43);
	    Athlete newAthlete10 = new Runner("Frnki Zoman", 28, "Male", 36);
	    allAthletes.add(newAthlete5);
	    allAthletes.add(newAthlete6);
	    allAthletes.add(newAthlete7);
	    allAthletes.add(newAthlete8);
	    allAthletes.add(newAthlete9);
	    allAthletes.add(newAthlete10);
	    allCountries.get(numOfCountries).addAthlete(newAthlete5);
	    allCountries.get(numOfCountries).addAthlete(newAthlete6);
	    allCountries.get(numOfCountries).addAthlete(newAthlete7);
	    allCountries.get(numOfCountries).addAthlete(newAthlete8);
	    allCountries.get(numOfCountries).addAthlete(newAthlete9);
	    allCountries.get(numOfCountries).addAthlete(newAthlete10);
	    
	    Team.Sport_Types sportType_3 = Team.Sport_Types.RUNNING;
		Team newTeam_3 = new Team("USA", sportType_3);
		allTeams.add(newTeam_3);
		allCountries.get(numOfCountries).addTeams(newTeam_3);
		allCountries.get(numOfCountries).addAthlete(newAthlete5);
		allCountries.get(numOfCountries).addAthlete(newAthlete6);
		allCountries.get(numOfCountries).addAthlete(newAthlete9);
		allCountries.get(numOfCountries).addAthlete(newAthlete10);
		allTeams.get(numOfTeams).addAthlete(newAthlete5);
		allTeams.get(numOfTeams).addAthlete(newAthlete6);
		allTeams.get(numOfTeams).addAthlete(newAthlete9);
		allTeams.get(numOfTeams).addAthlete(newAthlete10);
		numOfTeams++;
				
		Team.Sport_Types sportType4 = Team.Sport_Types.JUMPING;
		Team newTeam_4 = new Team("USA", sportType4);
		allTeams.add(newTeam_4);
		allCountries.get(numOfCountries).addTeams(newTeam_4);
		allCountries.get(numOfCountries).addAthlete(newAthlete5);
		allCountries.get(numOfCountries).addAthlete(newAthlete6);
		allCountries.get(numOfCountries).addAthlete(newAthlete7);
		allCountries.get(numOfCountries).addAthlete(newAthlete8);
		allTeams.get(numOfTeams).addAthlete(newAthlete5);
		allTeams.get(numOfTeams).addAthlete(newAthlete6);
		allTeams.get(numOfTeams).addAthlete(newAthlete7);
		allTeams.get(numOfTeams).addAthlete(newAthlete8);
		
		numOfTeams++;
		numOfCountries++;
        
        
		//======================================italy==============================================   
        Country newCountry3 = new Country("Italy");
        allCountries.add(newCountry3);
        
		Athlete newAthlete11 = new RunnerAndJumper("Loo min", 29, "Male", 33, 9);
	    Athlete newAthlete12 = new RunnerAndJumper("Max Doom", 31, "Male", 41, 10);
	    Athlete newAthlete13 = new Jumper("Too Too", 23, "Male", 7);
	    Athlete newAthlete14 = new Jumper("lil Omi", 27, "Male", 9);
	    Athlete newAthlete15 = new Runner("Ben Vins", 23, "Male", 33);
	    Athlete newAthlete16 = new Runner("Hlio Noon", 28, "Male", 36);
	    allAthletes.add(newAthlete11);
	    allAthletes.add(newAthlete12);
	    allAthletes.add(newAthlete13);
	    allAthletes.add(newAthlete14);
	    allAthletes.add(newAthlete15);
	    allAthletes.add(newAthlete16);
	    allCountries.get(numOfCountries).addAthlete(newAthlete11);
	    allCountries.get(numOfCountries).addAthlete(newAthlete12);
	    allCountries.get(numOfCountries).addAthlete(newAthlete13);
	    allCountries.get(numOfCountries).addAthlete(newAthlete14);
	    allCountries.get(numOfCountries).addAthlete(newAthlete15);
	    allCountries.get(numOfCountries).addAthlete(newAthlete16);
	    
	    Team.Sport_Types sportType_5 = Team.Sport_Types.RUNNING;
		Team newTeam_5 = new Team("Italy", sportType_5);
		allTeams.add(newTeam_5);
		allCountries.get(numOfCountries).addTeams(newTeam_5);
		
		allCountries.get(numOfCountries).addAthlete(newAthlete11);
		allCountries.get(numOfCountries).addAthlete(newAthlete12);
		allCountries.get(numOfCountries).addAthlete(newAthlete15);
		allCountries.get(numOfCountries).addAthlete(newAthlete16);
		allTeams.get(numOfTeams).addAthlete(newAthlete15);
		allTeams.get(numOfTeams).addAthlete(newAthlete16);
		allTeams.get(numOfTeams).addAthlete(newAthlete11);
		allTeams.get(numOfTeams).addAthlete(newAthlete12);
		numOfTeams++;
		
		Team.Sport_Types sportType6 = Team.Sport_Types.JUMPING;
		Team newTeam_6 = new Team("Italy", sportType6);
		allTeams.add(newTeam_6);
		allCountries.get(numOfCountries).addTeams(newTeam_6);
		allCountries.get(numOfCountries).addAthlete(newAthlete11);
		allCountries.get(numOfCountries).addAthlete(newAthlete12);
		allCountries.get(numOfCountries).addAthlete(newAthlete13);
		allCountries.get(numOfCountries).addAthlete(newAthlete14);
		allTeams.get(numOfTeams).addAthlete(newAthlete11);
		allTeams.get(numOfTeams).addAthlete(newAthlete12);
		allTeams.get(numOfTeams).addAthlete(newAthlete13);
		allTeams.get(numOfTeams).addAthlete(newAthlete14);
		
		numOfTeams++;
		numOfCountries++;
		
		
		//=============================Brazil=================================================  		
        Country newCountry4 = new Country("Brazil");
        allCountries.add(newCountry4);

		Athlete newAthlete17 = new RunnerAndJumper("Rio Zeavi", 39, "Male", 32, 8);
	    Athlete newAthlete18 = new RunnerAndJumper("fenny Verg", 20, "Male", 24, 6);
	    Athlete newAthlete19 = new Jumper("Lord chi", 28, "Male", 9);
	    Athlete newAthlete20 = new Jumper("Yom Belam", 21, "Male", 8);
	    allAthletes.add(newAthlete17);
	    allAthletes.add(newAthlete18);
	    allAthletes.add(newAthlete19);
	    allAthletes.add(newAthlete20);
	    allCountries.get(numOfCountries).addAthlete(newAthlete17);
	    allCountries.get(numOfCountries).addAthlete(newAthlete18);
	    allCountries.get(numOfCountries).addAthlete(newAthlete19);
	    allCountries.get(numOfCountries).addAthlete(newAthlete20);
	    
	    Team.Sport_Types sportType_7 = Team.Sport_Types.RUNNING;
		Team newTeam_7 = new Team("Brazil", sportType_7);
		allTeams.add(newTeam_7);
		allCountries.get(numOfCountries).addTeams(newTeam_7);
		allCountries.get(numOfCountries).addAthlete(newAthlete17);
		allCountries.get(numOfCountries).addAthlete(newAthlete18);
		allTeams.get(numOfTeams).addAthlete(newAthlete1);
		allTeams.get(numOfTeams).addAthlete(newAthlete2);
		numOfTeams++;
		
		Team.Sport_Types sportType_8 = Team.Sport_Types.JUMPING;
		Team newTeam_8 = new Team("Brazil", sportType_8);
		allTeams.add(newTeam_8);
		allCountries.get(numOfCountries).addTeams(newTeam_7);
		allCountries.get(numOfCountries).addAthlete(newAthlete17);
		allCountries.get(numOfCountries).addAthlete(newAthlete18);
		allCountries.get(numOfCountries).addAthlete(newAthlete19);
		allCountries.get(numOfCountries).addAthlete(newAthlete20);
		allTeams.get(numOfTeams).addAthlete(newAthlete17);
		allTeams.get(numOfTeams).addAthlete(newAthlete18);
		allTeams.get(numOfTeams).addAthlete(newAthlete19);
		allTeams.get(numOfTeams).addAthlete(newAthlete20);
		numOfTeams++;
		numOfCountries++;
		
		//==================================Mexico===============================================  			
		
        Country newCountry5 = new Country("Mexico");
        allCountries.add(newCountry5);

	    Athlete newAthlete21 = new Jumper("Popi Monser", 18, "Male", 9);
	    Athlete newAthlete22 = new Jumper("Lock Once", 21, "Male", 7);
	    allAthletes.add(newAthlete21);
	    allAthletes.add(newAthlete22);
	    allCountries.get(numOfCountries).addAthlete(newAthlete21);
	    allCountries.get(numOfCountries).addAthlete(newAthlete22);
	    
	    Team.Sport_Types sportType_9 = Team.Sport_Types.JUMPING;
		Team newTeam_9 = new Team("Mexico", sportType_9);
		allTeams.add(newTeam_9);
		allCountries.get(numOfCountries).addTeams(newTeam_9);
		allCountries.get(numOfCountries).addAthlete(newAthlete21);
		allCountries.get(numOfCountries).addAthlete(newAthlete22);
		allTeams.get(numOfTeams).addAthlete(newAthlete21);
		allTeams.get(numOfTeams).addAthlete(newAthlete22);
		numOfTeams++;
		numOfCountries++;
		
		//====================================Russian==================================================  			
        Country newCountry6 = new Country("Russian");
        allCountries.add(newCountry6);
		
	    Athlete newAthlete23 = new Runner("Londo Fun", 18, "Male", 38);
	    Athlete newAthlete24 = new Runner("Rfeal Kamdo", 21, "Male", 39);
	    allAthletes.add(newAthlete23);
	    allAthletes.add(newAthlete24);
	    allCountries.get(numOfCountries).addAthlete(newAthlete23);
	    allCountries.get(numOfCountries).addAthlete(newAthlete24);
		
		Team.Sport_Types sportType_10 = Team.Sport_Types.RUNNING;
		Team newTeam_10 = new Team("Russian", sportType_10);
		allTeams.add(newTeam_10);
		allCountries.get(numOfCountries).addTeams(newTeam_10);
		allCountries.get(numOfCountries).addAthlete(newAthlete23);
		allCountries.get(numOfCountries).addAthlete(newAthlete24);
		allTeams.get(numOfTeams).addAthlete(newAthlete23);
		allTeams.get(numOfTeams).addAthlete(newAthlete24);
		numOfTeams++;
		numOfCountries++;
		
		//====================================Japan==============================================		
        Country newCountry7 = new Country("Japan");
        allCountries.add(newCountry7);
        
		Athlete newAthlete25 = new RunnerAndJumper("lee Kan", 26, "Male", 45, 8);
	    Athlete newAthlete26 = new RunnerAndJumper("Narto gan ", 21, "Male", 41, 6);
	    Athlete newAthlete27 = new Jumper("Goko chan", 25, "Male", 8);
	    Athlete newAthlete28 = new Jumper("Chan di", 24, "Male", 6);
	    Athlete newAthlete29 = new Runner("skora lin", 32, "Male", 37);
	    Athlete newAthlete30 = new Runner("Elim Na", 18, "Male", 33);
	    allAthletes.add(newAthlete25);
	    allAthletes.add(newAthlete26);
	    allAthletes.add(newAthlete27);
	    allAthletes.add(newAthlete28);
	    allAthletes.add(newAthlete29);
	    allAthletes.add(newAthlete30);
	    allCountries.get(numOfCountries).addAthlete(newAthlete25);
	    allCountries.get(numOfCountries).addAthlete(newAthlete26);
	    allCountries.get(numOfCountries).addAthlete(newAthlete27);
	    allCountries.get(numOfCountries).addAthlete(newAthlete28);
	    allCountries.get(numOfCountries).addAthlete(newAthlete29);
	    allCountries.get(numOfCountries).addAthlete(newAthlete30);
	    
	    Team.Sport_Types sportType_11 = Team.Sport_Types.RUNNING;
		Team newTeam_11 = new Team("Japan", sportType_11);
		allTeams.add(newTeam_11);
		allCountries.get(numOfCountries).addTeams(newTeam_11);
		allCountries.get(numOfCountries).addAthlete(newAthlete25);
		allCountries.get(numOfCountries).addAthlete(newAthlete26);
		allCountries.get(numOfCountries).addAthlete(newAthlete29);
		allCountries.get(numOfCountries).addAthlete(newAthlete30);
		allTeams.get(numOfTeams).addAthlete(newAthlete25);
		allTeams.get(numOfTeams).addAthlete(newAthlete26);
		allTeams.get(numOfTeams).addAthlete(newAthlete29);
		allTeams.get(numOfTeams).addAthlete(newAthlete30);
		numOfTeams++;
		
		Team.Sport_Types sportType12 = Team.Sport_Types.JUMPING;
		Team newTeam_12 = new Team("Japan", sportType12);
		allTeams.add(newTeam_12);
		allCountries.get(numOfCountries).addTeams(newTeam_12);
		allCountries.get(numOfCountries).addAthlete(newAthlete25);
		allCountries.get(numOfCountries).addAthlete(newAthlete26);
		allCountries.get(numOfCountries).addAthlete(newAthlete27);
		allCountries.get(numOfCountries).addAthlete(newAthlete28);
		allTeams.get(numOfTeams).addAthlete(newAthlete25);
		allTeams.get(numOfTeams).addAthlete(newAthlete26);
		allTeams.get(numOfTeams).addAthlete(newAthlete27);
		allTeams.get(numOfTeams).addAthlete(newAthlete28);
		
		numOfTeams++;
		numOfCountries++;
		
		
		//==============================Canada===================================================  			
		
        Country newCountry8 = new Country("Canada");
        allCountries.add(newCountry8);
		
	    Athlete newAthlete31 = new Runner("toms Kani", 18, "Male", 35);
	    Athlete newAthlete32 = new Runner("Even Mindo", 21, "Male", 36);
	    allAthletes.add(newAthlete31);
	    allAthletes.add(newAthlete32);
	    allCountries.get(numOfCountries).addAthlete(newAthlete31);
	    allCountries.get(numOfCountries).addAthlete(newAthlete32);
	    
		Team.Sport_Types sportType_13 = Team.Sport_Types.RUNNING;
		Team newTeam_13 = new Team("Canada", sportType_13);
		allTeams.add(newTeam_13);
		allCountries.get(numOfCountries).addTeams(newTeam_13);
		allCountries.get(numOfCountries).addAthlete(newAthlete23);
		allCountries.get(numOfCountries).addAthlete(newAthlete24);
		allTeams.get(numOfTeams).addAthlete(newAthlete23);
		allTeams.get(numOfTeams).addAthlete(newAthlete24);
		numOfTeams++;
		numOfCountries++;
		
		//==============================Jamaican===================================================  			
		
        Country newCountry9 = new Country("Jamaican");
        allCountries.add(newCountry9);
		
	    Athlete newAthlete33 = new Runner("Usain bolt", 35, "Male", 47);
	    allAthletes.add(newAthlete33);
	    allCountries.get(numOfCountries).addAthlete(newAthlete33);
	    
		Team.Sport_Types sportType_14 = Team.Sport_Types.RUNNING;
		Team newTeam_14 = new Team("Jamaican", sportType_14);
		allTeams.add(newTeam_14);
		allCountries.get(numOfCountries).addTeams(newTeam_14);
		allCountries.get(numOfCountries).addAthlete(newAthlete33);
		allTeams.get(numOfTeams).addAthlete(newAthlete33);
		numOfTeams++;
		numOfCountries++;
		
		//==============================United_Kingdom===================================================  			
		
        Country newCountry10 = new Country("United Kingdom");
        allCountries.add(newCountry10);
		
		Athlete newAthlete34 = new RunnerAndJumper("Stanley klam", 36, "Male", 45, 8);
	    Athlete newAthlete35 = new RunnerAndJumper("Joni Ti ", 20, "Male", 41, 8);
	    Athlete newAthlete36 = new Jumper("Queen Elizabeth", 46, "Male", 10);
	    Athlete newAthlete37 = new Jumper("Boris Johnson", 45, "Male", 5);

	    allAthletes.add(newAthlete34);
	    allAthletes.add(newAthlete35);
	    allAthletes.add(newAthlete27);
	    allAthletes.add(newAthlete28);
	    allCountries.get(numOfCountries).addAthlete(newAthlete34);
	    allCountries.get(numOfCountries).addAthlete(newAthlete35);
	    allCountries.get(numOfCountries).addAthlete(newAthlete27);
	    allCountries.get(numOfCountries).addAthlete(newAthlete28);
	    
	    Team.Sport_Types sportType_15 = Team.Sport_Types.RUNNING;
		Team newTeam_15 = new Team("United Kingdom", sportType_15);
		allTeams.add(newTeam_15);
		allCountries.get(numOfCountries).addTeams(newTeam_15);
		allCountries.get(numOfCountries).addAthlete(newAthlete34);
		allCountries.get(numOfCountries).addAthlete(newAthlete35);
		allTeams.get(numOfTeams).addAthlete(newAthlete34);
		allTeams.get(numOfTeams).addAthlete(newAthlete35);

		numOfTeams++;
		
		Team.Sport_Types sportType16 = Team.Sport_Types.JUMPING;
		Team newTeam_16 = new Team("United Kingdom", sportType16);
		allTeams.add(newTeam_16);
		allCountries.get(numOfCountries).addTeams(newTeam_16);
		allCountries.get(numOfCountries).addAthlete(newAthlete34);
		allCountries.get(numOfCountries).addAthlete(newAthlete35);
		allCountries.get(numOfCountries).addAthlete(newAthlete36);
		allCountries.get(numOfCountries).addAthlete(newAthlete37);
		allTeams.get(numOfTeams).addAthlete(newAthlete34);
		allTeams.get(numOfTeams).addAthlete(newAthlete35);
		allTeams.get(numOfTeams).addAthlete(newAthlete36);
		allTeams.get(numOfTeams).addAthlete(newAthlete37);
		
		numOfTeams++;
		numOfCountries++;
		
		
		
		
		//====================================Referee==============================================		
		
		Referee newReferee1 = new RefereeRunner("Gal Osher", 32, "Male", 3, 5);
		Referee newReferee2 = new RefereeJumping("Ron Zheva", 25, "Female", 4, 19);
		Referee newReferee3 = new RefereeRunner("Tom Loo", 22, "Male", 10, 68);
		Referee newReferee4 = new RefereeJumping("Fbi Alen", 22, "Female", 10, 68);
		Referee newReferee5 = new RefereeRunner("Vans Wow", 39, "Male", 6, 68);
		Referee newReferee6 = new RefereeJumping("Sni Mor", 36, "Male", 9, 88);
		allReferees.add(newReferee1);
		allReferees.add(newReferee2);
		allReferees.add(newReferee3);
		allReferees.add(newReferee4);
		allReferees.add(newReferee5);
		allReferees.add(newReferee6);

		//=======================================================================================  		
		
		
	}

	public List<Referee> getAllReferees() {
		return allReferees;
	}

	public List<Athlete> getAllAthletes() {
		return allAthletes;
	}

	public ObservableList getWinnersInSpecificCompetition(Tournament competition) {
		List list = new ArrayList();
		for (int i = 0; i < competitions.size(); i++) {
			if (competition.getStadium().equals(competitions.get(i).getStadium()) && Winners[i] == false) {
				if (competition instanceof TeamCompetition) {
					list.addAll(((TeamCompetition) competition).getWinnersInCompetition());
					Winners[i] = true;
				} else if (competition instanceof CountryCompetition) {
					list.addAll(((CountryCompetition) competition).getWinnersinTeams());
					Winners[i] = true;
				}
				break;
			}
			if (Winners[i] == false) {
				if (competition instanceof TeamCompetition) {
					list.addAll(((TeamCompetition) competition).getWinners());

				} else if (competition instanceof CountryCompetition) {
					list.addAll(((CountryCompetition) competition).getTeamsWinners());
				}
			}
		}
		ObservableList data = FXCollections.observableList(list);
		return data;
	}


	public List<Tournament> getCompetitions() {
		return competitions;
	}

	public List<Team> getAllTeams() {
		return allTeams;
	}

	public void updateMdealsInCountry() {
		for (int i = 0; i < allCountries.size(); i++) {
			int numOfMedalsInCountry = 0;
			for (int j = 0; j < allCountries.get(i).getAllAthletes().size(); j++) {
				numOfMedalsInCountry += allCountries.get(i).getAllAthletes().get(j).getNumOfMedals();
			}
			for (int k = 0; k < allCountries.get(i).getCountryTeams().size(); k++) {
				numOfMedalsInCountry += allCountries.get(i).getCountryTeams().get(k).getNumOfTeamsMedals();
			}
			allCountries.get(i).setMedals(numOfMedalsInCountry);
		}
	}

	public List<Athlete> getAthletesDetailsisSorted() {

		return sortPersonalCompetition(allAthletes);
	}

	public List<Team> getTeamDetailsByRunning() {

		return sortTeams(allTeams);
	}

	public List<Country> getCountries() {
		return allCountries;
	}

	public void sortCountriesByMedals(List<Country> allCountries) {
		Comparator<Country> compareByCountries = new Comparator<Country>() {
			public int compare(Country o1, Country o2) {
				if (o1.getMedals() < o2.getMedals()) {
					return 1;
				} else if (o1.getMedals() == o2.getMedals()) {
					return 0;
				}
				return -1;
			}
		};
		Collections.sort(allCountries, compareByCountries);

	}

	public List<Team> sortTeams(List<Team> teams) {
		Comparator<Team> compareByTeamsMedals = new Comparator<Team>() {

			public int compare(Team o1, Team o2) {
				if (o1.getNumOfTeamsMedals() < o2.getNumOfTeamsMedals()) {
					return 1;
				} else if (o1.getNumOfTeamsMedals() == o2.getNumOfTeamsMedals()) {
					return 0;
				}
				return -1;
			}
		};
		Collections.sort(teams, compareByTeamsMedals);
		return teams;

	}


	public List<Athlete> sortPersonalCompetition(List<Athlete> athletes) {
		Comparator<Athlete> compareByMedals = new Comparator<Athlete>() {
			public int compare(Athlete o1, Athlete o2) {
				if ((o1.getNumOfMedals() < o2.getNumOfMedals())) {
					return 1;
				} else if (o1.getNumOfMedals() == o2.getNumOfMedals()) {
					return 0;
				}
				return -1;
			}
		};
		Collections.sort(athletes, compareByMedals);
		return athletes;
	}

	public String getWinnersInOlympicsByPersonalCompetitions() {
		sortPersonalCompetition(allAthletes);
		String personalWinners = "";
		if (allAthletes.size() >= 3) {
			for (int i = 0; i < 3; i++) {
				personalWinners += allAthletes.get(i) + "\n";
			}
		}
		return personalWinners;
	}

	public String getWinnersInOlympicsByTeamCompetitions() {
		sortTeams(allTeams);
		String teamsWinners = "";
		if (allTeams.size() >= 3) {
			for (int i = 0; i < 3; i++) {
				teamsWinners += allTeams.get(i) + "\n";
			}
		}
		return teamsWinners;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String Location) {
		this.Location = Location;
	}

	public Date getStartDate() {
		return start;
	}

	public void setStartDate(Date Date) {
		this.start = Date;
	}

	public Date getEndDate() {
		return End;
	}

	public void setEndDate(Date endDate) {
		this.End = endDate;
	}

	public void getWinnersInOlympicsByCountriesCompetitions() {
		updateMdealsInCountry();
		String countriesWinners = "";
		sortCountriesByMedals(allCountries);

	}
}