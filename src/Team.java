public class Team {

    private String teamName;
    private int wins;
    private int points;

    public Team(String name) {
        teamName = name;
    }

    public void addWin(int w) {
        wins += w;
    }

    public void addPoints(int p){
        points += p;
    }

    public void printName() {
        System.out.println(teamName);
    }

    public void printWins() {
        System.out.println(wins);
    }

    public String toString() {
        return teamName;
    }
}
