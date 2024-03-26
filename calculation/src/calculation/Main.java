package calculation;

import javax.swing.JOptionPane;

import calculation.model.Entity;
import calculation.service.calculationService;

public class Main {
    
    public static void main(String[] args) {
        calculationService calculationService = new calculationService();
        Entity entity = new Entity();
        
        // Obter o valor principal
        double valorPrincipal = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor principal: "));
        
        // Obter a taxa
        float taxa = Float.parseFloat(JOptionPane.showInputDialog("Entre com a taxa: "));
        
        // Obter o total de meses
        int meses = Integer.parseInt(JOptionPane.showInputDialog("Entre com o total de meses: "));
        
        try {
            int option = showOptionDialog();
            System.out.println("Opção selecionada: " + option);
            
            if (option == 1) {
                System.out.println("Calculo Financeiro_Simples");
                entity = calculationService.jurosSimples(entity, valorPrincipal, taxa, meses);
                System.out.println("Resultado");
            } else if (option == 2) {
                System.out.println("Calculo Financeiro_JurosComposto");
                entity = calculationService.jurosComposto(entity, valorPrincipal, taxa, meses);
                System.out.println("Resultado");
            } else {
                System.err.println("Opção Inválida");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("@fim");
    }
    
    private static int showOptionDialog() {
        String[] options = {"Juros Simples", "Juros Composto"};
        int choice = JOptionPane.showOptionDialog(null, "Escolha uma opção de cálculo de juros:", "Opções",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        // Adicionando 1 ao índice retornado para que corresponda ao 1º (Juros Simples) e 2º (Juros Compostos) caso
        return choice + 1;
    }
}
