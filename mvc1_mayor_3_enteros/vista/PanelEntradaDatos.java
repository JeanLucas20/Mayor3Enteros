package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------
    // Atributos
    //------------------
    private JLabel lbTitulo;
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbX;
    private JLabel lbY;
    private JLabel lbZ;
    private JTextField tfX;
    private JTextField tfY;
    private JTextField tfZ;

    //------------------
    // Métodos
    //------------------

    //Metodo constructor
    public PanelEntradaDatos()
    {
        //Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.black);

        //Crear y agregar etiqueta para titulo
        lbTitulo = new JLabel("MAYOR 3 ENTEROS", JLabel.CENTER);
        lbTitulo.setFont(new Font("chiller",Font.BOLD, 20));
        lbTitulo.setForeground(Color.white);
        lbTitulo.setBounds(0,10,480, 20);
        this.add(lbTitulo);

        //Creacion y adición etiquete X
        lbX = new JLabel("X = ", JLabel.RIGHT);
        lbX.setFont(new Font("chiller",Font.BOLD, 20));
        lbX.setForeground(Color.white);
        lbX.setBounds(0,50,120, 20);
        this.add(lbX);

        //Creacion y adición campo de texto X
        tfX = new JTextField();
        tfX.setFont(new Font("chiller",Font.BOLD, 20));
        tfX.setForeground(Color.black);
        tfX.setBounds(120,50,120, 20);
        this.add(tfX);

        //Creacion y adición etiquete Y
        lbY = new JLabel("Y = ", JLabel.RIGHT);
        lbY.setFont(new Font("chiller",Font.BOLD, 20));
        lbY.setForeground(Color.white);
        lbY.setBounds(0,100,120, 20);
        this.add(lbY);

        //Creacion y adición campo de texto Y
        tfY = new JTextField();
        tfY.setFont(new Font("chiller",Font.BOLD, 20));
        tfY.setForeground(Color.black);
        tfY.setBounds(120,100,120, 20);
        this.add(tfY);

        //Creacion y adición etiquete Z
        lbZ = new JLabel("Z = ", JLabel.RIGHT);
        lbZ.setFont(new Font("chiller",Font.BOLD, 20));
        lbZ.setForeground(Color.white);
        lbZ.setBounds(0,150,120, 20);
        this.add(lbZ);

        //Creacion y adición campo de texto Z
        tfZ = new JTextField();
        tfZ.setFont(new Font("chiller",Font.BOLD, 20));
        tfZ.setForeground(Color.black);
        tfZ.setBounds(120,150,120, 20);
        this.add(tfZ);

        //Creación y adición de imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/mario.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(310,60,100,100);
        this.add(lbImagen);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
        borde.setTitleColor(Color.red);
        this.setBorder(borde);
    }

    //metodos de acceso a la información
    public String getTfX()
    {
        return tfX.getText();
    }

    public String getTfY()
    {
        return tfY.getText();
    }

    public String getTfZ()
    {
        return tfZ.getText();
    }

    //metodo para borrar las cajas de texto
    public void borrar()
    {
        tfX.setText("");
        tfY.setText("");
        tfZ.setText("");
    }
}
