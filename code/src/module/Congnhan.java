/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module;

import java.util.Scanner;

public class Congnhan{
    private String hovaten;
    private int macn ;
    private String diachi;
    private String sodt;
    private  int bac;

    public Congnhan() {
        super();
    }

    public Congnhan(String hovaten, int macn, String diachi, String sodt, int bac) {
        super();
        this.hovaten = hovaten;
        this.macn = macn;
        this.diachi = diachi;
        this.sodt = sodt;
        this.bac = bac;
    }

    public void input(){
        Scanner input = new Scanner(System.in);

        System.out.println(" nhap ho va ten ");
        hovaten = input.nextLine();
        System.out.println(" nhap ma cong nhan ");
        macn = input.nextInt();
        String a = input.nextLine();
        System.out.println(" nhap dia chi  ");
        diachi = input.nextLine();
        System.out.println(" nhap so dt ");
        sodt = input.nextLine();
        System.out.println(" nhap bac ");
        bac = input.nextInt();

    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
      
    }

    public int getMacn() {
        return macn;
    }

    public void setMacn(int macn) {
        this.macn = macn;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public String toString() {
        return "Congnhan{" +
                "hovaten='" + hovaten + '\'' +
                ", macn=" + macn +
                ", diachi='" + diachi + '\'' +
                ", sodt=" + sodt +
                ", bac=" + bac +
                '}';
    }


}
