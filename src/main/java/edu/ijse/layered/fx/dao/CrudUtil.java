package edu.ijse.layered.fx.dao;

import edu.ijse.layered.fx.db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CrudUtil {

    public static PreparedStatement getStatement(String sql, Object... args) throws Exception {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement st = conn.prepareStatement(sql);

        if (args != null) {
            for (int i = 0; i <= args.length; i++) {
                st.setObject((i + 1), args[i]);
            }
        }

        return st;

    }

    public static boolean executeUpdate(String sql,Object...args) throws Exception{
        return getStatement(sql,args).executeUpdate() > 0;
    }

    public static ResultSet executeQuery(String sql,Object...args) throws Exception{
        return getStatement(sql,args).executeQuery();
    }



}
