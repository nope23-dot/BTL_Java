/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class KhachDatBanh {

    private String maKhachDat;
    private KhachHang khachHang;
    private NgayThang ngayDat;
    private ArrayList<DonHang> danhSachDonHang;

    public KhachDatBanh() {
    }

    public KhachDatBanh(String maKhachDat, KhachHang khachHang, NgayThang ngayDat) {
        this.maKhachDat = maKhachDat;
        this.khachHang = khachHang;
        this.ngayDat = ngayDat;
        this.danhSachDonHang = new ArrayList<>();
    }

    public void themDonHang(DonHang dh) {
        danhSachDonHang.add(dh);
    }

    public double tinhTongTien() {
        double tong = 0;
        for (DonHang dh : danhSachDonHang) {
            tong += dh.getThanhTien();
        }
        return tong;
    }

    public void in() {
        System.out.println("Ma: " + maKhachDat);
        System.out.println("tên KH: " + khachHang.getHoTen());
        System.out.println("Ngay; " + ngayDat.toString());
        for (DonHang dh : danhSachDonHang) {
            System.out.println(dh.getTenBanh() + ": số lương " + dh.getSoLuongMua() + ": tổng giá " + dh.getThanhTien());
        }
        System.out.println("Tong tien: " + tinhTongTien());
    }

    
    //  test chạy thử, chưa bắt ngoại lệ ngày tháng tạo khoảng để áp dụng thống kê
//    public static void main(String[] args) {
//
//        KhachHang kh1 = new KhachHang("KH01", "Nguyen", "An", "0123456789", "Ha Noi");
//        
//        NgayThang nt= new NgayThang(23,8,2005);// kiểu số nguyên nên không có tháng 08 -> lỗi
//
//        KhachDatBanh donDat = new KhachDatBanh("DH001", kh1, nt);
//
//        DonHang ctdh1 = new DonHang("B01", "Bánh mì", 10000, 50, 3);
//        DonHang ctdh2 = new DonHang("B02", "Bánh kem", 20000, 30, 2);
//
//        donDat.themDonHang(ctdh1);
//        donDat.themDonHang(ctdh2);
//
//        donDat.in();
//    }
}
