/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatLightLaf;
import controller.DrawChart;
import controller.ReadFile;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.CharConversionException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartMouseEvent;
import org.jfree.chart.ChartMouseListener;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.ChartEntity;
import org.jfree.chart.entity.XYItemEntity;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author kanku
 */
public class App extends javax.swing.JFrame {

    int count = 0;
    public Boolean isCheck = false;
    ReadFile f;
    public static String fileSave="txt";
    
    DrawChart newchart;

    ChartPanel chartForm;
    String item;

    XYPlot plot;
    boolean checkGridView = true;

    public App() {
        initComponents();
        FlatLightLaf.setup();
        f = new ReadFile();
        newchart = new DrawChart();
        this.pack();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fePointLight1 = new com.kitfox.svg.FePointLight();
        ContainPane = new javax.swing.JPanel();
        chartPn = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        OptionBox = new javax.swing.JComboBox<>();
        btnOneInOne = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        JMenu = new javax.swing.JMenu();
        onGrid = new javax.swing.JMenuItem();
        offGrid = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        changeXLabel = new javax.swing.JMenuItem();
        changeYLabel = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 255, 204));

        jLabel1.setBackground(new java.awt.Color(102, 51, 255));
        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Đồ thị sóng địa chấn");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout chartPnLayout = new javax.swing.GroupLayout(chartPn);
        chartPn.setLayout(chartPnLayout);
        chartPnLayout.setHorizontalGroup(
            chartPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        chartPnLayout.setVerticalGroup(
            chartPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jTable1.setFont(new java.awt.Font("JetBrains Mono NL", 1, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jPanel3.add(jScrollPane1);

        kGradientPanel3.setkEndColor(new java.awt.Color(204, 51, 255));
        kGradientPanel3.setkStartColor(new java.awt.Color(51, 0, 204));

        jButton1.setFont(new java.awt.Font("JetBrains Mono", 3, 14)); // NOI18N
        jButton1.setText("DrawChart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jButton2.setText("Multi Chart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        OptionBox.setFont(new java.awt.Font("JetBrains Mono", 3, 14)); // NOI18N
        OptionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option" }));
        OptionBox.setOpaque(true);
        OptionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionBoxActionPerformed(evt);
            }
        });

        btnOneInOne.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        btnOneInOne.setText("All In One");
        btnOneInOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneInOneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(OptionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOneInOne, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OptionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOneInOne, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ContainPaneLayout = new javax.swing.GroupLayout(ContainPane);
        ContainPane.setLayout(ContainPaneLayout);
        ContainPaneLayout.setHorizontalGroup(
            ContainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainPaneLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(ContainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ContainPaneLayout.createSequentialGroup()
                        .addComponent(chartPn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ContainPaneLayout.setVerticalGroup(
            ContainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ContainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chartPn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(ContainPane, java.awt.BorderLayout.CENTER);

        MenuBar.setToolTipText("");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icon/folder.png"))); // NOI18N
        jMenu1.setText("File");

        jMenuItem1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jMenuItem1.setText("Open File");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        MenuBar.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icon/zoomIn.png"))); // NOI18N
        jMenu2.setText("Zoom in");

        jMenuItem2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jMenuItem2.setText("ZoomX");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jMenuItem3.setText("ZoomY");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        MenuBar.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icon/zoom-out (1).png"))); // NOI18N
        jMenu3.setText("Zoom out");

        jMenuItem4.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jMenuItem4.setText("ZoomX");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jMenuItem5.setText("ZoomY");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        MenuBar.add(jMenu3);

        JMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icon/gridview.png"))); // NOI18N
        JMenu.setText("Grid view");

        onGrid.setBackground(new java.awt.Color(0, 255, 51));
        onGrid.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        onGrid.setText("On");
        onGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onGridActionPerformed(evt);
            }
        });
        JMenu.add(onGrid);

        offGrid.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        offGrid.setText("Off");
        offGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offGridActionPerformed(evt);
            }
        });
        JMenu.add(offGrid);

        MenuBar.add(JMenu);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icon/axis.png"))); // NOI18N
        jMenu4.setText("Change label");

        changeXLabel.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        changeXLabel.setText("X-axis");
        changeXLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeXLabelActionPerformed(evt);
            }
        });
        jMenu4.add(changeXLabel);

        changeYLabel.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        changeYLabel.setText("Y-axis");
        changeYLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeYLabelActionPerformed(evt);
            }
        });
        jMenu4.add(changeYLabel);

        MenuBar.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icon/target.png"))); // NOI18N
        jMenu5.setText("GInput");

        jMenuItem6.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jMenuItem6.setText("On");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jMenuItem7.setText("Off");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        MenuBar.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icon/wheel.png"))); // NOI18N
        jMenu6.setText("Chart Color");
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });

        jMenuItem8.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jMenuItem8.setText("ChooseColor");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        MenuBar.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icon/google-maps.png"))); // NOI18N
        jMenu7.setText("Map");

        jMenuItem9.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jMenuItem9.setText("Open map");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem9);

        MenuBar.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Asset/icon/settings.png"))); // NOI18N
        jMenu8.setText("Setting");

        jMenuItem10.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jMenuItem10.setText("File save");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem10);

        MenuBar.add(jMenu8);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        f.getFile();
        f.openFile();
        if (count != 0) {
            for (int k = OptionBox.getItemCount() - 1; k > 0; k--) {
                OptionBox.removeItemAt(k);
            }
        }
        for (int i = 1; i < f.obj.size(); i++) {
            OptionBox.addItem(
                    f.obj.get(i).getNameY());
        }
        viewTable();
        count++;
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (item != null) {
            chartPn.removeAll();
            chartPn.setLayout(new java.awt.BorderLayout());
            //createChartPanel(item);

            newchart.createChartPanel(item, f);
            chartForm = new ChartPanel(newchart.getChart());

            chartPn.add(chartForm, BorderLayout.CENTER);
            chartPn.validate();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        chartForm.zoomOutDomain(0.05, 0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        chartForm.zoomOutRange(0, 0.05);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        chartForm.zoomInDomain(0.05, 0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        chartForm.zoomInRange(0, 0.01);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void offGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offGridActionPerformed
        // TODO add your handling code here:
        chartPn.removeAll();

        plot = newchart.getChart().getXYPlot();
        plot.setDomainGridlinesVisible(false);
        plot.setRangeGridlinesVisible(false);

        onGrid.setOpaque(true);
        onGrid.setBackground(Color.white);
        offGrid.setBackground(Color.green);
        offGrid.setOpaque(true);

        chartForm = new ChartPanel(newchart.getChart());
        chartPn.add(chartForm, BorderLayout.CENTER);
        chartPn.validate();
        checkGridView = false;

        System.out.println("Tat");


    }//GEN-LAST:event_offGridActionPerformed

    private void onGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onGridActionPerformed
        // TODO add your handling code here:
        chartPn.removeAll();

        plot = newchart.getChart().getXYPlot();
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);

        onGrid.setOpaque(true);
        onGrid.setBackground(Color.green);
        offGrid.setBackground(Color.white);
        offGrid.setOpaque(true);

        chartForm = new ChartPanel(newchart.getChart());
        chartPn.add(chartForm, BorderLayout.CENTER);
        chartPn.validate();
        checkGridView = true;
        System.out.println("Bat");
    }//GEN-LAST:event_onGridActionPerformed

    private void changeXLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeXLabelActionPerformed
        // TODO add your handling code here:
        newchart.setxLabel(JOptionPane.showInputDialog("nhap gia tri x can thay doi"));
        chartPn.removeAll();
        newchart.editChart(newchart.getxLabel(), newchart.getyLabel());

        chartForm = new ChartPanel(newchart.getChart());
        chartPn.add(chartForm, BorderLayout.CENTER);
        chartPn.validate();

    }//GEN-LAST:event_changeXLabelActionPerformed

    private void changeYLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeYLabelActionPerformed
        // TODO add your handling code here:
        newchart.setyLabel(JOptionPane.showInputDialog("nhap gia tri y can thay doi"));
        newchart.editChart(newchart.getxLabel(), newchart.getyLabel());

        chartForm = new ChartPanel(newchart.getChart());
        chartPn.add(chartForm, BorderLayout.CENTER);
        chartPn.validate();

    }//GEN-LAST:event_changeYLabelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        chartPn.removeAll();
        chartPn.setLayout(new java.awt.FlowLayout());
        chartPn.setPreferredSize(new java.awt.Dimension(ContainPane.getWidth() / 2, chartPn.getHeight()));
        chartPn.setSize(ContainPane.getWidth() / 2, ContainPane.getHeight());

        ChartPanel[] allChart = new ChartPanel[4];
        for (int i = 0; i < f.obj.size() - 1; i++) {
            newchart.createChartPanel(f.obj.get(i + 1).getNameY(), f);
            //createChartPanel(f.obj.get(i+1).getNameY());
            chartForm = new ChartPanel(newchart.getChart());
            //chartForm.setPreferredSize(new java.awt.Dimension(chartPn.getWidth(), chartPn.getHeight() / (f.obj.size() - 1)));
            chartForm.setSize(chartPn.getWidth(), chartPn.getHeight() / (f.obj.size() - 1));
            allChart[i] = chartForm;
            System.out.println(i);
        }

        for (int i = 0; i < f.obj.size() - 1; i++) {
            allChart[i].setPreferredSize(new java.awt.Dimension(chartPn.getWidth(), chartPn.getHeight() / (f.obj.size() - 1) - 5));
            allChart[i].setSize(chartPn.getWidth(), chartPn.getHeight() / (f.obj.size() - 1) - 5);
            chartPn.add(allChart[i]);
        }

        chartPn.validate();

        rootPane.validate();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void OptionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionBoxActionPerformed
        // TODO add your handling code here:
        item = OptionBox.getSelectedItem().toString();
    }//GEN-LAST:event_OptionBoxActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        try {
            // TODO add your handling code here:
            newchart.createFile(fileSave);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            newchart.gInput(chartForm,fileSave);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        newchart.removeGInput(chartForm);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        chartPn.removeAll();
        Color initialcolor = Color.RED;
        XYPlot get = newchart.getChart().getXYPlot();
        int n = newchart.getDataset().getSeries().size();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        for (int i = 0; i < n; i++) {
            Color color = JColorChooser.showDialog(this, "Select a color", initialcolor);
            renderer.setSeriesPaint(i, color);
            renderer.setSeriesStroke(i, new BasicStroke(4.0f));
//            newchart.getChart().getXYPlot().getRenderer().setSeriesPaint(0, color);
//            newchart.getChart().getXYPlot().getRenderer().setSeriesPaint(1, color);
            newchart.getChart().getXYPlot().setRenderer(i,renderer);
            chartForm = new ChartPanel(newchart.getChart());
            chartPn.add(chartForm, BorderLayout.CENTER);
            chartPn.validate();
        }


    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        Map p = new Map();
        p.setVisible(true);

    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void btnOneInOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneInOneActionPerformed
        // TODO add your handling code here:
        chartPn.removeAll();
        chartPn.setLayout(new java.awt.BorderLayout());
        //createChartPanel(item);

        newchart.createAllChart(f);
        chartForm = new ChartPanel(newchart.getChart());

        chartPn.add(chartForm, BorderLayout.CENTER);
        chartPn.validate();
    }//GEN-LAST:event_btnOneInOneActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        Setting s = new Setting();
        s.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    public void viewTable() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        dtm.setColumnCount(0);
        DefaultTableModel mode = (DefaultTableModel) jTable1.getModel();
        mode.addColumn("STT");
        mode.addColumn(f.obj.get(1).getNameX());

        ArrayList<Object> row = new ArrayList<Object>();
        for (int i = 1; i < f.obj.size(); i++) {
            mode.addColumn(f.obj.get(i).getNameY());
        }

        for (int i = 0; i < f.obj.get(1).getSizeX() - 1; i++) {
            row.clear();
            row.add(i + 1);
            row.add(f.obj.get(1).getValueX(i));
            for (int k = 0; k < f.obj.size() - 1; k++) {

                row.add(f.obj.get(k + 1).getValueY(i));
            }
            Object[] rowData = row.toArray();
            mode.addRow(rowData);
        }

        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            DefaultTableCellRenderer centerRendererRow = new DefaultTableCellRenderer();
            centerRendererRow.setHorizontalAlignment(JLabel.CENTER);
            jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRendererRow);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel ContainPane;
    private transient javax.swing.JMenu JMenu;
    private transient javax.swing.JMenuBar MenuBar;
    private transient javax.swing.JComboBox<String> OptionBox;
    private transient javax.swing.JButton btnOneInOne;
    private transient javax.swing.JMenuItem changeXLabel;
    private transient javax.swing.JMenuItem changeYLabel;
    public static javax.swing.JPanel chartPn;
    private transient com.kitfox.svg.FePointLight fePointLight1;
    private transient javax.swing.JButton jButton1;
    private transient javax.swing.JButton jButton2;
    private transient javax.swing.JLabel jLabel1;
    private transient javax.swing.JMenu jMenu1;
    private transient javax.swing.JMenu jMenu2;
    private transient javax.swing.JMenu jMenu3;
    private transient javax.swing.JMenu jMenu4;
    private transient javax.swing.JMenu jMenu5;
    private transient javax.swing.JMenu jMenu6;
    private transient javax.swing.JMenu jMenu7;
    private transient javax.swing.JMenu jMenu8;
    private transient javax.swing.JMenuItem jMenuItem1;
    private transient javax.swing.JMenuItem jMenuItem10;
    private transient javax.swing.JMenuItem jMenuItem2;
    private transient javax.swing.JMenuItem jMenuItem3;
    private transient javax.swing.JMenuItem jMenuItem4;
    private transient javax.swing.JMenuItem jMenuItem5;
    private transient javax.swing.JMenuItem jMenuItem6;
    private transient javax.swing.JMenuItem jMenuItem7;
    private transient javax.swing.JMenuItem jMenuItem8;
    private transient javax.swing.JMenuItem jMenuItem9;
    private transient javax.swing.JPanel jPanel3;
    private transient javax.swing.JPanel jPanel4;
    private transient javax.swing.JScrollPane jScrollPane1;
    private transient javax.swing.JTable jTable1;
    private transient keeptoo.KGradientPanel kGradientPanel1;
    private transient keeptoo.KGradientPanel kGradientPanel3;
    private transient javax.swing.JMenuItem offGrid;
    private transient javax.swing.JMenuItem onGrid;
    // End of variables declaration//GEN-END:variables
}
