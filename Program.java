package ru.geekbrains.lesson7.observer;

public class Program {

    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master ivanov = new Master("Ivanov");
        Master petrov = new Master("Petrov");
        Student sidorov = new Student("Sidorov");
        ExperiencedMaster kuznetsov = new ExperiencedMaster("Kuznetsov");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(kuznetsov);

        for(int i = 0; i < 10; i++){
            geekBrains.addJobVacancy(PositionType.DEVELOPER);
            google.addJobVacancy(PositionType.DESIGNER);
            yandex.addJobVacancy(PositionType.MANAGER);
        }

    }

}
