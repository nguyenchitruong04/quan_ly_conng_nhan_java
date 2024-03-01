/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module;

import java.util.Scanner;

public class Xuong {
    private int maxuong;
    private float hscv;
    private String tenxuong,mota;


    public Xuong() {
        super();
    }

    public Xuong(int maxuong, float hscv, String tenxuong, String mota) {
        super();
        this.maxuong = maxuong;
        this.hscv = hscv;
        this.tenxuong = tenxuong;
        this.mota = mota;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println(" nhap ten xuong  ");
        tenxuong = input.nextLine();
        System.out.println(" nhap ma xuong ");
        //String a = input.nextLine();
        maxuong = input.nextInt();

        String a = input.nextLine();
        System.out.println(" nhap mo ta ");
        mota = input.nextLine();
       // String a = input.nextLine();
        System.out.println(" nhap he so cong viec ");
        hscv = input.nextFloat();

    }

    public int getMaxuong() {
        return maxuong;
    }

    public void setMaxuong(int maxuong) {
        this.maxuong = maxuong;
    }

    public float getHscv() {
        return hscv;
    }

    public void setHscv(float hscv) {
        this.hscv = hscv;
    }

    public String getTenxuong() {
        return tenxuong;
    }

    public void setTenxuong(String tenxuong) {
        this.tenxuong = tenxuong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @Override
    public String toString() {
        return "Xuong{" +
                "maxuong=" + maxuong +
                ", hscv=" + hscv +
                ", tenxuong='" + tenxuong + '\'' +
                ", mota='" + mota + '\'' +
                '}';
    }
}
