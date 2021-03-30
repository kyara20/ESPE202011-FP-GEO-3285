/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.flowerShop.controller;

import ec.edu.espe.flowerShop.model.Flower;
import utils.FileManager;

/**
 *
 * @author Kyara Lizeth
 */
public class FlowerController {
    public void save(Flower flower){
        String data = flower.getType() + ";" + flower.getKingdom() + ";" + flower.getColor() + ";" + flower.getCountryOfOrigin() + ";" + flower.getExportQuantity();
        FileManager.save(data, "Flowers");
    }  
}
