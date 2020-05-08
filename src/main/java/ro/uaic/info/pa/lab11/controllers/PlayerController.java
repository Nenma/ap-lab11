package ro.uaic.info.pa.lab11.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.uaic.info.pa.lab11.entity.model.Player;
import ro.uaic.info.pa.lab11.services.PlayerService;

import java.util.List;

@RestController
@RequestMapping(value = "/players")
public class PlayerController {

    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers() {
        return playerService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Player getPlayerById(@PathVariable Long id) {
        return playerService.getById(id);
    }

    @PostMapping
    public void create(@RequestBody String name) {
        playerService.save(new Player((long)getPlayers().size() + 1, name));
    }

    @PutMapping(value = "/{id}")
    public void modifyName(@PathVariable Long id, @RequestBody String name) {
        playerService.update(playerService.getById(id)).setName(name);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        playerService.delete(playerService.getById(id));
    }
}
