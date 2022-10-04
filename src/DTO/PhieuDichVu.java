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
public class PhieuDichVu {
    private String MaPhieuDichVu;
    private String MaPhong;
    private Date NgayTao;
    private int TrangThaiThanhToan;

    public String getMaPhieuDichVu() {
        return MaPhieuDichVu;
    }

    public void setMaPhieuDichVu(String MaPhieuDichVu) {
        this.MaPhieuDichVu = MaPhieuDichVu;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
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

    public PhieuDichVu() {
    }

    public PhieuDichVu(String MaPhieuDichVu, String MaPhong, Date NgayTao, int TrangThaiThanhToan) {
        this.MaPhieuDichVu = MaPhieuDichVu;
        this.MaPhong = MaPhong;
        this.NgayTao = NgayTao;
        this.TrangThaiThanhToan = TrangThaiThanhToan;
    }

    
}
