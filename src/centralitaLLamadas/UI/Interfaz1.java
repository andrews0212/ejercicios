package centralitaLLamadas.UI;

import centralitaLLamadas.Centralita;
import centralitaLLamadas.LlamadaTelefonica;
import centralitaLLamadas.Llamadas;
import centralitaLLamadas.Local;

import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;

public class Interfaz1 extends JDialog {

    private String[] ArrayMuestra;

    private Centralita centralita;

    private JPanel contentPane;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JButton llamarButton;
    private JList list1;

    private JLabel label;
    private JButton buttonOK;
    private JButton buttonCancel;

    public Interfaz1() {
        centralita = new Centralita();
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        llamarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedItem().equals("Local")) {
                    try {
                        Llamadas llamadaL;
                        try {
                            centralita.añadirllamada(llamadaL = new Local(textField1.getText(), textField2.getText(), Double.parseDouble(textField3.getText())));

                        } catch (LlamadaTelefonica E){
                            System.out.println(E);
                        }
                        ArrayMuestra = new String[centralita.getLlamadas().size()];
                    } catch (NumberFormatException err) {
                        JOptionPane.showMessageDialog(null,"Error al colocar los datos");
                    }


                } else if (comboBox1.getSelectedItem().equals("Provincial")){
                    try {
                        Llamadas llamadaP;
                        try {
                            centralita.añadirllamada(llamadaP = new Local(textField1.getText(), textField2.getText(), Double.parseDouble(textField3.getText())));
                        } catch (LlamadaTelefonica E){
                            System.out.println(E);
                        }
                        ArrayMuestra = new String[centralita.getLlamadas().size()];
                    } catch (NumberFormatException err){
                        JOptionPane.showMessageDialog(null,"Error al colocar los datos");
                    }
                }

                for (int i = 0; i < ArrayMuestra.length; i++) {
                    ArrayMuestra[i] = String.format("Numero origen %s : Numero Destino : %s Duracion:  %s", centralita.getLlamadas().get(i).getNumeroOrigen(), centralita.getLlamadas().get(i).getNumeroDestino(), centralita.getLlamadas().get(i).getDuracion());
                }
                list1.setListData(ArrayMuestra);
                label.setText(String.format("Cantidad de llamadas %s // total : %s", ArrayMuestra.length, centralita.getMontoTotal()));
                };

            });

    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
    public static void main(String[] args) {
        Interfaz1 dialog = new Interfaz1();
        dialog.pack();
        dialog.setSize(800,600);
        dialog.setVisible(true);
        System.exit(0);
    }

}
