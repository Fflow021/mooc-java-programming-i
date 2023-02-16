/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fflow
 */
public class Team {
    private String homeTeam, visitingTeam;
    private int homeTeamPoints, visitingTeamPoints, wins, losses, games;
    
    public Team(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    } // end of constructor
    
    public String getVisitingTeam() {
        return this.visitingTeam;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public int getHomeScore() {
        return this.homeTeamPoints;
    }
    
    public int getVisitingScore() {
        return this.visitingTeamPoints;
    }   
    
    public int playGame() {
        return games +=1;
    }
    
    public int setWins() {
        return this.wins +=1;
    }
    
    public int setLosses() {
        return this.losses += 1;
    }
    
    public int getWins() {
        return wins;
    }
    
    public int getLosses() {
        return losses;
    }
}
