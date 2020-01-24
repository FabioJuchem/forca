package br.com.fabio.boliche;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;

    private Integer totalScore = 0;

    private List<Score> scores = new ArrayList<>();

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void totalScore() {
        this.scores.forEach(score -> this.totalScore += score.getTotalScore());
    }
}
