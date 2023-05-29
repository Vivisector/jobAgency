package ru.geekbrains.lesson7.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Агенство по поиску сотрудников
 */
public class JobAgency implements Publisher {

    private List<Observer> observers = new ArrayList<>();

@Override
public void registerObserver(Observer observer) {
    observers.add(observer);
}

@Override
public void removeObserver(Observer observer) {
    observers.remove(observer);
}

// @Override
// public void sendOffer(String nameCompany, double salary) {
//     for (Observer observer : observers){
//         observer.receiveJobVacancy(JobVacancy jobVacancy);
//     }
// }

@Override
public void sendJobVacancy(JobVacancy jobVacancy) {
    for (Observer observer : observers){
        if (observer instanceof Student && jobVacancy.getSalary() > 10000) {
            observer.receiveJobVacancy(jobVacancy);
        }
        else if (observer instanceof Master && jobVacancy.getSalary() > 50000) {
            observer.receiveJobVacancy(jobVacancy);
        }
    }
}
}







