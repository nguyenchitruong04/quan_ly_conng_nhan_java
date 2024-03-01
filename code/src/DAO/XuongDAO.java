package DAO;

import module.Congnhan;
import module.Xuong;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.Home;

public class XuongDAO extends DAO.database implements DAOinterface<Xuong> {

    public static XuongDAO getInstance() {
        return new XuongDAO();

    }
    private Component rootPane;

    public void them(Xuong xuong) {
        Connection connection;
        int ketqua = 0;
        try {
            connection = DriverManager.getConnection(linkdb, user, password);
            String sql = "INSERT INTO xuong(maxuong,tenxuong,mota,hscv)" + "VALUES(?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, xuong.getMaxuong());
            ps.setString(2, xuong.getTenxuong());
            ps.setString(3, xuong.getMota());
            ps.setFloat(4, xuong.getHscv());
            ketqua = ps.executeUpdate();
            System.out.println("ban da thu thi " + sql);
            System.out.println("co " + ketqua + "dong bi thay doi");
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "  lỗi thêm ");
        }
        if (ketqua == 0) {
            JOptionPane.showMessageDialog(rootPane, "  thêm không thành công ");
        } else {
            JOptionPane.showMessageDialog(rootPane, "  thêm thành công ");

        }

    }

    public void capnhat(Xuong xuong) {
        Connection connection;
        int ketqua = 0;
        try {
            connection = DriverManager.getConnection(linkdb, user, password);
            String sql = " UPDATE xuong " + " SET "
                    + "mota = ? , hscv = ?"
                    + " WHERE maxuong =  ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, xuong.getMota());
            ps.setFloat(2, xuong.getHscv());
            ps.setInt(3, xuong.getMaxuong());
            ketqua = ps.executeUpdate();
            System.out.println("ban da thu thi " + sql);
            System.out.println("co " + ketqua + "dong bi thay doi");
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "  lỗi cập nhật");
        }
        if (ketqua == 0) {
            JOptionPane.showMessageDialog(rootPane, "  cập nhật không thành công ");
        } else {
            JOptionPane.showMessageDialog(rootPane, " cập nhật thành công ");

        }

    }

    public void xoa(Xuong xuong) {
        Connection connection;
        int ketqua = 0;
        try {
            connection = DriverManager.getConnection(linkdb, user, password);
            String sql = "delete from xuong where maxuong = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, xuong.getMaxuong());
            ketqua = ps.executeUpdate();
            System.out.println("ban da thu thi " + sql);
            System.out.println("co " + ketqua + "dong bi thay doi");
            connection.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "  lỗi xóa ");
        }
        if (ketqua == 0) {
            JOptionPane.showMessageDialog(rootPane, "  xóa không thành công ");
        } else {
            JOptionPane.showMessageDialog(rootPane, "  xóa thành công ");
        }

    }

}
