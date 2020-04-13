/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;
import java.util.ArrayList;
import nguyenvanphung.NhanVien;

/**
 *
 * @author Administrator
 */
public class QuanLyNhanVien implements IQuanLy {
    ArrayList<NhanVien> listNhanVien = new ArrayList<NhanVien>();

    @Override
    public void them(NhanVien nv) {
        listNhanVien.add(nv);
    }
    @Override
    public void inDS() {
       listNhanVien.forEach(nv ->System.out.println(nv.getThongTin()));
    }
}
