package boletin.pkg20;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Metodos {
    ArrayList <Libro> arrayLibro= new ArrayList();
    
    public String introducir(String i){
        return JOptionPane.showInputDialog("Introduce "+i);
    }
    public void añadirLibro(Libro i){
        arrayLibro.add(i);
    }
    public void vender (int i){
        arrayLibro.remove(i);
    }
    public void mostrarTodos (){
        int aux;
        String aux2;
        for (int i = 0; i < arrayLibro.size() - 1; i++) {
            for (int j = i + 1; j < arrayLibro.size(); j++) {
                if (notas[i] > notas[j]) {
                    aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                    aux2 = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = aux2;
                }
            }
        }
    }    
    
}
