package projects.triviaquiz.Models;

import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int playerID;
    private String teamName;
    private int points;
    @ElementCollection
    private List<Integer> answeredIDs;
    
    // getters
    public int getPlayerID() {
        return playerID;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getPoints() {
        return points;
    }

    public List<Integer> getAnsweredIDs() {
        return answeredIDs;
    }

    // setters
    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setAnsweredIDs(List<Integer> answeredIDs) {
        this.answeredIDs = answeredIDs;
    }

}
