public class FulltimeEmployee extends Employee implements ISalary,ILeaves{
    @Override
    public double yearlySalary() {
        return 12*(BaseSalary+BaseSalary*0.6+BaseSalary*1.2);
    }

    @Override
    public double yearlyLeaves() {
        return 10+(DaysWorked*0.05);
    }
}
