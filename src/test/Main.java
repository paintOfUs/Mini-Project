package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.IntelliJTheme;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatXcodeDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialOceanicIJTheme;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.*;

/**
 *
 * @author kanku
 */
public class Main {

    public static void main(String[] args) throws UnsupportedLookAndFeelException, InterruptedException {
        UIManager.put("MenuBar.showTabSeparators", true);
        UIManager.setLookAndFeel(new FlatLightFlatIJTheme());
        int count = 0;
        App pc = new App();
        pc.setVisible(true);

    }
}
