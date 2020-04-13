/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Administrator
 */
public class SinhVienBiz extends SinhVienPoLy{

    private double diemMarketing, diemSales;

    public SinhVienBiz(double diemMarketing, double diemSales, String hoTen, String nganh) {
        super(hoTen, nganh);
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }
    // thực hiện phương thức trừu tượng ở lớp cha
    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
}
