package employeeTask;

import java.util.InputMismatchException;

public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
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

    public void setWorkHours(int workHours) {
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
     * @param salary Maaş
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
     * @param workHours Çalışma saati
     * @return bonus amount
     */
    private double bonus(int workHours){
        if (workHours>40){
            return (workHours-40) * 30;
        } else {
            return 0;
        }
    }

    /**
     * Calculates raise in salary based on hire year.
     * Tax and bonus are taken into account!
     * 5% increase in salary if less than 10 years
     * 10% increase in salary if more than 9 and less than 20 years
     * 15% increase in salary if more than 19 years
     * @param hireYear Başlangıç yılı
     * @return salary raise amount
     */
    private double raiseSalary(int hireYear){
        double raiseSalaryAmount;
        if ( (2021-hireYear) < 10 ) {
            raiseSalaryAmount = salary * 0.05;
        } else if ( (2021-hireYear) > 9 && (2021-hireYear) < 20 ){
            raiseSalaryAmount = salary *  0.1;
        } else {
            raiseSalaryAmount = salary * 0.15;
        }
        return raiseSalaryAmount;
    }


    @Override
    public String toString() {
        return  "Adı : " + name +
                "\nMaaşı : " + salary +
                "\nÇalışma Saati : " + workHours +
                "\nBaşlangıç Yılı : " + hireYear +
                "\nVergi : " + tax(salary) +
                "\nBonus : " + bonus(workHours) +
                "\nMaaş Artışı : " + raiseSalary(hireYear) +
                "\nVergi ve Bonuslar ile birlikte maaş : " + ( salary + raiseSalary(hireYear) - bonus(workHours) - tax(salary) ) +
                "\nToplam Maaş : " + ( salary + raiseSalary(hireYear) + bonus(workHours)  - tax(salary));
    }
}