package br.com.fabio.boliche;

public class Score {

    private Integer firstScore;

    private Integer secondScore;

    private Integer totalScore;

    public Score() {
    }

    public Score(Integer firstScore, Integer secondScore, Integer totalScore) {
        this.firstScore = firstScore;
        this.secondScore = secondScore;
        this.totalScore = totalScore;
    }

    public Integer getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(Integer firstScore) {
        this.firstScore = firstScore;
    }

    public Integer getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(Integer secondScore) {
        this.secondScore = secondScore;
    }

    public Integer getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public void spare() {
        this.totalScore = this.firstScore * 2;
    }

    public void strike() {
        this.secondScore = 0;
        this.totalScore = this.firstScore * 2;
    }
}
