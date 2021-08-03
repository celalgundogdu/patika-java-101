package classes.homework;

import java.time.LocalDate;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double calculateTax(){
        if (this.salary <= 1000) {
            return 0;
        }
        return this.salary * 0.03;
    }

    double calculateBonus(){
        if (workHours > 40){
            return (workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary(){
        int year =  LocalDate.now().getYear();
        double raise = 0;
        if (year - hireYear >= 20) {
            raise = this.salary * 0.15;
        } else if (year - hireYear >= 10){
            raise = this.salary * 0.1;
        } else {
            raise = this.salary * 0.05;
        }
        return raise;
    }

    @Override
    public String toString() {
        return  String.format(
                    "Adı : %s\n" +
                    "Maas : %.2f\n" +
                    "Calisma Saati : %d\n" +
                    "Baslangic Yili : %d\n" +
                    "Vergi : %.2f\n" +
                    "Bonus : %.2f\n" +
                    "Maas Artisi : %.2f\n" +
                    "Vergi ve Bonus ile Maas : %.2f\n" +
                    "Toplam Maas : %.2f\n",
                    this.name, this.salary, this.workHours, this.hireYear, this.calculateTax(), this.calculateBonus(),
                    this.raiseSalary(), this.salary + this.calculateTax() + this.calculateBonus(), this.salary + this.raiseSalary()
                );
    }

}
