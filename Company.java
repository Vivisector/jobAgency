package ru.geekbrains.lesson7.observer;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

/**
 * Компания
 */
public class Company {

    private Random random;
    private String nameCompany;
    private List<JobVacancy> jobVacancies;
    private double maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.jobVacancies = new ArrayList<>();
        this.jobAgency = jobAgency;
        this.maxSalary = maxSalary;
        random = new Random();
    }

    // public void needEmployee(){
    //     double salary = random.nextDouble(3000, maxSalary);
    //     jobAgency.sendOffer(nameCompany, salary);
    // }

    public void addJobVacancy(PositionType positionType) {
        double salary = random.nextDouble(3000, maxSalary);
        JobVacancy jobVacancy = new JobVacancy(this, positionType, salary);
        jobVacancies.add(jobVacancy);
        jobAgency.sendJobVacancy(jobVacancy);
    }

}
