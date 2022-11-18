package assignment1;

public class LocalCalender {
    DateManipulator dateManipulator= new DateManipulator();
    public String changeDate(Date date){
       dateManipulator.incrementDate(date);
       String str;
       str=date.day+" "+date.month+" "+date.year;
       return str;
    }
}
