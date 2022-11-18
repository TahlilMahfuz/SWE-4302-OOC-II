public class Fizz extends FizzBuzz{
    @Override
    String getFizzyBuzz(int n) {
        if(n%3==0 && n%5==0){
            return "FizzBuzz";
        }
        else if(n%3==0){
            return "Fizz";
        }
        else if(n%5==0) {
            return "Buzz";
        }
        else {
            return "Boom";
        }
    }
}
