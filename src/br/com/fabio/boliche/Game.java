package br.com.fabio.boliche;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Integer currentRound;

    private List<Player> players = new ArrayList<>();

    public Game() {
    }

    public Game(Integer currentRound, List<Player> players) {
        this.currentRound = currentRound;
        this.players = players;
    }

    public Integer getCurrentRound() {
        return currentRound;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void startGame() {
        this.currentRound = 1;
    }

    public void nextRound() {
        this.currentRound += 1;
    }
}
