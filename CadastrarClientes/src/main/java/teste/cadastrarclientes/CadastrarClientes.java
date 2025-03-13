/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package teste.cadastrarclientes;

import javax.swing.JOptionPane;
import services.ViaCepService;
import telas.FrmCadastroClientes;
import telas.FrmLogin;

/**
 *
 * @author Nara Rubia B. Balena
 */
public class CadastrarClientes {

    public static void main(String[] args) {
       // FrmCadastroClientes frmCadastro = new FrmCadastroClientes();
        // frmCadastro.setVisible(true); 
        
        try{
            FrmLogin frmLogin = new FrmLogin();
            frmLogin.setResizable(false); 
            frmLogin.setVisible(true);
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao iniciar! " + e.getMessage());
        }
        
        
        
    }
}
