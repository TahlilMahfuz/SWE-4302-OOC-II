package assignment2.ControlCoupling;

public class OngoingMatch {
    public static void main(String[] args) {
        ArgentinaFootballTeam argentina=new ArgentinaFootballTeam(11);
        BrazilFootballTeam brazil=new BrazilFootballTeam(10);
        if(argentina.score>brazil.score){
            brazil.attack();
            argentina.defend();
        }
        ArgentinaFootballTeam argentina1=new ArgentinaFootballTeam(2);
        BrazilFootballTeam brazil1=new BrazilFootballTeam(10);
        if(argentina1.score<brazil1.score){
            argentina.attack();
            argentina.balanced();
            brazil.defend();
        }
        ArgentinaFootballTeam argentina2=new ArgentinaFootballTeam(2);
        BrazilFootballTeam brazil2=new BrazilFootballTeam(2);
        if(argentina2.score==brazil2.score){
            argentina.defend();
            brazil.attack();
        }
    }
}
