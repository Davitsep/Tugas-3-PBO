package Main;
import javax.swing.*;
import java.awt.event.*;
import Ruang.*;

public class Interface extends JFrame {

    JLabel lJudul = new JLabel("Kalkulator Balok");
    JLabel lPanjang = new JLabel("Length");
    JLabel lLebar = new JLabel("Width");
    JLabel lTinggi = new JLabel("Height");
    JLabel lLuas = new JLabel();
    JLabel lKeliling = new JLabel();
    JLabel lVolume = new JLabel();
    JLabel lLuasPermukaan = new JLabel();

    JTextField tfPanjang = new JTextField();
    JTextField tfLebar = new JTextField();
    JTextField tfTinggi = new JTextField();

    JButton btnCount = new JButton("Count");
    JButton btnReset = new JButton("Reset");

    public Interface(){
        setTitle("Tugas 3");
        setSize(400, 400);
        setLayout(null);

        add(lJudul);
        add(lPanjang);
        add(lLebar);
        add(lTinggi);
        add(lLuas);
        add(lKeliling);
        add(lVolume);
        add(lLuasPermukaan);


        add(tfPanjang);
        add(tfLebar);
        add(tfTinggi);

        add(btnCount);
        add(btnReset);

        lJudul.setBounds(125,10,200,20);

        lPanjang.setBounds(20, 60, 100, 20);
        tfPanjang.setBounds(130, 60, 200, 20);

        lLebar.setBounds(20,90,100,20);
        tfLebar.setBounds(130,90,200,20);

        lTinggi.setBounds(20,120,100,20);
        tfTinggi.setBounds(130,120,200,20);

        lLuas.setBounds(50, 200,200,20);
        lKeliling.setBounds(50, 220,200,20);
        lVolume.setBounds(160, 200,200,20);
        lLuasPermukaan.setBounds(160, 220,200,20);

        btnCount.setBounds(110,300,80,20);
        btnReset.setBounds(210,300,80,20);

        btnCount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double panjang = 0, lebar = 0, tinggi = 0;
                try{
                    panjang = Double.parseDouble(tfPanjang.getText());
                    lebar = Double.parseDouble(tfLebar.getText());
                    tinggi = Double.parseDouble(tfTinggi.getText());
                } catch (NumberFormatException err){
                    JOptionPane.showMessageDialog(null, "Error!! \n" + err.getMessage());
                } finally {
                    Balok balok = new Balok(panjang, lebar, tinggi);
                    lLuas.setText("Luas : " + balok.hitungLuas());
                    lKeliling.setText("Keliling : " + balok.hitungKeliling());
                    lVolume.setText("Volume : " + balok.hitungVolume());
                    lLuasPermukaan.setText("Luas Permukaan : " + balok.hitungLuasPermukaan());
                }
            }
        });

        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfPanjang.setText("");
                tfLebar.setText("");
                tfTinggi.setText("");
                lLuas.setText("");
                lKeliling.setText("");
                lVolume.setText("");
                lLuasPermukaan.setText("");
            }
        });

        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}