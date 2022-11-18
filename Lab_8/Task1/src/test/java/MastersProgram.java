public abstract class MastersProgram {
    public String major;

    public abstract boolean isEligible(float cgpa, String major);

    public abstract int getMarks(int theoryMarks, int thesisMarks, int presentMarks);
}
