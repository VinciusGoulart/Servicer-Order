package org.example.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    public  static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String Name;
    String email;
    Date birthDate;

    public Client(){

    }

    public Client(String name, String email, Date birthDate) {
        Name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Client: " + Name + " (" + sdf.format(birthDate) + ") - " + email;
    }
}
