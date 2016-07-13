package com.csys.evalpatient.generic;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MyConnection {

    private DataSource dataSource;

    public MyConnection() {
        try {

            Context initCtx = new InitialContext();
            Context envCtx = (Context) initCtx.lookup("java:comp/env");
            this.dataSource = (DataSource) envCtx.lookup("jdbc/gclinPin");
        } catch (NamingException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConnection() {
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    /* public static void main(String[] args) {
    MyConnection cnx = new MyConnection();
    try {
    System.out.println(cnx.dataSource.getConnection().getWarnings().toString());
    } catch (SQLException ex) {
    Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
    }
    }*/
}
