/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe8caixaeletronico;

import javax.swing.JOptionPane;




/**
 *
 * @author Camila Rodrigues
 */
public class MenuEletronico {
    public int menu;
    public int deposito;
    public int retirada;
    public int saldoFinal;
    
    public void MenuCxEletronic (){
        while(menu!=4){
                
                menu = Integer.parseInt(JOptionPane.showInputDialog(
                                "Digite '1' para DEPOSITAR DINHEIRO" +
                                "\n Digite '2' para RETIRAR DINHEIRO" +
                                "\n Digite '3' para SALDO DA CONTA" +
                                "\n Digite '4' para SAIR do SISTEMA"  ));






                
            switch (menu){
                case 1 ->   {deposito = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja depositar?"));
                            saldoFinal=deposito+saldoFinal;
                            JOptionPane.showMessageDialog(null, "Seu saldo agora é: R$" + saldoFinal);                            
                            }
                
                
                case 2 ->   {retirada = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja retirar?"));
                            if (saldoFinal>=retirada){
                                saldoFinal=saldoFinal-retirada;
                            } else {
                            JOptionPane.showMessageDialog(null,"Seu saldo é: R$" + 
                                    saldoFinal + ". Não poderá fazer seu Saque");
                            break;}
                            JOptionPane.showMessageDialog(null, "Seu saldo agora é: R$" + saldoFinal);                            
                            }                                   
                
                case 3 ->   {
                             JOptionPane.showMessageDialog(null,"Seu saldo é: R$" + saldoFinal);                    
                            }            

               
                case 4 ->   {                 
                            }                                    
                default ->  {JOptionPane.showMessageDialog(null,"Entrada Inválida\nFavor executar novamente");
                            }
            
            
            }    
        }
    }
    
    
    
    
    
    
    
    
    
}
