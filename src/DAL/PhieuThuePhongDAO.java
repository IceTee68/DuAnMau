/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.PhieuThuePhong;
import helper.ChuyenDoi;
import java.sql.*;
import java.util.Date;
/**
 *
 * @author Trung Thanh
 */
public class PhieuThuePhongDAO {
    public static ResultSet getCount(){
        String sql = "select count(*) as count from PhieuThuePhong";
        return helper.sqlHelper.executeQuery(sql);
    }
    
   public static ResultSet SelectAll()
   {
       String sql = "select * from PhieuThuePhong";
       return helper.sqlHelper.executeQuery(sql);
   }
   
   public static ResultSet SelectByMaPhieuThue(String maPhieuThue)
   {
       String sql = "select * from PhieuThuePhong where MaPhieuThue = ?";
       return helper.sqlHelper.executeQuery(sql, maPhieuThue);
   }
   
   public static ResultSet SelectByMaPhong(String maPhong)
   {
       String sql = "select * from PhieuThuePhong where MaPhong = ?";
       return helper.sqlHelper.executeQuery(sql, maPhong);
   }
   
   public static ResultSet SelectByMaPhongV2(String maPhong)
   {
       String sql = "select p.TenPhong, lp.tenLoaiPhong, ptp.MaPhieuThue, ttp.TenTrangThaiPhong, nv.tenNhanVien, ptp.NgayTao, ptp.NgayTraPhong, ptp.CMND, "
               + "ptp.SoLuongKhach, ptp.GhiChu  from PhieuThuePhong ptp join Phong p on ptp.MaPhong = p.MaPhong "
               + "join loaiphong lp on lp.maloaiphong = p.maloaiphong join nhanvien nv on ptp.manhanvien = nv.manhanvien "
               + "join TrangThaiPhong ttp on ttp.MaTrangThaiPhong = p.MaTrangThaiPhong where ptp.maphong = ?";
       return helper.sqlHelper.executeQuery(sql, maPhong);
   }
   
   public static ResultSet SelectByCMND(String CMND)
   {
       String sql = "select * from PhieuThuePhong where CMND = ?";
       return helper.sqlHelper.executeQuery(sql, CMND);
   }
   
   public static ResultSet SelectByNgayTao(Date ngayTao01, Date ngayTao02)
   {
       String sql = "set dateformat dmy select * from PhieuThuePhong where NgayTao between ? and ?";
       return helper.sqlHelper.executeQuery(sql, ChuyenDoi.LayNgayString(ngayTao01), ChuyenDoi.LayNgayString(ngayTao02));
   }
   
   public static ResultSet SelectByTrangThaiThanhToan(int trangThaiThanhToan)
   {
       String sql = "select * from PhieuThuePhong where TrangThaiThanhToan = ?";
       return helper.sqlHelper.executeQuery(sql, trangThaiThanhToan);
   }
   
   public static void Add(PhieuThuePhong phieuThuePhong)
   {
       String sql = "set dateformat dmy INSERT INTO PhieuThuePhong (MaPhieuThue, MaPhong, CMND, SoLuongKhach, TienCoc, GiamGia, "
                  + "NgayTao, NgayTraPhong, GhiChu, MaNhanVien, TrangThaiThanhToan) VALUES (?,?,?,?,?,?,?,?,?,?,0)";
       helper.sqlHelper.executeUpdate(sql, phieuThuePhong.getMaPhieuThue(), phieuThuePhong.getMaPhong(), phieuThuePhong.getCMND(), phieuThuePhong.getSoLuongKhach(), 
                                      phieuThuePhong.getTienCoc(), phieuThuePhong.getGiamGia(), ChuyenDoi.LayNgayString(phieuThuePhong.getNgayTao()), 
                                      ChuyenDoi.LayNgayString(phieuThuePhong.getNgayTraPhong()), phieuThuePhong.getGhiChu(), phieuThuePhong.getMaNhanVien());
   }
   
   public static void Update(PhieuThuePhong phieuThuePhong)
   {
        String sql = "set dateformat dmy UPDATE PhieuThuePhong SET MaPhong =?, CMND =?, SoLuongKhach =?, TienCoc =?, GiamGia = ?, NgayTraPhong =?, GhiChu =?, TrangThaiThanhToan = ? "
               + "WHERE MaPhieuThue = ?";
        helper.sqlHelper.executeUpdate(sql, phieuThuePhong.getMaPhong(), phieuThuePhong.getCMND(), phieuThuePhong.getSoLuongKhach(), 
                                      phieuThuePhong.getTienCoc(), phieuThuePhong.getGiamGia(), ChuyenDoi.LayNgayString(phieuThuePhong.getNgayTraPhong()), 
                                      phieuThuePhong.getGhiChu(), phieuThuePhong.getTrangThaiThanhToan(), phieuThuePhong.getMaPhieuThue());
   }
   
   public static void Delete(String maPhieuThue)
   {
       String sql = "delete from PhieuThuePhong where MaPhieuThue = ?";
       helper.sqlHelper.executeUpdate(sql, maPhieuThue);
   }
}
