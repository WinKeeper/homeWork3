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
        do {
            quessTheNumber();
            repeatGame();
        } while (repeatGame == 1);
    }

    private static void quessTheNumber() {
        System.out.println("Угадайте число от 0 до 9");
        System.out.println("Введите число ");
        do {
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

    public static int repeatGame() {
        do {
            System.out.println("Повторить игру ещё раз?");
            System.out.println("1. Мне повезёт!");
            System.out.println("2. Не, не, не...");
            repeatGame = sc.nextInt();
        } while (repeatGame < 1 || repeatGame > 2);

        switch (repeatGame) {
            case 1:
                System.out.println("Поехали!");
                break;
            case 2:
                System.out.println("Ну как хочешь.");
                break;
        }
        return repeatGame;
    }
}

//for pulls and
