package ru.geekbrains.lesson7.observer;

public class Student implements Observer {

    private String name;
    private double salary;

    public Student(String name) {
        this.name = name;
        salary = 5000;
    }

    @Override
    public void receiveJobVacancy(JobVacancy jobVacancy) {
    
        if (jobVacancy.getSalary() > salary){
            System.out.printf("Студент %s >>> Мне нужна эта работа! [%s - %.0f]\n",
                    name, jobVacancy.getPositionType(), jobVacancy.getSalary());
            this.salary = jobVacancy.getSalary();
        }
        else{
            System.out.printf("Студент %s >>> Я найду работу получше! [%s - %.0f]\n",
                    name, jobVacancy.getPositionType(), jobVacancy.getSalary());
        }
    }
}
