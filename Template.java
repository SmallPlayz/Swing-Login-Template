import javax.swing.*;  // Import all of Java Swing.
import java.awt.*;  // Import all of Java AWT.
import java.awt.event.ActionEvent; // Import ActionEvent class.
import java.awt.event.ActionListener; // Import ActionListener class.

class Template {  // Start of class.
  
  private static int width = 400; // Width of GUI.
  private static int height = 275; // Height of GUI.
  
  public static void main(String []args){ // Start of main method.
    JFrame frame = new JFrame("Login Page"); // Creates new JFrame object with title "Login Page".
    JButton button = new JButton("Login"); // Creates new JButton object with text "Login".
    JTextField textField = new JTextField(); // Creates new JTextField object to write username in.
    JPasswordField passwordField = new JPasswordField(); // Creates new JPasswordField object to write password in.
    JLabel signinLabel = new JLabel("Sign In"); // Creates new JLabel object to be the title of the GUI.

    button.setBounds(150, 150, 100,40 ); // Sets button's coordinates and size.
    textField.setBounds(100, 50, 200,40 ); // Sets textField's coordinates and size.
    passwordField.setBounds(100, 100, 200,40 ); // Sets passwordFields coordinates and size.
    signinLabel.setBounds(165, 25, 100,30 ); // Sets signinLabel's coordinates and size.

    frame.add(button); // Adds button object to the frame object.
    frame.add(textField); // Adds textField object to the frame object.
    frame.add(passwordField); // Adds passwordField object to the frame object.
    frame.add(signinLabel); // Adds signinLabel object to the frame object.

    signinLabel.setFont(new Font("Verdana",Font.BOLD,15)); // Sets signinLabel's font to "Verdana", Bold, and size to 15.
    textField.setFont(new Font("Verdana",Font.BOLD,15)); // Sets textField's font to "Verdana", Bold, and size to 15.
    passwordField.setFont(new Font("Verdana",Font.BOLD,15)); // Sets passwordField's font to "Verdana", Bold, and size to 15.

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Frame now exits on close.
    frame.setSize(width, height); // Frame height and width is now set to variables 'width' and 'height' declared and initialized on line 5 and 6.
    frame.setResizable(false); // Frame can no longer be manually resized by user.
    frame.setLayout(null); // Frame layout set to null.
    frame.setVisible(true); // Frame is now visible when code run.

    button.addActionListener(new ActionListener(){ // ActionListerner for sign-in button.
      public void actionPerformed(ActionEvent e){ // Button code starts here.

        if(textField.getText().trim().equalsIgnoreCase("Admin") && passwordField.getText().trim().equals("password")) { // Runs if the textField is equal to "admin" or "Admin" and the passwordField is equal to "password".
          System.out.println("Access Granted"); // Prints "Access Granted".
          MainFrame mainFrame = new MainFrame(); // Creates new MainFrame object.
          frame.setVisible(false); // Sets sign-in frame invisible.
        } // End of if statement.
        else { // If the above if statement was not 'true' then code under will run.
          textField.setText("Access Denied"); // Sets texField's text to "Access Denied".
          passwordField.setText(""); // Resets the password Field.
        } // End of else statement.

      } // Button code ends here.
    }); // Button ActionListener ends here.
  } // End of main method.
} // End of class.

class MainFrame { // Main Frame code that will open if you sign in correctly.
  MainFrame(){ // This code is run when MainFrame object is created.
    JFrame frame = new JFrame("Main Frame"); // Creates new frame for the Main Frame.
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Frame now exits on close.
    frame.setSize(600, 600); // Frame height and width is now set to variables 'width' and 'height' declared and initialized on line 5 and 6.
    frame.setResizable(false); // Frame can no longer be manually resized by user.
    frame.setLayout(null); // Frame layout set to null.

    /* **************************************************

    Write your own code here to make anything open when you sign in correctly!

    ************************************************** */

    frame.setVisible(true); // Frame is now visible when code run.
  }
}