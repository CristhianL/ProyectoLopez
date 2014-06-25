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
import java.util.ArrayList;
import pe.upeu.edu.pe.config.Conexion;
import pe.upeu.edu.pe.modelo.Distrito;
import pe.upeu.edu.pe.modelo.TipoIglesia;

/**
 *
 * @author alum.fial7
 */
public class TipoIglesiaDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    
    ArrayList<TipoIglesia> lista = null;
    public ArrayList<TipoIglesia> listarIglesia(){
        lista = new ArrayList();
        sql="SELECT * FROM tipo_iglesia";
        try{
            cx=Conexion.getConex();
            st=cx.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                TipoIglesia ti=new TipoIglesia();
                ti.setIdti(rs.getInt("idtipo_iglesia"));
                ti.setNomtipo(rs.getString("tipo_iglesia"));
                lista.add(ti);
            }
            
        }catch(SQLException e){
            
        }
        
        return lista;
    }


    
}
