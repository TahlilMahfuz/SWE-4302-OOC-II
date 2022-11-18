import java.util.FormatterClosedException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person=new Person(sc.nextLine());
        {
            int count = 0;
            for (int i = 0; i < person.PhoneNumber.length(); i++) {
                if ((int) person.PhoneNumber.charAt(i) >= 48 && (int) person.PhoneNumber.charAt(i) <= 57) {
                    count++;
                }
            }
            try {
                if(count==8 && person.PhoneNumber.contains("_")){
                    System.out.println("OK");
                }
                else {
                    throw new Exp();
                }
            }
            catch (Exception exp){
                System.out.println(exp.getMessage());
            }
        }
    }
}