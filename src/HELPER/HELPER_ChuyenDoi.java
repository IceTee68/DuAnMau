/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HELPER;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author CherryCe
 */
public class HELPER_ChuyenDoi {

    static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public static String getNgayString_1(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }
    
    public static String getNgayString_2(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(date);
    }

    public static Date getNgayDate_1(String ngay) {
        try {
            return dateFormat.parse(ngay);
        } catch (ParseException ex) {
            return null;
        }
    }

    public static Date getNgayDate_2(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static String getSoString(double so) {
        return NumberFormat.getNumberInstance().format(so);
    }

    public static int getSoInt(String so) {
        try {
            return NumberFormat.getNumberInstance().parse(so).intValue();
        } catch (ParseException ex) {
            return 0;
        }
    }

    public static double getSoDouble(String so) {
        try {
            return NumberFormat.getNumberInstance().parse(so).doubleValue();
        } catch (ParseException ex) {
            return 0;
        }
    }
}
