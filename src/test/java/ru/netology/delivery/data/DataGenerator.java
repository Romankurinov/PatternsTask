package ru.netology.delivery.data;

import com.github.javafaker.Faker;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {

    public static @NotNull
    Info generateUser() {
        String city = generateCity();
        String name = generateName();
        String phone = generatePhone();
        Info user = new Info(city, name, phone);
        return user;
    }

    public static String generateDate(int changeDay) {
        String date =  LocalDate.now().plusDays(changeDay).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        return date;
    }

    public static String generateCity() {
        Faker faker = new Faker(new Locale("ru"));
        String city = faker.address().city();
        return city;
    }

    public static String generateName() {
        Faker faker = new Faker(new Locale("ru"));
        String name = faker.name().lastName() + " " + faker.name().firstName();
        return name;
    }

    public static String generatePhone() {
        Faker faker = new Faker(new Locale("ru"));
        String phone = faker.phoneNumber().phoneNumber();
        return  phone;
    }
}
