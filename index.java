import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
try
{
    string url="";
    string user="root";
    string password="";
    connection con= DriverManager.getConnection(url,user,password);
    String query="SELECT*FROM unit";
    Statment stm = con.createStatement();
    ResultSet res=stm.executeQuery(query);
    String columns[] ={"NAME","MOBILE","GENDER","DOB","ADDRESS","ACCEPT TERMS AND CONDITIONS","SUBMIT","RESET"};
    String data[][] = new String[8][3];
    int i = 0;
    while (res.next()) {
        
        String NAME =res.getString("NAME");
        String MOBILE =res.getString("MOBILE");
        String GENDER =res.getString("GENDER");
        String DOB =res.getString("DOB");
        String ADDRESS =res.getString("ADDRESS");
        String ACCEPT TERMS AND CONDITIONS =res.getString("ACCEPT TERMS AND CONDITIONS");
        String SUBMIT =res.getString("SUBMIT");
        String RESET =res.getString("RESET");
        data[i][0] = NAME + "";
         data[i][1] = MOBILE + "";
          data[i][2] = GENDER + "";
           data[i][3] = DOB + "";
            data[i][4] = ADDRESS + "";
             data[i][5] = ACCEPT TERMS AND CONDITIONS + "";
              data[i][6] = SUBMIT + "";
               data[i][7] = RESET + "";
               i++;
    }

    DefaultTableModel model = new DefaultTableModel(data,columns);
    JTable table=new JTable(model);
    table.setShowGrid(true);
    table.setShowVerticalLines(true);
    JScrollPanel(table);
    JFrame f = new JFrame("DATA ABOUT REGISTRATION FORM");
    JPanel panel = new JPanel();
    panel.add(panel);
    f.add(panel);
    f.setSize(500,250);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
} catch(SQLException e) {
    e.printStackTrace();
}

        
        
    }
