/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.flowerShop.model;

/**
 *
 * @author Kyara Lizeth
 */
public class Flower {
    private String type;
    private String kingdom;
    private String color;
    private String countryOfOrigin;
    private float exportQuantity;

    public Flower(String type, String kingdom, String color, String countryOfOrigin, float exportQuantity) {
        this.type = type;
        this.kingdom = kingdom;
        this.color = color;
        this.countryOfOrigin = countryOfOrigin;
        this.exportQuantity = exportQuantity;
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
     * @return the kingdom
     */
    public String getKingdom() {
        return kingdom;
    }

    /**
     * @param kingdom the kingdom to set
     */
    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the countryOfOrigin
     */
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * @param countryOfOrigin the countryOfOrigin to set
     */
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    /**
     * @return the exportQuantity
     */
    public float getExportQuantity() {
        return exportQuantity;
    }

    /**
     * @param exportQuantity the exportQuantity to set
     */
    public void setExportQuantity(float exportQuantity) {
        this.exportQuantity = exportQuantity;
    }
    
}
