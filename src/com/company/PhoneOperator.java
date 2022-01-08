package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class PhoneOperator {
    public static void main(String[] args) {
        PhoneOperator phone = new PhoneOperator();
        File file = new File("src/com.company/phoneBook.txt");

    }
    List bookList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void addSubscriber() {
        System.out.println("Пожалуйста, введите имя: ");
        String name = sc.nextLine();
        System.out.println("Пожалуйста, введите фамилию: ");
        String surname = sc.nextLine();
        System.out.println("Пожалуйста, введите прозвище: ");
        String nickname = sc.nextLine();
        System.out.println("Пожалуйста, введите номер телефона: ");
        String numberPhone = sc.nextLine();
        System.out.println("Пожалуйста, введите электронный адрес: ");
        String email = sc.nextLine();
        System.out.println("Пожалуйста, введите дату рождения: ");
        String dateBirth = sc.nextLine();
        Subscriber subscriber = new Subscriber(name,surname,nickname,numberPhone,email,dateBirth);
        bookList.add(subscriber);
        System.out.println(subscriber.showSubscriber());
        System.out.println("Абонент успешно добавлен!!!");
    }

}

class Subscriber {
    String name;
    String surname;
    String nickname;
    String numberPhone;
    String email;
    String dateBirth;

    public Subscriber(String name, String surname, String nickname, String numberPhone,
                      String email, String dateBirth) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.numberPhone = numberPhone;
        this.email = email;
        this.dateBirth = dateBirth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public String showSubscriber(){
        return "Name: "+name+", Surname: "+surname+", Nickname: "+nickname+
                ", Number phone: "+numberPhone+", E-mail: "+email+", Date birth"+dateBirth;
    }
}