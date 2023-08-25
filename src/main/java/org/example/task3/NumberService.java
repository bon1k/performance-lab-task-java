package org.example.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * сервис проверки гос номера
 *
 * @return true если гос номер соответствует формату A123AA12 || A123AA123, а так же введены только валидные символы.
 */
public class NumberService {

    public String validate(String s) {
        //паттерн является ли строка s гос номером
        Pattern pattern = Pattern.compile("^([ABEKMHOPCTYX]\\d{3}(?<!000)[ABEKMHOPCTYX]{2}\\d{2,3})?$");
        Matcher matcher = pattern.matcher(s);
        // валидация является ли первая буква номера допустимой для ввода
        Pattern patternFirstChar = Pattern.compile("^[ABEKMHOPCTYX]");
        Matcher matcherFirstChar = patternFirstChar.matcher(s.substring(0, 1));
        if (!matcherFirstChar.matches()) {
            System.out.println("недопустимое значение первой буквы номера, вы ввели " + s.charAt(0));
        }
        return (matcher.matches()) ? "Номер прошел проверку!" : "Это не похоже на автомобильный номер";
    }

    //метод проверки и выдачи региона
    public String region(String gosNum) {
        int numberRegion = 0;
        if (gosNum.length() == 8) {
            numberRegion = Integer.parseInt(gosNum.substring(6, 8));
        }
        if (gosNum.length() == 9) {
            numberRegion = Integer.parseInt(gosNum.substring(6, 9));
        }
        if (gosNum.length() != 8 || gosNum.length() != 9) {
            return "Регион не распознан, проверьте корректность номера";
        }

        switch (numberRegion) {
            case 18:
            case 118:
                return "Удмуртия";
            case 16:
                return "Татарстан";
        }
        return "Регион не опознан";
    }

}
