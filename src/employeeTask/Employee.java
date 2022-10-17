package employeeTask;

import java.util.InputMismatchException;

public class Employee {

    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        setName(name);
        setSalary(salary);
        setWorkHours(workHours);
        setHireYear(hireYear);
    }

    public void setName(String name) {
        if ( name.isEmpty() || !name.matches("[a-zA-Z]++(?: ++[a-zA-Z]++)*+")){
            throw new InputMismatchException("Invalid name: " + name);
        }
        this.name = name;
    }

    public void setSalary(double salary) {
        if(salary <= 0){
            throw new InputMismatchException("Salary can not be zero or negative: " + salary);
        }
        this.salary = salary;
    }

    public void setWorkHours(double workHours) {
        if (workHours < 0){
            throw new InputMismatchException("Work hours can not be negative: " + workHours);
        }
        this.workHours = workHours;
    }

    // Hire year can not be later than 2021 (current date), or before 1921 (100 working years).
    public void setHireYear(int hireYear) {
        if (hireYear > 2021 || hireYear < 1921){
            throw new InputMismatchException("Hire year can not be more than 2021 " +
                    "or less than 1921: " + hireYear);
        }
        this.hireYear = hireYear;
    }

    /**
     * Calculates the tax to salary
     * No tax if salary is less than 1000TL
     * 3% tax if salary is more than or equal to 1000TL
     * @param salary
     * @return tax amount
     */
    private double tax(double salary){
        double taxAmount;
        if (salary<1000){
            taxAmount = 0.0;
        } else {
            taxAmount = salary * 0.03;
        }
        return taxAmount;
    }

    /**
     * Calculates the bonus payment.
     * 30TL bonus per hour over 40 working hours per week.
     * Calculates bonus for 4 weeks (one month)
     * @param workHours
     * @return bonus amount
     */
    private double bonus(double workHours){
        if (workHours>40.0){
            return (workHours-40.0) * 30.0 * 4.0;
        } else {
            return 0.0;
        }
    }

    /**
     * Calculates raise in salary based on hire year.
     * Tax and bonus are taken into account!
     * 5% increase in salary if less than 10 years
     * 10% increase in salary if more than 9 and less than 20 years
     * 15% increase in salary if more than 19 years
     * @param hireYear
     * @return salary raise amount
     */
    private double raiseSalary(int hireYear){
        double raiseSalaryAmount;
        double salaryWithTaxAndBonus = salary + tax(salary) + bonus(workHours);
        if ( (2021-hireYear) < 10 ) {
            raiseSalaryAmount = salaryWithTaxAndBonus * 0.05;
        } else if ( (2021-hireYear) > 9 && (2021-hireYear) < 20 ){
            raiseSalaryAmount = salaryWithTaxAndBonus *  0.1;
        } else {
            raiseSalaryAmount = salaryWithTaxAndBonus * 0.15;
        }
        return raiseSalaryAmount;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                ", tax =" + tax(salary) +
                ", bonus =" + bonus(workHours) +
                ", raise in salary =" + raiseSalary(hireYear) +
                ", salary with tax and bonus =" + ( salary + raiseSalary(hireYear) + bonus(workHours) + tax(salary) ) +
                ", total salary=" + ( salary + raiseSalary(hireYear) + bonus(workHours) ) +
                '}';
    }
}