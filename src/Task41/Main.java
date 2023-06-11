package Task41;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество секунд: ");
        long seconds = input.nextLong();
        System.out.println(convertSeconds(seconds));
    }

    public static String convertSeconds(long seconds) {
        int years = (int) (seconds / 31536000);
        int months = (int) ((seconds % 31536000) / 2592000);
        int weeks = (int) (((seconds % 31536000) % 2592000) / 604800);
        int days = (int) ((((seconds % 31536000) % 2592000) % 604800) / 86400);
        int hours = (int) (((((seconds % 31536000) % 2592000) % 604800) % 86400) / 3600);
        int minutes = (int) ((((((seconds % 31536000) % 2592000) % 604800) % 86400) % 3600) / 60);
        int sec = (int) (((((((seconds % 31536000) % 2592000) % 604800) % 86400) % 3600) % 60));

        String time = "";

        if (years > 0) {
            time += years + " " + formatTime(years, "год", "года", "лет") + ", ";
        }

        if (months > 0) {
            time += months + " " + formatTime(months, "месяц", "месяца", "месяцев") + ", ";
        }

        if (weeks > 0) {
            time += weeks + " " + formatTime(weeks, "неделя", "недели", "недель") + ", ";
        }

        if (days > 0) {
            time += days + " " + formatTime(days, "день", "дня", "дней") + ", ";
        }

        if (hours > 0) {
            time += hours + " " + formatTime(hours, "час", "часа", "часов") + ", ";
        }

        if (minutes > 0) {
            time += minutes + " " + formatTime(minutes, "минута", "минуты", "минут") + " ";
        }

        if (sec > 0) {
            time += "и " + sec + " " + formatTime(sec, "секунда", "секунды", "секунд");
        }

        return time;
    }

    public static String formatTime(int num, String form1, String form2, String form3) {
        if (num == 1) {
            return form1;
        } else if (num >= 2 && num <= 4) {
            return form2;
        } else {
            return form3;
        }
    }
}
