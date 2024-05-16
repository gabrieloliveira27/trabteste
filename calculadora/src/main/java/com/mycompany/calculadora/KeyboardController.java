import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyboardController implements Controller {

    private Model model;
    private View view; // Supondo que você tenha uma instância da classe View aqui

    public KeyboardController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

   
    public void receiveInput(String input) {
        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                model.appendNumber(Integer.parseInt(input));
                break;
            case "+":
            case "-":
            case "*":
            case "/":
                model.appendOperator(input);
                break;
            case "=":
                double result = model.calculate();
                // Atualizar a view com o resultado
                view.updateDisplay(Double.toString(result));
                break;
            case "c":
                model.clear();
                // Limpar a view
                break;
            default:
                // Lidar com outros botões, se houver
                break;
        }
    }
}
