package com.github.tel_ran_de.task_2110.task1;

public class Employee {
    String name;
    String surname;
    protected String taxRate;
    protected String socialRate;
    protected double salary;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public double CalculateTax(double salary, String taxRate, String socialRate) {
        int tR = Integer.parseInt(taxRate.split("%")[0]);
        int sR = Integer.parseInt(socialRate.split("%")[0]);
        return (salary * tR / 100) + (salary * sR / 100);
    }
}

class ResidentEmployee extends Employee {
    private String taxRate = "15%";
    private String socialRate = "10%";

    public ResidentEmployee(String name, String surname) {
        super(name, surname);
    }

    public String getTaxRate() {
        return taxRate;
    }

    public String getSocialRate() {
        return socialRate;
    }

    @Override
    public String toString() {
        return "ResidentEmployee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", taxRate='" + getTaxRate() + '\'' +
                ", socialRate='" + getSocialRate() + '\'' +
                '}';
    }
}

class NoResidentEmployee extends Employee {
    private static String taxRate = "20%";
    private static String socialRate = "3%";

    public NoResidentEmployee(String name, String surname) {
        super(name, surname);
    }

    public static String getTaxRate() {
        return taxRate;
    }

    public static String getSocialRate() {
        return socialRate;
    }

    @Override
    public String toString() {
        return "NoResidentEmployee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", taxRate='" + getTaxRate() + '\'' +
                ", socialRate='" + getSocialRate() + '\'' +
                '}';
    }
}

class Contractor extends Employee {
    private static String taxRate = "0%";
    private static String socialRate = "0%";

    public Contractor(String name, String surname) {
        super(name, surname);
    }

    public static String getTaxRate() {
        return taxRate;
    }

    public static String getSocialRate() {
        return socialRate;
    }

    public void getTaxInfo() {
        System.out.println("Налоги оплачиваются сотрудником");
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ResidentEmployee resAIvanov = new ResidentEmployee("Aleksandr", "Ivanov");
        double taxesIvanov = resAIvanov.CalculateTax(1000, resAIvanov.getTaxRate(), resAIvanov.getSocialRate());
        System.out.println(resAIvanov);
        System.out.println("Сумма налогов: " + taxesIvanov);

        NoResidentEmployee noResIVassiljev = new NoResidentEmployee("Igor", "Vassiljev");
        double taxesVassiljev = noResIVassiljev.CalculateTax(1000, noResIVassiljev.getTaxRate(), noResIVassiljev.getSocialRate());
        System.out.println(noResIVassiljev);
        Contractor conMSidorov = new Contractor("Mihhail", "Sidorov");
        double taxesSidorov = conMSidorov.CalculateTax(1000, conMSidorov.getTaxRate(), conMSidorov.getSocialRate());
        System.out.println(conMSidorov);
        System.out.println("Сумма налогов: " + taxesSidorov);

        ResidentEmployee resII = new ResidentEmployee("Igor", "Virr");
        double taxesVirr = resII.CalculateTax(5000, resII.getTaxRate(), resII.getSocialRate());
        System.out.println(conMSidorov);
        System.out.println("Сумма налогов: " + taxesVirr);

        Employee[] employees = { resAIvanov, noResIVassiljev, conMSidorov, resII};
        //Employee[] employees = {(Employee) resAIvanov, (Employee) noResIVassiljev, (Employee) conMSidorov, (Employee)  resII};
        //Employee[] employees = {new ResidentEmployee("Vladimir", "Solnyshko"), new Contractor("Ilja", "Muromets")};
        for (Employee employee : employees) {
            System.out.println(employee.name);

            if(employee instanceof Contractor) {
                Contractor contractor = (Contractor) employee;
                contractor.getTaxInfo();
            }
        };
    }
}