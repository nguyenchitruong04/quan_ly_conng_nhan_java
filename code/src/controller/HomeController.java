package controller;

import DAO.ChamcongDAO;
import DAO.CongnhanDAO;
import DAO.XuongDAO;
import DAO.database;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import module.Chamcong;
import module.Congnhan;
import module.Xuong;
import view.Home;

/**
 *
 * @author nguye
 */
public class HomeController extends DAO.database implements ActionListener {

    public Home home;

    Congnhan cn = new Congnhan();
    Xuong x = new Xuong();
    Chamcong cc = new Chamcong();
    int witdth = 150;
    int height = 900;
    int widthbang = 1000;
    int heightbang = 1000;
    int q;
    int qx;
    private Component rootPane;
    DAO.database db = new database();

    public HomeController(Home home) {

        this.home = home;
    }

    public void actionPerformed(ActionEvent e) {
        String cm = e.getActionCommand();
        String regdc = ".*[^\\p{Alpha}\\p{Digit}\\u0020\\u2026\\u00c0-\\uFFFF].*";
        String reg = ".*[^\\p{Alpha}\\u0020\\u2026\\u00c0-\\uFFFF].*";
        String so = "^[0-9\\'null']+";

        // công nhân
        //hiện data
        if (cm.equals("datacn")) {
            updatecn();
            // thêm công nhân
        } else if (cm == "themcn") {
            try {
                String a = home.nhapten.getText();
                String b = home.nhapma.getText();
                if (home.nhap_sdt.getText().isEmpty()) {
                    home.nhap_sdt.setText("null");
                    home.nhap_sdt.setForeground(Color.gray);
                }
                if (home.nhap_bac.getText().isBlank()) {
                    home.nhap_bac.setText("0");
                }
                if (home.nhap_dc.getText().isEmpty()) {
                    home.nhap_dc.setText("null");
                    home.nhap_dc.setForeground(Color.gray);
                }
                String c = home.nhap_dc.getText();
                String h = home.nhap_sdt.getText().replaceAll(" ", "");
                String d = home.nhap_bac.getText();
                if (b.isBlank() || a.isBlank()) {
                    JOptionPane.showMessageDialog(rootPane, "không được bỏ trống mã công nhân và tên ");
                } else {
                    if (home.nhapten.getText().matches(reg) || h.matches(so) == false) {

                        JOptionPane.showMessageDialog(rootPane, "kiểm tra lại tên,số điện thoại ");
                    } else {

                        cn.setMacn(Integer.valueOf(b));
                        String dc = c.replaceAll(regdc, "");
                        String ten = a.replaceAll(reg, "");
                        cn.setBac(Integer.valueOf(d));
                        cn.setHovaten(ten);
                        cn.setDiachi(dc);
                        cn.setSodt(h);
                        cn.setMacn(Integer.valueOf(b));
                        CongnhanDAO.getInstance().them(cn);
                        updatecn();
                        reset();
                    }
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(rootPane, "lỗi định dạng");
            }

// reset
        } else if (cm.equals("Resetcn")) {
            reset();
            home.data.setVisible(false);
            dem();

// xóa            
        } else if (cm.equals("xoacn")) {
            String b = home.nhapma.getText();
            if (b.isBlank()) {
                JOptionPane.showMessageDialog(rootPane, " cần điền mã công nhân để xóa  ");
            } else {

                cn.setMacn(Integer.parseInt(home.nhapma.getText()));
                CongnhanDAO.getInstance().xoa(cn);
                updatecn();
                reset();
            }

// tìm công nhân 
        } else if (cm.equals("timcn")) {
            String a = home.nhapten1.getText();
            if (a.isBlank()) {
                JOptionPane.showMessageDialog(rootPane, "cần điền họ và tên để tìm kiếm");
            } else {
                if (home.nhapten1.getText().matches(reg)) {
                    JOptionPane.showMessageDialog(rootPane, "tên công nhân không chứa kí tự đặc biệt và số");
                } else {
                    timkiem1(cn);
                    dem();
                }

            }

// cập nhật            
        } else if (cm.equals("updatecn")) {
            String a = home.nhapma.getText();
            String b = home.nhap_bac.getText();
            if (home.nhap_sdt.getText().isEmpty()) {
                home.nhap_sdt.setText("null");
                home.nhap_sdt.setForeground(Color.gray);
            }
            if (home.nhap_dc.getText().isEmpty()) {
                home.nhap_dc.setText("null");
                home.nhap_dc.setForeground(Color.gray);
            }
            String d = home.nhap_dc.getText();
            String c = home.nhap_sdt.getText();
            if (a.isBlank()) {
                JOptionPane.showMessageDialog(rootPane, " không để trống mã khi cập nhật ");
            } else {
                if (home.nhap_dc.getText().matches(regdc) || c.matches(so) == false) {
                    JOptionPane.showMessageDialog(rootPane, "kiểm tra lại địa chỉ,số điện thoại ");
                } else {
                    String dc = d.replaceAll(regdc, "");

                    cn.setBac(Integer.valueOf(b));
                    cn.setDiachi(dc);
                    cn.setSodt(c.replaceAll(" ", ""));
                    cn.setMacn(Integer.valueOf(a));
                    CongnhanDAO.getInstance().capnhat(cn);
                    updatecn();
                    reset();
                }
            }
        }

        // Xưởng     
        // hiện bảng
        if (cm.equals("datax")) {
            updatex();
            // thêm xưởng 
        } else if (cm.equals("themx")) {
            try {
                String a = home.nhaptx.getText();
                String b = home.nhapmx.getText();
                if (home.nhapmt.getText().isEmpty()) {
                    home.nhapmt.setText("null");
                    home.nhapmt.setForeground(Color.gray);
                }
                if (home.nhaphscv.getText().isBlank()) {
                    home.nhaphscv.setText("0");
                }

                String c = home.nhapmt.getText();
                String d = home.nhaphscv.getText();
                if (b.isBlank() || a.isBlank()) {
                    JOptionPane.showMessageDialog(rootPane, "không được bỏ trống mã và tên Xưởng");
                } else {
                    if (home.nhaptx.getText().matches(regdc)) {

                        JOptionPane.showMessageDialog(rootPane, "kiểm tra lại tên Xưởng ");
                    } else {

                        x.setMaxuong(Integer.valueOf(b));
                        String dc = c.replaceAll(regdc, "");
                        String ten = a.replaceAll(regdc, "");
                        x.setHscv(Float.valueOf(d));
                        x.setTenxuong(ten);
                        x.setMota(dc);
                        x.setMaxuong(Integer.valueOf(b));
                        XuongDAO.getInstance().them(x);
                        updatex();
                        reset();
                    }
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(rootPane, "lỗi định dạng");
            }
            // xóa xưởng
        } else if (cm.equals("xoax")) {
            String a = home.nhapmx.getText();
            if (a.isBlank()) {
                JOptionPane.showMessageDialog(rootPane, "cần điền mã xưởng để xóa");
            } else {
                x.setMaxuong(Integer.valueOf(a));
                XuongDAO.getInstance().xoa(x);
                updatex();
                reset();
            }
            // cập nhật xưởng
        } else if (cm.equals("updatex")) {
            String a = home.nhapmx.getText();
            String b = home.nhaphscv.getText();
            String c = home.nhapmt.getText();
            if (c.isBlank()) {
                home.nhapmt.setText("null");
                home.nhapmt.setForeground(Color.gray);
            }
            if (b.isBlank()) {
                home.nhaphscv.setText("0");
                home.nhaphscv.setForeground(Color.gray);
            }
            home.nhapmt.setForeground(Color.black);
            home.nhaphscv.setForeground(Color.black);
            if (a.isBlank()) {
                JOptionPane.showMessageDialog(rootPane, "cần điền mã để cập nhật");

            } else {

                if (c.matches(regdc)) {
                    JOptionPane.showMessageDialog(rootPane, "mô tả không nhận ký tự đặc biệt ");
                } else {
                    x.setMota(c);

                    x.setMaxuong(Integer.valueOf(a));
                    x.setHscv(Float.valueOf(b));
                    XuongDAO.getInstance().capnhat(x);
                    reset();
                    updatex();
                }

            }
            // reset xưởng
        } else if (cm.equals("Resetx")) {
            reset();
            // tìm xưởng
        } else if (cm.equals("timx")) {
            String a = home.nhaptkx.getText();
            if (a.isBlank()) {
                JOptionPane.showMessageDialog(rootPane, "cần nhập tên để tìm kiếm");
            } else {
                if (a.matches(regdc)) {
                    JOptionPane.showMessageDialog(rootPane, "tên xưởng không nhận ký tự đặc biệt");
                }
                x.setTenxuong(home.nhaptkx.getText());
                timkiemx();

            }
        }
        // xử lý combobox
        if (cm.equals("hscv")) {
            int index = home.jComboBox1.getSelectedIndex();
//            if (index >= 0) {
            String a = home.jComboBox1.getItemAt(index);
            home.nhaphscv.setText(a);
//            }
        } else if (cm.equals("bac")) {
            int index = home.chon.getSelectedIndex();
            if (index >= 0) {
                String a = home.chon.getItemAt(index);
                home.nhap_bac.setText(a);
            }
        }
// chấm công
        if (cm.equals("datacc")) {
            updatecc();
        } else if (cm.equals("Themcc")) {
            try {
                String a = home.nhapmcncc.getText();
                String b = home.nhapmxcc.getText();
                String c = home.nhapsongaylam.getText();
                if (a.isBlank()) {
                    JOptionPane.showMessageDialog(rootPane, " không được bỏ trống mã công khi thêm");
                } else {
                    cc.setMacn(Integer.valueOf(a));
                    cc.setMaxuong(Integer.valueOf(b));
                    cc.setSongaylam(Integer.valueOf(c));
                    cc.setNgaybd(home.nam.getText() + "-" + home.thang.getText() + "-" + home.ngay.getText());
                    ChamcongDAO.getInstance().them(cc);
                    updatecc();
                    home.tgbd.setText("");
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(rootPane, "lỗi định dạng");
            }
        } else if (cm.equals("xoacc")) {
            String a = home.nhapmcncc.getText();
            if (a.length() != 0) {
                cc.setMacn(Integer.valueOf(a));
                ChamcongDAO.getInstance().xoa(cc);
                updatecc();
                home.tgbd.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, " không được bỏ trống mã công khi thêm");
            }
       
        } else if (cm.equals("resetcc")) {
            home.nhapmcncc.setText("");
            home.nhapmxcc.setText("");
            home.ngay.setText("");
            home.thang.setText("");
            home.nam.setText("");
            home.tgbd.setText("");
            home.nhapsongaylam.setText("");

        } else if (cm.equals("tkcc")) {

            String b = home.tkcc.getText();
            home.nhapmcncc.setText(b);
            String a = home.nhapmcncc.getText();
            cc.setMacn(Integer.valueOf(a));
            timkiemcc();
            home.nhapmcncc.setText("");

        }
        // jcombobox chấm công 
        if (cm.equals("ngay")) {
            int index = home.ngayc.getSelectedIndex();
            if (index >= 0) {
                String a = home.ngayc.getItemAt(index);
                home.ngay.setText(a);
            }
        } else if (cm.equals("thang")) {
            int index = home.thangc.getSelectedIndex();
            if (index >= 0) {
                String a = home.thangc.getItemAt(index);
                home.thang.setText(a);
            }
        } else if (cm.equals("nam")) {
            int index = home.namc.getSelectedIndex();
            if (index >= 0) {
                String a = home.namc.getItemAt(index);
                home.nam.setText(a);
            }
        }
    }

    PreparedStatement ps = null;
    ResultSet rs = null;
    java.sql.Connection c = null;
    DefaultTableModel dtm;

    public void updatecn() {
        home.data.setVisible(true);
        dtm = (DefaultTableModel) home.data.getModel();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(linkdb, user, password);
            ps = c.prepareStatement("select * from congnhan order by macn ASC");
            rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            q = rsm.getColumnCount();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector columndata = new Vector();
                for (int i = 1; i <= q; i++) {
                    columndata.add(rs.getString(1));
                    columndata.add(rs.getString(2));
                    columndata.add(rs.getString(3));
                    columndata.add(rs.getString(4));
                    columndata.add(rs.getString(5));
                }
                dtm.addRow(columndata);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updatex() {
        dtm = (DefaultTableModel) home.datax.getModel();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(linkdb, user, password);
            ps = c.prepareStatement("select * from xuong order by maxuong ASC");
            rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            q = rsm.getColumnCount();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector columndata = new Vector();
                for (int i = 1; i <= q; i++) {
                    columndata.add(rs.getString(1));
                    columndata.add(rs.getString(2));
                    columndata.add(rs.getString(3));
                    columndata.add(rs.getString(4));

                }
                dtm.addRow(columndata);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updatecc() {
        dtm = (DefaultTableModel) home.datacc.getModel();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(linkdb, user, password);
            ps = c.prepareStatement("SELECT * FROM chamcong order by macn");
            rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            q = rsm.getColumnCount();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector columndata = new Vector();
                for (int i = 1; i <= q; i++) {
                    columndata.add(rs.getInt(1));
                    columndata.add(rs.getString(2));
                    columndata.add(rs.getString(3));
                    columndata.add(rs.getString(4));

                }
                dtm.addRow(columndata);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cnmenu() {
        closeMenu();
        home.congnhan.setBounds(0, 0, 100000, 100000);
        home.xuong.setVisible(false);
        home.chamcong.setVisible(false);
        home.xuong.setBounds(0, 0, 0, 0);
        home.chamcong.setBounds(0, 0, 0, 0);
        home.Trangchu.setVisible(false);
        home.Trangchu.setBounds(0, 0, 0, 0);
        home.congnhan.setVisible(true);

    }

    public void openMenu() {
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < witdth; i++) {
                    home.Menu.setSize(i, height);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        }).start();
    }

    public void closeMenu() {
        new Thread(new Runnable() {
            public void run() {
                for (int i = witdth; i > 0; i--) {
                    home.Menu.setSize(i, height);
                    try {
                        Thread.sleep(0);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        }).start();
    }

    public void reset() {
        home.nhapten.setText("");
        home.nhapma.setText("");
        home.nhap_dc.setText("");
        home.nhap_bac.setText("");
        home.nhap_sdt.setText("");
        home.nhapmt.setText("");
        home.nhapmx.setText("");
        home.nhaptx.setText("");
        home.nhaphscv.setText("");
        home.nhapten1.setText("tìm kiếm theo họ và tên");
        home.nhapten1.setForeground(Color.gray);
        home.tong.setText("");

    }

    public void timkiem1(Congnhan congnhan) {
        dtm = (DefaultTableModel) home.data.getModel();
        congnhan.setHovaten(home.nhapten1.getText());
        String a = "%" + home.nhapten1.getText() + "%";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(linkdb, user, password);
            String sql = "select * from congnhan where hovaten like ? ";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, a);
            ResultSet rs = pst.executeQuery();
            rs = pst.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            q = rsm.getColumnCount();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector columndata = new Vector();
                for (int i = 1; i <= q; i++) {
                    columndata.add(rs.getString(1));
                    columndata.add(rs.getString(2));
                    columndata.add(rs.getString(3));
                    columndata.add(rs.getString(4));
                    columndata.add(rs.getString(5));
                }
                dtm.addRow(columndata);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void timkiemx() {
        dtm = (DefaultTableModel) home.datax.getModel();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(linkdb, user, password);
            String sql = "select * from xuong where tenxuong like ? ";
            String s = "%" + home.nhaptkx.getText() + "%";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setString(1, s);
            ResultSet rs = pst.executeQuery();
            rs = pst.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            q = rsm.getColumnCount();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector columndata = new Vector();
                for (int i = 1; i <= q; i++) {
                    columndata.add(rs.getString(1));
                    columndata.add(rs.getString(2));
                    columndata.add(rs.getString(3));
                    columndata.add(rs.getString(4));
                }
                dtm.addRow(columndata);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void timkiemcc() {
        dtm = (DefaultTableModel) home.datacc.getModel();

        String a = home.tkcc.getText();
        home.nhapmcncc.setText(a);

        Integer.valueOf(a);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(linkdb, user, password);
            String sql = "select * from chamcong where macn = ? ";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setInt(1, Integer.valueOf(a));
            ResultSet rs = pst.executeQuery();
            rs = pst.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
            q = rsm.getColumnCount();
            dtm.setRowCount(0);
            while (rs.next()) {
                Vector columndata = new Vector();
                for (int i = 1; i <= q; i++) {
                    columndata.add(rs.getString(1));
                    columndata.add(rs.getString(2));
                    columndata.add(rs.getString(3));
                    columndata.add(rs.getString(4));

                }
                dtm.addRow(columndata);
            }
            System.out.println("jhg");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void dem() {
        if (home.nhapten1.getText().equals("tìm kiếm theo họ và tên")) {
        } else {
            String a = "%" + home.nhapten1.getText() + "%";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                c = DriverManager.getConnection(linkdb, user, password);
                ps = c.prepareStatement("select count(macn) from congnhan where hovaten like ? ");
                ps.setString(1, a);
                rs = ps.executeQuery();
                if (rs.next()) {
                    int count = rs.getInt(1);
                    home.tong.setText("số kết quả đã tìm kiến theo " + home.nhapten1.getText() + " là " + count);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
