package com.mycompany.calculadora;

public class App {
    public static void main(String ...a) {
        Model model = new Model();
        CalculadoraView view = new CalculadoraView();
        KeyboardController keyboardController = new KeyboardController(model);
        model.addView(view);
        view.addController(keyboardController);
    }
}