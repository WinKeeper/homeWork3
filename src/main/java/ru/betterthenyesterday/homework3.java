package ru.betterthenyesterday;

import java.util.Random;
import java.util.Scanner;

public class homework3 {

    static Scanner sc = new Scanner(System.in);               //Создание класса - сканер
    static Random randomNumb = new Random();                  //Создание случайного числа от 0 до 9 включительно
    static int x = randomNumb.nextInt(10);
    static int tryGuess = 3;
    static int userNumber;
    static int repeatGame;
    static int push123123123;

    public static void main(String[] args) {
        quessTheNumber();
        sufferAgainPlz();
    }

    private static void quessTheNumber() {
        System.out.println("Угадайте число от 0 до 9");
        do {
            System.out.println("Введите число ");
            userNumber = sc.nextInt();
            if (x == userNumber) {
                System.out.println("Вы угадали число!");
                return;
            } else if (userNumber < x) {
                System.out.println("Загаданное число больше!");
            } else {
                System.out.println("Загаданное число меньше!");
            }
            tryGuess--;
            System.out.println("Осталось попыток - " + tryGuess);
        } while (tryGuess > 0);
    }

    public static void sufferAgainPlz() {
        do {
            System.out.println("Повторить игру ещё раз?");
            System.out.println("1. Мне повезёт!");
            System.out.println("2. Не, не, не...");
            repeatGame = sc.nextInt();
        } while (repeatGame < 1 || repeatGame > 2);

        switch (repeatGame) {
            case 1:
                System.out.println("321");
                break;
            case 2:
                System.out.println("123");
                break;
        }
    }
}

//for pulls and
