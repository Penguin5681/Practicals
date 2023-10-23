import java.awt.*;

public class Radio {
    public static void main(String[] args) {
        Frame frame = new Frame("Radio Button Example");
        CheckboxGroup group = new CheckboxGroup();

        Checkbox check1 = new Checkbox("Male", group, false);
        Checkbox check2 = new Checkbox("Female", group, false);
        Checkbox check3 = new Checkbox("Attack Helicopter", group, false);

        check1.setBounds(100, 50, 100, 30);
        check2.setBounds(100, 80, 100, 30);
        check3.setBounds(100, 110, 100, 30);

        frame.add(check1);
        frame.add(check2);
        frame.add(check3);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}