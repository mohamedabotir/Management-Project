package User;

import com.company.Functions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.connection;

public class delete extends JFrame implements Functions, ActionListener {

Connection con;
Statement statement;
String query;
    JTextField National=new JTextField(15);
    JLabel LNational=new JLabel("National no");
    JButton Delete=new JButton("Delete");
    delete()
    {
        setTitle("Delete");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        LNational.setLabelFor(National);
        add(LNational);
        add(National);
        add(Delete);
        setLayout(new GridLayout(2,1));
        Delete.addActionListener(this);
        pack();
        setVisible(true);
        setResizable(false);
    }


    @Override
    public void insert() {

    }

    @Override
    public void delete()  {

try {
    connection startConnection=new connection();
    String pass=National.getText();
    ResultSet rs;
query="delete from client where national ='"+pass+"'";

    connection startConnect=new connection();
    con=startConnect.connect();
    statement=con.createStatement();
   statement.execute(query);


    JOptionPane.showMessageDialog(null,"DeletedSuccessful");

} catch (SQLException e) {
    JOptionPane.showMessageDialog(null,"ErrorCan'tDelete"+e.getMessage());
}

finally {
    try{
        statement.close();
        con.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"Can't Close Connection"+e.getMessage());
    }
}
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Delete)
        {
            delete();
        }
    }
}
