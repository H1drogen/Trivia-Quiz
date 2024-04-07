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
    private int[] playerIDs;

    @OneToMany
    private int[] questionIDs;

    // getters and setters
}