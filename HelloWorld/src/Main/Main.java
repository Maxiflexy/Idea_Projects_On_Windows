package Main;

public class Main {
    public static void main(String[] args) {
        var employee=new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage=employee.calculateWage(10);
        System.out.println(wage);
    }
}



// We will perform encapsulation on the code below
//        int baseSalary = 50_000;
//        int extraHours = 10;
//        int hourlyRate = 20;
//
//        int wage = calculateWage(baseSalary,extraHours,hourlyRate);
//        System.out.println(wage);
//    }
///    public static int calculateWage(int baseSalary,int extraHours,int hourlyRate){
//        int wage;
//        wage = baseSalary + (extraHours*hourlyRate);
//        return wage;
//    }
