/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.opencsv.CSVWriter;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartMouseEvent;
import org.jfree.chart.ChartMouseListener;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.ChartEntity;
import org.jfree.chart.entity.XYItemEntity;
import org.jfree.chart.labels.CrosshairLabelGenerator;
import org.jfree.chart.panel.CrosshairOverlay;
import org.jfree.chart.plot.Crosshair;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RectangleEdge;

/**
 *
 * @author kanku
 */
public class DrawChart {

    private XYSeriesCollection dataset;
    private XYSeries series;
    private String nameChart;
    private String xLabel;
    private String yLabel;
    private JFreeChart chart;
    Crosshair xCrosshair, yCrosshair;
    CrosshairOverlay crosshairOverlay;
    private ArrayList<DrawChart> list;

    boolean gInputOn = false;
    FileWriter myWriter;
    CSVWriter CSVWriter;

    public DrawChart() {
        list = new ArrayList<>();
    }

    public XYSeriesCollection getDataset() {
        return dataset;
    }

    public void setDataset(XYSeriesCollection dataset) {
        this.dataset = dataset;
    }

    public XYSeries getSeries() {
        return series;
    }

    public void setSeries(XYSeries series) {
        this.series = series;
    }

    public String getxLabel() {
        return xLabel;
    }

    public void setxLabel(String xLabel) {
        this.xLabel = xLabel;
    }

    public String getyLabel() {
        return yLabel;
    }

    public void setyLabel(String yLabel) {
        this.yLabel = yLabel;
    }

    public JFreeChart getChart() {
        return chart;
    }

    public void setChart(JFreeChart chart) {
        this.chart = chart;
    }

    public void createChartPanel(String e, ReadFile f) {
        if (!e.equals("Option")) {
            for (int i = 1; i < f.obj.size(); i++) {
                if (f.obj.get(i).getNameY().equals(e)) {
                    //Lấy các dữ liệu từ đối tượng data sau khi đọc tệp tin
                    nameChart = f.obj.get(i).getNameField();
                    xLabel = f.obj.get(i).getNameX();
                    yLabel = f.obj.get(i).getNameY();
                    System.out.println(xLabel + " " + yLabel);
                    //đối ra chuỗi dữ liệu để vẽ đồ thị
                    series = new XYSeries(f.obj.get(i).getNameY());
                    for (int k = 0; k < f.obj.get(i).getSizeY(); k++) {
                        //kiểm tra xem dữ liệu có bị lỗi gì không
                        if (f.obj.get(1).getValueX(k) == null || f.obj.get(i).getValueY(k) == null) {
                            System.out.println(f.obj.get(1).getValueX(k) + " " + f.obj.get(i).getValueY(k));
                        } else {
                            series.add(f.obj.get(1).getValueX(k), f.obj.get(i).getValueY(k));
                        }
                    }
                }
            }
            dataset = new XYSeriesCollection(series);
            chart = ChartFactory.createXYLineChart("Băng gia tốc tại " + yLabel, xLabel,
                    yLabel, dataset, PlotOrientation.VERTICAL, true, true, true);
        }
    }

    public void createAllChart(ReadFile f) {
        dataset = new XYSeriesCollection();

        for (int i = 1; i < f.obj.size(); i++) {
            series = new XYSeries(f.obj.get(i).getNameY());
            series.clear();
            for (int k = 1; k < f.obj.get(i).getSizeY(); k++) {
                series.add(f.obj.get(i).getValueX(k - 1), f.obj.get(i).getValueY(k - 1));
            }
            dataset.addSeries(series);
        }

        chart = ChartFactory.createXYLineChart("Đồ thị tổng hợp", f.obj.get(1).getNameX(),
                f.obj.get(1).getNameY().substring(f.obj.get(1).getNameY().length() - 3),
                dataset, PlotOrientation.VERTICAL, true, true, true);
    }

    public void editChart(String xLabel, String yLabel) {
        chart = ChartFactory.createXYLineChart("Băng gia tốc tại " + yLabel, xLabel,
                yLabel, dataset, PlotOrientation.VERTICAL, true, true, true);
    }

