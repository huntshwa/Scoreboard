import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scoreboard testGame = new Scoreboard("Red", "Blue");

        System.out.println(testGame.getScore());
        testGame.recordPlay(1);
        System.out.println(testGame.getScore());
        testGame.recordPlay(0);
        System.out.println(testGame.getScore());
        System.out.println(testGame.getScore());
        testGame.recordPlay(3);
        System.out.println(testGame.getScore());
        testGame.recordPlay(1);
        testGame.recordPlay(0);
        System.out.println(testGame.getScore());
        testGame.recordPlay(0);
        testGame.recordPlay(4);
        System.out.println(testGame.getScore());
        testGame.recordPlay(0);

        Scoreboard match = new Scoreboard("Lions", "Tigers");
        System.out.println(match.getScore());
        System.out.println(testGame.getScore());

        read();
    }

    public static void read() throws FileNotFoundException {
        File f = new File("Scoreboard.txt");
        Scanner s = new Scanner(f);
        Scoreboard game = null;

        Team[] teams = new Team[7];

        while (s.hasNext()) {
            if (!s.hasNextInt()) game = new Scoreboard(s.next(), s.next());

            while (s.hasNextInt()) {
                game.recordPlay(s.nextInt());
            }

            int oneList = 0;
            int twoList = 0;
            for (int i = 0; i < 7; i++) {
                if (teams[i] != null) {
                    if (teams[i].getName().equals(game.getTeam1())) oneList = 1;
                    if (teams[i].getName().equals(game.getTeam2())) twoList = 1;
                }
            }

            if (oneList == 0)
                for (int i = 0; i < 7; i++)
                    if (teams[i] == null) {
                        teams[i] = new Team(game.getTeam1());
                        break;
                    }

            if (twoList == 0)
                for (int i = 0; i < 7; i++)
                    if (teams[i] == null) {
                        teams[i] = new Team(game.getTeam2());
                        break;
                    }
            for (int i = 0; i < 7; i++)
                if (teams[i] != null)
                    if (teams[i].getName().equals(game.getWin())) teams[i].addWin();

        }

        for (int i = 0; i < 7; i++) {
            System.out.print(teams[i].getName() + " - ");
            System.out.println(teams[i].getWins());
        }
    }
}
