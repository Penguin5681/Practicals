import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuExample {
    public static void main(String[] args) {
        JFrame menuFrame = new JFrame("MenuExample");
        
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu viewMenu = new JMenu("View");
        JMenu HelpMenu = new JMenu("Help");
        
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem recentItem = new JMenuItem("Open Recent");

        JMenuItem undoItem = new JMenuItem("Undo");
        JMenuItem redoItem = new JMenuItem("Redo");
        JMenuItem cutItem = new JMenuItem("Cut");

        JMenuItem searchItem = new JMenuItem("Search");
        JMenuItem FullScreenItem = new JMenuItem("Full Screen");
        JMenuItem zenModeItem = new JMenuItem("Zen Mode");

        JMenuItem updateItem = new JMenuItem("Check for Updates");
        JMenuItem aboutItem = new JMenuItem("About");
        JMenuItem supportItem = new JMenuItem("Support");

        editMenu.add(undoItem);
        editMenu.add(redoItem);
        editMenu.add(cutItem);

        viewMenu.add(searchItem);
        viewMenu.add(FullScreenItem);
        viewMenu.add(zenModeItem);

        HelpMenu.add(updateItem);
        HelpMenu.add(aboutItem);
        HelpMenu.add(supportItem);

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(recentItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(HelpMenu);

        menuFrame.setSize(400, 100);
        menuFrame.setJMenuBar(menuBar);
        menuFrame.setResizable(true);
        menuFrame.setDefaultCloseOperation(3);
        menuFrame.setVisible(true);
    }
}