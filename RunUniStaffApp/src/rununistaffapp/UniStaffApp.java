package rununistaffapp;

/**
 *
 * @author likho
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class UniStaffApp extends JFrame{
    private JComboBox<String> cboDepart;
    private JTextField fstName, lstName;
    private JRadioButton rdbPermanet, rdbTemporary;
    private JButton btnAdd, btnExit;
    private JTable table;
    
    DefaultTableModel tableModel;
    
    public UniStaffApp() {
        super("University Staff Application");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        JPanel topPanel = new JPanel(new GridLayout(4,2,5,5));
        
        topPanel.add(new JLabel("Department:"));
        cboDepart = new JComboBox();
        cboDepart.addItem("Select");
        cboDepart.addItem("IT");
        cboDepart.addItem("Education");
        cboDepart.addItem("Civil Engineer");
        topPanel.add(cboDepart);
        
        
        topPanel.add(new JLabel("First Name:"));
        fstName = new JTextField();
        topPanel.add(fstName);
        
        topPanel.add(new JLabel("Last Name:"));
        lstName = new JTextField();
        topPanel.add(lstName);
        
        topPanel.add(new JLabel("Employment Type:"));
        
        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        rdbPermanet = new JRadioButton("Permanet");
        rdbTemporary = new JRadioButton("Temporary");
        ButtonGroup group = new ButtonGroup();
        group.add(rdbPermanet);
        group.add(rdbTemporary);
        
        radioPanel.add(rdbPermanet);
        radioPanel.add(rdbTemporary);
        
        topPanel.add(radioPanel);
        
        add(topPanel, BorderLayout.NORTH);
        
        tableModel = new DefaultTableModel();
        
        tableModel.addColumn("Department");
        tableModel.addColumn("First Name");
        tableModel.addColumn("Last Name");
        tableModel.addColumn("Employment Type");
        
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);
        
        JPanel buttonPanel = new JPanel(new GridLayout(1,2));
        btnAdd = new JButton("Add to Table");
        btnExit = new JButton("EXIT");
        
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnExit);
        
        add(buttonPanel, BorderLayout.SOUTH);
        setGui();
    }
    public void setGui() {
        
        btnAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                String dept = cboDepart.getSelectedItem().toString();
                String name = fstName.getText();
                String surname = lstName.getText();
                String employment = "";
                if (rdbPermanet.isSelected()) {
                    employment = "Permanet";
                }else if (rdbTemporary.isSelected()) {
                    employment = "Temporary";
                }
                tableModel.addRow(new Object[]{dept, name, surname, employment});
            }
        });
        btnExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
}
