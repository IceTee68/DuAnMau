/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DTO.PhieuThuePhong;
import com.toedter.calendar.JDateChooser;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Trung Thanh
 */
public class BLL_PhieuThuePhong {
//    public static ArrayList<PhieuThuePhong> select()
//    {
//        ResultSet rs = DAL.PhieuThuePhongDAO.
//        return 
//    }
    public static String MaPhong = "";
    
    public static String findMaPhongbyTenPhong(JLabel tenPhong)
    {
        String maPhong = "";
        ResultSet rs = DAL.DAL_Phong.findMaPhongBySoPhong(tenPhong.getText());
        try {
            if(rs.next())
            {
                maPhong = rs.getString("MaPhong");    
                MaPhong = maPhong;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_PhieuThuePhong.class.getName()).log(Level.SEVERE, null, ex);
        }
//        DAL.PhieuThuePhongDAO.SelectByMaPhong(maPhong);
        return maPhong;
    }
    
    public static String findTrangThaiPhongByMaPhong()
    {
//        String maPhong = findMaPhongbyTenPhong(tenPhong);
        ResultSet rs = DAL.DAL_Phong.findTrangThaiPhongByMaPhong(MaPhong);
        try {
            if(rs.next())
            {
                String maTrangThaiPhong = rs.getString("MaTrangThaiPhong");
                return maTrangThaiPhong;
            }
        } catch (Exception e) {
            System.out.println("false2");
        }
        return "";
    }
    
    public static int getCount()
    {
        ResultSet rs = DAL.PhieuThuePhongDAO.getCount();
        try {
            if(rs.next())
            {
                 return rs.getInt("count");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BLL_PhieuThuePhong.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public static void select(JLabel lblSetSoPhong, JLabel lblSetMaHoaDon, JLabel lblSetTrangThai, JLabel lblSetNhanVien, JLabel lblSetNgayTao, 
                                JDateChooser dateNgayDen, JLabel lblGioPhutDen, JDateChooser dateNgayDi, JLabel lblGioPhutDi, 
                                JTextField txtCCCD, JTextField txtTenKhach, JTextField txtSoLuong, JTextField txtGhiChu)
    {
        String maTrangThaiPhong = findTrangThaiPhongByMaPhong();
        if(maTrangThaiPhong.equals("COKHACH"))
        {
            ResultSet rs = DAL.PhieuThuePhongDAO.SelectByMaPhongV2(MaPhong);
            try {
                if(rs.next())
                {
                    lblSetSoPhong.setText(rs.getString("TenPhong") +" - "+ rs.getString("TenLoaiPhong"));
                    lblSetMaHoaDon.setText(rs.getString("MaPhieuThue"));
                    lblSetTrangThai.setText(rs.getString("TenTrangThaiPhong"));
                    lblSetNhanVien.setText("Hellu");
                }
            } catch (SQLException ex) {
                System.out.println("false3");
            }
        }
    }

}
