package projects.triviaquiz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projects.triviaquiz.Models.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{
    boolean existsByPlayerID(int playerID);
}
