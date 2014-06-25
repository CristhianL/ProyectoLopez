/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.upeu.edu.pe.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pe.upeu.edu.pe.config.Conexion;

/**
 *
 * @author alum.fial7
 */
public class IglesiaDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    private int op;
    
    public int registrarIglesia(int idd, int idti, String nom, int cuenta){
        sql="INSERT INTO iglesia VALUES (null,'"+idd+"','"+idti+"','"+nom+"','"+cuenta+"')";
        try{
            cx=Conexion.getConex();
            st=cx.createStatement();
            op=st.executeUpdate(sql);
        }catch(SQLException e){
            
        }
        return op;
    }
}
