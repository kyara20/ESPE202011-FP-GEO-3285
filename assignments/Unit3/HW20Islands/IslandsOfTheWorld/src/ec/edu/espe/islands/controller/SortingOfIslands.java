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
public class SortingOfIslands {
    public String [] sortOfIslands(String islands []) {
        
        int n = islands.length;
        String temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (islands[j].equals(j)){
                    //swap
                    temp = islands[j];
                    islands[j] = islands[j + 1];
                    islands[j + 1] = temp;
                } else {
                }
            }
        }
        return islands;
    }
}
