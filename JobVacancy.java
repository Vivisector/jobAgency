package ru.geekbrains.lesson7.observer;

public class JobVacancy {
  
    private Company company;
private PositionType positionType;
private double salary;

public JobVacancy(Company company, PositionType positionType, double salary) {
    this.company = company;
    this.positionType = positionType;
    this.salary = salary;
}

public Company getCompany() {
    return company;
}

public void setCompany(Company company) {
    this.company = company;
}

public PositionType getPositionType() {
    return positionType;
}

public void setPositionType(PositionType positionType) {
    this.positionType = positionType;
}

public double getSalary() {
    return salary;
}

public void setSalary(double salary) {
    this.salary = salary;
}
}

enum PositionType {
DEVELOPER, DESIGNER, MANAGER
}
