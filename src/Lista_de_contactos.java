import javax.swing.*;

public class Lista_de_contactos {

    static String[][] lista = new String[5][3];


    public static void main(String[] args) {

        boolean repetir = false;

        while (repetir == false) {
            String menu = JOptionPane.showInputDialog("1. Agregar contacto \n" +
                    "2. Buscar contacto \n" +
                    "3. Borrar contacto \n" +
                    "0. Salir");
            switch (menu) {
                case "1":

                    int poscision = Integer.parseInt(JOptionPane.showInputDialog("ingrese en que poscision va a " +
                            "guardar su contacto \n" + "0. " + lista[0][0] + "\n" +
                            "1. " + lista[1][0] + "\n" +
                            "2. " + lista[2][0] + "\n" +
                            "3. " + lista[3][0] + "\n" +
                            "4. " + lista[4][0] + "\n"));
                    if (poscision >= 0 && poscision <= 4) {
                        if (lista[poscision][0] != null) {
                            String sobreescribir = JOptionPane.showInputDialog("desea sobreescribir el contacto" +
                                    lista[poscision][0] + "\n 1. si \n 2. no");
                            if (sobreescribir.equalsIgnoreCase("1")) {
                                lista[poscision][0] = JOptionPane.showInputDialog("Ingrese nombre del contacto");
                                lista[poscision][1] = JOptionPane.showInputDialog("ingrese numero del contacto");
                                lista[poscision][2] = JOptionPane.showInputDialog("Ingrese direccion del contacto");
                            } else {
                                JOptionPane.showMessageDialog(null, "No se realiza ninguna accion");
                            }
                        } else {
                            lista[poscision][0] = JOptionPane.showInputDialog("Ingrese nombre del contacto");
                            lista[poscision][1] = JOptionPane.showInputDialog("ingrese numero del contacto");
                            lista[poscision][2] = JOptionPane.showInputDialog("Ingrese direccion del contacto");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "poscision invalida, por favor " +
                                "seleccione un numero del 0 al 4");
                    }
                    break;
                case "2":
                    int buscar = Integer.parseInt(JOptionPane.showInputDialog("ingrese en que poscision va a " +
                            "buscar" + "\n" + "0. " + lista[0][0] + "\n" +
                            "1. " + lista[1][0] + "\n" +
                            "2. " + lista[2][0] + "\n" +
                            "3. " + lista[3][0] + "\n" +
                            "4. " + lista[4][0] + "\n"));

                    JOptionPane.showMessageDialog(null, "Nombre: " + lista[buscar][0] +
                            "\n Telefono: " + lista[buscar][1] + "\n Direccion: " + lista[buscar][2]);
                    break;
                case "3":
                    int borrar = 0;
                    borrar = Integer.parseInt(JOptionPane.showInputDialog("ingrese el contacto que desea borrar"));
                    lista[borrar][0] = null;
                    lista[borrar][1] = null;
                    lista[borrar][2] = null;
                    JOptionPane.showMessageDialog(null, "contacto borrado");
                    break;
                case "0":
                    repetir = true;
                    break;
                default:
            }
        }
    }
}
