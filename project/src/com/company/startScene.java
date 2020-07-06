package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startScene extends JFrame implements ActionListener {
   private JButton ManagementButton=new JButton("Management");
    private JButton UserButton=new JButton("User");
    private JButton ClientButton=new JButton("Client");
    public startScene()
    {
        setTitle("Syetem");
        setLayout(new GridLayout(1,3));
setLocation(340,330);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ManagementButton.setToolTipText("ForManagementMembers");
        ClientButton.setToolTipText("For Client");
        UserButton.setToolTipText("For Worker");
        ManagementButton.setSize(120,120);
        ClientButton.setSize(120,120);
        UserButton.setSize(120,120);
        add(ManagementButton);
        add(UserButton);
        add(ClientButton);
        setVisible(true);
        pack();
        ClientButton.addActionListener(this);
UserButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==ClientButton)
        {
           client.insert o=new client.insert();
        }
        if(e.getSource()==UserButton)
        {
            User.login o=new User.login();
        }
    }

}
