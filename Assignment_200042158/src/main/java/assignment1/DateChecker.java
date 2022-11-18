package assignment1;

public class DateChecker {
    public boolean LeapYear(int year){
        return ((year%400==0) || (year%4==0 && year%100!=0));
    }
    public boolean LeapMonth(int month){
        return month==2;
    }

}
