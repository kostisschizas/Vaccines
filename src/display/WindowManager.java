package display;

import buttons.ChangeBoolean;

import javax.swing.*;
import java.awt.*;

public class WindowManager {
    public static JTextArea area;
    public static JButton yes;
    public static JButton no;
    public static ChangeBoolean changeBoolean;

    public static void main(String[] args){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        JFrame frame = new JFrame("Εμβόλια");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize((int)(screenSize.getWidth()*0.85), (int)(screenSize.getHeight()*0.75));
        area = new JTextArea();
        area.setEditable(false);
        area.setForeground(Color.BLUE);
        area.setFont(new Font("Serif", Font.PLAIN, 14));

        JMenuBar bar= new JMenuBar();
        JMenu menu1 = new JMenu("Αρχείο");
        bar.add(menu1);
        JMenuItem m11 = new JMenuItem("Επαναφόρτωση");
        JMenuItem m12 = new JMenuItem("Έξοδος");
        menu1.add(m11);
        menu1.add(m12);

        m11.addActionListener(e -> {
            WindowManager.setButtonsActive(true);
            WindowManager.area.setForeground(Color.BLUE);
            WindowManager.changeBoolean.setSteps(0);
            WindowManager.area.setText("Ανήκεις σε καποια από αυτές τις κατηγορίες?\n"+ "α. Υγειονομικοί και προσωπικό κοινωνικών υπηρεσιών\n" +
                    "\n" +
                    "β. Ασθενείς και προσωπικό σε θεραπευτήρια χρονίως πασχόντων, κέντρα αποθεραπείας και αποκατάστασης, κέντρα κοινωνικής πρόνοιας, κέντρα διημέρευσης και ημερήσιας φροντίδας\n" +
                    "\n" +
                    "γ. Εκπαιδευτικοί, προσωπικό και μαθητές (ηλικίας 16 ετών και άνω) ειδικών σχολείων και κέντρων δημιουργικής απασχόλησης παιδιών με αναπηρία\n" +
                    "\n" +
                    "δ. Ατομα, που έρχονται σε επαφή με ζώα, που μπορεί να φέρουν μεταλλαγμένα  στελέχη του ιού SARS-CoV-2\n" +
                    "\n" +
                    "ε. Άτομα σημαντικά για τη διασφάλιση της λειτουργίας και της συνέχειας του κράτους");
        });

        m12.addActionListener(e -> System.exit(0));

        JPanel panel = new JPanel();
        yes = new JButton("Ναί");
        no = new JButton("Όχι");
        panel.add(yes);
        panel.add(no);
        changeBoolean=new ChangeBoolean();
        yes.addActionListener(changeBoolean);
        no.addActionListener(changeBoolean);

        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, bar);
        frame.getContentPane().add(BorderLayout.CENTER, area);
        frame.setVisible(true);

        area.setText("Ανήκεις σε καποια από αυτές τις κατηγορίες?\n"+ "α. Υγειονομικοί και προσωπικό κοινωνικών υπηρεσιών\n" +
                "\n" +
                "β. Ασθενείς και προσωπικό σε θεραπευτήρια χρονίως πασχόντων, κέντρα αποθεραπείας και αποκατάστασης, κέντρα κοινωνικής πρόνοιας, κέντρα διημέρευσης και ημερήσιας φροντίδας\n" +
                "\n" +
                "γ. Εκπαιδευτικοί, προσωπικό και μαθητές (ηλικίας 16 ετών και άνω) ειδικών σχολείων και κέντρων δημιουργικής απασχόλησης παιδιών με αναπηρία\n" +
                "\n" +
                "δ. Ατομα, που έρχονται σε επαφή με ζώα, που μπορεί να φέρουν μεταλλαγμένα  στελέχη του ιού SARS-CoV-2\n" +
                "\n" +
                "ε. Άτομα σημαντικά για τη διασφάλιση της λειτουργίας και της συνέχειας του κράτους");
    }

    public static void setButtonsActive(boolean active){
        yes.setEnabled(active);
        no.setEnabled(active);
    }
}
