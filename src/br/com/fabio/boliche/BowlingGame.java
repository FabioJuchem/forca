package br.com.fabio.boliche;

import java.util.Scanner;

public class BowlingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        var game = new Game();

        var hasNewPlayer = "";
        while(!hasNewPlayer.equalsIgnoreCase("N")) {
            System.out.println("Favor adicione jogadores ao jogo");
            var player = new Player(sc.nextLine());
            game.getPlayers().add(player);
            System.out.println("Deseja adicionar mais jogadores[Y/N]?");
            hasNewPlayer = sc.nextLine();
        }
        game.startGame();

        while(game.getCurrentRound() <= 2) {

            game.getPlayers().forEach(player -> {
                var score = new Score();
                System.out.println("Faça sua primeira jogada, e digite sua pontuação");
                score.setFirstScore(scan());
                if(score.getFirstScore().equals(10)) {
                    System.out.println("STRIIIIIIKKKKKEEEEEEEEEEE");
                    score.strike();
                } else {
                    System.out.println("Faça sua segunda jogada, e digite sua pontuação");
                    score.setSecondScore(scan());
                    if(score.getFirstScore() + score.getSecondScore() == 10) {
                        System.out.println("SPAAAREEEEE");
                        score.spare();
                    } else {
                        score.setTotalScore(score.getFirstScore() + score.getSecondScore());
                    }
                }
                player.getScores().add(score);
            });
            game.nextRound();
            System.out.println("Próxima rodada");
        }
        System.out.println("Pontuação Total");
        game.getPlayers().forEach(player -> {
            System.out.print(player.getName() + " ");
            player.totalScore();
            System.out.println("Pontuação: "+ player.getTotalScore());
        });

    }

    public static Integer scan() {
        Scanner sc = new Scanner(System.in);
        var value = 0;
        do  {
            System.out.println("valor invalido");
            value = sc.nextInt();
        } while((value > 10 || value < 0));
        return value;
    }
}
