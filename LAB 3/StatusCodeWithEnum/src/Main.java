import java.util.Scanner;

enum StatusCode{
    C_400("Bad Request"),
    C_401("Unauthorized"),
    C_403("Forbidden"),
    C_404("Not found"),
    C_408("Request timeout");

    String str;
    StatusCode(String Status){
        this.str=Status;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Solution sol = new Solution();
        System.out.println(sol.Stat(sc.nextLine()));;
    }
}