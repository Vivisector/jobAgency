package ru.geekbrains.lesson7.observer;

public class Master implements Observer {

    private String name;
    private double salary;

    public Master(String name) {
        this.name = name;
        salary = 80000;
    }

    @Override
    
        public void receiveJobVacancy(JobVacancy jobVacancy) {
        if (jobVacancy.getSalary() > salary){
            System.out.printf("Специалист %s >>> Мне нужна эта работа! [%s - %.0f]\n",
            name, jobVacancy.getPositionType(), jobVacancy.getSalary());
            this.salary = jobVacancy.getSalary();
        }
        else{
            System.out.printf("Специалист %s >>> Я найду работу получше! [%s - %.0f]\n",
            name, jobVacancy.getPositionType(), jobVacancy.getSalary());
        }
    }
}
