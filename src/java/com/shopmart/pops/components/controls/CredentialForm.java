package com.shopmart.pops.components.controls;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import lombok.Getter;

public class CredentialForm extends GridPane {

    @Getter private TextField usernameField;
    @Getter private PasswordField passwordField;

    public CredentialForm(){
        super();
        this.setHgap(8);
        this.setVgap(8);
        Label txt2 = new Label("Username:");
        this.add(txt2, 0, 0);
        Label txt3 = new Label("Password:");
        this.add(txt3, 0, 1);
        usernameField = new TextField();
        this.add(usernameField, 1, 0);
        passwordField = new PasswordField();
        this.add(passwordField, 1, 1);
    }

    public String getUsername(){
        return this.usernameField.getText();
    }

    public void setUsername(String username){
        this.usernameField.setText(username);
    }

    public String getPassword(){
        return this.passwordField.getText();
    }

    public void setPassword(String password){
        this.passwordField.setText(password);
    }
}
