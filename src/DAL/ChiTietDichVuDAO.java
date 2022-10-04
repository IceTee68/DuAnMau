/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ChiTietDichVu;
import helper.ChuyenDoi;
import java.sql.*;
import java.util.Date;
/**
 *
 * @author Trung Thanh
 */
public class ChiTietDichVuDAO {
    
    public static ResultSet SelectAll(){
        String sql = "select * from ChiTietDichVu";
        return helper.sqlHelper.executeQuery(sql);
    }
    
    public static ResultSet SelectByMaPhieuDichVu(String MaPhieuDichVu){
        String sql = "select * from ChiTietDichVu WHERE MaPhieuDichVu = ?";
        return helper.sqlHelper.executeQuery(sql, MaPhieuDichVu);
    }
    
    public static void Add(ChiTietDichVu tDichVu)
    {
        String sql = "set dateformat dmy INSERT INTO ChiTietDichVu(MaChiTietDichVu, MaPhieuDichVu, MaSanPham, SoLuong, GiaTien, GhiChu, MaNhanVien) VALUES (?,?,?,?,?,?,?)";
        helper.sqlHelper.executeUpdate(sql, tDichVu.getMaChiTietDichVu(), tDichVu.getMaPhieuDichVu(), tDichVu.getMaSanPham(), tDichVu.getSoLuong(), tDichVu.getGiaTien(), 
                                            tDichVu.getGhiChu(), tDichVu.getMaNhanVien());
    }
    
    public static void Update(ChiTietDichVu tDichVu)
    {
        String sql = "UPDATE ChiTietDichVu SET MaPhieuDichVu =?, MaSanPham =?, SoLuong =?, GiaTien =?, GhiChu =? WHERE (MaChiTietDichVu = ?)";
        helper.sqlHelper.executeUpdate(sql, tDichVu.getMaPhieuDichVu(), tDichVu.getMaSanPham(), tDichVu.getSoLuong(), tDichVu.getGiaTien(), 
                                            tDichVu.getGhiChu(), tDichVu.getMaChiTietDichVu());
    }
    
    public static void Delete(String MaChiTietDichVu)
    {
        String sql = "DELETE FROM ChiTietDichVu where MaChiTietDichVu = ?";
        helper.sqlHelper.executeUpdate(sql, MaChiTietDichVu);
    }
}
