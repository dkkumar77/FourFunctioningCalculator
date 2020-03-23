package CalculatorController;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Controller {

    @FXML
    private JFXButton clear;

    @FXML
    private JFXButton four;

    @FXML
    private JFXButton one;

    @FXML
    private JFXButton negativePositive;

    @FXML
    private JFXButton three;

    @FXML
    private JFXButton zero;

    @FXML
    private JFXButton six;

    @FXML
    private JFXButton nine;

    @FXML
    private JFXButton division;

    @FXML
    private JFXButton percentage;

    @FXML
    private JFXButton two;

    @FXML
    private JFXButton five;

    @FXML
    private JFXButton eight;

    @FXML
    private JFXButton decimal;

    @FXML
    private JFXButton multiply;

    @FXML
    private JFXButton minus;

    @FXML
    private JFXButton plus;

    @FXML
    private JFXButton equal;

    @FXML
    private JFXButton seven;

    @FXML
    private JFXTextField outputText;

    private String number = "";

    @FXML
    public void handleButtonEvent(ActionEvent event){
        if(event.getSource().equals(zero)){
            number = number + "0";
            handleText();
        }
        if(event.getSource().equals(one)){
            number = number + "1";
            handleText();
        }
        if(event.getSource().equals(two)){
            number = number + "2";
            handleText();
        }
        if(event.getSource().equals(three)){
            number = number + "3";
            handleText();

        }
        if(event.getSource().equals(four)){
            number = number + "4";
            handleText();

        }
        if(event.getSource().equals(five)){
            number = number + "5";
            handleText();

        }
        if(event.getSource().equals(six)){
            number = number + "6";
            handleText();

        }
        if(event.getSource().equals(seven)){
            number = number + "7";
            handleText();

        }
        if(event.getSource().equals(eight)){
            number = number + "8";
            handleText();

        }
        if(event.getSource().equals(nine)){
            number = number + "9";
            handleText();

        }

    }

    public void handleText(){
        outputText.setText(number);


    }


    @FXML
    public void handleClear(ActionEvent event) throws IOException{
        if(event.getSource().equals(clear)){
            number = "";
            if(event.getSource().equals(clear)){
                number = "";
                PrintWriter pw = new PrintWriter("output.text");
                pw.write("");

            }


        }
    }


    @FXML
    public void handleOperands(ActionEvent event) throws FileNotFoundException {
        if (event.getSource().equals(plus)) {
                PrintWriter pr = new PrintWriter("output.text");
                pr.write(number);
                outputText.setText("");
                pr.write("\n+");
                pr.close();

        }
        if (event.getSource().equals(minus)) {

            PrintWriter pr = new PrintWriter("output.text");
            pr.write(number);
            outputText.setText("");
            pr.write("\n-");
            pr.close();


        }
        if (event.getSource().equals(multiply)) {

            PrintWriter pr = new PrintWriter("output.text");
            pr.write(number);
            outputText.setText("");
            pr.write("\nx");
            pr.close();

        }

        if (event.getSource().equals(division)) {
            {
                PrintWriter pr = new PrintWriter("output.text");
                pr.write(number);
                outputText.setText("");
                pr.write("\n/");
                pr.close();


            }


        }


    }}

