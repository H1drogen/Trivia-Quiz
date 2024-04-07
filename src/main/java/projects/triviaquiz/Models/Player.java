package projects.triviaquiz.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int playerID;
    private String teamName;
    private int points;
    private int[] answeredIDs;

    // getters and setters
}
