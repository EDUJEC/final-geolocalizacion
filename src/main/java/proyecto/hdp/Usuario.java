/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.hdp;

import java.util.ArrayList;
import org.springframework.data.annotation.Id;

/**
 *
 * @author JOSEEDUARDO
 */
public class Usuario {
    @Id
    private String id;
    
    private String nickname;
    private String email;
    private String pasword;
    private ArrayList<Mensaje> mensaje;
    private Posicion posicion;

    public Usuario() {
    }

    public Usuario(String id) {
        this.id = id;
    }

    public Usuario(String nickname, String email, String pasword, ArrayList<Mensaje> mensaje, Posicion posicion) {
        this.nickname = nickname;
        this.email = email;
        this.pasword = pasword;
        this.mensaje = mensaje;
        this.posicion = posicion;
    }

    public Usuario(String id, String nickname, String email, String pasword, ArrayList<Mensaje> mensaje, Posicion posicion) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.pasword = pasword;
        this.mensaje = mensaje;
        this.posicion = posicion;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public ArrayList<Mensaje> getMensaje() {
        return mensaje;
    }

    public void setMensaje(ArrayList<Mensaje> mensaje) {
        this.mensaje = mensaje;
    }
    
}
