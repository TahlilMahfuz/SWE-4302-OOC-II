public class GetDirection {
    String str;
    GetDirection(String s){
        this.str=s;
    }
    public String GetPosition(String str){
        return "I am in the "+str;
    }
    public String GoDirection(){
        return "I have to go "+ Direction.valueOf(str).Direct;
    }
}
