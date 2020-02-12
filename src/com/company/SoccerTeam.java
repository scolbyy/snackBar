package com.company;
public class SoccerTeam
{
    private int wins, losses, ties;
    private static int games = 0, goals = 0;

    public SoccerTeam() { //default Constructor
        wins = 0;
        losses = 0;
        ties = 0;
    }
    public void played(SoccerTeam other, int myScore, int otherScore)
    {
        if (myScore > otherScore)
        {
            wins++;
            other.losses++;
        }
        if (myScore < otherScore)
        {
            losses++;
            other.wins++;
        }
        if (myScore == otherScore)
        {
            ties++;
            other.ties++;
        }
        games++;
        goals += myScore + otherScore;
    }

    public int currentPoints()
    {
        int points = (3 * wins) + (ties);
        return points;
    }
    public void reset()
    {
        wins = 0;
        losses = 0;
        ties = 0;
    }
    public static void startTournament()
    {
        games = 0;
        goals = 0;
    }
    public static int getGoals()
    {
        return goals;
    }
    public static int getGames()
    {
        return games;
    }
    public static void main(String[] args)
    {
        SoccerTeam t1 = new SoccerTeam();
        SoccerTeam t2 = new SoccerTeam();
        SoccerTeam t3 = new SoccerTeam();
        SoccerTeam t4 = new SoccerTeam();
        t1.played(t2, 5, 21);
        t2.played(t3, 22, 4);
        t3.played(t4, 4 , 1);
        t4.played(t1, 3, 0);
        System.out.println("First Tournament");
        System.out.println("Total games played : " + getGames() + " & Total goals scored : " + getGoals());
        System.out.println("Team 1 scored " + t1.currentPoints() + " points");
        System.out.println("Team 2 scored " + t2.currentPoints() + " points");
        System.out.println("Team 3 scored " + t3.currentPoints() + " points");
        System.out.println("Team 4 socred " + t4.currentPoints() + " points");
        startTournament();
        t1.reset();
        t2.reset();
        t3.reset();
        t4.reset();
        System.out.println();
        t1.played(t3, 12, 2);
        t2.played(t4, 22, 12);
        t3.played(t2, 19 , 8);
        t4.played(t1, 3, 10);
        t1.played(t4, 4, 32);
        t2.played(t3, 17, 2);
        System.out.println("Second Tournament");
        System.out.println("Total games played : " + getGames() + " & Total goals scored : " + getGoals());
        System.out.println("Team 1 scored " + t1.currentPoints() + " points");
        System.out.println("Team 2 scored " + t2.currentPoints() + " points");
        System.out.println("Team 3 scored " + t3.currentPoints() + " points");
        System.out.println("Team 4 scored " + t4.currentPoints() + " points");
    }
}

