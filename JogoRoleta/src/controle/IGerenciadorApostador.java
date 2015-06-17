/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dados.IDAOApostador;
import java.util.ArrayList;
import modelo.Apostador;

/**
 *
 * @author CCE
 */
public interface IGerenciadorApostador 
{
    public void novoApostador(String nome);   
    public void removerApostador(int idApostador);
    public ArrayList<Apostador> getApostadores();
    public Apostador getApostador(int idApostador);
    public IDAOApostador getDAOApostadores();
      
}
