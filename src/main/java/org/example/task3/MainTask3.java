package org.example.task3;

import java.util.Scanner;

/**
 * Программа запрашивает на вход строку и проверяет через сервис NumberService является ли она автомобильным номером.
 * gosNumber номер в формате A123TT18 если пользователь введет маленькие буквы, спец символы или пробелы между буквами и
 * цифрами, программа уберет данные спец символы.
 * так же программа, выдаёт, какому региону принадлежит номер.
 * Программа работает до тех пор пока пользователь не введет "exit"
 */
public class MainTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gosNumber;
        NumberService nService = new NumberService();
        while (true) {
            gosNumber = scanner.nextLine().toUpperCase().replaceAll("\\W", "").trim();
            System.out.println(gosNumber);
            System.out.println(nService.validate(gosNumber));
            System.out.println(nService.region(gosNumber));
            if (gosNumber.equals("EXIT")) {
                break;
            }
        }
    }
}
