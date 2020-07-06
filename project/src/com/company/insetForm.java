package com.company;

import javax.swing.*;

public class insetForm extends JFrame implements Functions{
    private JTextField Name=new JTextField(25);
    private JTextField VisaCard=new JTextField(25);
    private JTextField PhoneNumber=new JTextField(25);
    private JTextField Country=new JTextField(25);
    private JTextField Passpor=new JTextField(25);
    private JLabel LName=new JLabel("Name");
    private JLabel LVisaCard=new JLabel("VisaCard");
    private JLabel LPhoneNumber=new JLabel("PhoneNumber");
    private JLabel LCountry=new JLabel("Country");
    private JLabel LPasspor=new JLabel("Passpor");
    insetForm()
    {
        setTitle("Insert");
    }

    @Override
    public void insert() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void signature() {

    }

    @Override
    public void display() {

    }

    @Override
    public void update() {

    }
}
