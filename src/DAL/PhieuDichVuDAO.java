/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.PhieuDichVu;
import helper.ChuyenDoi;
import java.sql.*;
import java.util.Date;
/**
 *
 * @author Trung Thanh
 */
public class PhieuDichVuDAO {
    public static ResultSet SelectAll()
    {
        String sql = "select * from PhieuDichVu";
        return helper.sqlHelper.executeQuery(sql);
    }
    
    public static ResultSet SelectByMaPhieuDichVu(String maPhieuDichVu)
    {
        String sql = "select * from PhieuDichVu where MaPhieuDichVu = ?";
        return helper.sqlHelper.executeQuery(sql, maPhieuDichVu);
    }
    
    public static ResultSet SelectByNgayTao(Date ngayTao01, Date ngayTao02)
    {
        String sql = "set dateformat dmy select * from PhieuDichVu where NgayTao between ? and ?";
        return helper.sqlHelper.executeQuery(sql, ChuyenDoi.LayNgayString(ngayTao01), ChuyenDoi.LayNgayString(ngayTao02));
    }
    
       public static ResultSet SelectByTrangThaiThanhToan(int trangThaiThanhToan)
   {
       String sql = "select * from PhieuDichVu where TrangThaiThanhToan = ?";
       return helper.sqlHelper.executeQuery(sql, trangThaiThanhToan);
   }
    
    public static void Add(PhieuDichVu phieuDichVu)
    {
        String sql = "set dateformat dmy INSERT INTO PhieuDichVu (MaPhieuDichVu, MaPhong, TrangThaiThanhToan) VALUES (?,?,0)";
        helper.sqlHelper.executeUpdate(sql, phieuDichVu.getMaPhieuDichVu(), phieuDichVu.getMaPhong());
    }
    
    public static void Update(PhieuDichVu phieuDichVu)
    {
        String sql = "UPDATE PhieuDichVu SET MaPhong = ?, TrangThaiThanhToan =? WHERE MaPhieuDichVu = ?";
        helper.sqlHelper.executeUpdate(sql, phieuDichVu.getMaPhong(), phieuDichVu.getTrangThaiThanhToan(), phieuDichVu.getMaPhieuDichVu());
    }
    
    public static void Delete(String maPhieuDichVu)
    {
        String sql = "delete from PhieuDichVu where MaPhieuDichVu = ?";
        helper.sqlHelper.executeUpdate(sql, maPhieuDichVu);
    }
}
