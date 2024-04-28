package projects.triviaquiz.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projects.triviaquiz.Models.Player;
import projects.triviaquiz.Repository.PlayerRepository;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }
    
    public boolean existsByPlayerID(int playerID) {
        return playerRepository.existsByPlayerID(playerID);
    }

}
