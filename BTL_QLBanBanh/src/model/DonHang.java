/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class DonHang extends Banh {

    private int soLuongMua;

    double getThanhTien() {
        return soLuongMua * getGia();
    }

    public DonHang() {
    }

    public DonHang(String maBanh, String tenBanh, double gia, int soLuongTon, int soLuongMua) {
        super(maBanh, tenBanh, gia, soLuongTon);
        this.soLuongMua = soLuongMua;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

}
