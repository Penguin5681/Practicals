import java.awt.*;

public class Form {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Frame frame = new Frame("Form");
        Label firstName = new Label("First Name: ");
        Label lastName = new Label("Last Name: ");
        Label age = new Label("Age: ");
        Label email = new Label("Email: ");
        Label phone = new Label("Phone: ");
        Choice gender = new Choice();
        gender.add("Male");
        gender.add("Female");
        gender.add("Trans");
        Label temp = new Label(" "); 


        firstName.setBounds(100, 100, 60, 10);
        lastName.setBounds(100, 200, 60, 10);
        age.setBounds(100, 300, 50, 10);
        email.setBounds(100, 400, 50, 10);
        phone.setBounds(100, 500, 50, 10);
        temp.setBounds(100, 600, 30, 10);
        gender.setBounds(100, 550, 90, 20);

        TextField fName = new TextField("First Name: "); 
        TextField lName = new TextField("Last Name"); 
        TextField ageField = new TextField("Age"); 
        TextField emailField = new TextField("Email"); 
        TextField phoneField = new TextField("Phone"); 
        TextField tempField = new TextField(" ");

        Button button = new Button("Click ME!");
        button.setBounds(100, 650, 80, 30);

        fName.setBounds(200, 100, 150, 25);
        lName.setBounds(200, 200, 150, 25);
        ageField.setBounds(200, 300, 150, 25);
        emailField.setBounds(200, 400, 150, 25);
        phoneField.setBounds(200, 500, 150, 25);
        tempField.setBounds(200, 600, 150, 25);

        frame.setSize(1000, 1000);
        frame.setResizable(false);

        frame.add(firstName);
        frame.add(lastName);
        frame.add(age);
        frame.add(email);
        frame.add(phone);
        frame.add(temp);
        frame.add(gender);

        frame.add(button);

        frame.add(fName);
        frame.add(lName);
        frame.add(ageField);
        frame.add(emailField);
        frame.add(phoneField);
        frame.add(tempField);
        frame.setVisible(true);
    }

}
