package br.com.poo.aula5;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Condominio {
    public static void main(String[] args){
        List<Casa> torre1 = new ArrayList<Casa>();

        torre1.add(new Casa(02, "katucha", 1231233, "Junior"));

        JOptionPane.showMessageDialog(null,"Lista vazia: " + torre1.isEmpty());
    }
}
