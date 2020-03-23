package CalculatorController;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.Short.valueOf;

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
    private String operand = "";


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
            outputText.equals("");

            if(event.getSource().equals(clear)){
                number = "";
                PrintWriter pw = new PrintWriter("output.text");
                pw.write("");

            }


        }
    }

    @FXML

    public void handleEqual(ActionEvent event) throws IOException {

        /*
        Need to Fix String to Int;

         */

        if(event.getSource().equals(equal)){
            String data = new String(Files.readAllBytes(Paths.get("output.text")));
            int initial_Number = Integer.parseInt(data);
            int num = Integer.parseInt(number);

            PrintWriter pw = new PrintWriter("output.text");

            if(operand == ""){
                outputText.setText(number);
                number = Integer.toString(initial_Number + num);
                pw.write(number);
                pw.close();


            }
            if(operand == "+"){
                outputText.setText(Integer.toString(initial_Number + num));
                number = Integer.toString(initial_Number + num);
                pw.write(Integer.toString(initial_Number + num));
                pw.close();


            }
            if(operand.equalsIgnoreCase("-")){
                outputText.setText(Integer.toString(initial_Number - num));
                number = Integer.toString(initial_Number - num);
                pw.write(Integer.toString(initial_Number - num));
                pw.close();

            }
        }


    }

    @FXML
    public void handleOperands(ActionEvent event) throws FileNotFoundException {

        PrintWriter pr = new PrintWriter("output.text");
        pr.write(number);
        pr.close();

        if (event.getSource().equals(plus)) {
            operand = "+";
            outputText.setText("");
            number = "";
        }
        if (event.getSource().equals(minus)) {
            operand = "-";
            outputText.setText("");
            number = "";


        }
        if (event.getSource().equals(multiply)) {
            operand = "x";
            outputText.setText("");
            number = "";


        }

        if (event.getSource().equals(division)) {
            {
                operand = "/";
                outputText.setText("");
                number = "";



            }


        }


    }}

