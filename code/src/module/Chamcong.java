/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package module;

/**
 *
 * @author nguye
 */
public class Chamcong {
    int macn;
    int maxuong;
    String ngaybd;
    int songaylam;

    public Chamcong() {
        super();
    }

    public Chamcong(int macn, int maxuong, String ngaybd, int songaylam) {
        this.macn = macn;
        this.maxuong = maxuong;
        this.ngaybd = ngaybd;
        this.songaylam = songaylam;
    }

    public int getMacn() {
        return macn;
    }

    public void setMacn(int macn) {
        this.macn = macn;
    }

    public int getMaxuong() {
        return maxuong;
    }

    public void setMaxuong(int maxuong) {
        this.maxuong = maxuong;
    }

    public String getNgaybd() {
        return ngaybd;
    }

    public void setNgaybd(String ngaybd) {
        this.ngaybd = ngaybd;
    }

    public int getSongaylam() {
        return songaylam;
    }

    public void setSongaylam(int songaylam) {
        this.songaylam = songaylam;
    }
    
    
}
