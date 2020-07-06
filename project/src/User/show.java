package User;

import com.company.Functions;
import database.connection;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.util.Vector;

public class show extends JFrame  implements Functions {
    Connection con;
    Statement statement;

   show()
   {


   }




    @Override
    public void insert() {

    }

    @Override
    public void delete() throws SQLException {

    }

    @Override
    public void signature() {

    }
    @Override
    public void display()
    {
        connection startConnect=new connection() ;


        ResultSet rs;
        String query;
        try{
        con=startConnect.connect();
        statement=con.createStatement();
        query="select * from client";
        rs=statement.executeQuery(query);
            ResultSetMetaData count=  rs.getMetaData();
            int coun=count.getColumnCount();
            Vector column=new Vector(coun);
for(int i=1;i<=coun;i++)
{
    column.add(count.getColumnName(i));

}
Vector data=new Vector();
Vector row=new Vector();

while(rs.next())
{
    row=new Vector(coun);
    for(int i=1;i<=coun;i++)
    {
        row.add(rs.getString(i));
    }
    data.add(row);
}
setTitle("Data");
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
JPanel pan=new JPanel();
JTable table=new JTable(data,column);
JScrollPane scroll=new JScrollPane(table);
pan.setLayout(new BorderLayout());
pan.add(scroll,BorderLayout.CENTER);
add(pan);
setVisible(true);
pack();
    }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Can't access Database"+e.getMessage());
        }
        finally {
            try {
                con.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update() {

    }}

