/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import module.Chamcong;
import view.Home;

/**
 *
 * @author nguye
 */
public class ChamcongDAO extends DAO.database implements DAOinterface<Chamcong> {

    public static ChamcongDAO getInstance() {

        return new ChamcongDAO();
    }

    private Component rootPane;
    Connection connection;
    PreparedStatement ps = null;
    ResultSet rs = null;
    int q;
    DefaultTableModel dtm;
    Home h = new Home();
    public void them(Chamcong chamcong) {
        int ketqua = 0;

        try {
            connection = DriverManager.getConnection(linkdb, user, password);
            String sql = "INSERT INTO chamcong (macn,maxuong,ngaybd,songaylam)" + "VALUES(?,?,?,?)";
            PreparedStatement pst;
            pst = connection.prepareStatement(sql);
            pst.setInt(1, chamcong.getMacn());
            pst.setInt(2, chamcong.getMaxuong());
            pst.setString(3, chamcong.getNgaybd());
            pst.setInt(4, chamcong.getSongaylam());

            ketqua = pst.executeUpdate();
            System.out.println("ban da thu thi " + sql);
            System.out.println("co " + ketqua + "dong bi thay doi");
            connection.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(rootPane, " lỗi ");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "  điền đầy đủ thông tin  ");
        }

        if (ketqua == 0) {
            JOptionPane.showMessageDialog(rootPane, " mã công nhân không đúng hoặc số ngày làm vượt quá 30 ngày ");
        } else {
            JOptionPane.showMessageDialog(rootPane, "  thêm thành công ");

        }
    }

    @Override
    public void capnhat(Chamcong chamcong) {
        Connection connection;
        int ketqua = 0;
        String tg = h.nam.getText() + "-" + h.thang.getText() + "-" + h.ngay.getText();
        try {
           
          
            connection = DriverManager.getConnection(linkdb, user, password);
            String sql = " UPDATE chamcong set ngaybd = ? ,songaylam=? where macn = ? ";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, tg);
            pst.setInt(2, chamcong.getSongaylam());
             pst.setInt(3, chamcong.getMacn());

            ketqua = pst.executeUpdate();
            System.out.println("ban da thu thi " + sql);
            System.out.println("co " + ketqua + "dong bi thay doi");
            connection.close();
            System.out.println(tg);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, " lỗi cập nhật  ");
        }

        if (ketqua == 0) {
            JOptionPane.showMessageDialog(rootPane, " cập nhật chưa thành công ");

        } else {
            JOptionPane.showMessageDialog(rootPane, " cập nhật thành công ");

        }

    }

    @Override
    public void xoa(Chamcong chamcong) {
        Connection connection;
        int ketqua = 0;
        try {
            connection = DriverManager.getConnection(linkdb, user, password);
            String sql = "delete from chamcong where macn = ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, chamcong.getMacn());
            ketqua = pst.executeUpdate();
            System.out.println("ban da thu thi " + sql);
            System.out.println("co " + ketqua + "dong bi thay doi");
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, " lỗi xóa ");
        }
        if (ketqua == 0) {
            JOptionPane.showMessageDialog(rootPane, " xóa không thành công");

        } else {
            JOptionPane.showMessageDialog(rootPane, " xóa  thành công ");
        }
    }

}
