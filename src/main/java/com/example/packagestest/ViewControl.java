package com.example.packagestest;


import javafx.beans.Observable;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import secondpackage.SecondPackageClass;

public class ViewControl {

    public static CheckBox chkBox;
    public Text txt1;


    public void grabTheVar(MouseEvent mouseEvent) {
        SecondPackageClass secondPackageClass = new SecondPackageClass();
        System.out.println(secondPackageClass.num);

    }


}
