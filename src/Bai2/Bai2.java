/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import nguyenvanphung.NhanVien;


/**
 *
 * @author Administrator
 */
public class Bai2 {
   public static void main(String[] args) {
     NhanVien nv1 =  new NhanVien("Nguyen Van Phung",22,"An Hoa",10000,300);
     NhanVien nv2 =  new NhanVien("Tran Van No",19,"An Hoa",20000,200);
     IQuanLy QL = new QuanLyNhanVien();
     QL.them(nv1);
     QL.them(nv2);
     QL.inDS();
    }
}
