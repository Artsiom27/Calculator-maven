package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean e = false;



    try {

        do {

            Scanner in = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int num1 = in.nextInt();

            System.out.print("Введите второе число: ");
            int num2 = in.nextInt();

            Scanner in2 = new Scanner(System.in);
            System.out.print("Выберите операцию(+,-,/,*): ");
            String num3 = in2.nextLine();
            switch (num3) {
                case "+":
                    System.out.println("Результат: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Результат: " + (num1 + num2));
                    break;
                case "*":
                    System.out.println("Результат: " + (num1 * num2));
                    break;
                case "/":
                    System.out.println("Результат: " + (num1 / num2));
                    break;
                default:
                    System.out.println("Неверная операция");
            }
            Scanner in0 = new Scanner(System.in);
            System.out.print("Желаете еще посчитать(да или нет): ");
            String c = in0.nextLine();
            e = c.equals("нет");
        }

        while (false);
        System.out.println("Ну и УХОДИ");

    } catch (InputMismatchException| ArithmeticException ex) {
        System.out.println("Ошибка ввода");// либо только InputMismatchException и "Вы ввели строку"
    }
               // catch (ArithmeticException ex) {
                 //   System.out.println("Деление на ноль запрещено");
              //  }
        }
    }