    public void getPosition(ChartPanel chartForm) {
        chartForm.addChartMouseListener(new ChartMouseListener() {
            @Override
            //Mỗi khi nhấn chuột là sẽ lấy dữ liệu trên đồ thị
            public void chartMouseClicked(ChartMouseEvent e) {
                ChartEntity ce = e.getEntity();
                if (ce instanceof XYItemEntity) {
                    XYItemEntity itm = (XYItemEntity) ce;
                    XYDataset d = ((XYItemEntity) ce).getDataset();
                    int i = ((XYItemEntity) ce).getItem();
                    double chartpx = d.getXValue(0, i);
                    double chartpy = d.getYValue(0, i);
                    System.out.println("X:" + chartpx + ", Y:" + chartpy);
                }
            }

            @Override
            public void chartMouseMoved(ChartMouseEvent e) {
            }
        });
    }

    public void gInput(ChartPanel chartForm, String fileSave) throws IOException {
        gInputOn = true;
        chartForm.addChartMouseListener(new ChartMouseListener() {
            @Override
            public void chartMouseClicked(ChartMouseEvent e) {
                //kiểm tra xem chức năng ginput có được bật không
                if (gInputOn) {
                    ChartEntity chartentity = e.getEntity();
                    if (chartentity instanceof XYItemEntity) {
                        try {
                            //lấy dữ liệu trên đồ thị để lưu vào tệp tin
                            XYItemEntity ce = (XYItemEntity) chartentity;
                            XYDataset d = ce.getDataset();
                            int s = ce.getSeriesIndex();
                            int i = ce.getItem();
                            double x = d.getXValue(s, i);
                            double y = d.getYValue(s, i);
                            System.out.println("x " + x + " y " + y);
                            saveFile(x, y, fileSave);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(DrawChart.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(DrawChart.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }

            @Override
            public void chartMouseMoved(ChartMouseEvent e) {
                ChartEntity chartentity = e.getEntity();
                if (chartentity instanceof XYItemEntity) {
                    XYItemEntity ce = (XYItemEntity) chartentity;
                    XYDataset d = ce.getDataset();
                    int s = ce.getSeriesIndex();
                    int i = ce.getItem();
                    double x = d.getXValue(s, i);
                    double y = d.getYValue(s, i);
                    xCrosshair.setValue(x);
                    yCrosshair.setValue(y);
                }
            }

        });
        crosshairOverlay = new CrosshairOverlay();
        xCrosshair = new Crosshair(Double.NaN, Color.GRAY, new BasicStroke(0.5f));
        xCrosshair.setLabelFont(xCrosshair.getLabelFont().deriveFont(20f));

        xCrosshair.setLabelVisible(true);

        xCrosshair.setLabelBackgroundPaint(Color.WHITE);
        yCrosshair = new Crosshair(Double.NaN, Color.GRAY, new BasicStroke(0.5f));
        yCrosshair.setLabelVisible(true);
        yCrosshair.setLabelFont(yCrosshair.getLabelFont().deriveFont(20f));
        yCrosshair.setLabelBackgroundPaint(Color.WHITE);

        crosshairOverlay.addDomainCrosshair(xCrosshair);
        crosshairOverlay.addRangeCrosshair(yCrosshair);
        chartForm.addOverlay(crosshairOverlay);
    }

    public void removeGInput(ChartPanel chartForm) {
        try {
            gInputOn = false;
            chartForm.removeOverlay(crosshairOverlay);
            myWriter.close();
            CSVWriter.close();

        } catch (IOException ex) {
            Logger.getLogger(DrawChart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createFile(String fileSave) throws IOException {
        if (fileSave.equals("csv")) {
            myWriter = new FileWriter("GinputData.csv");
            CSVWriter = new CSVWriter(myWriter);
        } else {
            myWriter = new FileWriter("GinputData.txt");
        }
    }

    public void saveFile(Double x, Double y, String fileSave) throws IOException {
        if (fileSave.equals("txt")) {
            myWriter.write("X: " + x + " Y: " + y + "\n");
            return;
        } else if (fileSave.equals("csv")) {
            String[] data = {"X", "" + x, "Y", "" + y};
            CSVWriter.writeNext(data);
            return;
        }
    }

}
