public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name,double salary,int workHours,int hireYear) {
    this.name = name;
    this.salary = salary;
    this.workHours = workHours;
    this.hireYear = hireYear;
    }


    public double tax(){
        if (this.salary < 1000) return 0;
        else return this.salary * 0.03;
    }

    public int bonus(){
        if (this.workHours > 40)
            return (this.workHours - 40) * 30;
        else
            return 0;

    }

    public double RaiseSalary(){
        int yearsWorked = 2021 - this.hireYear;
        if (yearsWorked < 10) return this.salary * 0.05;
        else if (yearsWorked < 20) return this.salary * 0.10;
        else return this.salary * 0.15;

    }


    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = RaiseSalary();
        double salaryAfterTaxBonus = salary - tax + bonus;
        double totalSalary = salary + raise;

        return "Adı : " + this.name + "\n"
                + "Maaşı : " + this.salary + "\n"
                + "Çalışma Saati : " + this.workHours + "\n"
                + "Başlangıç Yılı : " + this.hireYear + "\n"
                + "Vergi : " + tax + "\n"
                + "Bonus : " + bonus + "\n"
                + "Maaş Artışı : " + raise + "\n"
                + "Vergi ve Bonuslar ile birlikte maaş : " + salaryAfterTaxBonus + "\n"
                + "Toplam Maaş : " + totalSalary;
    }

}


