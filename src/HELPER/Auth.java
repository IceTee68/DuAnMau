/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HELPER;

import DTO.NhanVien;

/**
 *
 * @author Trung Thanh
 */
public class Auth {
    public static NhanVien user = null;
    
    public static void clear()
    {
        Auth.user = null;
    }
    
    public static boolean login()
    {
        return Auth.user != null;
    }
    
    public static String getMaChucVu()
    {
        if(Auth.login())
        {
            return user.getMaChucVu();
        }
        return null;
    }
}
