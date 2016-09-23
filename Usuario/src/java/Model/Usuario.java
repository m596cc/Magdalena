/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Maria Magdalena Cabrera Coronilla magdacc05@gmail.com
 */
public class Usuario {
    
    private int idUsuario;
    private String login;
    private String password;
    private String email;
    private String fechaAlta;
    private String UltimoAcceso;

    public Usuario(int idUsuario, String login, String password, String email, String fechaAlta, String UltimoAcceso) {
        this.idUsuario = idUsuario;
        this.login = login;
        this.password = password;
        this.email = email;
        this.fechaAlta = fechaAlta;
        this.UltimoAcceso = UltimoAcceso;
    }

//    public Usuario() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

      public Usuario(){
        this(0,"","","","","");
      }
      
      public Usuario(int aInt, String string, String string0, int aInt0) {
//        throw new UnsupportedOperationException("Not supported yet.");
      }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getUltimoAcceso() {
        return UltimoAcceso;
    }

    public void setUltimoAcceso(String UltimoAcceso) {
        this.UltimoAcceso = UltimoAcceso;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", login=" + login + ", password=" + password + ", email=" + email + ", fechaAlta=" + fechaAlta + ", UltimoAcceso=" + UltimoAcceso + '}';
    }
}
