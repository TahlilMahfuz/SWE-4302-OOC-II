package assignment1;

public class DateManipulator {
    public void incrementDate(Date date){
        if(date.maxday==date.day){
            if(date.month==12){
                date.year++;
                date.month=1;
                date.day=1;
            }
            else{
                date.month++;
                date.day=1;
            }
        }
        else{
            date.day++;
        }
    }
}
