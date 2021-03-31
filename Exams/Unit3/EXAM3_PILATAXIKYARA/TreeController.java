/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.forest.controller;

import ec.edu.espe.forest.model.Tree;
import utils.FileManager;

/**
 *
 * @author Kyara Lizeth
 */
public class TreeController {
     public void save(Tree tree){
        String data = tree.getName() + ";" + tree.getType() + ";" + tree.getHeight() + ";" + tree.getWeather() + ";" + tree.getExtinction();
        FileManager.save(data, "Flowers");
    }  
}
   
