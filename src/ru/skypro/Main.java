package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //Задание1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        //Задание2
        String forTheReport = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные сотрудника для заполнения отчета - " + forTheReport);
        //Задание3
        String forAdmin = fullName.replace(' ', ';');
        System.out.println("Данные для административного отдела: " + forAdmin);
        //Задание4
        String fullName2 = "Иванов Семён Семёнович";
        if (fullName2.contains("ё")) {
            String withoutE = fullName2.replace('ё', 'е');
            System.out.println("Данные сотрудника: " + withoutE);
        }
    }
}

