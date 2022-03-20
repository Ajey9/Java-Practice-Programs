package Java_programs;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Month_of_Calendar {
    public static void main(String[] args) {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        LocalDate localDate = LocalDate.now();

        int month = localDate.getMonthValue();
        int today = localDate.getDayOfMonth();

        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        int value = dayOfWeek.getValue();

        System.out.print(LocalDate.of(1995,9,9));

    }
    }

