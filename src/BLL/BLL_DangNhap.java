/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.NhanVienDAO;
import DTO.NhanVien;
import HELPER.Auth;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Trung Thanh
 */
public class BLL_DangNhap {
    
    static boolean validate(String maNhanVien, String matKhau)
    {
        if(maNhanVien.isEmpty() || matKhau.isEmpty())
        {
            return false;
        }
        return true;
    }
    
    public static boolean findPasswordByUsername(JTextField jmaNhanVien, JPasswordField jmatKhau)
    {
        String maNhanVien = jmaNhanVien.getText().toUpperCase();
        String matKhau = jmatKhau.getText();
        String maNhanVienSQL = "";
        String matKhauSQL = "";
        if(!validate(maNhanVien, matKhau)) return false;
        ResultSet rs = NhanVienDAO.SelectByMaNhanVien(maNhanVien);
        try {
            if(rs.next())
            {
               maNhanVienSQL = rs.getString("MaNhanVien");
               matKhauSQL = rs.getString("MatKhau");
               if(maNhanVien.equals(maNhanVienSQL) && matKhau.equals(matKhauSQL))
               {
                    NhanVien nhanVien = new NhanVien(rs.getString("MaNhanVien"), rs.getString("TenNhanVien"), rs.getString("MaChucVu"));
                    Auth.user = nhanVien;
                    return true;
               }
            }
        } catch (SQLException ex) {
        }
        return false;
    }
    
    static JFrame jfrm = null;
    public static void hideJFrmLogin()
    {
        jfrm.dispose();
    }
    
    public static void getJFrmLogin(JFrame jfrm)
    {
        BLL_DangNhap.jfrm = jfrm;
    }
}
