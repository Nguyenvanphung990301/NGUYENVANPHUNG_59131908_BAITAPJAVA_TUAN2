/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenvanphung;

import Bai2.IQuanLy;
import Bai2.QuanLyNhanVien;

public class Bai1{
    public static void main(String[] args) {
        NhanVien nv1 =  new NhanVien("Nguyen Van Phung",22,"An Hoa",10000,300);
        NhanVien nv2 =  new NhanVien("Tran Van No",19,"An Hoa",20000,200);
        System.out.println("Nhan vien 1 :"+nv1.getThongTin()+" "+nv1.tinhThuong());
        System.out.println("Nhan vien 2 :"+nv2.getThongTin()+" "+nv2.tinhThuong());
     IQuanLy QL = new QuanLyNhanVien();
     QL.them(nv1);
     QL.them(nv2);
     QL.inDS();
    }
}