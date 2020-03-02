/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 *
 * @author dsrde
 */
public class FXMLDocumentController implements Initializable {
    
       @FXML
    private LineChart<?, ?> salarychart;

    @FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        XYChart.Series set1 = new XYChart.Series<>();
        
       set1.getData().add(new XYChart.Data("Deepak",500));
        set1.getData().add(new XYChart.Data("tyagi",200));
        set1.getData().add(new XYChart.Data("bharti",300));
        set1.getData().add(new XYChart.Data("danish",400));
        set1.getData().add(new XYChart.Data("gaddu",200));
        set1.getData().add(new XYChart.Data("karan",500));
        set1.getData().add(new XYChart.Data("saanp",400));
        set1.getData().add(new XYChart.Data("langda",300));
        
        
        
        salarychart.getData().addAll(set1);
    }    
    
}
