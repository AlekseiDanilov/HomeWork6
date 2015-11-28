package com.epam.javauniversity.hw6;

import java.util.Date;

public enum Month {

    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

    public int getNumberDay() {
        switch (this) {
            case JANUARY: {
                return 31;
            }
            case FEBRUARY: {
                Date currentDate = new Date();
                if (currentDate.getYear() % 400 == 0 ||
                        (currentDate.getYear() % 4 == 0 && currentDate.getYear() % 100 != 0)) {
                    return 29;
                }
                return  28;
            }
            case MARCH: {
                return 31;
            }
            case APRIL: {
                return 30;
            }
            case MAY: {
                return 31;
            }
            case JUNE: {
                return 30;
            }
            case JULY: {
                return 31;
            }
            case AUGUST: {
                return 31;
            }
            case SEPTEMBER: {
                return 30;
            }
            case OCTOBER: {
                return 31;
            }
            case NOVEMBER: {
                return 30;
            }
            case DECEMBER: {
                return  31;
            }
        }
        return 0;
    }

    public Month getNextMonth() {
        Month[] months = Month.values();
        if (this.ordinal() == months.length - 1) {
            return months[0];
        }
        return months[this.ordinal() + 1];
    }
}
