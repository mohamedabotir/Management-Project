package User;

import com.company.Functions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startScene extends JFrame implements Functions, ActionListener {


    private JButton Update=new JButton("Update");
    private JButton Delete=new JButton("Delete");
    private JButton Signature=new JButton("Signature");
    private JButton Display=new JButton("DisplayClient");


   public startScene()
   {
       setTitle("Client");
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       setResizable(false);
       setLayout(new GridLayout(4,1));
       Font f=new Font("Verdana",Font.BOLD,25);
       Update.setFont(f);
       Delete.setFont(f);
       Signature.setFont(f);
       Display.setFont(f);
       Update.setToolTipText("ModifyData");
       Delete.setToolTipText("DeleteData");
       Signature.setToolTipText("Record Attendance");
       Display.setToolTipText("Display All Client");
       add(Update);
       add(Delete);
       add(Signature);
       add(Display);
       pack();
       setVisible(true);
       Signature.addActionListener(this);
       Update.addActionListener(this);
       Delete.addActionListener(this);
       Display.addActionListener(this);
   }






    @Override
    public void insert()
    {

    }
   public void delete(){}
    public void signature(){}
    public void display(){}
    public void update(){}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Signature)
        {
            attendance attend=new attendance();
        }
        if(e.getSource()==Update)
        {
            Update o=new Update();
        }
        if(e.getSource()==Delete)
        {
            delete o=new delete();
        }
        if (e.getSource()==Display)
        {
            show start=new show();
        }
        if(e.getSource()==Display)
        {
            show o=new show();
o.display();

        }
    }
}
