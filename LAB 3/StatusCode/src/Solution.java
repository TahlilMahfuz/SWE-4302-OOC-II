import java.util.Objects;

public class Solution {
    public String getResponse(String str){
        if(Objects.equals(str, "C_400")){return "Bad Request";}
        else if(Objects.equals(str, "C_401")){return "Unauthorized";}
        else if(Objects.equals(str, "C_403")){return "Forbidden";}
        else if(Objects.equals(str, "C_404")){return "Not Found";}
        else if(Objects.equals(str, "C_408")){return "Request Timeout";}
        else return "Error 404";
    }
}
