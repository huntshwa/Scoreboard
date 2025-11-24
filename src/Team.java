public class Team {
    private String name;
    private int wins;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addWin() {
        wins++;
    }

    public int getWins() {
        return wins;
    }
}
