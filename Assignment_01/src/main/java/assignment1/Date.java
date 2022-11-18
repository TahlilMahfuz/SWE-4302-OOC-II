package assignment1;

import java.util.Arrays;
import java.util.List;


public class Date {
    int day,month,year,maxday;
    public Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
        setMaxDays();
    }
    void setMaxDays(){
        DateChecker dateChecker=new DateChecker();
        List<Integer> list31= Arrays.asList(new Integer[]{1,3,5,7,8,10,12});

        if(dateChecker.LeapMonth(this.month)){
            if(dateChecker.LeapYear(this.year)){
                this.maxday=29;
            }
            else{
                this.maxday=28;
            }
        }
        else{
            if(list31.contains(this.month)){
                this.maxday=31;
            }
            else{
                this.maxday=30;
            }
        }
    }
}
