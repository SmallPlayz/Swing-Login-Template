import javax.swing.*;  // Import all of Java Swing.

class Template {  // Start of class.
  
  private static int width = 500; // Width of GUI.
  private static int height = 500; // Height of GUI.
  
  public static void main(String []args){ // Start of main method.
    JFrame frame = new JFrame("Login Page"); // Creates new frame object with title "Login Page".
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Frame now exits on close.
    frame.setSize(width, height); // Frame height and width is now set to variables 'width' and 'height' declared and initialized on line 5 and 6.
    frame.setLayout(null); // Frame layout set to null.
    frame.setVisible(true); // Frame is now visible when code run.
  } // End of main method.
} // End of class.
