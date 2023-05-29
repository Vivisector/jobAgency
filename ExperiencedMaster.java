package ru.geekbrains.lesson7.observer;
// import ru.geekbrains.lesson7.observer.JobVacancy.VacancyType;

public class ExperiencedMaster implements Observer {
    

    private String name;
    private double salary;
    
    public ExperiencedMaster(String name) {
        this.name = name;
        salary = 120000;
    }
    
    @Override
    public void receiveJobVacancy(JobVacancy jobVacancy) {
        if (jobVacancy.getSalary() > salary){
            System.out.printf("Опытный специалист %s >>> Мне нужна эта работа! [%s - %f]\n",
            name, jobVacancy.getPositionType(), jobVacancy.getSalary());
            this.salary = jobVacancy.getSalary();
        }
        else{
            System.out.printf("Опытный специалист %s >>> Я найду работу получше! [%s - %f]\n",
            name, jobVacancy.getPositionType(), jobVacancy.getSalary());
                    
        }
    }
    }
