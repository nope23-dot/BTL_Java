/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS
 */
public class Banh {

    private String maBanh;
    private String tenBanh;
    private double gia;
    private int soLuongTon;

    public Banh() {
    }

    public Banh(String maBanh, String tenBanh, double gia, int soLuongTon) {
        this.maBanh = maBanh;
        this.tenBanh = tenBanh;
        this.gia = gia;
        this.soLuongTon = soLuongTon;
    }

    public String getMaBanh() {
        return maBanh;
    }

    public void setMaBanh(String maBanh) {
        this.maBanh = maBanh;
    }

    public String getTenBanh() {
        return tenBanh;
    }

    public void setTenBanh(String tenBanh) {
        this.tenBanh = tenBanh;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

}
