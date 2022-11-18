public class ExecutiveMasterProgram extends MastersProgram{
    public ExecutiveMasterProgram(String major){
        this.major=major;
    }
    @Override
    public boolean isEligible(float cgpa, String major) {
        return (cgpa >= 3.75 || this.major.equals(major));
    }

    @Override
    public int getMarks(int theoryMarks, int thesisMarks, int presentMarks) {
        return theoryMarks;
    }
}
