package projects.triviaquiz.Models;


import jakarta.persistence.*;

@Entity
@Table(name = "players")
public record Player() {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private static int playerID;
    private static String teamName;
    private static int points;
    private static int[] answeredIDs;
}
