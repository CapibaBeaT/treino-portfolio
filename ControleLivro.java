/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exe5controlemprestlivro;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author Tagore Arruda
 */
public class ControleLivro {
    
    public String livro_Nome, cli_Leitor;
    public int dias;
    
    Date dtEntrega = new Date();
    Calendar c = Calendar.getInstance();
    
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    
    public void Emprestimo(){
    
        cli_Leitor = JOptionPane.showInputDialog("Escreva seu nome");
        livro_Nome = JOptionPane.showInputDialog("Qual o nome do livro?");
        dias = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias ficará com o livro?"));
        
        c.setTime(dtEntrega);
        c.add(Calendar.DATE, + dias);
        
        
        
        System.out.println();
        
        JOptionPane.showMessageDialog(null,cli_Leitor + 
                                       ", O Livro (" + livro_Nome + 
                                       ") Deverá ser entrega na Data: " + 
                                        (formatter.format(c.getTime())));  
    } 
}
