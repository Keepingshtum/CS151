import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Math;

class magicEightBall extends JPanel {
    public void paintComponent(Graphics gc) {
        super.paintComponent(gc);
        Graphics2D circle = (Graphics2D) gc;
        Graphics2D circle2 = (Graphics2D) gc;
        gc.setColor(Color.BLACK);
        circle.fillOval(20, 30, 200, 200);
        gc.setColor(Color.WHITE);
        circle2.fillOval(70, 80, 100, 100);
        gc.setColor(Color.BLACK);
        gc.setFont(new Font(Font.MONOSPACED,  Font.BOLD, 70));
        gc.drawString("8", 100, 150); }
}
public class VictoriaLe extends JFrame implements ActionListener {
    public String response;
    public VictoriaLe() {
        setSize(500, 300);
        setTitle("Magic 8 Ball");
        setLocationRelativeTo(null);
        this.setLayout((new GridLayout(1, 2)));
        this.add(new magicEightBall());
        this.add(new button());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); }
    public void actionPerformed(ActionEvent ae) {
        String[] responses = {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it",
                "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy, try again", "Ask again later",
                "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it", "My reply is no",
                "My sources say no", "Outlook not so good", "Very Doubtful"};
        if (ae.getActionCommand().equals("Shake Magic 8 Ball")) {
            response = responses[(int) (Math.random() * responses.length)];
            JOptionPane.showMessageDialog(this, response, "Magic 8 Ball says:", JOptionPane.INFORMATION_MESSAGE); }
    }
    class button extends JPanel {
        public button() {
            JPanel p = new JPanel();
            JButton shake = new JButton("Shake Magic 8 Ball");
            shake.addActionListener(VictoriaLe.this);
            p.add(shake);
            add(p); }
    }
    public static void main(String[] args) {
        VictoriaLe m = new VictoriaLe();
        m.setVisible(true); }
}