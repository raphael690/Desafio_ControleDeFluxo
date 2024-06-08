import java.util.Scanner;

import javax.swing.JOptionPane;

public class Contador {
    public static void main (String[] args){
     /* Scanner terminal = new Scanner(System.in);
 
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();*/
        

        try{
            String parametroUmStr = JOptionPane.showInputDialog(null,"Digite o primeiro parâmetro");
            String parametroDoisStr= JOptionPane.showInputDialog(null,"Digite o segundo parâmetro");
            
            //Converter os parâmetros para inteiros
            int parametroUm = Integer.parseInt(parametroUmStr);
            int parametroDois = Integer.parseInt(parametroDoisStr);


            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            //System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            JOptionPane.showMessageDialog(null,"O segundo parâmetro deve ser maior que o primeiro" );
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        // validar se parametroUm é Maior que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }        

        int contagem = parametroDois - parametroUm;
        StringBuilder mensagem = new StringBuilder();
        //realizar o for para imprimir os números com base na variável contagem
        for(int i = 0; i < contagem; i++){
           // System.out.println("Imprimindo o número " +i);
            mensagem.append("Imprimindo o número ").append(i).append("\n");
            
        }
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

}
