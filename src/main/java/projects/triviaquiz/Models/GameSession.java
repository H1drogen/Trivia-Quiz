package projects.triviaquiz.Models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "game_sessions")
public class GameSession {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int sessionID;

    @OneToMany
    private List<Player> playerIDs;

    @OneToMany
    private List<Question> questionIDs;

    // getters and setters
}