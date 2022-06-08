/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firebase2;

/**
 *Clase donde se establecen los datos de los usuarios
 * @author Carlos Carmona Castillo
 */
public class Usuarios {

    /**
     *Variable que guarda el id del usuario
     */
    public int id;

    /**
     * Función toString(), para dar formato a la cadena donde se escriben los datos
     * @return String con todos los datos
     */
    @Override
    public String toString() {
        return "Usuarios{" + "id=" + id + ", email=" + email + ", password=" + password + ", rol=" + rol + '}';
    }

    /**
     *Variable que guarda el email del usuario
     */
    public String email;

    /**
     *Variable que guarda la contraseña del usuario
     */
    public String password;

    /**
     *Variable que guarda el rol del usuario
     */
    public int rol;

    /**
     * Constructor de la clase sin parametros
     */
    public Usuarios() {
    }

    /**
     *Constructor de la clase que recibe los datos como parámetros
     * @param id
     * @param email
     * @param password
     * @param rol
     */
    public Usuarios(int id, String email, String password, int rol) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }

    /**
     * Método get de la variable id de tipo int
     * @return id del usuario
     */
    public int getId() {
        return id;
    }

    /**
     *Método get de la variable email de tipo String
     * @return email del usuario
     */
    public String getEmail() {
        return email;
    }

    /**
     *Método get de la variable password de tipo String
     * @return contraseña del usuario
     */
    public String getPassword() {
        return password;
    }

    /**
     *Método get de la variable rol de tipo int
     * @return rol del usuario
     */
    public int getRol() {
        return rol;
    }

    /**
     * Método set de la variable id de tipo int
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *Método set de la variable email de tipo String
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *Método set de la variable password de tipo String
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *Método set de la variable rol de tipo int
     * @param rol
     */
    public void setRol(int rol) {
        this.rol = rol;
    }
 
}
