package ru.javawebinar.topjava.util;

import java.time.LocalTime;

public class TimeUtil {

    /**
     * Проверка того, если время находится в указанных промежутках включительно
     *
     * @param lt
     * @param startTime
     * @param endTime
     * @return boolean
     */
    public static boolean isBetween(LocalTime lt, LocalTime startTime, LocalTime endTime) {
        return lt.compareTo(startTime) >= 0 && lt.compareTo(endTime) <= 0;
    }
}
