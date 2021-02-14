package br.com.nextevolution.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.util.Objects.isNull;

public class DateUtils {

    public static LocalDateTime convertoToLocalDateTime(String date) {
        if (isNull(date))
            return null;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(date, dateTimeFormatter);
        return parse;
    }
}
