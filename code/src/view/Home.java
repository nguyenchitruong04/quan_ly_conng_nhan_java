package view;

import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import module.Congnhan;
import DAO.CongnhanDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import module.Xuong;
import DAO.XuongDAO;
import controller.HomeController;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection c = null;
    DefaultTableModel dtm;
    HomeController ctr = new HomeController(this);
    ActionListener actionListener = new HomeController(this);

    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    Congnhan cn = new Congnhan();
    Xuong x = new Xuong();

    int witdth = 150;
    int height = 900;
    int widthbang = 1000;
    int heightbang = 1000;
    int q;
    int qx;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        trangchumenu = new javax.swing.JLabel();
        congnhanmenu = new javax.swing.JLabel();
        xuongmenu = new javax.swing.JLabel();
        chamcongmenu = new javax.swing.JLabel();
        bangben = new javax.swing.JPanel();
        Trangchu = new javax.swing.JPanel();
        icontc = new javax.swing.JLabel();
        congnhan = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        nhapten = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        nhapma = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nhap_dc = new javax.swing.JTextField();
        nhap_sdt = new javax.swing.JTextField();
        nhap_bac = new javax.swing.JTextField();
        them = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        iconcn = new javax.swing.JLabel();
        timkiem = new javax.swing.JButton();
        updata = new javax.swing.JButton();
        chon = new javax.swing.JComboBox<>();
        capnhat = new javax.swing.JButton();
        canhbaobac = new javax.swing.JLabel();
        nhapten1 = new javax.swing.JTextField();
        tong = new javax.swing.JLabel();
        xuong = new javax.swing.JPanel();
        iconx = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nhapmt = new javax.swing.JTextField();
        nhaptx = new javax.swing.JTextField();
        nhaphscv = new javax.swing.JTextField();
        nhapmx = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        datax = new javax.swing.JTable();
        xoax = new javax.swing.JButton();
        capnhatx = new javax.swing.JButton();
        themx = new javax.swing.JButton();
        resetx = new javax.swing.JButton();
        allx = new javax.swing.JButton();
        tkx = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        nhaptkx = new javax.swing.JTextField();
        chamcong = new javax.swing.JPanel();
        iconcc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ngay = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nhapmxcc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nhapmcncc = new javax.swing.JTextField();
        nutthemcc = new javax.swing.JButton();
        nuttkcc = new javax.swing.JButton();
        tkcc = new javax.swing.JTextField();
        nutxoacc = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        datacc = new javax.swing.JTable();
        nutdatacc = new javax.swing.JButton();
        nam = new javax.swing.JTextField();
        thang = new javax.swing.JTextField();
        thangc = new javax.swing.JComboBox<>();
        ngayc = new javax.swing.JComboBox<>();
        namc = new javax.swing.JComboBox<>();
        tgbd = new javax.swing.JLabel();
        nutresetcc = new javax.swing.JButton();
        nhapsongaylam = new javax.swing.JTextField();

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\nguye\\OneDrive\\Hình ảnh\\close.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("quản lý công nhân");
        setBackground(new java.awt.Color(153, 153, 153));

        Main.setBackground(new java.awt.Color(153, 153, 153));
        Main.setPreferredSize(new java.awt.Dimension(1000, 1000));

        Menu.setBackground(new java.awt.Color(51, 49, 175));
        Menu.setPreferredSize(new java.awt.Dimension(125, 1000));

        trangchumenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trangchumenu.setText("Trang Chủ ");
        trangchumenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trangchumenuMouseClicked(evt);
            }
        });

        congnhanmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        congnhanmenu.setText("Công Nhân ");
        congnhanmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                congnhanmenuMouseClicked(evt);
            }
        });

        xuongmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xuongmenu.setText("Xưởng ");
        xuongmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xuongmenuMouseClicked(evt);
            }
        });

        chamcongmenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chamcongmenu.setText("Ngày làm việc ");
        chamcongmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chamcongmenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(trangchumenu, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(congnhanmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(chamcongmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(xuongmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addComponent(trangchumenu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(congnhanmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(xuongmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(chamcongmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bangben.setBackground(new java.awt.Color(153, 153, 153));
        bangben.setPreferredSize(new java.awt.Dimension(1000, 1000));
        bangben.setLayout(new java.awt.CardLayout());

        Trangchu.setBackground(new java.awt.Color(153, 153, 153));
        Trangchu.setPreferredSize(new java.awt.Dimension(1000, 1000));

        icontc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1242.jpg"))); // NOI18N
        icontc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icontcMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TrangchuLayout = new javax.swing.GroupLayout(Trangchu);
        Trangchu.setLayout(TrangchuLayout);
        TrangchuLayout.setHorizontalGroup(
            TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrangchuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icontc)
                .addContainerGap(1326, Short.MAX_VALUE))
        );
        TrangchuLayout.setVerticalGroup(
            TrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrangchuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icontc)
                .addContainerGap(844, Short.MAX_VALUE))
        );

        bangben.add(Trangchu, "card5");

        congnhan.setBackground(new java.awt.Color(153, 153, 153));
        congnhan.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Họ và Tên");

        data.setBackground(new java.awt.Color(255, 255, 255));
        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã công nhân ", "Họ và tên ", "Địa chỉ ", "Số điện thoại", "Bậc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        data.getTableHeader().setResizingAllowed(false);
        data.getTableHeader().setReorderingAllowed(false);
        data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(data);
        if (data.getColumnModel().getColumnCount() > 0) {
            data.getColumnModel().getColumn(0).setResizable(false);
            data.getColumnModel().getColumn(1).setResizable(false);
            data.getColumnModel().getColumn(2).setResizable(false);
            data.getColumnModel().getColumn(3).setResizable(false);
            data.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Mã công nhân");

        nhapma.setForeground(new java.awt.Color(102, 102, 102));
        nhapma.setActionCommand("nhapmacn");
        nhapma.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nhapmaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nhapmaFocusLost(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Địa chỉ ");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Bậc");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Số điện thoại");

        nhap_dc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nhap_dcFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nhap_dcFocusLost(evt);
            }
        });

        nhap_sdt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nhap_sdtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nhap_sdtFocusLost(evt);
            }
        });

        nhap_bac.setEditable(false);
        nhap_bac.setEnabled(false);

        them.setBackground(new java.awt.Color(255, 255, 255));
        them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/them.png"))); // NOI18N
        them.setActionCommand("themcn");
        them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                themMouseClicked(evt);
            }
        });
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        xoa.setBackground(new java.awt.Color(255, 255, 255));
        xoa.setForeground(new java.awt.Color(255, 255, 255));
        xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/xoa.png"))); // NOI18N
        xoa.setActionCommand("xoacn");
        xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xoaMouseClicked(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 255, 255));
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Screenshot 2024-02-26 211446.png"))); // NOI18N
        reset.setActionCommand("Resetcn");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        iconcn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1242.jpg"))); // NOI18N
        iconcn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconcnMouseClicked(evt);
            }
        });

        timkiem.setBackground(new java.awt.Color(255, 255, 255));
        timkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/123.png"))); // NOI18N
        timkiem.setActionCommand("timcn");
        timkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timkiemMouseClicked(evt);
            }
        });
        timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timkiemActionPerformed(evt);
            }
        });

        updata.setBackground(new java.awt.Color(255, 255, 255));
        updata.setForeground(new java.awt.Color(255, 255, 255));
        updata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/showdata.png"))); // NOI18N
        updata.setActionCommand("datacn");
        updata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updataMouseClicked(evt);
            }
        });

        chon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        chon.setActionCommand("bac");
        chon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chonActionPerformed(evt);
            }
        });

        capnhat.setBackground(new java.awt.Color(255, 255, 255));
        capnhat.setForeground(new java.awt.Color(255, 255, 255));
        capnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sua.png"))); // NOI18N
        capnhat.setActionCommand("updatecn");
        capnhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                capnhatMouseClicked(evt);
            }
        });
        capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capnhatActionPerformed(evt);
            }
        });

        canhbaobac.setForeground(new java.awt.Color(255, 0, 0));

        nhapten1.setForeground(new java.awt.Color(102, 102, 102));
        nhapten1.setText("tìm kiếm theo họ và tên");
        nhapten1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nhapten1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nhapten1FocusLost(evt);
            }
        });

        tong.setForeground(new java.awt.Color(255, 255, 255));
        tong.setAutoscrolls(true);

        javax.swing.GroupLayout congnhanLayout = new javax.swing.GroupLayout(congnhan);
        congnhan.setLayout(congnhanLayout);
        congnhanLayout.setHorizontalGroup(
            congnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(congnhanLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(congnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(congnhanLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nhapten, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(congnhanLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nhapma)))
                .addGap(162, 162, 162)
                .addGroup(congnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(congnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(congnhanLayout.createSequentialGroup()
                        .addComponent(nhap_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(congnhanLayout.createSequentialGroup()
                        .addComponent(nhap_dc, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(congnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(congnhanLayout.createSequentialGroup()
                                .addComponent(nhap_bac, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(canhbaobac, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, congnhanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(congnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(congnhanLayout.createSequentialGroup()
                        .addComponent(nhapten1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(tong, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(capnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updata, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(congnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(iconcn)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );
        congnhanLayout.setVerticalGroup(
            congnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(congnhanLayout.createSequentialGroup()
                .addComponent(iconcn)
                .addGap(12, 12, 12)
                .addGroup(congnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhapten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhap_dc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhap_bac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(congnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(congnhanLayout.createSequentialGroup()
                        .addGroup(congnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nhapma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nhap_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(congnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(congnhanLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(congnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(capnhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, congnhanLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(congnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tong, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(congnhanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nhapten1)
                                        .addComponent(timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addGap(5, 5, 5))))
                    .addComponent(canhbaobac, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        bangben.add(congnhan, "card2");

        xuong.setBackground(new java.awt.Color(153, 153, 153));

        iconx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1242.jpg"))); // NOI18N
        iconx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconxMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tên Xưởng ");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Mô tả");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Mã Xưởng");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Hệ số công việc");

        nhapmt.setForeground(new java.awt.Color(102, 102, 102));
        nhapmt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nhapmtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nhapmtFocusLost(evt);
            }
        });

        nhaphscv.setEditable(false);
        nhaphscv.setEnabled(false);

        nhapmx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nhapmxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nhapmxFocusLost(evt);
            }
        });

        datax.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Xưởng ", "Tên Xưởng", "Mô tả", "Hệ số công việc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        datax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataxMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(datax);
        if (datax.getColumnModel().getColumnCount() > 0) {
            datax.getColumnModel().getColumn(0).setResizable(false);
            datax.getColumnModel().getColumn(1).setResizable(false);
            datax.getColumnModel().getColumn(2).setResizable(false);
            datax.getColumnModel().getColumn(3).setResizable(false);
        }

        xoax.setBackground(new java.awt.Color(255, 255, 255));
        xoax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/xoa.png"))); // NOI18N
        xoax.setActionCommand("xoax");
        xoax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xoaxMouseClicked(evt);
            }
        });

        capnhatx.setBackground(new java.awt.Color(255, 255, 255));
        capnhatx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sua.png"))); // NOI18N
        capnhatx.setActionCommand("updatex");
        capnhatx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                capnhatxMouseClicked(evt);
            }
        });

        themx.setBackground(new java.awt.Color(255, 255, 255));
        themx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/them.png"))); // NOI18N
        themx.setActionCommand("themx");
        themx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                themxMouseClicked(evt);
            }
        });

        resetx.setBackground(new java.awt.Color(255, 255, 255));
        resetx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Screenshot 2024-02-26 211446.png"))); // NOI18N
        resetx.setActionCommand("Resetx");
        resetx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetxMouseClicked(evt);
            }
        });

        allx.setBackground(new java.awt.Color(255, 255, 255));
        allx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/showdata.png"))); // NOI18N
        allx.setActionCommand("datax");
        allx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allxMouseClicked(evt);
            }
        });

        tkx.setBackground(new java.awt.Color(255, 255, 255));
        tkx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/123.png"))); // NOI18N
        tkx.setActionCommand("timx");
        tkx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tkxMouseClicked(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.0", "1.5", "2.0", "2.5", "3.0", "3.5", "4.0" }));
        jComboBox1.setActionCommand("hscv");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        nhaptkx.setForeground(java.awt.Color.gray);
        nhaptkx.setText("tìm kiếm theo tên xưởng");
        nhaptkx.setActionCommand("nhaptkx");
        nhaptkx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nhaptkxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nhaptkxFocusLost(evt);
            }
        });

        javax.swing.GroupLayout xuongLayout = new javax.swing.GroupLayout(xuong);
        xuong.setLayout(xuongLayout);
        xuongLayout.setHorizontalGroup(
            xuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xuongLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(xuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(xuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(xuongLayout.createSequentialGroup()
                        .addComponent(nhapmt, javax.swing.GroupLayout.PREFERRED_SIZE, 736, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 483, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, xuongLayout.createSequentialGroup()
                        .addComponent(nhaptx, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nhapmx, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(nhaphscv, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267))))
            .addGroup(xuongLayout.createSequentialGroup()
                .addGroup(xuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(xuongLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconx))
                    .addGroup(xuongLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(xuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(xuongLayout.createSequentialGroup()
                                .addComponent(nhaptkx)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tkx)
                                .addGap(498, 498, 498)
                                .addComponent(themx, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resetx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(capnhatx, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(allx, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(xoax, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        xuongLayout.setVerticalGroup(
            xuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xuongLayout.createSequentialGroup()
                .addComponent(iconx)
                .addGroup(xuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(xuongLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(xuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nhaptx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nhaphscv)
                            .addComponent(nhapmx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1))
                        .addGap(14, 14, 14)
                        .addGroup(xuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nhapmt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(xuongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xoax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(capnhatx, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(themx, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetx, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(allx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tkx, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(xuongLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nhaptkx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                .addContainerGap())
        );

        bangben.add(xuong, "card3");

        chamcong.setBackground(new java.awt.Color(153, 153, 153));
        chamcong.setPreferredSize(new java.awt.Dimension(1412, 1000));

        iconcc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1242.jpg"))); // NOI18N
        iconcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconccMouseClicked(evt);
            }
        });

        jLabel1.setText("mã công nhân");

        ngay.setEditable(false);
        ngay.setEnabled(false);

        jLabel3.setText("mã xưởng");

        nhapmxcc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nhapmxccFocusLost(evt);
            }
        });

        jLabel5.setText("thời gian bắt đầu ");

        jLabel6.setText("số ngày làm");

        nhapmcncc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nhapmcnccFocusLost(evt);
            }
        });

        nutthemcc.setBackground(new java.awt.Color(255, 255, 255));
        nutthemcc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/them.png"))); // NOI18N
        nutthemcc.setActionCommand("Themcc");
        nutthemcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nutthemccMouseClicked(evt);
            }
        });

        nuttkcc.setBackground(new java.awt.Color(255, 255, 255));
        nuttkcc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/123.png"))); // NOI18N
        nuttkcc.setActionCommand("tkcc");
        nuttkcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuttkccMouseClicked(evt);
            }
        });

        tkcc.setForeground(java.awt.Color.gray);
        tkcc.setText("tìm kiếm theo mã công nhân");
        tkcc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tkccFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tkccFocusLost(evt);
            }
        });

        nutxoacc.setBackground(new java.awt.Color(255, 255, 255));
        nutxoacc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/xoa.png"))); // NOI18N
        nutxoacc.setActionCommand("xoacc");
        nutxoacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutxoaccActionPerformed(evt);
            }
        });

        datacc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã công nhân", "Mã xưởng", "ngày bắt đầu", "Số ngày làm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        datacc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataccMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(datacc);
        if (datacc.getColumnModel().getColumnCount() > 0) {
            datacc.getColumnModel().getColumn(0).setResizable(false);
            datacc.getColumnModel().getColumn(1).setResizable(false);
            datacc.getColumnModel().getColumn(2).setResizable(false);
            datacc.getColumnModel().getColumn(3).setResizable(false);
        }

        nutdatacc.setBackground(new java.awt.Color(255, 255, 255));
        nutdatacc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/showdata.png"))); // NOI18N
        nutdatacc.setActionCommand("datacc");
        nutdatacc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nutdataccMouseClicked(evt);
            }
        });

        nam.setEditable(false);
        nam.setEnabled(false);
        nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namActionPerformed(evt);
            }
        });

        thang.setEditable(false);
        thang.setEnabled(false);
        thang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thangActionPerformed(evt);
            }
        });

        thangc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        thangc.setActionCommand("thang");
        thangc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thangcActionPerformed(evt);
            }
        });

        ngayc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        ngayc.setActionCommand("ngay");
        ngayc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngaycActionPerformed(evt);
            }
        });

        namc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));
        namc.setActionCommand("nam");
        namc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namcActionPerformed(evt);
            }
        });

        nutresetcc.setBackground(new java.awt.Color(255, 255, 255));
        nutresetcc.setForeground(new java.awt.Color(255, 255, 255));
        nutresetcc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Screenshot 2024-02-26 211446.png"))); // NOI18N
        nutresetcc.setActionCommand("resetcc");
        nutresetcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nutresetccMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout chamcongLayout = new javax.swing.GroupLayout(chamcong);
        chamcong.setLayout(chamcongLayout);
        chamcongLayout.setHorizontalGroup(
            chamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chamcongLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(iconcc)
                .addGap(1320, 1320, 1320))
            .addGroup(chamcongLayout.createSequentialGroup()
                .addGroup(chamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(chamcongLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(chamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(chamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nhapmxcc, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nhapmcncc, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(chamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(chamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(chamcongLayout.createSequentialGroup()
                                .addGroup(chamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tgbd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, chamcongLayout.createSequentialGroup()
                                        .addComponent(ngay, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ngayc, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(thang, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(thangc, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nam, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namc, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nhapsongaylam, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(505, 505, 505))
                    .addGroup(chamcongLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(chamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(chamcongLayout.createSequentialGroup()
                                .addComponent(tkcc, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nuttkcc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nutthemcc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nutresetcc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nutdatacc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nutxoacc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        chamcongLayout.setVerticalGroup(
            chamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chamcongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chamcongLayout.createSequentialGroup()
                        .addComponent(iconcc)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chamcongLayout.createSequentialGroup()
                        .addComponent(tgbd)
                        .addGap(4, 4, 4)))
                .addGroup(chamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhapmcncc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thangc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngayc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(chamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhapmxcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhapsongaylam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(chamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(chamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nutresetcc, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nutdatacc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nutxoacc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(chamcongLayout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(chamcongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tkcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nuttkcc, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(nutthemcc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bangben.add(chamcong, "card4");

        javax.swing.GroupLayout MainLayout = new javax.swing.GroupLayout(Main);
        Main.setLayout(MainLayout);
        MainLayout.setHorizontalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bangben, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainLayout.setVerticalGroup(
            MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainLayout.createSequentialGroup()
                .addComponent(bangben, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, 1376, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themMouseClicked
        them.addActionListener(actionListener);
    }//GEN-LAST:event_themMouseClicked

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        reset.addActionListener(actionListener);

    }//GEN-LAST:event_resetMouseClicked

    private void xoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xoaMouseClicked
        xoa.addActionListener(actionListener);
    }//GEN-LAST:event_xoaMouseClicked

    private void xuongmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xuongmenuMouseClicked
        congnhan.setBounds(0, 0, 0, 0);
        chamcong.setBounds(0, 0, 0, 0);
        Trangchu.setVisible(false);
        congnhan.setVisible(false);
        chamcong.setVisible(false);
        xuong.setBounds(0, 0, 32767, 1000);
        xuong.setVisible(true);
        closeMenu();
    }//GEN-LAST:event_xuongmenuMouseClicked

    private void dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataMouseClicked
        int selectRows = data.getSelectedRow();
        dtm = (DefaultTableModel) data.getModel();
        nhapma.setText(dtm.getValueAt(selectRows, 0).toString());
        nhapten.setText(dtm.getValueAt(selectRows, 1).toString());
        nhap_dc.setText(dtm.getValueAt(selectRows, 2).toString());
        nhap_sdt.setText(dtm.getValueAt(selectRows, 3).toString());
        nhap_bac.setText(dtm.getValueAt(selectRows, 4).toString());
    }//GEN-LAST:event_dataMouseClicked

    private void timkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timkiemMouseClicked
        timkiem.addActionListener(actionListener);
    }//GEN-LAST:event_timkiemMouseClicked

    private void iconxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconxMouseClicked
        openMenu();
        xuong.setBounds(125, 0, 32767, 1000);
        congnhan.setVisible(false);
        xuong.setVisible(true);
    }//GEN-LAST:event_iconxMouseClicked

    private void themxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themxMouseClicked
        themx.addActionListener(actionListener);
    }//GEN-LAST:event_themxMouseClicked

    private void resetxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetxMouseClicked
        resetx.addActionListener(actionListener);
    }//GEN-LAST:event_resetxMouseClicked

    private void tkxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tkxMouseClicked
        tkx.addActionListener(actionListener);


    }//GEN-LAST:event_tkxMouseClicked

    private void xoaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xoaxMouseClicked
        xoax.addActionListener(actionListener);


    }//GEN-LAST:event_xoaxMouseClicked

    private void capnhatxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capnhatxMouseClicked
        capnhatx.addActionListener(actionListener);
    }//GEN-LAST:event_capnhatxMouseClicked

    private void dataxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataxMouseClicked
        int selectRows = datax.getSelectedRow();
        dtm = (DefaultTableModel) datax.getModel();
        nhapmx.setText(dtm.getValueAt(selectRows, 0).toString());
        nhaptx.setText(dtm.getValueAt(selectRows, 1).toString());
        nhapmt.setText(dtm.getValueAt(selectRows, 2).toString());
        nhaphscv.setText(dtm.getValueAt(selectRows, 3).toString());
    }//GEN-LAST:event_dataxMouseClicked

    private void chonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chonActionPerformed
        chon.addActionListener(actionListener);

    }//GEN-LAST:event_chonActionPerformed

    private void capnhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capnhatMouseClicked
        capnhat.addActionListener(actionListener);

    }//GEN-LAST:event_capnhatMouseClicked

    private void icontcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icontcMouseClicked
        openMenu();
        Trangchu.setBounds(125, 0, 32767, 1000);
    }//GEN-LAST:event_icontcMouseClicked

    private void trangchumenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trangchumenuMouseClicked
        closeMenu();
        xuong.setVisible(false);
        chamcong.setVisible(false);
        xuong.setBounds(0, 0, 0, 0);
        chamcong.setBounds(0, 0, 0, 0);
        congnhan.setVisible(false);
        congnhan.setBounds(0, 0, 0, 0);
        Trangchu.setVisible(true);
        Trangchu.setBounds(0, 0, 32767, 1000);
    }//GEN-LAST:event_trangchumenuMouseClicked

    private void nhapmxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapmxFocusLost
        if (nhapmx.getText().isBlank()) {
            nhapmx.setText("vui lòng nhập mã");
            nhapmx.setForeground(Color.gray);
        } else {
            if (isInteger(nhapmx.getText()) == false) {
                JOptionPane.showMessageDialog(rootPane, "lỗi định dạng");
            }
        }

    }//GEN-LAST:event_nhapmxFocusLost

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jComboBox1.addActionListener(actionListener);

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void iconcnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconcnMouseClicked
        openMenu();
        congnhan.setBounds(125, 0, 32767, 1000);

    }//GEN-LAST:event_iconcnMouseClicked

    private void congnhanmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_congnhanmenuMouseClicked
        closeMenu();
        congnhan.setBounds(0, 0, 32767, 1000);
        xuong.setVisible(false);
        chamcong.setVisible(false);
        xuong.setBounds(0, 0, 0, 0);
        chamcong.setBounds(0, 0, 0, 0);
        Trangchu.setVisible(false);
        Trangchu.setBounds(0, 0, 0, 0);
        congnhan.setVisible(true);

    }//GEN-LAST:event_congnhanmenuMouseClicked

    private void updataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updataMouseClicked
        updata.addActionListener(actionListener);
    }//GEN-LAST:event_updataMouseClicked

    private void capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capnhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capnhatActionPerformed

    private void allxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allxMouseClicked
        allx.addActionListener(actionListener);
    }//GEN-LAST:event_allxMouseClicked

    private void nhapmaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapmaFocusLost
        if (nhapma.getText().isBlank()) {
            nhapma.setText("vui lòng nhập mã công nhân");

        } else {
            if (isInteger(nhapma.getText()) == false) {
                JOptionPane.showMessageDialog(rootPane, "nhập sai định dạng");
            }
        }


    }//GEN-LAST:event_nhapmaFocusLost

    private void iconccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconccMouseClicked
        openMenu();
        chamcong.setBounds(125, 0, 32767, 1000);
    }//GEN-LAST:event_iconccMouseClicked

    private void chamcongmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chamcongmenuMouseClicked
        closeMenu();
        chamcong.setBounds(0, 0, 32767, 1000);
        xuong.setVisible(false);
        chamcong.setVisible(true);
        xuong.setBounds(0, 0, 0, 0);
        Trangchu.setVisible(false);
        Trangchu.setBounds(0, 0, 0, 0);
        congnhan.setVisible(false);
    }//GEN-LAST:event_chamcongmenuMouseClicked

    private void nutdataccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nutdataccMouseClicked
        nutdatacc.addActionListener(actionListener);

    }//GEN-LAST:event_nutdataccMouseClicked

    private void thangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thangActionPerformed

    private void namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namActionPerformed

    private void ngaycActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngaycActionPerformed
        ngayc.addActionListener(actionListener);
    }//GEN-LAST:event_ngaycActionPerformed

    private void thangcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thangcActionPerformed
        thangc.addActionListener(actionListener);
    }//GEN-LAST:event_thangcActionPerformed

    private void namcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namcActionPerformed
        namc.addActionListener(actionListener);
    }//GEN-LAST:event_namcActionPerformed

    private void nutthemccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nutthemccMouseClicked
        nutthemcc.addActionListener(actionListener);

    }//GEN-LAST:event_nutthemccMouseClicked

    private void nutxoaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutxoaccActionPerformed
        nutxoacc.addActionListener(actionListener);
    }//GEN-LAST:event_nutxoaccActionPerformed

    private void dataccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataccMouseClicked
        int selectRows = datacc.getSelectedRow();
        dtm = (DefaultTableModel) datacc.getModel();
        nhapmcncc.setText(dtm.getValueAt(selectRows, 0).toString());
        nhapmxcc.setText(dtm.getValueAt(selectRows, 1).toString());

        nhapsongaylam.setText(dtm.getValueAt(selectRows, 3).toString());
        tgbd.setText(dtm.getValueAt(selectRows, 2).toString());
        nam.setText(dtm.getValueAt(selectRows, 2).toString());

    }//GEN-LAST:event_dataccMouseClicked

    private void nutresetccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nutresetccMouseClicked
        nutresetcc.addActionListener(actionListener);
    }//GEN-LAST:event_nutresetccMouseClicked

    private void nuttkccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuttkccMouseClicked
        nuttkcc.addActionListener(actionListener);
        System.out.println("ssassaddasd");
    }//GEN-LAST:event_nuttkccMouseClicked

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_themActionPerformed

    private void timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timkiemActionPerformed

    private void nhapten1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapten1FocusLost
        if (nhapten1.getText().isEmpty()) {
            nhapten1.setText("tìm kiếm theo họ và tên");
            nhapten1.setForeground(Color.gray);
        }
    }//GEN-LAST:event_nhapten1FocusLost

    private void nhapten1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapten1FocusGained
        if (nhapten1.getText().equals("tìm kiếm theo họ và tên")) {
            nhapten1.setText("");
            nhapten1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nhapten1FocusGained

    private void nhap_dcFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhap_dcFocusLost
        if (nhap_dc.getText().equals("null")) {
            nhap_dc.setText("");
        }
    }//GEN-LAST:event_nhap_dcFocusLost

    private void nhap_sdtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhap_sdtFocusLost
        if (nhap_sdt.getText().equals("null")) {
            nhap_sdt.setText("");
        }
    }//GEN-LAST:event_nhap_sdtFocusLost

    private void nhap_dcFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhap_dcFocusGained
        if (nhap_dc.getText().equals("null")) {
            nhap_dc.setText("");
            nhap_dc.setForeground(Color.BLACK);
        } else {
            nhap_dc.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nhap_dcFocusGained

    private void nhap_sdtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhap_sdtFocusGained
        if (nhap_sdt.getText().equals("null")) {
            nhap_sdt.setText("");
            nhap_sdt.setForeground(Color.BLACK);
        } else {
            nhap_sdt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nhap_sdtFocusGained

    private void nhapmtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapmtFocusGained
        if (nhapmt.getText().equals("null")) {
            nhapmt.setText("");
            nhapmt.setForeground(Color.BLACK);
        } else {
            nhapmt.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nhapmtFocusGained

    private void nhapmtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapmtFocusLost
        if (nhapmt.getText().equals("null")) {
            nhapmt.setText("");
        }
        if (nhapmt.getText().isEmpty()) {
            nhapmt.setText("null");
            nhapmt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_nhapmtFocusLost

    private void nhapmaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapmaFocusGained
        if (nhapma.getText().matches("vui lòng nhập mã công nhân")) {
            nhapma.setText("");
            nhapma.setForeground(Color.black);
        }

    }//GEN-LAST:event_nhapmaFocusGained

    private void nhapmxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapmxFocusGained
        if (nhapmx.getText().matches("vui lòng nhập mã")) {
            nhapmx.setText("");
            nhapmx.setForeground(Color.black);
        }
    }//GEN-LAST:event_nhapmxFocusGained

    private void tkccFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tkccFocusGained
        if (tkcc.getText().matches("tìm kiếm theo mã công nhân")) {
            tkcc.setText("");
            tkcc.setForeground(Color.black);
        }
    }//GEN-LAST:event_tkccFocusGained

    private void tkccFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tkccFocusLost
        if (tkcc.getText().isBlank()) {
            tkcc.setText("tìm kiếm theo mã công nhân");
            tkcc.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tkccFocusLost

    private void nhaptkxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhaptkxFocusGained
        if (nhaptkx.getText().matches("tìm kiếm theo tên xưởng")) {
            nhaptkx.setText("");
            nhaptkx.setForeground(Color.black);
        }
    }//GEN-LAST:event_nhaptkxFocusGained

    private void nhaptkxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhaptkxFocusLost

        if (nhaptkx.getText().isBlank()) {
            nhaptkx.setText("tìm kiếm theo tên xưởng");
            nhaptkx.setForeground(Color.gray);
        }
    }//GEN-LAST:event_nhaptkxFocusLost

    private void nhapmcnccFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapmcnccFocusLost
        if (nhapmcncc.getText().isBlank()) {
        } else {
            if (isInteger(nhapmcncc.getText()) == false) {
                JOptionPane.showMessageDialog(rootPane, "lỗi định dạng");
            }
        }
    }//GEN-LAST:event_nhapmcnccFocusLost

    private void nhapmxccFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nhapmxccFocusLost
       if (nhapmxcc.getText().isBlank()) {
        } else {
            if (isInteger(nhapmxcc.getText()) == false) {
                JOptionPane.showMessageDialog(rootPane, "lỗi định dạng");
            }
        }
    }//GEN-LAST:event_nhapmxccFocusLost
    public void updatecc() {
        dtm = (DefaultTableModel) datacc.getModel();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/new_schema", "root", "231204");
            ps = c.prepareStatement("SELECT * FROM chamcong order by macn");
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

    public void openMenu() {
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < witdth; i++) {
                    Menu.setSize(i, height);
                    try {
                        Thread.sleep(0);
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
                    Menu.setSize(i, height);
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
        nhapten.setText("");
        nhapma.setText("");
        nhap_dc.setText("");
        nhap_bac.setText("");
        nhap_sdt.setText("");
        nhapmt.setText("");
        nhapmx.setText("");
        nhaptx.setText("");
        nhaphscv.setText("");
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main;
    public javax.swing.JPanel Menu;
    public javax.swing.JPanel Trangchu;
    public javax.swing.JButton allx;
    private javax.swing.JPanel bangben;
    public javax.swing.JLabel canhbaobac;
    private javax.swing.JButton capnhat;
    public javax.swing.JButton capnhatx;
    public javax.swing.JPanel chamcong;
    public javax.swing.JLabel chamcongmenu;
    public javax.swing.JComboBox<String> chon;
    public javax.swing.JPanel congnhan;
    public javax.swing.JLabel congnhanmenu;
    public javax.swing.JTable data;
    public javax.swing.JTable datacc;
    public javax.swing.JTable datax;
    private javax.swing.JLabel iconcc;
    public javax.swing.JLabel iconcn;
    private javax.swing.JLabel icontc;
    private javax.swing.JLabel iconx;
    public javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextField nam;
    public javax.swing.JComboBox<String> namc;
    public javax.swing.JTextField ngay;
    public javax.swing.JComboBox<String> ngayc;
    public javax.swing.JTextField nhap_bac;
    public javax.swing.JTextField nhap_dc;
    public javax.swing.JTextField nhap_sdt;
    public javax.swing.JTextField nhaphscv;
    public javax.swing.JTextField nhapma;
    public javax.swing.JTextField nhapmcncc;
    public javax.swing.JTextField nhapmt;
    public javax.swing.JTextField nhapmx;
    public javax.swing.JTextField nhapmxcc;
    public javax.swing.JTextField nhapsongaylam;
    public javax.swing.JTextField nhapten;
    public javax.swing.JTextField nhapten1;
    public javax.swing.JTextField nhaptkx;
    public javax.swing.JTextField nhaptx;
    public javax.swing.JButton nutdatacc;
    private javax.swing.JButton nutresetcc;
    public javax.swing.JButton nutthemcc;
    public javax.swing.JButton nuttkcc;
    public javax.swing.JButton nutxoacc;
    private javax.swing.JButton reset;
    public javax.swing.JButton resetx;
    public javax.swing.JLabel tgbd;
    public javax.swing.JTextField thang;
    public javax.swing.JComboBox<String> thangc;
    public javax.swing.JButton them;
    public javax.swing.JButton themx;
    private javax.swing.JButton timkiem;
    public javax.swing.JTextField tkcc;
    public javax.swing.JButton tkx;
    public javax.swing.JLabel tong;
    public javax.swing.JLabel trangchumenu;
    public javax.swing.JButton updata;
    private javax.swing.JButton xoa;
    public javax.swing.JButton xoax;
    public javax.swing.JPanel xuong;
    public javax.swing.JLabel xuongmenu;
    // End of variables declaration//GEN-END:variables
}
