package com.csys.evalpatient.generic;

//import com.csys.services.PatientWS;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import service.EchelleWS;
import service.EchelleWS_Service;


public class WS {

  
    public static EchelleWS portEchelleWS;

    public String getWSDLPort() {
        MyConnection myconn = new MyConnection();
        Connection conn = myconn.getConnection();
        String WSDLPort = "";
        try {
            Statement stm = conn.createStatement();
            String query = "select top(1) url_ws_dmi from clinique";
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                WSDLPort = rs.getString("url_ws_dmi");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            // Release connection back to the pool
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {

                }
            }
        }
        return WSDLPort;
    }

   
    
    public EchelleWS EchelleWS() throws MalformedURLException {

        Authenticator myAuth = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                MyConnection myconn = new MyConnection();
                Connection conn = myconn.getConnection();
                String user = "";
                String psw = "";
                try {
                    Statement stm = conn.createStatement();
                    String query = "select top(1) rolet.user_name,user_pass from users_tomcat usert inner join  user_roles rolet on rolet.user_name=usert.user_name where role_name='tomcat'";
                    ResultSet rs = stm.executeQuery(query);
                    while (rs.next()) {
                        user = rs.getString("user_name");
                        psw = rs.getString("user_pass");
                    }
                } catch (SQLException e) {
                    System.err.println(e.getMessage());
                } finally {
                    // Release connection back to the pool
                    if (conn != null) {
                        try {
                            conn.close();
                        } catch (SQLException ex) {

                        }
                    }
                    conn = null; // prevent any future access
                }
                return new PasswordAuthentication(user, psw.toCharArray());
            }
        };

        Authenticator.setDefault(myAuth);
        String WSDLport = getWSDLPort();
        if (WSDLport.equalsIgnoreCase("")) {
            System.out.println("erreur WSDl");
            return null;
        } else {
             EchelleWS_Service service = new EchelleWS_Service(new URL("http://" + WSDLport + "/evalPatient-core/EchelleWS?wsdl"));
            portEchelleWS = service.getEchelleWSPort();
            return portEchelleWS;

        }
    }
    
  

}
