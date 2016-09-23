/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Usuario;
import java.sql.Connection;
import java.util.List;
import util.Util;

/**
 *
 * @author Maria Magdalena Cabrera Coronilla magdacc05@gmail.com
 */
public class UsuarioDaoIm implements UsuarioDao {
    private Connection connection;
    
    public UsuarioDaoIm(){
        connection = Util.getConnection();
    
}

    @Override
    public void insertarUsuario(Usuario usuario) {
//        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void eliminarUsuario(int idUsuario) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Usuario> desplegarUsuarios() {
     throw new UnsupportedOperationException("Not supported yet."); 
    
    }

    @Override
    public Usuario elegirUsuario(int idUsuario) {
   throw new UnsupportedOperationException("Not supported yet.");
    
    }
    
}
