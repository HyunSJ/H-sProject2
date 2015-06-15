package track1;




import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
	
public class BookManager extends javax.swing.JFrame {
    private List<Book> books = new ArrayList<Book>();
    private List<Account> accounts = new ArrayList<Account>();
    private List<Lentbook> lentlist = new ArrayList<Lentbook>();
    
    public BookManager() {
        initComponents();
    }                          
    private void initComponents() {
        jTabbedPane1 = new javax.swing.JTabbedPane();
        paneBooks = new javax.swing.JPanel();
        tfCode1 = new javax.swing.JTextField();
        tfAuthor1 = new javax.swing.JTextField();
        tfGenre1 = new javax.swing.JTextField();
        tfPub1 = new javax.swing.JTextField();
        tfTitle1 = new javax.swing.JTextField();
        tfState1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBook1 = new javax.swing.JTable();
        BPane1 = new javax.swing.JPanel();
        bAdd1 = new javax.swing.JButton();
        bEdit1 = new javax.swing.JButton();
        bDelete1 = new javax.swing.JButton();
        bSave1 = new javax.swing.JButton();
        bLoad1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        paneSearchBook = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblBook2 = new javax.swing.JTable();
        BPane2 = new javax.swing.JPanel();
        bEdit2 = new javax.swing.JButton();
        bDelete2 = new javax.swing.JButton();
        bSave2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        tfSearchBook = new javax.swing.JTextField();
        bSearch1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        tfCode2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tfGenre2 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        tfTitle2 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tfAuthor2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        tfPub2 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        tfState2 = new javax.swing.JTextField();
        paneAccounts = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAccount1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        tfId1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfName1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfContact1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfCharge1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfUse1 = new javax.swing.JTextField();
        BPane3 = new javax.swing.JPanel();
        bAdd2 = new javax.swing.JButton();
        bEdit3 = new javax.swing.JButton();
        bDelete3 = new javax.swing.JButton();
        bLoad2 = new javax.swing.JButton();
        bSave3 = new javax.swing.JButton();
        paneSearchAccount = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblAccount2 = new javax.swing.JTable();
        BPane4 = new javax.swing.JPanel();
        bEdit4 = new javax.swing.JButton();
        bDelete4 = new javax.swing.JButton();
        bSave4 = new javax.swing.JButton();
        tfSearchAccount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bSearch2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        tfId2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfName2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfContack2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tfCharge2 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        tfUse2 = new javax.swing.JTextField();
        paneLentBook = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLentBook = new javax.swing.JTable();
        BPane5 = new javax.swing.JPanel();
        bEdit5 = new javax.swing.JButton();
        bDelete5 = new javax.swing.JButton();
        bLoad3 = new javax.swing.JButton();
        bSave5 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        tfCode3 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tfId3 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        tfAday = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tfBday = new javax.swing.JTextField();
        paneLent = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLentBook2 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        tfCode4 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tfId4 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        tfAday2 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        tfBday2 = new javax.swing.JTextField();
        BPane6 = new javax.swing.JPanel();
        bAdd4 = new javax.swing.JButton();
        bEdit6 = new javax.swing.JButton();
        bDelete6 = new javax.swing.JButton();
        bLoad4 = new javax.swing.JButton();
        bSave6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("한양 만화방");
        jTabbedPane1.setToolTipText("book");


        tblBook1.setModel(new BookTableModel(new ArrayList<Book>()));
        jScrollPane1.setViewportView(tblBook1);
        
        tblBook1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tblBook1.rowAtPoint(evt.getPoint());
                int col = tblBook1.columnAtPoint(evt.getPoint());
                tfCode1.setText(books.get(row).getCode());
                tfGenre1.setText(books.get(row).getGenre());
                tfTitle1.setText(books.get(row).getTitle());
                tfAuthor1.setText(books.get(row).getAuthor());
                tfPub1.setText(books.get(row).getPublisher());
                tfState1.setText(books.get(row).getState());
            }
        });

        bAdd1.setText("등록");
        bAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdd1ActionPerformed(evt);
            }
        });

        bEdit1.setText("수정");
        bEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEdit1ActionPerformed(evt,tblBook1.getSelectedRow());
            }
        });

        bDelete1.setText("삭제");
        bDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDelete1ActionPerformed(evt,tblBook1.getSelectedRow());
            }
        });

        javax.swing.GroupLayout BPane1Layout = new javax.swing.GroupLayout(BPane1);
        BPane1.setLayout(BPane1Layout);
        BPane1Layout.setHorizontalGroup(
            BPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bAdd1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEdit1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDelete1)
                .addGap(18, 18, 18)
                .addGap(18, 18, 18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BPane1Layout.setVerticalGroup(
            BPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdd1)
                    .addComponent(bEdit1)
                    .addComponent(bDelete1)
                    
        )));

        jLabel1.setText("코드 :");

        jLabel2.setText("장르 :");

        jLabel3.setText("제목 :");

        jLabel4.setText("저자 :");

        jLabel6.setText("상태 :");

        jLabel5.setText("출판사 :");

        javax.swing.GroupLayout paneBooksLayout = new javax.swing.GroupLayout(paneBooks);
        paneBooks.setLayout(paneBooksLayout);
        paneBooksLayout.setHorizontalGroup(
            paneBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneBooksLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(paneBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneBooksLayout.createSequentialGroup()
                        .addGroup(paneBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(paneBooksLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCode1))
                            .addGroup(paneBooksLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAuthor1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(paneBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneBooksLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPub1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paneBooksLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfGenre1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(paneBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfState1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        paneBooksLayout.setVerticalGroup(
            paneBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneBooksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(paneBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(tfGenre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(paneBooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfAuthor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tfState1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(BPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("도서목록", paneBooks);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        tblBook2.setModel(new BookTableModel(new ArrayList<Book>()));
        jScrollPane6.setViewportView(tblBook2);
        
        tblBook2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tblBook2.rowAtPoint(evt.getPoint());
                int col = tblBook2.columnAtPoint(evt.getPoint());
                tfCode2.setText(books.get(row).getCode());
                tfGenre2.setText(books.get(row).getGenre());
                tfTitle2.setText(books.get(row).getTitle());
                tfAuthor2.setText(books.get(row).getAuthor());
                tfPub2.setText(books.get(row).getPublisher());
                tfState2.setText(books.get(row).getState());
            }
        });

        bEdit2.setText("수정");
        bEdit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEdit2ActionPerformed(evt,tblBook2.getSelectedRow());
            }
        });

        bDelete2.setText("삭제");
        bDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDelete2ActionPerformed(evt,tblBook2.getSelectedRow());
            }
        });

        javax.swing.GroupLayout BPane2Layout = new javax.swing.GroupLayout(BPane2);
        BPane2.setLayout(BPane2Layout);
        BPane2Layout.setHorizontalGroup(
            BPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bEdit2)
                .addGap(26, 26, 26)
                .addComponent(bDelete2)
                .addGap(26, 26, 26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BPane2Layout.setVerticalGroup(
            BPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEdit2)
                    .addComponent(bDelete2)
        )));

        jLabel13.setText("도서명 :");


        bSearch1.setText("검색");
        bSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearch1ActionPerformed(evt);
            }
        });

        jLabel24.setText("코드 :");

        jLabel25.setText("장르 :");

        jLabel26.setText("제목 :");


        jLabel27.setText("저자 :");


        jLabel28.setText("출판사 :");

        jLabel29.setText("상테 :");


        javax.swing.GroupLayout paneSearchBookLayout = new javax.swing.GroupLayout(paneSearchBook);
        paneSearchBook.setLayout(paneSearchBookLayout);
        paneSearchBookLayout.setHorizontalGroup(
            paneSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneSearchBookLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(paneSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneSearchBookLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSearch1))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneSearchBookLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfGenre2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneSearchBookLayout.createSequentialGroup()
                        .addGroup(paneSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneSearchBookLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAuthor2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPub2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfState2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        paneSearchBookLayout.setVerticalGroup(
            paneSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneSearchBookLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(paneSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfSearchBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearch1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(paneSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tfCode2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(tfGenre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(tfTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(paneSearchBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tfAuthor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(tfPub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(tfState2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(BPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("도서검색", paneSearchBook);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        tblAccount1.setModel(new AccountTableModel(new ArrayList<Account>()));
        jScrollPane2.setViewportView(tblAccount1);
        
        tblAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tblAccount1.rowAtPoint(evt.getPoint());
                int col = tblAccount1.columnAtPoint(evt.getPoint());
                tfId1.setText(accounts.get(row).getId());
                tfName1.setText(accounts.get(row).getName());
                tfContact1.setText(Integer.toString(accounts.get(row).getContact()));
                tfCharge1.setText(Integer.toString(accounts.get(row).getCharge()));
                tfUse1.setText(Integer.toString(accounts.get(row).getUse()));
            }
        });

        jLabel8.setText("ID :");

        jLabel9.setText("이름 :");


        jLabel10.setText("연락처 :");

        jLabel11.setText("연체료 :");
        
        jLabel12.setText("이용횟수 :");
        
        bAdd2.setText("등록");
        bAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdd2ActionPerformed(evt);
            }
        });

        bEdit3.setText("수정");
        bEdit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEdit3ActionPerformed(evt,tblAccount1.getSelectedRow());
            }
        });

        bDelete3.setText("삭제");
        bDelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDelete3ActionPerformed(evt,tblAccount1.getSelectedRow());
            }
        });

        javax.swing.GroupLayout BPane3Layout = new javax.swing.GroupLayout(BPane3);
        BPane3.setLayout(BPane3Layout);
        BPane3Layout.setHorizontalGroup(
            BPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bAdd2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEdit3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDelete3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGap(24, 24, 24))
        );
        BPane3Layout.setVerticalGroup(
            BPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BPane3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(BPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdd2)
                    .addComponent(bEdit3)
                    .addComponent(bDelete3)
        )));

        javax.swing.GroupLayout paneAccountsLayout = new javax.swing.GroupLayout(paneAccounts);
        paneAccounts.setLayout(paneAccountsLayout);
        paneAccountsLayout.setHorizontalGroup(
            paneAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneAccountsLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(paneAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneAccountsLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfId1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfName1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfContact1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneAccountsLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCharge1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfUse1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        paneAccountsLayout.setVerticalGroup(
            paneAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneAccountsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(paneAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tfName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tfContact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfCharge1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tfUse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
        );

        jTabbedPane1.addTab("회원목록", paneAccounts);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        tblAccount2.setModel(new AccountTableModel(new ArrayList<Account>()));
        jScrollPane5.setViewportView(tblAccount2);
        
        tblAccount2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tblAccount2.rowAtPoint(evt.getPoint());
                int col = tblAccount2.columnAtPoint(evt.getPoint());
                tfId2.setText(accounts.get(row).getId());
                tfName2.setText(accounts.get(row).getName());
                tfContack2.setText(Integer.toString(accounts.get(row).getContact()));
                tfCharge2.setText(Integer.toString(accounts.get(row).getCharge()));
                tfUse2.setText(Integer.toString(accounts.get(row).getUse()));
            }
        });

        BPane4.setPreferredSize(new java.awt.Dimension(263, 39));

        bEdit4.setText("수정");
        bEdit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEdit4ActionPerformed(evt,tblAccount2.getSelectedRow());
            }
        });

        bDelete4.setText("삭제");
        bDelete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDelete4ActionPerformed(evt,tblAccount2.getSelectedRow());
            }
        });

        javax.swing.GroupLayout BPane4Layout = new javax.swing.GroupLayout(BPane4);
        BPane4.setLayout(BPane4Layout);
        BPane4Layout.setHorizontalGroup(
            BPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bEdit4)
                .addGap(26, 26, 26)
                .addComponent(bDelete4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addContainerGap())
        );
        BPane4Layout.setVerticalGroup(
            BPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEdit4)
                    .addComponent(bDelete4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("회원이름 :");

        bSearch2.setText("검색");
        bSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearch2ActionPerformed(evt);
            }
        });

        jLabel15.setText("ID :");


        jLabel16.setText("이름 :");

        jLabel17.setText("연락처 :");


        jLabel18.setText("연체료 :");

        
        jLabel19.setText("이용횟수 :");

        
        javax.swing.GroupLayout paneSearchAccountLayout = new javax.swing.GroupLayout(paneSearchAccount);
        paneSearchAccount.setLayout(paneSearchAccountLayout);
        paneSearchAccountLayout.setHorizontalGroup(
            paneSearchAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneSearchAccountLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(paneSearchAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneSearchAccountLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfCharge2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfUse2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneSearchAccountLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfId2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfName2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfContack2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneSearchAccountLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSearchAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSearch2))
                    .addComponent(BPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        paneSearchAccountLayout.setVerticalGroup(
            paneSearchAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneSearchAccountLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(paneSearchAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSearchAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(bSearch2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(paneSearchAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tfId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(tfName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(tfContack2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneSearchAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tfCharge2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(tfUse2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("회원검색", paneSearchAccount);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        tblLentBook.setModel(new BookTableModel(new ArrayList<Book>()));
        jScrollPane4.setViewportView(tblLentBook);
        
        tblLentBook.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tblLentBook.rowAtPoint(evt.getPoint());
                int col = tblLentBook.columnAtPoint(evt.getPoint());
                tfCode3.setText(lentlist.get(row).getCode());
                tfId3.setText(lentlist.get(row).getId());
                tfAday.setText(lentlist.get(row).getAday());
                tfBday.setText(lentlist.get(row).getBday());
            }
        });

       
        bEdit5.setText("수정");
        bEdit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEdit5ActionPerformed(evt,tblLentBook.getSelectedRow());
            }
        });

        bDelete5.setText("반납");
        bDelete5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDelete5ActionPerformed(evt,tblLentBook.getSelectedRow());
            }
        });

        bLoad3.setText("불러오기");
        bLoad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoad3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BPane5Layout = new javax.swing.GroupLayout(BPane5);
        BPane5.setLayout(BPane5Layout);
        BPane5Layout.setHorizontalGroup(
            BPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEdit5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDelete5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(bLoad3)
                .addContainerGap())
        );
        BPane5Layout.setVerticalGroup(
            BPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEdit5)
                    .addComponent(bDelete5)
                    .addComponent(bLoad3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setText("코드 :");


        jLabel21.setText("회원 ID :");

        jLabel22.setText("대여일 :");
        
        jLabel23.setText("반납일 :");

        

        javax.swing.GroupLayout paneLentBookLayout = new javax.swing.GroupLayout(paneLentBook);
        paneLentBook.setLayout(paneLentBookLayout);
        paneLentBookLayout.setHorizontalGroup(
            paneLentBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLentBookLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(paneLentBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneLentBookLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCode3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfId3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneLentBookLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAday, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfBday, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        paneLentBookLayout.setVerticalGroup(
            paneLentBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLentBookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(paneLentBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tfCode3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(tfId3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneLentBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tfAday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(tfBday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("대여중인 도서", paneLentBook);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        tblLentBook2.setModel(new LentbookTableModel(new ArrayList<Lentbook>()));
        jScrollPane3.setViewportView(tblLentBook2);
        
        tblLentBook2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tblLentBook2.rowAtPoint(evt.getPoint());
                int col = tblLentBook2.columnAtPoint(evt.getPoint());
                tfCode4.setText(lentlist.get(row).getCode());
                tfId4.setText(lentlist.get(row).getId());
                tfAday2.setText(lentlist.get(row).getAday());
                tfBday2.setText(lentlist.get(row).getBday());
            }
        });


        
        jLabel14.setText("코드 :");

        tfCode4.setPreferredSize(new java.awt.Dimension(76, 24));
        

        jLabel30.setText("회원 ID :");

        jLabel31.setText("대여일 :");

        jLabel32.setText("반납일 :");

        bAdd4.setText("대여");
        bAdd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdd4ActionPerformed(evt);
            }
        });

        bEdit6.setText("수정");
        bEdit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEdit6ActionPerformed(evt,tblLentBook2.getSelectedRow());
            }
        });

        bDelete6.setText("삭제");
        bDelete6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDelete6ActionPerformed(evt,tblLentBook2.getSelectedRow());
            }
        });
        
        javax.swing.GroupLayout BPane6Layout = new javax.swing.GroupLayout(BPane6);
        BPane6.setLayout(BPane6Layout);
        BPane6Layout.setHorizontalGroup(
            BPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bAdd4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEdit6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDelete6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addContainerGap())
        );
        BPane6Layout.setVerticalGroup(
            BPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdd4)
                    .addComponent(bEdit6)
                    .addComponent(bDelete6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout paneLentLayout = new javax.swing.GroupLayout(paneLent);
        paneLent.setLayout(paneLentLayout);
        paneLentLayout.setHorizontalGroup(
            paneLentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLentLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(paneLentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneLentLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAday2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfBday2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneLentLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCode4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfId4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        paneLentLayout.setVerticalGroup(
            paneLentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(paneLentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tfCode4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(tfId4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneLentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(tfAday2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(tfBday2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("대여", paneLent);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.PAGE_START);
        Load();
        pack();
        addWindowListener(new WindowAdapter(){   
            public void windowClosing(WindowEvent e){
               try{   
                  FileOutputStream fout = null;
  				ObjectOutputStream oos = null;

  				try {
  					
  					fout = new FileOutputStream("booklist.dat");
  		            oos = new ObjectOutputStream(fout);
  		            
  					oos.writeObject(books);
  		            oos.reset();

  				} catch (Exception ex) {
  					System.out.println(ex.getMessage());
  				} finally {
  					try {
  						oos.close();
  						fout.close();
  					} catch (IOException ioe) {
  					}
  				}
  				try {
					
					fout = new FileOutputStream("Accountlist.dat");
		            oos = new ObjectOutputStream(fout);
		            
					oos.writeObject(accounts);
		            oos.reset();

				} catch (Exception el) {
					System.out.println(el.getMessage());
				} finally {
					try {
						oos.close();
						fout.close();
					} catch (IOException ioe) {
					}
				}
  				try {
					
					fout = new FileOutputStream("rentallist.dat");
		            oos = new ObjectOutputStream(fout);
		            
					oos.writeObject(lentlist);
		            oos.reset();

				} catch (Exception ek) {
					System.out.println(ek.getMessage());
				} finally {
					try {
						oos.close();
						fout.close();
					} catch (IOException ioe) {
					}
				}
				tblLentBook2.setModel(new LentbookTableModel(lentlist));
				tblAccount1.setModel(new AccountTableModel(accounts));
  				tblBook1.setModel(new BookTableModel(books));

               }catch(Exception ex){}   
               JOptionPane.showMessageDialog(null, "종료합니다", "종료경고", JOptionPane.WARNING_MESSAGE);//팝업창 처리   
               System.exit(0);   
            }
         });
    }                        

    private void bAdd1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
		String code = tfCode1.getText();
    	String title = tfTitle1.getText();
		String author = tfAuthor1.getText();
		String genre = tfGenre1.getText();
		String state = tfState1.getText();
		String publisher = tfPub1.getText();
		if (!duplicated(code)) {
			if(empty_field(code) || empty_field(title) || empty_field(author) || empty_field(genre) || empty_field(tfState1.getText()) || empty_field(publisher))
			{		
				JOptionPane.showMessageDialog(new JFrame(), "정보를 입력해 주세요.");
			}
			else books.add(new Book(code, genre, title, author, publisher, state));
			
		}
		else 
		{
			JOptionPane.showMessageDialog(new JFrame(), "이미 있는 코드입니다.");
		}
		tblBook1.setModel(new BookTableModel(books));
		//tfCode1.setText("");
		//tfGenre1.setText("");
		//tfTitle1.setText("");
		//tfAuthor1.setText("");
		//tfPub1.setText("");
		//tfState1.setText("");
	}

	public boolean empty_field(String value)
	{
		boolean returnV = false;
		if(value.equals(""))
			returnV = true;
		else 
			returnV = false;
		return returnV;
	}
	public boolean duplicated(String code) {
		boolean returnV = false;
		for (int i = 0; i < books.size(); i++) {
			if (code.equals(books.get(i).getCode()))
				return returnV = true;
			else
				returnV = false;
		}

		return returnV;
   }                                     

   private void bSearch1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	//회원검색
    	String title = tfSearchBook.getText();
    	ArrayList<Book> temp = new ArrayList<Book>();
    	for(int i =0;i<books.size();i++){
    		if(books.get(i).getTitle().indexOf(title)!=-1){
    			temp.add(books.get(i));
    		}
    	}
    	tblBook2.setModel(new BookTableModel(temp));    	
   }                                        

    private void bAdd2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
    	String id = tfId1.getText();
    	String name = tfName1.getText();
		int contact = Integer.parseInt(tfContact1.getText());
		int charge = Integer.parseInt(tfCharge1.getText());
		int use = Integer.parseInt(tfUse1.getText());
		if (!duplicated2(id)) {
			if(empty_field2(id) || empty_field2(name) || empty_field2(tfContact1.getText()) || empty_field2(tfCharge1.getText()) || empty_field2(tfUse1.getText()))
			{		
				JOptionPane.showMessageDialog(new JFrame(), "정보를 입력해 주세요.");
			}
			else accounts.add(new Account(id, name, contact, charge, use));
		}
		else 
		{
			JOptionPane.showMessageDialog(new JFrame(), "이미 있는 ID입니다.");
		}
		tblAccount1.setModel(new AccountTableModel(accounts));
		//tfId1.setText("");
		//tfName.setText("");
		//tfContact1.setText("");
		//tfCharge1.setText("");
		//tfUse1.setText("");
	}

	public boolean empty_field2(String value)
	{
		boolean returnV = false;
		if(value.equals(""))
			returnV = true;
		else 
			returnV = false;
		return returnV;
	}
	public boolean duplicated2(String id) {
		boolean returnV = false;
		for (int i = 0; i < accounts.size(); i++) {
			if (id.equals(accounts.get(i).getId()))
				return returnV = true;
			else
				returnV = false;
		}

		return returnV;
	}                                     

    private void bEdit2ActionPerformed(java.awt.event.ActionEvent evt, int index) {                                       
        // TODO add your handling code here:
    	books.remove(index);
		String code = tfCode2.getText();
		String title = tfTitle2.getText();
		String author = tfAuthor2.getText();
		String genre = tfGenre2.getText();
		String state = tfState2.getText();
		String publisher = tfPub2.getText();
		books.add(index,new Book(code, genre, title, author, publisher, state));
		tblBook2.setModel(new BookTableModel(books));
		tfCode2.setText("");
		tfGenre2.setText("");
		tfTitle2.setText("");
		tfAuthor2.setText("");
		tfPub2.setText("");
		tfState2.setText("");
    }                                      


    private void bAdd4ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    	String code = tfCode4.getText();
    	String id = tfId4.getText();
    	String aday = tfAday2.getText();
    	String bday = tfBday2.getText();
		if (!duplicated3(code)) {
			if(empty_field(code) || empty_field(id) || empty_field(tfAday2.getText()) || empty_field(tfBday2.getText()))
			{		
				JOptionPane.showMessageDialog(new JFrame(), "정보를 입력해 주세요.");
			}
			else lentlist.add(new Lentbook(code, id, aday, bday));
		}
		else 
		{
			JOptionPane.showMessageDialog(new JFrame(), "이미 대여중인 책입니다.");
		}
		
		for(int i = 0; i <books.size(); i++){
			if(books.get(i).getCode().equals(code)){
				books.get(i).setState("대여중");
			}
		}
		for(int i = 0;i <accounts.size(); i++){
			if(accounts.get(i).getId().equals(id)){
				int use = accounts.get(i).getUse();
				accounts.get(i).setUse(++use);//사용횟수 증가 차후 우수고객 설정에 할당
			}
		}
		tblLentBook2.setModel(new LentbookTableModel(lentlist));
		//tfCode4.setText("");
		//tfId4.setText("");
		//tfAday2.setText("");
		//tfBday2.setText("");
		
		
	}

	public boolean empty_field3(String value)
	{
		boolean returnV = false;
		if(value.equals(""))
			returnV = true;
		else 
			returnV = false;
		return returnV;
	}
	public boolean duplicated3(String code) {
		boolean returnV = false;
		for (int i = 0; i < lentlist.size(); i++) {
			if (code.equals(lentlist.get(i).getCode()))
				return returnV = true;
			else
				returnV = false;
		}

		return returnV;

    }                                     

    private void bEdit1ActionPerformed(java.awt.event.ActionEvent evt,int index) {                                       
    	books.remove(index);
		String code = tfCode1.getText();
		String title = tfTitle1.getText();
		String author = tfAuthor1.getText();
		String genre = tfGenre1.getText();
		String state = tfState1.getText();
		String publisher = tfPub1.getText();
		books.add(index,new Book(code, genre, title, author, publisher, state));
		tblBook1.setModel(new BookTableModel(books));
		tfCode1.setText("");
		tfGenre1.setText("");
		tfTitle1.setText("");
		tfAuthor1.setText("");
		tfPub1.setText("");
		tfState1.setText("");
    }                                      

    private void bDelete1ActionPerformed(java.awt.event.ActionEvent evt,int index) {                                         
        // TODO add your handling code here:
    	books.remove(index);
		tblBook2.setModel(new BookTableModel(books));
		tfCode2.setText("");
		tfGenre2.setText("");
		tfTitle2.setText("");
		tfAuthor2.setText("");
		tfPub2.setText("");
		tfState2.setText("");
    	
    }                                        


    private void bDelete2ActionPerformed(java.awt.event.ActionEvent evt , int index) {                                         
        // TODO add your handling code here:
    	books.remove(index);
		tblBook1.setModel(new BookTableModel(books));
		tfCode1.setText("");
		tfGenre1.setText("");
		tfTitle1.setText("");
		tfAuthor1.setText("");
		tfPub1.setText("");
		tfState1.setText("");
    }                                        


    private void bEdit3ActionPerformed(java.awt.event.ActionEvent evt, int index) {                                       
        // TODO add your handling code here:
    	accounts.remove(index);
    	String id = tfId1.getText();
    	String name = tfName1.getText();
		int contact = Integer.parseInt(tfContact1.getText());
		int charge = Integer.parseInt(tfCharge1.getText());
		int use = Integer.parseInt(tfUse1.getText());
		accounts.add(index,new Account(id, name, contact, charge, use));
		tblAccount1.setModel(new AccountTableModel(accounts));
		tfId1.setText("");
		tfName1.setText("");
		tfContact1.setText("");
		tfCharge1.setText("");
		tfUse1.setText("");
    }                                      

    private void bDelete3ActionPerformed(java.awt.event.ActionEvent evt,int index) {                                         
        // TODO add your handling code here:
    	accounts.remove(index);
		tblAccount1.setModel(new AccountTableModel(accounts));
		tfId1.setText("");
		tfName1.setText("");
		tfContact1.setText("");
		tfCharge1.setText("");
		tfUse1.setText("");
    }                                        

    private void bSearch2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	//회원찾기
    	String name = tfSearchAccount.getText();
    	ArrayList<Account> temp = new ArrayList<Account>();
    	for(int i =0;i<accounts.size();i++){
    		if(accounts.get(i).getName().indexOf(name)!=-1){
    			temp.add(accounts.get(i));
    		}
    	}
    	tblAccount2.setModel(new AccountTableModel(temp));
    	
    }                                        

    private void bEdit4ActionPerformed(java.awt.event.ActionEvent evt, int index) {                                       
        // TODO add your handling code here:
    	accounts.remove(index);
    	String id = tfId2.getText();
    	String name = tfName2.getText();
		int contact = Integer.parseInt(tfContack2.getText());
		int charge = Integer.parseInt(tfCharge2.getText());
		int use = Integer.parseInt(tfUse2.getText());
		accounts.add(index,new Account(id, name, contact, charge, use));
		tblAccount2.setModel(new AccountTableModel(accounts));
		tfId2.setText("");
		tfName2.setText("");
		tfContack2.setText("");
		tfCharge2.setText("");
		tfUse2.setText("");
    }                                      

    private void bDelete4ActionPerformed(java.awt.event.ActionEvent evt,int index) {                                         
        // TODO add your handling code here:
    	accounts.remove(index);
		tblAccount2.setModel(new AccountTableModel(accounts));
		tfId2.setText("");
		tfName2.setText("");
		tfContack2.setText("");
		tfCharge2.setText("");
		tfUse2.setText("");
    }                                        

    private void bEdit5ActionPerformed(java.awt.event.ActionEvent evt, int index) {                                       
        // TODO add your handling code here:
    	lentlist.remove(index);
    	String code = tfCode3.getText();
    	String id = tfId3.getText();
    	String aday = tfAday.getText();
    	String bday = tfBday.getText();
		lentlist.add(index,new Lentbook(code, id, aday, bday));
		tblLentBook.setModel(new LentbookTableModel(lentlist));
		tfCode3.setText("");
		tfId3.setText("");
		tfAday.setText("");
		tfBday.setText("");

    }                                      
    
    public static int diffOfDate(String begin, String end)
	  {
	    SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

	    
	    Date beginDate = null;
	    Date endDate = null;
		try {
			endDate = format.parse(end);
			beginDate = format.parse(begin);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	    int diff = (int) (endDate.getTime() - beginDate.getTime());
	    int diffDays = diff / (24 * 60 * 60 * 1000);

	    return diffDays;
	  }


    private void bDelete5ActionPerformed(java.awt.event.ActionEvent evt, int index){                                         
        // TODO add your handling code here:
    	String inDate   = new java.text.SimpleDateFormat("yyyyMMdd").format(new java.util.Date());//현재시간
		String code = tfCode3.getText();
		String id = tfId3.getText();
		for(int i = 0;i <books.size(); i++){
			if(books.get(i).getCode().equals(code)){
				books.get(i).setState("대여가능");
			}
		}
		for(int i=0;i<accounts.size();i++){
			if(accounts.get(i).getId().equals(id)){
				for(int j =0;j<lentlist.size();j++){
					if(lentlist.get(j).getId().equals(id)){
						if(diffOfDate(lentlist.get(j).getBday(), inDate) >0 ){
							try {
								int fee= (diffOfDate(lentlist.get(j).getBday(), inDate)*300);
								int s = accounts.get(i).getCharge();
								accounts.get(i).setCharge(s + fee);//연체료 부과
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
						lentlist.remove(index);
						tblLentBook.setModel(new LentbookTableModel(lentlist));
						tfCode3.setText("");
						tfId3.setText("");
						tfAday.setText("");
						tfBday.setText("");
					}
				}
							
			}
		}
    }                                        

    private void bLoad3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    	SwingWorker worker = new SwingWorker() {

			@Override
			protected Object doInBackground() throws Exception {
				
				FileInputStream fin = null;
				ObjectInputStream ois = null;

				try {
					fin = new FileInputStream("rentallist.dat");
					ois = new ObjectInputStream(fin);
					ArrayList list1 = (ArrayList) ois.readObject();
					for (int i = 0; i < list1.size(); i++)
						lentlist.add((Lentbook) list1.get(i));

				} catch (Exception e) {
					System.out.println(e.getMessage());
				} finally {
					try {
						ois.close();
						fin.close();
					} catch (IOException ioe) {
					}
				}
				tblLentBook.setModel(new LentbookTableModel(lentlist));
				return null;
			}
		};
		worker.execute();

    }                                      

    private void bEdit6ActionPerformed(java.awt.event.ActionEvent evt, int index) {                                       
        // TODO add your handling code here:
    	lentlist.remove(index);
    	String code = tfCode4.getText();
    	String id = tfId4.getText();
    	String aday = tfAday2.getText();
    	String bday = tfBday2.getText();
		lentlist.add(index,new Lentbook(code, id, aday, bday));
		tblLentBook2.setModel(new LentbookTableModel(lentlist));
		tfCode4.setText("");
		tfId4.setText("");
		tfAday2.setText("");
		tfBday2.setText("");

    }                                      

    private void bDelete6ActionPerformed(java.awt.event.ActionEvent evt,int index){                                         
        // TODO add your handling code here:
    	long time = System.currentTimeMillis(); 
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyyMMdd");
		String str = dayTime.format(new Date(time));

    	lentlist.remove(index);
		tblLentBook2.setModel(new LentbookTableModel(lentlist));
		tfCode4.setText("");
		tfId4.setText("");
		tfAday2.setText("");
		tfBday2.setText("");
		String code = tfCode4.getText();
		String id = tfId4.getText();
		for(int i = 0;i <books.size(); i++){
			if(books.get(i).getCode().equals(code)){
				books.get(i).setState("대여가능");
			}
			break;
		}
		for(int i=0;i<lentlist.size();i++){
			if(accounts.get(i).getId().equals(id)){
				try {
					SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
					Date beginDate = (Date) formatter.parse(lentlist.get(i).getBday());
					Date endDate = (Date) formatter.parse(str);
					long diff = endDate.getTime() - beginDate.getTime();
					long diffDays = diff / (24 * 60 * 60 * 1000);
					accounts.get(i).setCharge((int) (diffDays*300));
				} catch (ParseException e) {
					e.printStackTrace();
				}				
			}
			else
				break;
		}
		
		
    }
    	    
    public void Load(){
    	FileInputStream fin = null;
		ObjectInputStream ois = null;

		try {
			fin = new FileInputStream("booklist.dat");
			ois = new ObjectInputStream(fin);
			ArrayList list3 = (ArrayList) ois.readObject();
			for (int i = 0; i < list3.size(); i++)
				books.add((Book) list3.get(i));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				ois.close();
				fin.close();
			} catch (IOException ioe) {
			}
		}
		try {
			fin = new FileInputStream("Accountlist.dat");
			ois = new ObjectInputStream(fin);
			ArrayList list2 = (ArrayList) ois.readObject();
			for (int i = 0; i < list2.size(); i++)
				accounts.add((Account) list2.get(i));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				ois.close();
				fin.close();
			} catch (IOException ioe) {
			}
		}
		try {
			fin = new FileInputStream("rentallist.dat");
			ois = new ObjectInputStream(fin);
			ArrayList list1 = (ArrayList) ois.readObject();
			for (int i = 0; i < list1.size(); i++)
				lentlist.add((Lentbook) list1.get(i));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				ois.close();
				fin.close();
			} catch (IOException ioe) {
			}
		}
		tblLentBook.setModel(new LentbookTableModel(lentlist));
		tblAccount1.setModel(new AccountTableModel(accounts));
		tblBook1.setModel(new BookTableModel(books));
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookManager().setVisible(true);
            }
        });
    }

                    
    private javax.swing.JPanel BPane1;
    private javax.swing.JPanel BPane2;
    private javax.swing.JPanel BPane3;
    private javax.swing.JPanel BPane4;
    private javax.swing.JPanel BPane5;
    private javax.swing.JPanel BPane6;
    private javax.swing.JButton bAdd1;
    private javax.swing.JButton bAdd2;
    private javax.swing.JButton bAdd4;
    private javax.swing.JButton bDelete1;
    private javax.swing.JButton bDelete2;
    private javax.swing.JButton bDelete3;
    private javax.swing.JButton bDelete4;
    private javax.swing.JButton bDelete5;
    private javax.swing.JButton bDelete6;
    private javax.swing.JButton bEdit1;
    private javax.swing.JButton bEdit2;
    private javax.swing.JButton bEdit3;
    private javax.swing.JButton bEdit4;
    private javax.swing.JButton bEdit5;
    private javax.swing.JButton bEdit6;
    private javax.swing.JButton bLoad1;
    private javax.swing.JButton bLoad2;
    private javax.swing.JButton bLoad3;
    private javax.swing.JButton bLoad4;
    private javax.swing.JButton bSave1;
    private javax.swing.JButton bSave2;
    private javax.swing.JButton bSave3;
    private javax.swing.JButton bSave4;
    private javax.swing.JButton bSave5;
    private javax.swing.JButton bSave6;
    private javax.swing.JButton bSearch1;
    private javax.swing.JButton bSearch2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel paneAccounts;
    private javax.swing.JPanel paneBooks;
    private javax.swing.JPanel paneLent;
    private javax.swing.JPanel paneLentBook;
    private javax.swing.JPanel paneSearchAccount;
    private javax.swing.JPanel paneSearchBook;
    private javax.swing.JTable tblAccount1;
    private javax.swing.JTable tblAccount2;
    private javax.swing.JTable tblBook1;
    private javax.swing.JTable tblBook2;
    private javax.swing.JTable tblLentBook;
    private javax.swing.JTable tblLentBook2;
    private javax.swing.JTextField tfAday;
    private javax.swing.JTextField tfAday2;
    private javax.swing.JTextField tfAuthor1;
    private javax.swing.JTextField tfAuthor2;
    private javax.swing.JTextField tfBday;
    private javax.swing.JTextField tfBday2;
    private javax.swing.JTextField tfCharge1;
    private javax.swing.JTextField tfCharge2;
    private javax.swing.JTextField tfCode1;
    private javax.swing.JTextField tfCode2;
    private javax.swing.JTextField tfCode3;
    private javax.swing.JTextField tfCode4;
    private javax.swing.JTextField tfContack2;
    private javax.swing.JTextField tfContact1;
    private javax.swing.JTextField tfGenre1;
    private javax.swing.JTextField tfGenre2;
    private javax.swing.JTextField tfId1;
    private javax.swing.JTextField tfId2;
    private javax.swing.JTextField tfId3;
    private javax.swing.JTextField tfId4;
    private javax.swing.JTextField tfName1;
    private javax.swing.JTextField tfName2;
    private javax.swing.JTextField tfPub1;
    private javax.swing.JTextField tfPub2;
    private javax.swing.JTextField tfSearchAccount;
    private javax.swing.JTextField tfSearchBook;
    private javax.swing.JTextField tfState1;
    private javax.swing.JTextField tfState2;
    private javax.swing.JTextField tfTitle1;
    private javax.swing.JTextField tfTitle2;
    private javax.swing.JTextField tfUse1;
    private javax.swing.JTextField tfUse2;
                   
}
