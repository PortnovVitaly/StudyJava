package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true)
        {
            System.out.print("Введите число от 0 до 10000: ");

            Scanner in = new Scanner(System.in);

            if (in.hasNextInt())
            {
                int decNum = in.nextInt();

                if (decNum <= 10000 && decNum >= 0)
                {
                    System.out.println("Число " + decNum + " в шестнадцатиричной системе счисления: "
                            + Integer.toHexString(decNum));

                    System.out.println("Число " + decNum + " в двоичной системе счисления: "
                            + Integer.toBinaryString(decNum));

                    while (true)
                    {
                        System.out.print("Введите число в двоичной системе счисления: ");

                        in = new Scanner(System.in);
                        String biNum = in.nextLine();

                        try
                        {
                            decNum = Integer.parseInt(biNum, 2);
                        }
                        catch (NumberFormatException e)
                        {
                            System.out.println("Неверно введено число или" +
                                    " введено слишком большое число. Попробуйте ещё раз!");
                            continue;
                        }

                        System.out.println("Число " + biNum + " в десятичной системе счисления: "
                                + decNum);
                        break;
                    }

                    System.out.print("Для выхода из программы нажмите \"Q\"," +
                            " для повторного ввода чисел нажмите Enter ");
                    String choice = in.nextLine();
                    if (choice.equalsIgnoreCase("Q"))
                        return;
                }
                else
                    {
                        System.out.println("Число должно быть в пределах от 0 до 10000!");
                        continue;
                    }
            }
            else
                {
                    System.out.println("Неверно введено число. Попробуйте ещё раз!");
                    continue;
                }
        }
    }
}
