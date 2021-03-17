package TasksFromChap6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Chapter 6, task 6.87
 */
public class Game {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameTeam1 = null;
        String nameTeam2 = null;

        try {
            System.out.print("Название первой команды: ");
            nameTeam1 = reader.readLine();
            System.out.print("Назывние второй команды: ");
            nameTeam2 = reader.readLine();
            System.out.println("Подождем 3 секунды пока матч закончится ");
            Thread.sleep(3000);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int team1 = score();
        int team2 = score();

        System.out.println("команда " + nameTeam1 + " набрал " + team1);
        System.out.println("команда " + nameTeam2 + " набрал " + team2);

        if (team1 > team2) {
            System.out.println("Победитель команда " + nameTeam1);
        } else if (team1 == team2) {
            System.out.println("ничья");
        } else {
            System.out.println("Победитель команда " + nameTeam2);
        }

    }

    static int play() {
        Random random = new Random();
        int goool = random.nextInt(4);
        return goool;
    }

    static int score() {
        int ochki = play();
        return ochki;
    }
}
