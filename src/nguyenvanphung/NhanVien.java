/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenvanphung;

/**
 *
 * @author Administrator
 */
public class NhanVien {
    private String Name;
    private int Age;
    private String Address;
    private double Salary;
    private int workHours;

    public NhanVien() {
    }

    public NhanVien(String Name, int Age, String Address, double Salary, int workHours) {
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
        this.Salary = Salary;
        this.workHours = workHours;
    }
   

    public String getName() {
        return Name;
    }
    public void setName(String newName){
        this.Name = newName;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int newAge) {
        this.Age = newAge;
    }
    public String getAddress(){
        return Address;
    }
    public void setAddress(String newAddress){
        this.Address = newAddress;
    }
    public double getSalary(){
        return Salary;
    }
    public void setSalary(double newSalary){
        this.Salary = newSalary;
    }
    public int getworkHours(){
        return workHours;
    }
    public void setworkHours(int newworkHours){
        this.workHours = newworkHours;
    }
    public String getThongTin(){
        return Name + " " + Age + " " + Address + " " + Salary + " " + workHours;
    }
    public double tinhThuong() {
        if (workHours >= 200) return Salary * 0.2;
        else if (workHours >= 100 && workHours < 200) return Salary * 0.1;
        else return 0;
    }
}