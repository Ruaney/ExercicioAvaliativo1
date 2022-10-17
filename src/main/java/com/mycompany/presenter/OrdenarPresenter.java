/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presenter;

import com.mycompany.collection.OrdenarCollection;
import com.ufes.view.OrdenacaoView;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.text.Element;

/**
 *
 * @author ruanr
 */
public class OrdenarPresenter {

    OrdenarCollection salarios;
    OrdenacaoView view;

    public OrdenarPresenter(OrdenarCollection salarios, String option) {
        
        if (salarios.getSalarios().size() <= 0) {
            JOptionPane.showMessageDialog(view, "nenhum arquivo foi selecionado.", " Err IO ", JOptionPane.INFORMATION_MESSAGE);
            throw new RuntimeException("arquivo ");
        }

        this.salarios = salarios;

        if ("BUBBLESORT".equals(option)) {
            bubbleSort();
        } else {
            selectionSort();
        }
    }

    private void bubbleSort() {
        ArrayList<Double> lstSalarios;
        lstSalarios = salarios.getSalarios();
        Double temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < lstSalarios.size() - 1; i++) {
                if (lstSalarios.get(i).compareTo(lstSalarios.get(i + 1)) > 0) {
                    temp = lstSalarios.get(i);
                    lstSalarios.set(i, lstSalarios.get(i + 1));
                    lstSalarios.set(i + 1, temp);
                    sorted = false;
                }
            }
        }

    }

    private void selectionSort() {
        ArrayList<Double> lstSalarios;
        lstSalarios = salarios.getSalarios();

        for (int i = 0; i < lstSalarios.size(); i++) {
            int pos = i;
            for (int j = i; j < lstSalarios.size(); j++) {
                if (lstSalarios.get(j) < lstSalarios.get(pos)) {
                    pos = j;
                }
            }
            double min = lstSalarios.get(pos);
            lstSalarios.set(pos, lstSalarios.get(i));
            lstSalarios.set(i, min);

        }
    }
}
