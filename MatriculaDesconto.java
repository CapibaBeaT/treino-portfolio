/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe9universidcursos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Tagore Arruda
 */
public class MatriculaDesconto {
    
    public float valorManh, valorTard, valorNoit, valorVenc, mensal;
    public int menu;
    public String charConfirmVenc;
    public char charLetra;
    
    DecimalFormat df = new DecimalFormat("#.##");
    
    
    
    
    
    
    public void SysPagDesconto (){
    
        menu = Integer.parseInt(JOptionPane.showInputDialog(
                                "Digite '1' Se seu TURNO é o da 'MANHÃ'" +
                                "\n Digite '2' Se seu TURNO é o da 'TARDE'" +
                                "\n Digite '3' Se seu TURNO é o da 'NOITE'" +
                                "\n Digite '4' para SAIR do SISTEMA"  ));
                                  if (menu==4){System.exit(0);}

        charConfirmVenc = JOptionPane.showInputDialog("A Fatura está dentro do Vencimento?" +
                "\n Digite S para Sim"+
                "\n ou"+
                "\n Digite N para Não");
        charLetra = charConfirmVenc.charAt(0);
          
        
        mensal+=352.87;
        
                                    //MANHÃ 1
                        if (menu==1 && charLetra == 'S'){
                        valorManh = (float)(mensal*0.8);
                        valorVenc = (float)(valorManh*0.95);
                        JOptionPane.showMessageDialog
                        (null,"Mensalidade valor normal: " + mensal + "R$" +
                                         "\nMensalidade valor com desconto: " + df.format(valorVenc) + "R$");
                                                
                        }else if(menu==1 && charLetra == 'N'){
                        valorManh = (float)(mensal*0.8);
                        JOptionPane.showMessageDialog
                        (null,"Mensalidade valor normal: " + mensal + "R$" +
                                         "\nMensalidade valor com desconto: " + df.format(valorManh) + "R$");
                        }
        
                                        //TARDE 2
                        if (menu==2 && charLetra == 'S'){
                        valorTard = (float)(mensal*0.87);
                        valorVenc = (float)(valorTard*0.95);
                        JOptionPane.showMessageDialog
                        (null,"Mensalidade valor normal: " + mensal + "R$" +
                                         "\nMensalidade valor com desconto: " + df.format(valorVenc) + "R$");
                                                
                        }else if(menu==2 && charLetra == 'N'){
                        valorTard = (float)(mensal*0.87);
                        JOptionPane.showMessageDialog
                        (null,"Mensalidade valor normal: " + mensal + "R$" +
                                         "\nMensalidade valor com desconto: " + df.format(valorTard) + "R$");
                        }
        
                                    //NOITE 3
                        if (menu==3 && charLetra == 'S'){
                        valorVenc = (float)(mensal*0.95);
                        JOptionPane.showMessageDialog
                        (null,"Mensalidade valor normal: " + mensal + "R$" +
                                         "\nMensalidade valor com desconto: " + df.format(valorVenc) + "R$");
                                                
                        }else if(menu==3 && charLetra == 'N'){
                        JOptionPane.showMessageDialog
                        (null,"Mensalidade valor normal: " + mensal + "R$");
                        }
        

        
        
            
            }
        }
