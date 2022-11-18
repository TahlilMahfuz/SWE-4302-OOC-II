import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GetDirection get_direction = new GetDirection();
        System.out.println(get_direction.GetPosition(sc.nextLine()));;
        System.out.println(get_direction.GoDirection());
    }
}