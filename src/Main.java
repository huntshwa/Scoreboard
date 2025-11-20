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
        Scoreboard game;

        while (s.hasNext()) {
            if (!s.hasNextInt()) game = new Scoreboard(s.next(), s.next());

            while (s.hasNextInt()) {
                game.recordPlay(s.nextInt());
            }


        }
}
