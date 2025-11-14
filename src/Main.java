import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.List;
public class Main {
    public static void main(String[] args) {

    }

    public static String read() throws FileNotFoundException {
        File f = new File("Scoreboard.txt");
        Scanner s = new Scanner(f);

        Team[] teams = new Team[7];

        while (s.hasNext()) {

            if (!s.hasNextInt()) {
                String teamOne = s.next();
                String teamTwo = s.next();

                for (int i = 0; i < 7; i++){
                    if (!teams[i].equals(teamOne) & teams[i] == null) {

                        Team temp = new Team(teamOne);
                        teams[i] = temp;

                        Team t1 = teams[i];
                    }
                    else if (teams[i].equals(teamOne))
                        Team t1 = teams[i];

                    if (!teams[i].equals(teamTwo) & teams[i] == null) {

                        Team temp = new Team(teamTwo);
                        teams[i] = temp;

                        Team t2 = teams[i];
                    }
                    else if (teams[i].equals(teamTwo))
                        Team t2 = teams[i];

                }

            }

            int[] scores = new int[2];
            int x = 0;

            while (s.hasNextInt()) {
                if (s.nextInt() == 0) {
                    if (x == 0) x++;
                    else x--;
                }
                scores[x] += s.nextInt();
            }

            t1.addPoints(scores[0]);
            t2.addPoints(scores[1]);

            

        }

    }
}
