public class Contractual extends Employee implements ISalary,ILeaves{
    public void Contractual(int BaseSalary,int DaysWorked){
        this.BaseSalary=BaseSalary;
        this.DaysWorked=DaysWorked;
    }
    @Override
    public double yearlySalary() {
        return BaseSalary*12;
    }

    @Override
    public double yearlyLeaves() {
        return 15;
    }
}
