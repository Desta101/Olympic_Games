package Controller;
//Shimon Desta-203670286
import Model.*;
import View.*;
import Model.Date;
import javafx.fxml.FXML;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class SystamController {
    public OlympicGame Olympic = new OlympicGame();

    @SuppressWarnings("unused")
	public void getInfroInOlympics() throws Exception {
    	
    	int Referee;
        boolean Flag = false;
        //boolean Flag2 = false;
    	Olympic.inPutData();
        List<Tournament> tournaments = new ArrayList<Tournament>();
        Stadium London = new Stadium("London ", "UK", 90350);
        Stadium Birmingham = new Stadium("Birmingham", "UK", 50360);
        Stadium Manchester = new Stadium("Manchester", "UK", 57631);
        Stadium Liverpool = new Stadium("Liverpool", "UK", 12335);
        Stadium NewYorkCity = new Stadium("NewYorkCity ", "USA", 123131);
        Stadium Texas = new Stadium("Texas", "USA", 12305);
        Stadium Florida  = new Stadium("Florida ", "USA", 30512);
        Stadium Arizona  = new Stadium("Arizona ", "USA", 45086);
        Stadium Kyoto = new Stadium("Kyoto ", "Japan", 63371);
        Stadium Osaka = new Stadium("Osaka", "Japan", 32154);
        Stadium Yokohama = new Stadium("Yokohama", "Japan", 80012);
		Stadium Nagoya = new Stadium("Nagoya", "Japan", 70513);
        

//
//        for (int a = 0; a < Olympic.getCompetitions().size(); a++) {
//            if (Olympic.getCompetitions().get(a) instanceof CountryCompetition) {
//                for (int j = 0; j < Olympic.getAllTeams().size(); j++) {
//                    if (Olympic.getAllTeams().get(j).getSportTypes() == Olympic.getCompetitions().get(a).getSportTypes()) {
//                        ((CountryCompetition) Olympic.getCompetitions().get(a))
//                                .addTeamsToCompetition(Olympic.getAllTeams().get(j));
//             			}      
//             		}  
//            	}       
//             }    
//        int random = (int) (Math.random() * personalCompetitionAthletes.size());
//			if (checkIfNoRepeatWinner(winners, personalCompetitionAthletes.get(randomWinners))) {
//			winners.add(personalCompetitionAthletes.get(randomWinners));
//			personalCompetitionAthletes.get(randomWinners).addNumOfMedals();
//			numOfWinners++;
//		}
//	

        do {
        	Referee = getRandomReferee(); 
        	if (Olympic.getAllReferees().get(Referee) instanceof RefereeJumping) {
                tournaments.add(new CountryCompetition(Olympic.getAllReferees().get(Referee),
                Team.Sport_Types.JUMPING, new Date(1,10, 2020), Kyoto));
                Flag = true;
            }
        } while (!Flag);
        do {
        	Flag = false;
            Referee = getRandomReferee(); 
            if (Olympic.getAllReferees().get(Referee) instanceof RefereeRunner) {
                tournaments.add(new CountryCompetition(Olympic.getAllReferees().get(Referee), 
                Team.Sport_Types.RUNNING,new Date(2,10, 2020), Osaka));
                Flag = true;
            }
        } while (!Flag);
        do {
        	Flag = false;
            Referee = getRandomReferee(); 
            if (Olympic.getAllReferees().get(Referee) instanceof RefereeJumping) {
                tournaments.add(new TeamCompetition(Olympic.getAllReferees().get(Referee), 
                Team.Sport_Types.JUMPING, new Date(4,10, 2020), Yokohama));
                Flag = true;
            }
        } while (!Flag);
        do {
        	Flag = false;
        	Referee = getRandomReferee(); 
            if (Olympic.getAllReferees().get(Referee) instanceof RefereeRunner) {
                tournaments.add(new TeamCompetition(Olympic.getAllReferees().get(Referee),
                Team.Sport_Types.RUNNING, new Date(3,10, 2020), Nagoya));
                Flag = true;
            }
        } while (!Flag);
        
        
        for (int i = 0; i < tournaments.size(); i++) {
        	Olympic.addCompetitons(tournaments.get(i));
        }


        for (int a = 0; a < Olympic.getCompetitions().size(); a++) {
            if (Olympic.getCompetitions().get(a) instanceof CountryCompetition) {
                for (int j = 0; j < Olympic.getAllTeams().size(); j++) {
                    if (Olympic.getAllTeams().get(j).getSportTypes() == Olympic.getCompetitions().get(a).getSportTypes()) {
                        ((CountryCompetition) Olympic.getCompetitions().get(a))
                                .addTeamsToCompetition(Olympic.getAllTeams().get(j));
                    }
                }
            } else if (Olympic.getCompetitions().get(a) instanceof TeamCompetition) {
                for (int j = 0; j < Olympic.getAllAthletes().size(); j++) {
                    if (Olympic.getCompetitions().get(a).
                            getSportTypes() == Team.Sport_Types.RUNNING) {
                        ((TeamCompetition) Olympic.getCompetitions().get(a))
                                .addAthleteToPersonalCompetition(Olympic.getAllAthletes().get(j));

                    } else {
                        ((TeamCompetition) Olympic.getCompetitions().get(a))
                                .addAthleteToPersonalCompetition(Olympic.getAllAthletes().get(j));

                    }
                }
            }
        }
    }

    public List<Tournament> getCompetitions() {
        return Olympic.getCompetitions();
    }

    public List<Athlete> getAthleteInSprcificCompetition(TeamCompetition tournaments) {
        return tournaments.getPersonalCompetitionAthletes();
    }
    public List<Team> getTeamInSpecificCmpetition(CountryCompetition tournaments){
        return tournaments.getCompetitionTeams();
    }

    public String getFinalWinners(){
        StringBuffer sb = new StringBuffer();
        return sb.toString();
    }
    public int getRandomReferee() {
        return (int) (Math.random() * Olympic.getAllReferees().size());
    }
    public void makeStadium() {
    	
    	
    	
    }
    
}






