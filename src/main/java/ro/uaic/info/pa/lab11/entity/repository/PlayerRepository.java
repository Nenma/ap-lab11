package ro.uaic.info.pa.lab11.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uaic.info.pa.lab11.entity.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
