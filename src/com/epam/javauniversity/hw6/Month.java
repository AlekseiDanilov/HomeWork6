package com.epam.javauniversity.hw6;

import java.util.Date;

public enum Month {

    JANUARY(31),    FEBRUARY(28),
    MARCH(31),      APRIL(30),
    MAY(31),        JUNE(30),
    JULY(31),       AUGUST(31),
    SEPTEMBER(30),  OCTOBER(31),
    NOVEMBER(30),   DECEMBER(31);

    private final int numberDay;

    Month(int numberDay) {
        this.numberDay = numberDay;
    }

    public int getNumberDay() {
        Date currentDate = new Date();
        if (this == FEBRUARY && checkCurrentYearBissextile(currentDate)) {
            return 29;
        }
        return numberDay;
    }

    public Month getNextMonth() {
        Month[] months = Month.values();
        if (this.ordinal() == months.length - 1) {
            return months[0];
        }
        return months[this.ordinal() + 1];
    }

    public static boolean checkCurrentYearBissextile(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("date is null");
        }
        return date.getYear() % 400 == 0 || (date.getYear() % 4 == 0 && date.getYear() % 100 != 0);
    }
}
