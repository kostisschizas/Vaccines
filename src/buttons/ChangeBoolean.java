package buttons;

import display.WindowManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeBoolean implements ActionListener {
    private int steps;

    public ChangeBoolean() {
        steps=0;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        boolean aBoolean = button.getText().equals("Ναί");

        if (aBoolean){
            WindowManager.area.setForeground(Color.GREEN);
            switch (steps){
                case 0:
                    WindowManager.area.setText("Ανήκεις στην 1η κατηγορία");
                    break;
                case 1:
                    WindowManager.area.setText("Ανήκεις στην 2η κατηγορία");
                    break;
                case 2:
                    WindowManager.area.setText("Ανήκεις στην 3η κατηγορία");
                    break;
                case 3:
                    WindowManager.area.setText("Ανήκεις στην 4η κατηγορία");
                    break;
                case 4:
                    WindowManager.area.setText("Ανήκεις στην 5η κατηγορία");
                    break;
                case 5:
                    WindowManager.area.setText("Ανήκεις στην 6η κατηγορία");
                    break;
                case 6:
                    WindowManager.area.setText("Ανήκεις στην 7η κατηγορία");
                    break;
                case 7:
                    WindowManager.area.setText("Ανήκεις στην 8η κατηγορία");
                    break;
                case 8:
                    WindowManager.area.setText("Ανήκεις στην 9η κατηγορία");
                    break;
            }
            WindowManager.setButtonsActive(false);

        } else {
            switch (steps) {
                case 0:
                    WindowManager.area.setText("Ανήκεις σε καποια από αυτές τις κατηγορίες?\n"+"Άτομα ηλικίας 85 ετών και άνω");
                    steps++;
                    break;
                case 1:
                    WindowManager.area.setText("Ανήκεις σε καποια από αυτές τις κατηγορίες?\n"+"Άτομα ηλικίας 80 ετών και άνω");
                    steps++;
                    break;
                case 2:
                    WindowManager.area.setText("Ανήκεις σε καποια από αυτές τις κατηγορίες?\n"+"Άτομα ηλικίας 75 ετών και άνω");
                    steps++;
                    break;
                case 3:
                    WindowManager.area.setText("Ανήκεις σε καποια από αυτές τις κατηγορίες?\n"+"α. Άτομα με υποκείμενα νοσήματα υψηλού κινδύνου\n" +
                            "\n" +
                            "(ανεξαρτήτως ηλικίας*)\n" +
                            "\n" +
                            "β. Άτομα ηλικίας 70 ετών και άνω");
                    steps++;
                    break;
                case 4:
                    WindowManager.area.setText("Ανήκεις σε καποια από αυτές τις κατηγορίες?\n"+"Άτομα ηλικίας 65 ετών και άνω");
                    steps++;
                    break;
                case 5:
                    WindowManager.area.setText("Ανήκεις σε καποια από αυτές τις κατηγορίες?\n"+"α. Άτομα ηλικίας 60 ετών και άνω\n" +
                            "\n" +
                            "β. Άτομα ηλικίας 18-59 ετών με υποκείμενα νοσήματα αυξημένου κινδύνου*");
                    steps++;
                    break;
                case 6:
                    WindowManager.area.setText("Ανήκεις σε καποια από αυτές τις κατηγορίες?\n"+"α. Εκπαιδευτικοί ηλικίας έως 59 ετών Πρωτοβάθμιας, Δευτεροβάθμιας και Τριτοβάθμιας εκπαίδευσης και εργαζόμενοι σε Βρεφονηπιακούς Σταθμούς\n" +
                            "\n" +
                            "β. Προσωπικό υπηρεσιών κρίσιμων τομέων της κρατικής λειτουργίας\n" +
                            "\n" +
                            "γ. Άτομα ηλικίας 18-59 ετών που διαμένουν σε δομές ομαδικής διαβίωσης με μεγάλο συγχρωτισμό");
                    steps++;
                    break;
                case 7:
                    WindowManager.area.setText("Ανήκεις σε καποια από αυτές τις κατηγορίες?\n"+"Άτομα 18–59 ετών χωρίς υποκείμενα νοσήματα τα οποία εμπίπτουν στις ανωτέρω κατηγορίες (προτεραιότητα βάσει ηλικίας: 55–59 ετών, κατόπιν 50– 54 ετών, 45–49 ετών κ.ο.κ.)");
                    steps++;
                    break;
                case 8:
                    WindowManager.area.setForeground(Color.RED);
                    WindowManager.area.setText("Δεν ανήκεις σε καμία κατηγορία");
                    steps++;
                    WindowManager.setButtonsActive(false);
                    break;
            }
        }


    }
}
