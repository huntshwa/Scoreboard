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
                if (!List.contains(s.next()) )
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


        }

    }
}
