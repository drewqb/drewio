package com.frantz.samples2.excl;

import java.io.File;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

public class DirPicker extends Application {
 
 
    @Override
    public void start(final Stage stage) {
        stage.setTitle("File Chooser Sample");
        final Label labelSelectedDirectory = new Label();
         DirectoryChooser directoryChooser = new DirectoryChooser();
                File selectedDirectory = 
                        directoryChooser.showDialog(stage);
                 
                if(selectedDirectory == null){
                    labelSelectedDirectory.setText("No Directory selected");
                }else{
                    labelSelectedDirectory.setText(selectedDirectory.getAbsolutePath());
                }
   
    }
 
    public static void main(String[] args) {
        Application.launch(null);
    }		

}
