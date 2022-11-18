package assignment2.ControlCoupling;

public class ArgentinaFootballTeam implements Football{
    int score;
    public ArgentinaFootballTeam(int score){
        this.score=score;
    }
    @Override
    public void attack() {
        System.out.println("Argentina trying to score");
    }

    @Override
    public void defend() {
        System.out.println("Argentina trying to defend");
    }

    @Override
    public void balanced() {
        System.out.println("Argentina trying to play balanced");
    }
}
