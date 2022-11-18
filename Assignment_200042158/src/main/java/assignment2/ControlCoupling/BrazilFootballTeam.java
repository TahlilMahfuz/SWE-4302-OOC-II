package assignment2.ControlCoupling;

public class BrazilFootballTeam implements Football{
    int score;
    public BrazilFootballTeam(int score){
        this.score=score;
    }
    @Override
    public void attack() {
        System.out.println("Opponent left the match because of Brazil's attack :V");
    }

    @Override
    public void defend() {
        System.out.println("Opponent left the match being scared of Thiago Silva, Casemiro and Marquinhos");
    }

    @Override
    public void balanced() {
        System.out.println("Brazil playing Balanced");
    }
}
