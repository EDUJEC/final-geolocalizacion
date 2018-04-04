/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.hdp;

/**
 *
 * @author JOSEEDUARDO
 */
public class Posicion {
    private double lat;
    private double lon;
    
    public Posicion() {
    }

    public Posicion(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

}
