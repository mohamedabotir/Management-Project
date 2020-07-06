package client;

import com.company.Functions;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import database.connection;
//import javafx.scene.text.Font;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class insert extends JFrame implements Functions, ActionListener {
  JPanel p1=new JPanel();
   static Connection con;
    static Statement statement;
    static String query;
    String element[]={"Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire", "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France", "France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands", "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan", "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain", "Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname", "Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan, Province of China", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)", "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe"};
    private JComboBox Country=new JComboBox(element);
    private JScrollPane scroll=new JScrollPane(Country);
    private JTextField Name=new JTextField(10);
    private JTextField VisaCard=new JTextField(10);
    private JTextField PhoneNumber=new JTextField(10);
    private JTextField National=new JTextField(10);
    private JLabel LName=new JLabel("Name");
    private JLabel LVisaCard=new JLabel("VisaCard");
    private JLabel LPhoneNumber=new JLabel("PhoneNumber");
    private JLabel LCountry=new JLabel("Country");
    private JLabel LNational=new JLabel("National no");
    private JDateChooser Calendar=new JDateChooser();
    private JLabel LCalender=new JLabel("Date");
    private  JButton Submit=new JButton("Submit");


    public insert()
    {
        Font f=new Font("Verdana",Font.BOLD,26);
        setTitle("InsertInformation");
        Submit.setToolTipText("SendInformation");
        LNational.setToolTipText("National Number");
        Submit.setFont(f);
        LName.setFont(f);
        LNational.setFont(f);
        LVisaCard.setFont(f);
        LCountry.setFont(f);
        LPhoneNumber.setFont(f);
        LCalender.setFont(f);
        LCalender.setLabelFor(Calendar);
        LName.setLabelFor(Name);
        LVisaCard.setLabelFor(VisaCard);
        LCountry.setLabelFor(Country);
        LNational.setLabelFor(National);
        LPhoneNumber.setLabelFor(PhoneNumber);
        LName.setDisplayedMnemonic('N');
        LVisaCard.setDisplayedMnemonic('L');
        LPhoneNumber.setDisplayedMnemonic('P');
        LCountry.setDisplayedMnemonic('C');
        LVisaCard.setDisplayedMnemonic('V');
        LNational.setDisplayedMnemonic('N');
        LCalender.setDisplayedMnemonic('D');
        setLayout(new GridLayout(7,1));

        add(LName); add(Name);
        add(LPhoneNumber);add(PhoneNumber);
        add(LCountry);add(Country);
        add(LVisaCard); add(VisaCard);
        add(LNational); add(National);
        add(LCalender);add(Calendar);
        p1.setLayout(new FlowLayout(FlowLayout.RIGHT) );
        p1.add(Submit);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);
       // add(p1
        // );
        add(p1);
Submit.addActionListener(this);
         pack();
    }

    @Override
    public void insert() {
        SimpleDateFormat filter=new SimpleDateFormat("yyyy-MM,dd");
        String date=filter.format(Calendar.getDate());
        String name=Name.getText();
        int phone=Integer.parseInt(PhoneNumber.getText());
        String visa=VisaCard.getText();
        String country=(String) Country.getSelectedItem();

        int Nationalt=Integer.parseInt(National.getText());
        connection startConnection=new connection();


        try{
            con=startConnection.connect();
            statement=con.createStatement();
            query="insert into client (name,phone,visa,country,national,date)values('"+name+"','"+phone+"','"+visa+"','"+country+"','"+Nationalt+"','"+date+"')";
            statement.execute(query);
            JOptionPane.showMessageDialog(null,"Successful!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Can't Add"+e.getMessage());
        }finally {
            try{
            statement.close();
            con.close();} catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Error"+e.getMessage());
            }
        }

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
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==Submit)
        {
            insert();
        }
    }
}
