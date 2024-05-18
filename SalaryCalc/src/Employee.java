public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int year;
    double tax;
    int extraMoney;
    double raise;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.year = 2021;
        this.tax = 0;
        this.extraMoney = 0;
        this.raise = 0;
    }

    double tax(){
        if(this.salary > 1000){
            tax = (this.salary * 0.03);
        }
        return tax;
    }

    double bonus(){
        if(this.workHours > 40){
            extraMoney = (this.workHours - 40) * 30;
        }
        return extraMoney;
    }

    double raiseSalary(){

        if(this.year - this.hireYear < 10){
            raise = (this.salary * 0.05);
        } else if (this.year - this.hireYear > 9 && this.year - this.hireYear < 20) {
            raise = (this.salary * 0.1);
        } else if (this.year - this.hireYear > 19) {
            raise = (this.salary * 0.15);
        }
        return raise;
    }

    @Override
    public String toString(){
        System.out.println("Name: " + this.name + "\n"
        + "Salary: " + this.salary + "\n"
        + "Work hours: " + this.workHours + "\n"
        + "Entry year: " + this.hireYear + "\n"
        + "Tax: " + tax() + "\n"
        + "Bonus: " + bonus() + "\n"
        + "Salary raise: " + raiseSalary() + "\n"
        + "Salary with taxes and bonuses: " + (this.salary + (extraMoney - tax)) + "\n"
        + "New salary: " + (this.salary + (extraMoney - tax) + raise));
        return null;
    }


}
