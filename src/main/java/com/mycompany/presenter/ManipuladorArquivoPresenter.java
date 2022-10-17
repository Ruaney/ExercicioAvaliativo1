/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.presenter;

import com.mycompany.collection.OrdenarCollection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author ruanr
 */
public class ManipuladorArquivoPresenter {

    private static OrdenarCollection salarios;
    
    public ManipuladorArquivoPresenter(OrdenarCollection salarios) {
        this.salarios = salarios;
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            try {
                leitor(selectedFile.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("erro IOEXcpt");
            }
        }
    }

    public static void leitor(String path) throws IOException {
        try ( BufferedReader buffRead = new BufferedReader(new FileReader(path))) {
            String linha = buffRead.readLine();
            while (true) {
               linha = buffRead.readLine();

                if (linha != null ) {
                    salarios.addSalarios(Double.parseDouble(linha));
                } else {
                    break;
                }

            }
        }
    }
}
