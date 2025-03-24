import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ECOapp extends JFrame {
    private JTextField textField1;



    public ECOapp() {
        super();
        setTitle("ECOapp");

        JComponent botoneira =botoneira();
        JComponent cadroTexto = cadroTexto();
        textField1 = (JTextField) cadroTexto;

       JSplitPane splitPane = new JSplitPane( JSplitPane.VERTICAL_SPLIT, botoneira, cadroTexto );
        getContentPane().add(splitPane);
        pack();
        setVisible(true);
    }

    private JComponent botoneira() {
        JPanel botoneira = new JPanel();
        JButton btnHola = new JButton("Boton");

        btnHola.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        textField1.setText("Hola");
                    }

                }
        );
        botoneira.add(btnHola);

        return botoneira;
    }

    private JComponent cadroTexto() {
        JTextField cadroTexto = new JTextField();
        cadroTexto.setText("Texto");


        return cadroTexto;
    }
}
