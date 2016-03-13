package boletin.pkg20;

import javax.swing.JOptionPane;

/**
 *
 * @author galle
 */
public class Boletin20 {
    public static void main(String[] args) {
        Metodos obj = new Metodos();

        for (boolean b = false; b == false;) {

            switch (Integer.parseInt(obj.introducir("la opcion:\n\n1.) Añadir Libro\n2.) Ver numero de correos en la bandeja\n3.) Ver si hay correos por leer\n4.) Ver el primer correo no leido\n5.) Ver el correo deseado\n6.) Eliminar correo\n7.) Salir"))) {
                case 1:
                    Libro obj2 = new Libro();
                    obj.introducir(obj2);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Numero de correos sin leer es " + obj.numeroDeCorreos());
                    break;
                case 3:
                    if (obj.porLer() == true) {
                        JOptionPane.showMessageDialog(null, "Hay correos por leer");
                    } else {
                        JOptionPane.showMessageDialog(null, "Estan todos los correos leidos");
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, obj.amosaPrimerNoLeido());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, obj.amosa(Integer.parseInt(obj.introducir("numero del correo"))));
                    break;
                case 6:
                    obj.elimina(Integer.parseInt(obj.introducir("el numero del correo que quieres eliminar")));
                    break;
                case 7:
                    b = true;
                    break;

                default:
                    break;
            }

        }
    }
    
}
