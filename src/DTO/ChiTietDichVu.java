/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Trung Thanh
 */
public class ChiTietDichVu {
    private String MaChiTietDichVu;
    private String MaPhieuDichVu;
    private String MaSanPham;
    private int SoLuong;
    private double GiaTien;
    private String GhiChu;
    private String MaNhanVien;
    private Date NgayTao;

    public String getMaChiTietDichVu() {
        return MaChiTietDichVu;
    }

    public void setMaChiTietDichVu(String MaChiTietDichVu) {
        this.MaChiTietDichVu = MaChiTietDichVu;
    }

    public String getMaPhieuDichVu() {
        return MaPhieuDichVu;
    }

    public void setMaPhieuDichVu(String MaPhieuDichVu) {
        this.MaPhieuDichVu = MaPhieuDichVu;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(double GiaTien) {
        this.GiaTien = GiaTien;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public ChiTietDichVu() {
    }

    public ChiTietDichVu(String MaChiTietDichVu, String MaPhieuDichVu, String MaSanPham, int SoLuong, double GiaTien, String GhiChu, String MaNhanVien) {
        this.MaChiTietDichVu = MaChiTietDichVu;
        this.MaPhieuDichVu = MaPhieuDichVu;
        this.MaSanPham = MaSanPham;
        this.SoLuong = SoLuong;
        this.GiaTien = GiaTien;
        this.GhiChu = GhiChu;
        this.MaNhanVien = MaNhanVien;
    }

    public ChiTietDichVu(String MaChiTietDichVu, String MaPhieuDichVu, String MaSanPham, int SoLuong, double GiaTien, String GhiChu, String MaNhanVien, Date NgayTao) {
        this.MaChiTietDichVu = MaChiTietDichVu;
        this.MaPhieuDichVu = MaPhieuDichVu;
        this.MaSanPham = MaSanPham;
        this.SoLuong = SoLuong;
        this.GiaTien = GiaTien;
        this.GhiChu = GhiChu;
        this.MaNhanVien = MaNhanVien;
        this.NgayTao = NgayTao;
    }
    
    
}
