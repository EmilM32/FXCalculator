package fxcalculator;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ActivityController implements Initializable {
    
    double number1;
    double number2;
    double result;
    String operations;
    
    @FXML
    private Button b1;
    @FXML
    private Button b12;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    @FXML
    private Button b9;
    @FXML
    private Button b0;
    @FXML
    private Button b11;
    @FXML
    private Button b21;
    @FXML
    private Button b31;
    @FXML
    private Button b41;
    @FXML
    private Button b51;
    @FXML
    private Button b61;
    @FXML
    private Button b71;
    @FXML
    private Button b81;
    @FXML
    private Button b91;
    @FXML
    private Button b01;
    @FXML
    private Button b02;
    @FXML
    private Button b_plus;
    @FXML
    private Button b_minus;
    @FXML
    private Button b_mnozenie;
    @FXML
    private Button b_dzielenie;
    @FXML
    private Button b_pierwiastek;
    @FXML
    private Button b_potega;
    @FXML
    private Button b_szescian;
    @FXML
    private Button b_kropka;
    @FXML
    private Button bC;
    @FXML
    private Button b_wynik;
    @FXML
    private Button bC1;
    @FXML
    private Button bC2;
    @FXML
    private Button b_wynik1;
    @FXML
    private TextField textField_result;
    @FXML
    private TextField binary_text1;
    @FXML
    private TextField binary_new;
    @FXML
    private TextField binary_text2;
    @FXML
    private TextField binary_new2;
    
    @FXML
    private void handle1(ActionEvent event) {
        String tmp = textField_result.getText();
        textField_result.setText(tmp + "1");
    }
    @FXML
    private void handle12(ActionEvent event) {
        String tmp = binary_text2.getText();
        binary_text2.setText(tmp + "1");
    }
    @FXML
    private void handle02(ActionEvent event) {
        String tmp = binary_text2.getText();
        binary_text2.setText(tmp + "0");
    }
    @FXML
    private void handle2(ActionEvent event) {
        String tmp = textField_result.getText();
        textField_result.setText(tmp + "2");
    }
    @FXML
    private void handle3(ActionEvent event) {
        String tmp = textField_result.getText();
        textField_result.setText(tmp + "3");
    }
    @FXML
    private void handle4(ActionEvent event) {
        String tmp = textField_result.getText();
        textField_result.setText(tmp + "4");
    }
    @FXML
    private void handle5(ActionEvent event) {
        String tmp = textField_result.getText();
        textField_result.setText(tmp + "5");
    }
    @FXML
    private void handle6(ActionEvent event) {
        String tmp = textField_result.getText();
        textField_result.setText(tmp + "6");
    }
    @FXML
    private void handle7(ActionEvent event) {
        String tmp = textField_result.getText();
        textField_result.setText(tmp + "7");
    }
    @FXML
    private void handle8(ActionEvent event) {
        String tmp = textField_result.getText();
        textField_result.setText(tmp + "8");
    }
    @FXML
    private void handle9(ActionEvent event) {
        String tmp = textField_result.getText();
        textField_result.setText(tmp + "9");
    }
    @FXML
    private void handle0(ActionEvent event) {
        String tmp = textField_result.getText();
        textField_result.setText(tmp + "0");
    }
    
    @FXML
    private void handle11(ActionEvent event) {
        String tmp = binary_text1.getText();
        binary_text1.setText(tmp + "1");
    }
    @FXML
    private void handle21(ActionEvent event) {
        String tmp = binary_text1.getText();
        binary_text1.setText(tmp + "2");
    }
    @FXML
    private void handle31(ActionEvent event) {
        String tmp = binary_text1.getText();
        binary_text1.setText(tmp + "3");
    }
    @FXML
    private void handle41(ActionEvent event) {
        String tmp = binary_text1.getText();
        binary_text1.setText(tmp + "4");
    }
    @FXML
    private void handle51(ActionEvent event) {
        String tmp = binary_text1.getText();
        binary_text1.setText(tmp + "5");
    }
    @FXML
    private void handle61(ActionEvent event) {
        String tmp = binary_text1.getText();
        binary_text1.setText(tmp + "6");
    }
    @FXML
    private void handle71(ActionEvent event) {
        String tmp = binary_text1.getText();
        binary_text1.setText(tmp + "7");
    }
    @FXML
    private void handle81(ActionEvent event) {
        String tmp = binary_text1.getText();
        binary_text1.setText(tmp + "8");
    }
    @FXML
    private void handle91(ActionEvent event) {
        String tmp = binary_text1.getText();
        binary_text1.setText(tmp + "9");
    }
    @FXML
    private void handle01(ActionEvent event) {
        String tmp = binary_text1.getText();
        binary_text1.setText(tmp + "0");
    }
    
    
    @FXML
    private void handle_plus(ActionEvent event){
       if(textField_result.getText().equals("")) {
           System.err.println("Najpierw podaj pierwszą liczbę!");
       }
       else {
            number1 = Double.parseDouble(textField_result.getText());
            textField_result.setText("");
            operations = "+";
       }
    }
    @FXML
    private void handle_minus(ActionEvent event){
       if(textField_result.getText().equals("")) {
           System.err.println("Najpierw podaj pierwszą liczbę!");
       }
       else {
            number1 = Double.parseDouble(textField_result.getText());
            textField_result.setText("");
            operations = "-";
       }
    }
    @FXML
    private void handle_mnozenie(ActionEvent event){
              if(textField_result.getText().equals("")) {
           System.err.println("Najpierw podaj pierwszą liczbę!");
       }
       else {
            number1 = Double.parseDouble(textField_result.getText());
            textField_result.setText("");
            operations = "*";
       }
    }
    @FXML
    private void handle_dzielenie(ActionEvent event){
             if(textField_result.getText().equals("")) {
           System.err.println("Najpierw podaj pierwszą liczbę!");
       }
       else {
            number1 = Double.parseDouble(textField_result.getText());
            textField_result.setText("");
            operations = "/";
       }
    }
    @FXML
    private void handle_pierwiastek(ActionEvent event){
       if(textField_result.getText().equals("")) {
           System.err.println("Najpierw podaj liczbę!");
       }
       else {
            number1 = Double.parseDouble(textField_result.getText());
            textField_result.setText(""+ Math.sqrt(number1));
       }
    }
    @FXML
    private void handle_kwadrat(ActionEvent event){
       if(textField_result.getText().equals("")) {
           System.err.println("Najpierw podaj liczbę!");
       }
       else {
            number1 = Double.parseDouble(textField_result.getText());
            textField_result.setText(""+ Math.pow(number1, 2));
       }      
    }
    @FXML
    private void handle_szescian(ActionEvent event){
             if(textField_result.getText().equals("")) {
           System.err.println("Najpierw podaj liczbę!");
       }
       else {
            number1 = Double.parseDouble(textField_result.getText());
            textField_result.setText(""+ Math.pow(number1, 3));
       }  
    }
    @FXML
    private void handle_kropka(ActionEvent event){
      final String regex = "\\b\\d*\\.\\d*\\b";
        final Pattern pattern = Pattern.compile(regex);

        if(textField_result.getText().equals("")) {
            textField_result.setText(0 + ".");
        } else {
            textField_result.setText(textField_result.getText() + ".");
        }
                
        final Matcher matcher = pattern.matcher(textField_result.getText());        
        while (matcher.find()) {
            textField_result.setText(matcher.group(0));
        }   
    }
    @FXML
    private void handle_binary(ActionEvent event){
        int tmp_number = Integer.parseInt(binary_text1.getText());
        binary_new.setText(Integer.toBinaryString(tmp_number));   
    }
    @FXML
    private void handle_binary2(ActionEvent event){
        String number = binary_text2.getText();
        int new_number = binaryToInt(number);
        binary_new2.setText(""+new_number);
    }
    @FXML
    private void handle_c(ActionEvent event){
       textField_result.setText("");
    }
    @FXML
    private void handle_c1(ActionEvent event){
       binary_text1.setText("");
    }
    @FXML
    private void handle_c2(ActionEvent event){
       binary_text2.setText("");
    }
    @FXML
    private void handle_result(ActionEvent event){
           if(textField_result.getText().equals("")) {
            System.err.println("Brak danych do tej operacji.");
        }
        else {
            number2 = Double.parseDouble(textField_result.getText());
                if(operations == null) {
                    System.err.println("Brak operacji.");
                } else {
                    switch(operations)
                    {
                        case "+":
                        {
                            result = number1 + number2;
                            textField_result.setText(""+result);
                            break;
                        }
                        case "-":
                        {
                            result = number1 - number2;
                            textField_result.setText(""+result);
                            break;
                        }
                        case "*":
                        {
                            result = number1 * number2;
                            textField_result.setText(""+result);
                            break;
                        }
                        case "/":
                        {
                            result = number1 / number2;
                            textField_result.setText(""+result);
                            break;
                        }
                        default:
                        {
                            System.err.print("Nie rozpoznano operacji!");
                            break;
                        }
                    }
                 }
        }
    }
    static int binaryToInt (String binary) {
    char []cA = binary.toCharArray();
    int result = 0;
    for (int i = cA.length-1;i>=0;i--){
        if(cA[i]=='1') result+=Math.pow(2, cA.length-i-1);
    }
    return result;
}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
