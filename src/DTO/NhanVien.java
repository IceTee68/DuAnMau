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
public class NhanVien {
    private String MaNhanVien;
    private String TenNhanVien;
    private boolean GioiTinh;
    private Date NgaySinh;
    private String SoDienThoai;
    private String CMND;
    private String MaChucVu;
    private String MatKhau;
    private double Luong;
    private Date NgayTao;
    private boolean TrangThaiNhanVien;

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getMaChucVu() {
        return MaChucVu;
    }

    public void setMaChucVu(String MaChucVu) {
        this.MaChucVu = MaChucVu;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public boolean isTrangThaiNhanVien() {
        return TrangThaiNhanVien;
    }

    public void setTrangThaiNhanVien(boolean TrangThaiNhanVien) {
        this.TrangThaiNhanVien = TrangThaiNhanVien;
    }

    public NhanVien() {
    }

    public NhanVien(String MaNhanVien, String TenNhanVien, String MaChucVu) {
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.MaChucVu = MaChucVu;
    }
    
    

    public NhanVien(String MaNhanVien, String TenNhanVien, boolean GioiTinh, Date NgaySinh, String SoDienThoai, String CMND, String MaChucVu, String MatKhau, double Luong) {
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.SoDienThoai = SoDienThoai;
        this.CMND = CMND;
        this.MaChucVu = MaChucVu;
        this.MatKhau = MatKhau;
        this.Luong = Luong;
    }

    public NhanVien(String MaNhanVien, String TenNhanVien, boolean GioiTinh, Date NgaySinh, String SoDienThoai, String CMND, String MaChucVu, String MatKhau, double Luong, Date NgayTao) {
        this.MaNhanVien = MaNhanVien;
        this.TenNhanVien = TenNhanVien;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.SoDienThoai = SoDienThoai;
        this.CMND = CMND;
        this.MaChucVu = MaChucVu;
        this.MatKhau = MatKhau;
        this.Luong = Luong;
        this.NgayTao = NgayTao;
    }
    
    
}
