import java.util.Objects;

public class GetDirection {
    String str;
    public String GetPosition(String S){
        this.str=S;
        if(Objects.equals(str, "North")){return "I am in the "+S;}
        else if(Objects.equals(str, "South")){return "I am in the "+S;}
        else if(Objects.equals(str, "East")){return "I am in the "+S;}
        else if(Objects.equals(str, "West")){return "I am in the "+S;}
        else return "I am somewhere";
    }
    public String GoDirection(){
        if(Objects.equals(str, "North")){return "I have to GO South";}
        else if(Objects.equals(str, "South")){return "I have to go North";}
        else if(Objects.equals(str, "East")){return "I have to go West";}
        else if(Objects.equals(str, "West")){return "I have to go East";}
        else return "Some way";
    }
}
