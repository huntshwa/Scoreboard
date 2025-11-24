public class Scoreboard {

    private String team1;
    private String team2;

    private int score1;
    private int score2;

    private boolean activeTeam;

    public Scoreboard(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
        activeTeam = true;
    }

    public void recordPlay(int points) {
        if (points != 0)
            if (activeTeam) score1 += points;
            else score2 += points;

        else activeTeam = !activeTeam;
    }

    public String getScore() {
        String team;

        if (activeTeam) team = team1;
        else team = team2;

        return score1 + "-" + score2 + "-" + team;
    }

    public String getWin() {
        String team;

        if (activeTeam) team = team1;
        else team = team2;

        return team;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }
}
