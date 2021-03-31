/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.forest.model;

/**
 *
 * @author Kyara Lizeth
 */
public class Tree {
    private String name;
    private String type;
    private float height;
    private String weather;
    private String extinction;

    public Tree (String name, String type, float height, String weather, String extinction) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.weather = weather;
        this.extinction = extinction;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the weather
     */
    public String getWeather() {
        return weather;
    }

    /**
     * @param weather the weather to set
     */
    public void setWeather(String weather) {
        this.weather = weather;
    }

    /**
     * @return the extinction
     */
    public String getExtinction() {
        return extinction;
    }

    /**
     * @param extinction the extinction to set
     */
    
     public void setExtinction(String extinction) {
        this.extinction = extinction;
    }
}


