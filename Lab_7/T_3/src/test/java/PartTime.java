public class PartTime extends Employee implements ILeaves,ISalary{
    public void PartTime(int BaseSalary,int DaysWorked){
        this.BaseSalary=BaseSalary;
        this.DaysWorked=DaysWorked;
    }

    @Override
    public double yearlySalary() {
        return 12*(DaysWorked*(BaseSalary/22));
    }

    @Override
    public double yearlyLeaves() {
        return 0;
    }
}
