package CalculatorController;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.math.*;
import static javafx.application.Platform.exit;

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
    public void handleButtonEvent(ActionEvent event) throws FileNotFoundException {

        if (event.getSource().equals(zero)) {
            number = number + "0";
            handleText();
        }
        if (event.getSource().equals(one)) {
            number = number + "1";
            handleText();
        }
        if (event.getSource().equals(two)) {
            number = number + "2";
            handleText();
        }
        if (event.getSource().equals(three)) {
            number = number + "3";
            handleText();

        }
        if (event.getSource().equals(four)) {
            number = number + "4";
            handleText();

        }
        if (event.getSource().equals(five)) {
            number = number + "5";
            handleText();

        }
        if (event.getSource().equals(six)) {
            number = number + "6";
            handleText();

        }
        if (event.getSource().equals(seven)) {
            number = number + "7";
            handleText();

        }
        if (event.getSource().equals(eight)) {
            number = number + "8";
            handleText();

        }
        if (event.getSource().equals(nine)) {
            number = number + "9";
            handleText();

        }
        if (event.getSource().equals(decimal)) {
            if (validateNumber() == true) {
                number = number + ".";
                handleText();
            }
            else{
                number = number;

                }
            }

        }




    public void handleText(){
        outputText.setText(number);


    }

    public boolean validateNumber() {
        int index = outputText.getText().indexOf(".");
        if(index != -1) {
            // Contains a decimal point
            if (outputText.getText().substring(index + 1).indexOf(".") == -1) {
                return false;
            } else {
               return false;
            }
        }
        else {
            return true;

        }
    }


    @FXML
    public void handleClear(ActionEvent event) throws IOException{
        if(event.getSource().equals(clear)){
            outputText.setText("0");
            number = "";
            if(event.getSource().equals(clear)){
                number = "";
                PrintWriter pw = new PrintWriter("output.text");
                pw.write("");

            }
        }
    }



    @FXML
    public void handleEqual(ActionEvent event) throws IOException {

        if (event.getSource().equals(equal)) {

            if (!number.equals("")) {
                String data = new String(Files.readAllBytes(Paths.get("output.text")));
                double initial_Number = Double.parseDouble(data);
                double num = Double.parseDouble(number);
                PrintWriter pw = new PrintWriter("output.text");
                if (operand == "") {

                    outputText.setText(Double.toString(Double.parseDouble(number)));
                    number = Double.toString(initial_Number);
                    pw.write(number);
                    pw.close();


                }
                if (operand == "+") {
                    outputText.setText(Double.toString(initial_Number + num));
                    number = Double.toString(initial_Number + num);
                    pw.write(Double.toString(initial_Number + num));
                    pw.close();
                    operand = "";


                }
                if (operand.equalsIgnoreCase("-")) {
                    outputText.setText(Double.toString(initial_Number - num));
                    number = Double.toString(initial_Number - num);
                    pw.write(Double.toString(initial_Number - num));
                    pw.close();
                    operand = "";

                }
                if (operand.equalsIgnoreCase("x")) {
                    outputText.setText(Double.toString(initial_Number * num));
                    number = Double.toString(initial_Number * num);
                    pw.write(Double.toString(initial_Number * num));
                    pw.close();
                    operand = "";

                }
                if (operand.equalsIgnoreCase("/")) {

                    outputText.setText(Double.toString(initial_Number / num));
                    number = Double.toString(initial_Number / num);
                    pw.write(Double.toString(initial_Number / num));
                    pw.close();
                    operand = "";

                }
            }
            else if(operand == "" && number.equals("")){
                outputText.setText("0");
            }
            else{
                outputText.setText("Error, try again");
                number = "";
                PrintWriter pw = new PrintWriter("output.text");
                pw.write("");
            }

        }


    }



    @FXML
    public void handleOperands(ActionEvent event) throws FileNotFoundException {

        if(number != "") {
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
        }
        else{
            operand = "";
        }
    }


    @FXML
    public void handlePositiveNegativeConversion(ActionEvent event) throws FileNotFoundException {

        if (event.getSource().equals(negativePositive)) {
            PrintWriter pr = new PrintWriter("output.text");
            if(Double.parseDouble(number) != 0) {
                if (Double.parseDouble(number) < 0) {
                    double value = Math.abs(Double.parseDouble(number));
                    number = Double.toString(value);
                    outputText.setText(number);
                    pr.write(number);
                } else{
                    double value = -(Double.parseDouble(number));
                    number = Double.toString(value);
                    outputText.setText(number);
                    pr.write(number);
                }

            }
            else{
                return;

            }


        }


    }

    @FXML
    public void handlePercentage(ActionEvent event) throws IOException{

        if(event.getSource().equals(percentage)){
            if(number != ""){
            double v = Double.parseDouble(outputText.getText()) / 100;
            outputText.setText(Double.toString(v));
            number = Double.toString(v);

            PrintWriter pr = new PrintWriter("output.text");
            pr.write(number);}
            number = number;


        }
    }

}
