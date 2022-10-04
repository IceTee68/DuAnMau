/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.NhanVien;
import helper.ChuyenDoi;
import java.sql.*;
import java.util.Date;
/**
 *
 * @author Trung Thanh
 */
public class NhanVienDAO {
    public static ResultSet SelectAll()
    {
        String sql = "select * from NhanVien";
        return helper.sqlHelper.executeQuery(sql);
    }
    
    public static ResultSet SelectByMaNhanVien(String maNhanVien)
    {
        String sql = "select * from NhanVien where MaNhanVien = ?";
        return helper.sqlHelper.executeQuery(sql, maNhanVien);
    }
    
    public static ResultSet SelectByTenNhanVien(String tenNhanVien)
    {
        String sql = "select * from NhanVien where TenNhanVien like ?";
        return helper.sqlHelper.executeQuery(sql,"%" + tenNhanVien + "%");
    }
    
    public static ResultSet SelectByMaChucVu(String maChucVu)
    {
        String sql = "select * from NhanVien where MaNhanVien = ?";
        return helper.sqlHelper.executeQuery(sql, maChucVu);
    }
    
    public static ResultSet SelectByTrangThaiNhanVien(boolean trangThaiNhanVien)
    {
        String sql = "select * from NhanVien where TrangThaiNhanVien = ?";
        return helper.sqlHelper.executeQuery(sql, trangThaiNhanVien);
    }
    
    public static void Add(NhanVien nhanVien)
    {
        String sql = "set dateformat dmy INSERT INTO NhanVien (MaNhanVien, TenNhanVien, GioiTinh, NgaySinh, SoDienThoai, CMND, MaChucVu, MatKhau, Luong) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        helper.sqlHelper.executeUpdate(sql, nhanVien.getMaNhanVien(), nhanVien.getTenNhanVien(), nhanVien.isGioiTinh(), ChuyenDoi.LayNgayString(nhanVien.getNgaySinh()),
                                            nhanVien.getSoDienThoai(), nhanVien.getCMND(), nhanVien.getMaChucVu(), nhanVien.getMatKhau(), nhanVien.getLuong());
    }
    
    public static void Update(NhanVien nhanVien)
    {
        String sql = "set dateformat dmy UPDATE NhanVien SET TenNhanVien = ?, GioiTinh = ?, NgaySinh = ?, SoDienThoai = ?, CMND = ?, MaChucVu = ?, "
                                        + "MatKhau = ?, Luong = ?, TrangThaiNhanVien = ? WHERE MaNhanVien = ?";
        helper.sqlHelper.executeUpdate(sql, nhanVien.getTenNhanVien(), nhanVien.isGioiTinh(), ChuyenDoi.LayNgayString(nhanVien.getNgaySinh()),
                                            nhanVien.getSoDienThoai(), nhanVien.getCMND(), nhanVien.getMaChucVu(), nhanVien.getMatKhau(), nhanVien.getLuong(),
                                            nhanVien.isTrangThaiNhanVien(), nhanVien.getMaNhanVien());
    }
    
    public static void Delete(String maNhanVien)
    {
        String sql ="DELETE FROM NhanVien WHERE MaNhanVien = ?";
        helper.sqlHelper.executeUpdate(sql, maNhanVien);
    }
}
