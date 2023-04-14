package packageGUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class frameButtons extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    frameButtons(){
        
        label = new JLabel();
        ImageIcon icon = new ImageIcon("vasco.png");
        label.setBackground(Color.red);
        label.setIcon(icon);
        label.setBounds(150, 250, 300, 300);
        label.setVisible(false);



        button = new JButton();
        button.setBounds(100, 100, 250, 100);
        button.setText("im a button");
        button.addActionListener(this);
        button.setFocusable(false);
        //button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.green);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setEnabled(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            System.out.println("poo");
            //button.setEnabled(false);
            label.setVisible(true);
        }
    }

}
