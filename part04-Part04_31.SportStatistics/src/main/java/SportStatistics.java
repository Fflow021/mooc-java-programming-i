
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SportStatistics {

    public static void main(String[] args) {
        int count = 0;
        int wins = 0;
        int losses = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();        
        
        ArrayList<Team> records = readRecordsFromFile(file);
        
        System.out.println("Team:");
        String teamName = scan.nextLine();
        
        
        //setting losses, wins, games, for the input team
        for(Team team: records) {
            if(team.getHomeTeam().contains(teamName)) {
                count++;
            
                if(team.getHomeScore() > team.getVisitingScore()) {
                    wins++;
                    team.setWins();
                } else {
                    losses++;
                    team.setLosses();
                }
            
            } else if (team.getVisitingTeam().contains(teamName)) {
                count++;
                
                if(team.getVisitingScore() > team.getHomeScore()) {
                    wins++;
                    team.setWins();
                } else {
                    losses++;
                    team.setLosses();
                }
            }
            
            team.playGame();
        }//end of for
        
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }//end of main
    
    //method for populate the list "Teams" with object "Team"
    public static ArrayList<Team> readRecordsFromFile(String file) {
        ArrayList<Team> teams = new ArrayList<>();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                
                String[] parts = row.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                
                teams.add(new Team(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
        return teams;
    }
    
}
