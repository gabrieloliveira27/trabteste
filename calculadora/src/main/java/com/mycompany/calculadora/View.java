package com.mycompany.calculadora;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class View extends JFrame {

    private JTextField display;

    public View() {
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        display = new JTextField();
        display.setEditable(false);
        getContentPane().add(display, java.awt.BorderLayout.NORTH);

        // Adicione outros componentes da interface gráfica aqui, como botões, etc.
    }

    public void updateDisplay(String text) {
        display.setText(text);
    }

    // Adicione métodos para atualizar outros componentes da interface gráfica conforme necessário
}
