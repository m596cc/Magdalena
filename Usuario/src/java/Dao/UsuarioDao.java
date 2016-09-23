/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Usuario;
import java.util.List;

/**
 *
 * @author Maria Magdalena Cabrera Coronilla magdacc05@gmail.com
 */
public interface UsuarioDao {
    void insertarUsuario(Usuario usuario);
    void eliminarUsuario(int idUsuario);
    void modificarUsuario(Usuario usuario);
    List<Usuario> desplegarUsuarios();
    Usuario elegirUsuario(int idUsuario);
    
}
