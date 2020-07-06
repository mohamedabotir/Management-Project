package User;

import com.company.Functions;

import javax.swing.*;
import java.awt.*;
import java.lang.annotation.Annotation;

public class attendance extends JFrame implements Functions {


    JTextField Name=new JTextField(15);
    JLabel LName=new JLabel("Name");
    JButton Submit=new JButton("Submit");
    attendance()
    {
        setTitle("Attendance");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        LName.setLabelFor(Name);
        add(LName);
        add(Name);
        add(Submit);
        setLayout(new GridLayout(2,1));
        pack();
        setVisible(true);
        setResizable(false);
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
