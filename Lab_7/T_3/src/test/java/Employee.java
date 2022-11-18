abstract class Employee {
    String EmployeeTime;
    int BaseSalary,DaysWorked;
}
interface ISalary{
    double yearlySalary();
}
interface ILeaves{
    double yearlyLeaves();
}