/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.util.ArrayList;

/**
 *
 * @author kanku
 */
public class data {
    private String nameField;
    private String nameX;
    private String nameY;
    private ArrayList<Double> valueX;
    private ArrayList<Double> valueY;
    private int size;

    public data(String nameX, String nameY) {
        this.nameX = nameX;
        this.nameY = nameY;
        valueX = new ArrayList<Double>();
        valueY = new ArrayList<Double>();
    }      

    public String getNameField() {
        return nameField;
    }

    public void setNameField(String nameField) {
        this.nameField = nameField;
    }

    public Double getValueX(int i) {
        return this.valueX.get(i);
    }

    public void setValueX(Double value) {
        this.valueX.add(value);
    }
    
    public Double getValueY(int i) {
        return this.valueY.get(i);
    }

    public void setValueY(Double value) {
        this.valueY.add(value);
    }

    public String getNameX() {
        return nameX;
    }

    public void setNameX(String nameX) {
        this.nameX = nameX;
    }

    public String getNameY() {
        return nameY;
    }

    public void setNameY(String nameY) {
        this.nameY = nameY;
    }
    
    public int getSizeY(){
        return this.valueY.size();
    }
    
    public int getSizeX(){
        return this.valueX.size();
    }
    
}
