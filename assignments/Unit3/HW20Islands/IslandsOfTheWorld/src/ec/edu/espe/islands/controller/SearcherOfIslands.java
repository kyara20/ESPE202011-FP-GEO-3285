/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.islands.controller;

/**
 *
 * @author Kyara Lizeth
 */
public class SearcherOfIslands {
        public static int findIslands(String [] islands, String x){
        for(int i = 0; i < islands.length; i++){    
            if(islands[i].equals(x)){
                return i;
            }
        }
        return -1; 
    }
}



