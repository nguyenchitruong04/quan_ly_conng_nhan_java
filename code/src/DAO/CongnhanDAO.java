package DAO;

import controller.HomeController;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.lang.ref.Cleaner;
import module.Congnhan;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.Home;

public class CongnhanDAO extends DAO.database implements DAOinterface<Congnhan> {

    public Home home;

    public static CongnhanDAO getInstance() {

        return new CongnhanDAO();
    }

    private Component rootPane;
    Connection connection;
    PreparedStatement ps = null;
    ResultSet rs = null;
    int q;
    DefaultTableModel dtm;

    public void them(Congnhan congnhan) {

        int ketqua = 0;

        try {
            connection = DriverManager.getConnection(linkdb, user, password);
            String sql = "INSERT INTO congnhan (macn,hovaten,diachi,sdt,bac)" + "VALUES(?,?,?,?,?)";
            PreparedStatement pst;
            pst = connection.prepareStatement(sql);
            pst.setInt(1, congnhan.getMacn());
            pst.setString(2, congnhan.getHovaten());
            pst.setString(3, congnhan.getDiachi());
            pst.setString(4, congnhan.getSodt());
            pst.setInt(5, congnhan.getBac());
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
            JOptionPane.showMessageDialog(rootPane, "  thêm không thành công "
                    + "\nmã công nhân bị trùng ");
        } else {
            JOptionPane.showMessageDialog(rootPane, "  thêm thành công ");

        }

    }

    public void capnhat(Congnhan congnhan) {
        Connection connection;
        int ketqua = 0;

        try {
            connection = DriverManager.getConnection(linkdb, user, password);
            String sql = " UPDATE congnhan set diachi = ? , sdt = ? , bac = ? where macn = ? ";
            PreparedStatement pst = connection.prepareStatement(sql);

            pst.setString(1, congnhan.getDiachi());
            pst.setString(2, congnhan.getSodt());
            pst.setInt(3, congnhan.getBac());
            pst.setInt(4, congnhan.getMacn());
            ketqua = pst.executeUpdate();
            System.out.println("ban da thu thi " + sql);
            System.out.println("co " + ketqua + "dong bi thay doi");
            connection.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, " lỗi cập nhật  ");
        }

        if (ketqua == 0) {
            JOptionPane.showMessageDialog(rootPane, " cập nhật chưa thành công "
                    + " \nLưu ý : nhập đủ thông tin ");

        } else {
            JOptionPane.showMessageDialog(rootPane, " cập nhật thành công ");

        }

    }

    public void xoa(Congnhan congnhan) {
        Connection connection;
        int ketqua = 0;
        try {
            connection = DriverManager.getConnection(linkdb, user, password);
            String sql = "delete from congnhan where macn = ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, congnhan.getMacn());
            ketqua = pst.executeUpdate();
            System.out.println("ban da thu thi " + sql);
            System.out.println("co " + ketqua + "dong bi thay doi");
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, " lỗi xóa ");
        }
        if (ketqua == 0) {
            JOptionPane.showMessageDialog(rootPane, "nếu xóa công nhân này thì sẽ xóa luôn bên chấm công "
                    + "\n nếu vẫn muốn xóa thì thực hiện lại để xóa  ");
            try {
                connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema", "root", "231204");
                String sql = "delete from chamcong where macn = ?";
                PreparedStatement pst = connection.prepareStatement(sql);
                pst.setInt(1, congnhan.getMacn());
                ketqua = pst.executeUpdate();
            } catch (SQLException ex) {
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, " xóa  thành công ");
        }
    }

}
