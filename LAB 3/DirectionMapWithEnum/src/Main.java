import java.util.Scanner;

enum Direction{

    North("South"),
    South("North"),
    East("West"),
    West("East");
    String Direct;
    Direction(String s){
        this.Direct=s;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GetDirection get_direction = new GetDirection(sc.nextLine());
        System.out.println(get_direction.GetPosition(get_direction.str));
        System.out.println(get_direction.GoDirection());
    }
}