package odev.employee;

import java.util.InputMismatchException;

public class Employee {

    //Fields
    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    //Constructor
    public Employee(String name, double salary, double workHours, int hireYear) {
        setName(name);
        setSalary(salary);
        setWorkHours(workHours);
        setHireYear(hireYear);
    }

    //Setter for 'name'.
    //Accepts only alphabets and spaces, not allowing spaces at the beginning and the end of the string.
    public void setName(String name) {
        if ( name.isEmpty() || !name.matches("[a-zA-Z]++(?: ++[a-zA-Z]++)*+")){
            throw new InputMismatchException("Invalid name: " + name);
        }
        this.name = name;
    }

    //Setter for 'salary'. Accepts only positive number
    public void setSalary(double salary) {
        if(salary <= 0){
            throw new InputMismatchException("Salary can not be zero or negative: " + salary);
        }
        this.salary = salary;
    }

    //Setter for 'workHours'. Accepts only zero or positive number
    public void setWorkHours(double workHours) {
        if (workHours < 0){
            throw new InputMismatchException("Work hours can not be negative: " + workHours);
        }
        this.workHours = workHours;
    }

    //Hire year can not be later than 2021 (current date), or before 1921 (100 working years).
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
     * 30TL bonus per hour over 40 working hours.
     * @param workHours
     * @return bonus amount
     */
    private double bonus(double workHours){
        if (workHours>40.0){
            return (workHours-40.0) * 30.0;
        } else {
            return 0.0;
        }
    }

    /**
     * Calculates raise in salary based on hire year.
     * 5% increase in salary if less than 10 years
     * 10% increase in salary if more than 9 and less than 20 years
     * 15% increase in salary if more than 19 years
     * @param hireYear
     * @return salary raise amount
     */
    private double raiseSalary(int hireYear){
        double raiseSalaryAmount;
        if ( (2021-hireYear) < 10 ) {
            raiseSalaryAmount = salary * 0.05;
        } else if ( (2021-hireYear) >= 10 && (2021-hireYear) < 20 ){
            raiseSalaryAmount = salary *  0.1;
        } else {
            raiseSalaryAmount = salary * 0.15;
        }
        return raiseSalaryAmount;
    }


    //Prints employee information
    @Override
    public String toString() {
        return  "Adı : " + name + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma Saati : " + workHours + "\n" +
                "Başlangıç Yılı : " + hireYear + "\n" +
                "Vergi : " + tax(salary) + "\n" +
                "Bonus : " + bonus(workHours) + "\n" +
                "Maaş Artışı : " + raiseSalary(hireYear) + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + ( salary + bonus(workHours) - tax(salary) ) + "\n" +
                "Toplam Maaş : " + ( salary + raiseSalary(hireYear) );
    }
}
