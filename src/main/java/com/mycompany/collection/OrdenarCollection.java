/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collection;

import java.util.ArrayList;

/**
 *
 * @author ruanr
 */
public class OrdenarCollection {

  
    /**
     * @return the salarios
     */
    public ArrayList<Double> getSalarios() {
        return salarios;
    }
    private ArrayList<Double> salarios;
    public OrdenarCollection() {
        salarios = new ArrayList<>();       
    }
    
    public void addSalarios(double salario){
        getSalarios().add(salario);
    }
    public void reset(ArrayList<Double> salariosReset){
        salarios = new ArrayList<>(salariosReset) ;
    }
}
