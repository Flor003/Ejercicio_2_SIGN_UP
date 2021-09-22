import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registro {
    private JPanel panelRegistro;
    private JTextField usuario;
    private JTextField apellido;
    private JTextField fechanacimiento;
    private JTextField genero;
    private JTextField correo;
    private JPasswordField contraseña;
    private JButton registrarmeButton;
    private JTextField nombre;
    private JTextArea tout;

    public Registro() {
        registrarmeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = usuario.getText();
                String name = nombre.getText();
                String lastname = apellido.getText();
                String date = fechanacimiento.getText();
                String gender = genero.getText();
                String email = correo.getText();
                String password = contraseña.getText();
                if (e.getSource() == registrarmeButton) {
                    String data
                            = "Usuario : " + usuario.getText() + "\n"
                            + "Nombre : " + nombre.getText() + "\n";
                    String data2
                            = "Apellido: " + apellido.getText() + "\n"
                            + "Fecha de nacimiento: " + fechanacimiento.getText() + "\n"
                            + "Genero : " + genero.getText() + "\n";
                    String data3
                            = "Correo : " + correo.getText()+ "\n"
                            + "Contraseña : " + contraseña.getText();

                        tout.setText(data +  data2 + data3);
                        tout.setEditable(false);
                    }
                JOptionPane.showMessageDialog(null,"Registrado Correctamente");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Registro");
        frame.setContentPane(new Registro().panelRegistro);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
