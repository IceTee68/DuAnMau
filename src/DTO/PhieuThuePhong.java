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
public class PhieuThuePhong {
    private String MaPhieuThue;
    private String MaPhong;
    private String CMND;
    private String MaNhanVien;
    private int SoLuongKhach;
    private double TienCoc;
    private double GiamGia;
    private Date NgayTraPhong;
    private String GhiChu;
    private Date NgayTao;
    private int TrangThaiThanhToan;

    public String getMaPhieuThue() {
        return MaPhieuThue;
    }

    public void setMaPhieuThue(String MaPhieuThue) {
        this.MaPhieuThue = MaPhieuThue;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public int getSoLuongKhach() {
        return SoLuongKhach;
    }

    public void setSoLuongKhach(int SoLuongKhach) {
        this.SoLuongKhach = SoLuongKhach;
    }

    public double getTienCoc() {
        return TienCoc;
    }

    public void setTienCoc(double TienCoc) {
        this.TienCoc = TienCoc;
    }

    public double getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(double GiamGia) {
        this.GiamGia = GiamGia;
    }

    public Date getNgayTraPhong() {
        return NgayTraPhong;
    }

    public void setNgayTraPhong(Date NgayTraPhong) {
        this.NgayTraPhong = NgayTraPhong;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public int getTrangThaiThanhToan() {
        return TrangThaiThanhToan;
    }

    public void setTrangThaiThanhToan(int TrangThaiThanhToan) {
        this.TrangThaiThanhToan = TrangThaiThanhToan;
    }

    public PhieuThuePhong() {
    }

    public PhieuThuePhong(String MaPhieuThue, String MaPhong, String CMND, String MaNhanVien, int SoLuongKhach, double TienCoc, double GiamGia, Date NgayTraPhong, String GhiChu, int TrangThaiThanhToan) {
        this.MaPhieuThue = MaPhieuThue;
        this.MaPhong = MaPhong;
        this.CMND = CMND;
        this.MaNhanVien = MaNhanVien;
        this.SoLuongKhach = SoLuongKhach;
        this.TienCoc = TienCoc;
        this.GiamGia = GiamGia;
        this.NgayTraPhong = NgayTraPhong;
        this.GhiChu = GhiChu;
        this.TrangThaiThanhToan = TrangThaiThanhToan;
    }

    public PhieuThuePhong(String MaPhieuThue, String MaPhong, String CMND, String MaNhanVien, int SoLuongKhach, double TienCoc, double GiamGia, Date NgayTraPhong, String GhiChu, Date NgayTao, int TrangThaiThanhToan) {
        this.MaPhieuThue = MaPhieuThue;
        this.MaPhong = MaPhong;
        this.CMND = CMND;
        this.MaNhanVien = MaNhanVien;
        this.SoLuongKhach = SoLuongKhach;
        this.TienCoc = TienCoc;
        this.GiamGia = GiamGia;
        this.NgayTraPhong = NgayTraPhong;
        this.GhiChu = GhiChu;
        this.NgayTao = NgayTao;
        this.TrangThaiThanhToan = TrangThaiThanhToan;
    }

    
}
