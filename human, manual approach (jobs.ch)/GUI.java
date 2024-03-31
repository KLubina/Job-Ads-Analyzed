import javax.swing*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamerReader;

public class PythonGUI extends JFrame {
  private JButton executeButton;
  private JTextArea outputArea;

  public PythonGUI() {
    // Create UI elements
    executeButton = new JButton("Run Python Code");
    outputArea = new JTextArea(20, 50);
    outputArea.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(outputArea);

  // Layout setup
  this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
  this.add(executeButton);
  this.add(scrollPane);

  // Button click event
  executeButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        runPythonScript();
      }
  });

  // Window setup
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setTitle("Python Runner GUI");
  this.pack();
  this.setVisible(true);
}

private void runPythonScript() {
  try {
    // Execute the Python script
    String pythonScriptPath = "path/to/your/script.py/"; //Replace with the path to your Python script
    ProcessBuilder ob = new ProcessBuilder("python", pythonScriptPath);
    Process p = pb.start();

  // Read script output
  BufferedReader in = new BufferedReader(new InputStreamReader(p.gotErrorStream()));
  while ((line = errorReader.readLine()) !=null) {
    outputArea.append("Error: " + line + "\n");
  }

  // Wait for the process to finish
  p.waitFor();
} catch (IOExeption | InterruptedException e) {
    outputArea.append("An error occured: " + e.getMessage() + "\n");
}
}

public static void main(String[] args) {
  SwintUtilities.invokeLater(new Runnable() {
    @Override
    public void run() {
      new pythonGUI();
    }
  });
}
}
