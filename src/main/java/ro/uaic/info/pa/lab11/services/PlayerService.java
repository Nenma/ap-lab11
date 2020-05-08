package ro.uaic.info.pa.lab11.services;

import ro.uaic.info.pa.lab11.entity.model.Player;

import java.util.List;

public interface PlayerService {

    List<Player> getAll();

    Player getById(Long id);

    Player save(Player player);

    Player update(Player player);

    Player patch(Player player);

    void delete(Player player);

}
