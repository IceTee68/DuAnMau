/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Trung Thanh
 */
public class TaoChuoiMa {
    public static String TaoChuoiMa(String haiKyTuDau, int soLuong)
    {
        String soLuongString = soLuong+"";
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        if(soLuong > 0 && soLuong < 10)
        {
            soLuongString  = "0" + soLuong;
        }
        return haiKyTuDau.toUpperCase() + sdf.format(date) + soLuongString;
    }
}
