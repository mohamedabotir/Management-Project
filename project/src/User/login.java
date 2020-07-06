package User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import database.connection;

import static javax.swing.JOptionPane.*;

public class login extends JFrame implements ActionListener {
   String query;
   Connection con;
   Statement statement;
    public  boolean isLog=false;
    private JButton log=new JButton("Log in");

    private  JPasswordField password=new JPasswordField();
    private JTextField name=new JTextField(10);
    private JLabel Lname=new JLabel("Name");
    private  JLabel Lpassword=new JLabel("Password");
    public login()
    {
        setTitle("Log in");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLayout(new GridLayout(3,1));
        Lname.setDisplayedMnemonic('N');
        Lpassword.setDisplayedMnemonic('P');
        Lpassword.setLabelFor(password);
        Lname.setLabelFor(name);
        add(Lname);add(name);
        add(Lpassword);add(password);
        add(log);
        log.addActionListener(this);

        pack();
    }

    void log()
    {
try{
    String nam=name.getText() ;
    String pass=String.valueOf(password.getPassword());

    ResultSet rs;
    query="select * from user where name='"+nam+"' and password='"+pass+"'";
    connection startConnect=new connection();
   con=startConnect.connect();
   statement=con.createStatement();
   rs=statement.executeQuery(query);

    if(rs.next())
    {
        isLog=true;
        showMessageDialog(null,"Log in Successful");
        startScene start=new startScene();

    }
    else
    {
        showMessageDialog(null,"Some Thing go wrong ");
        con.close();
    }

} catch (SQLException e) {
    showMessageDialog(null,"Can't access database!"+e.getMessage());
}
finally {
    try{
        con.close();
        statement.close();


    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    }
    @Override
    public void actionPerformed(ActionEvent e) {
if (e.getSource()==log)
{
    log();

if (isLog==true)
{

    this.dispose();
}


}
    }
}
