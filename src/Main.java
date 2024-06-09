//Создать справочник сотрудников
//        Необходимо:
//        Создать класс справочник сотрудников, который содержит внутри
//        коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавления нового сотрудника в справочник



public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();
        directory.addEmployee(1, 123456, "Masha", 3);
        directory.addEmployee(2, 423456, "Sveta", 1);
        directory.addEmployee(3, 145456, "Petr", 10);
        directory.addEmployee(4, 127456, "Ivan", 2);
        directory.addEmployee(5, 123456, "Alex", 2);

        System.out.println(directory.searchExperience(2));
        System.out.println(directory.searchPhoneByName("Masha"));
        System.out.println(directory.searchEmployeeByPersonnelNumber(3));

    }
}