/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bean.data;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
/**
 *
 * @author kanku
 */
public class ReadFile {
    //Các thuộc tính của đọc file
    public ArrayList<data> obj;
    public JFileChooser file;
    FileReader r;
    String pathFile;
    
    public ReadFile() {
        //khởi tạo tự sinh ra mảng để lưu trữ
        obj = new ArrayList<data>();
    }

    public void getFile() {
        //mở thư mục và mặc định là ổ C
        file = new JFileChooser("C:\\");

        int returnValue = file.showOpenDialog(null);
        //chọn file và lấy thông tin về đường dẫn
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            pathFile = selectedFile.getAbsolutePath();
            System.out.println(pathFile);
        }
    }
    
    public void openFile(){
        //xóa mảng lưu trữ khi gọi lại hàm này
        obj.clear();
        try {
            //mở chức năng đọc file
            r = new FileReader(pathFile);
            BufferedReader bReader = new BufferedReader(r);
            
            String line;
            //thêm vào mặc định phần tử số không do muốn làm việc từ số 1
            obj.add(0,null);
            //get nameX-Y chart
            String[] dataName = bReader.readLine().split("\\t+");
            for(int i = 1; i<dataName.length;i++){
                System.out.println(dataName[0]+" "+dataName[i]);
                data g = new data(dataName[0],dataName[i]);
                obj.add(i,g);
            }
            //get data
            String[] dataLine;
            while((line = bReader.readLine())!=null){
                dataLine = line.split("\\s+");    
                for(int i=1;i<dataLine.length;i++){
                    obj.get(i).setValueX(Double.parseDouble(dataLine[0]));
                    obj.get(i).setValueY(Double.parseDouble(dataLine[i]));
                } 
                System.out.println("");
            }     
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
