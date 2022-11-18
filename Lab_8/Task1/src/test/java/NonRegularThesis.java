public class NonRegularThesis extends MastersProgram{
    public NonRegularThesis(String major){
        this.major=major;
    }
    @Override
    public boolean isEligible(float cgpa, String major) {
        return this.major.equals(major);
    }

    @Override
    public int getMarks(int theoryMarks, int thesisM, int presentMarks) {
        return theoryMarks + presentMarks/2;
    }
}
