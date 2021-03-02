/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Statement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author Danie
 */
public class MainWindow extends javax.swing.JFrame {

    /*
     * Creates new form MainWindow
     */
    JMenuItem newConnection_item, exit_item;
    NewConnectionWindow newConn;
    String CurDB;
    
    static private DefaultMutableTreeNode root;
    static private DefaultTreeModel defTreemodel;
    static private MainWindow window;
    private DefaultTableModel tableModel;
    DefaultListModel listModel;
    
    Connection conn;
    
    public MainWindow() {
        initComponents();
        initMenu();
    }
    
    private void initMenu() {
        
        newConnection_item = new JMenuItem("New Connection");
        
        exit_item = new JMenuItem("Exit");
        listModel = new DefaultListModel();
        
        jList1.setModel(listModel);
        
        jMenu1.add(newConnection_item);
        jMenu1.add(exit_item);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        newconnection_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        QueryTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("JTree");
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(jTree1);

        newconnection_btn.setText("New Connection");
        newconnection_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newconnection_btnMouseClicked(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        QueryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(QueryTable);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(newconnection_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newconnection_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))))
                .addGap(14, 14, 14))
        );

        jMenu1.setText("File");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked

        //Creates a new db
        newConnection_item.addActionListener((ActionEvent e) -> methodsWins.openNewConnectionWindow());

        //Closes the window - ends execution
        exit_item.addActionListener((ActionEvent e) -> System.exit(0));
        

    }//GEN-LAST:event_jMenu1MouseClicked
    

    private void newconnection_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newconnection_btnMouseClicked
        methodsWins.openNewConnectionWindow();
    }//GEN-LAST:event_newconnection_btnMouseClicked
    public void EditTable(String tableName) {
        methodsWins.openTableModificationWindow(tableName, conn);
    }
    
    public void DropTable(String tableName) {
        int n = JOptionPane.showConfirmDialog(this.window, "Are you sure you want to drop table " + tableName + "?", "Drop Table", JOptionPane.YES_NO_OPTION);
        
        String SQLDrop = "DROP TABLE " + tableName;
        
        if (n == 0) {
            try {
                Statement s = this.conn.createStatement();
                s.execute(SQLDrop);
                this.loadJist(this.conn);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this.window, e.getLocalizedMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void JListListener() {
        
        jList1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (SwingUtilities.isLeftMouseButton(e)) {
                    
                    String value = (String) jList1.getModel().getElementAt(jList1.locationToIndex(e.getPoint()));
                    
                    try {
                        Statement stmt = conn.createStatement(/*ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY*/);
                        String SQLQuery = "SELECT * FROM " + value;
                        ResultSet res = stmt.executeQuery(SQLQuery);
                        loadUpQueryTable(res);
                        
                        stmt.close();
                        
                    } catch (Exception ee) {
                        System.out.println(ee.getLocalizedMessage());
                    }
                    
                }
            }
        });
        jList1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String value = jList1.getSelectedValue();
                
                if (SwingUtilities.isRightMouseButton(e)
                        && !jList1.isSelectionEmpty()
                        && jList1.locationToIndex(e.getPoint()) == jList1.getSelectedIndex()) {
                    JPopupMenu popup = new JPopupMenu();
                    JMenuItem addRow_item = new JMenuItem("Edit");
                    JMenuItem dropTable_item = new JMenuItem("Drop Table");
                    
                    dropTable_item.addActionListener(ev -> DropTable(value));
                    addRow_item.addActionListener(ev -> EditTable(value));
                    
                    popup.add(dropTable_item);
                    popup.add(new JSeparator());
                    popup.add(addRow_item);
                    popup.show(jList1, e.getX(), e.getY());
                }
            }
        });
        
    }
    
    public void loadUpQueryTable(ResultSet res) {
        
        tableModel = (DefaultTableModel) QueryTable.getModel();
        
        try {
            //set column names
            ResultSetMetaData resMD = res.getMetaData();

            //Get number of rows in table
            Vector<Object> column_identifiers = new Vector<>();
            
            Vector<Vector> dataArray = new Vector<>();
            Vector<String> rowData;
            
            int j = 1;
            for (int i = 0; i < resMD.getColumnCount(); i++) {
                column_identifiers.addElement(resMD.getColumnName(j++));
            }
            
            while (res.next()) {
                rowData = new Vector<>();
                for (int k = 1; k <= resMD.getColumnCount(); k++) {
                    rowData.add(res.getString(k));
                }
                dataArray.add(rowData);
            }
            
            tableModel.setDataVector(dataArray, column_identifiers);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void loadJist(Connection _conn) {
        conn = _conn;
        
        ArrayList<String> TableNames;
        listModel.removeAllElements();
        try {
            
            Statement stmt = _conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String currentShema = _conn.getSchema();
            
            String SQLQuery = "SELECT S.tablename FROM SYS.SYSTABLES S INNER JOIN SYS.SYSSCHEMAS SCH"
                    + " ON S.SCHEMAID = SCH.SCHEMAID and SCH.SCHEMANAME = '" + currentShema + "' WHERE S.TABLETYPE = 'T'";
            
            ResultSet res = stmt.executeQuery(SQLQuery);
            
            TableNames = new ArrayList<>();
            
            if (res.next() == false) {
                TableNames.add("No Tables");
            }
            
            res.beforeFirst();
            while (res.next()) {
                TableNames.add(res.getString(1));
            }
            
            String[] tableNameArr = new String[TableNames.size()];
            int i = 0;
            for (String TableName : TableNames) {
                tableNameArr[i] = TableName;
                i++;
            }
            
            for (int j = 0; j < tableNameArr.length; j++) {
                listModel.addElement(tableNameArr[j]);
            }
            
            jList1.setModel(listModel);
            
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    
    public void loadJTree() {
        File directoryPath = new File("C:\\Users\\Danie\\Documents\\NetBeansProjects\\DBM\\Connections");
        root = new DefaultMutableTreeNode(directoryPath.getName());
        File dbs[] = directoryPath.listFiles();
        
        if (dbs != null) {
            for (File db : dbs) {
                DefaultMutableTreeNode node = new DefaultMutableTreeNode(db.getName());
                if (db.isDirectory()) {
                    root.add(node);
                }
            }
        }
        defTreemodel = new DefaultTreeModel(root);
        jTree1.setModel(defTreemodel);
    }
    
    public void RightClickOnTreeFunc() {
        jTree1.getSelectionModel().setSelectionMode(TreeSelectionModel.DISCONTIGUOUS_TREE_SELECTION);
        jTree1.addMouseListener(new MyMouseAdapter(this.window));
    }
    
    public void loadTextArea(String data) {
        JScrollPane scrollpane = new JScrollPane(textArea);
        textArea.setEditable(true);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
    }
    
    public static void main(String args[]) {
        
        window = new MainWindow();
        java.awt.EventQueue.invokeLater(() -> {
            window.setTitle("Database Management System");
            window.loadJTree();
            window.JListListener();
            window.RightClickOnTreeFunc();
            window.setLocationRelativeTo(null);
            window.setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable QueryTable;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton newconnection_btn;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
     GUIMethods.MethodsWins methodsWins = new GUIMethods.MethodsWins();
    GUIMethods.MethodsDB methodsDB = new GUIMethods.MethodsDB();
}

class MyMouseAdapter extends MouseAdapter {
    
    MainWindow window;
    
    public MyMouseAdapter(MainWindow a) {
        window = a;
    }
    
    private void myPopupEvent(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        JTree tree = (JTree) e.getSource();
        
        TreePath path = tree.getPathForLocation(x, y);
        File path_ = new File("C:\\Users\\Danie\\Documents\\NetBeansProjects\\DBM\\Connections\\" + path.getLastPathComponent());
        
        DefaultMutableTreeNode rightClickedNode = (DefaultMutableTreeNode) path
                .getLastPathComponent();
        
        TreePath[] selectionPaths = tree.getSelectionPaths();
        
        boolean isSelected = false;
        if (selectionPaths != null) {
            for (TreePath selectionPath : selectionPaths) {
                if (selectionPath.equals(path)) {
                    isSelected = true;
                }
            }
        }
        if (!isSelected) {
            tree.setSelectionPath(path);
        }
        if (rightClickedNode.isLeaf()) {
            JPopupMenu popup = new JPopupMenu();
            //     final JMenuItem connectItem = new JMenuItem("Connect");
            final JMenuItem addTable_item = new JMenuItem("Create Table");
            final JMenuItem viewTables_item = new JMenuItem("Consult Tables");
            final JMenuItem refreshMenuItem = new JMenuItem("Refresh");
            final JMenuItem deleteMenuItem = new JMenuItem("Delete Connection");
            final JMenuItem editMenuItem = new JMenuItem("Edit Connection");
            final JMenuItem viewIndex_item = new JMenuItem("Consult Indexes");
            final JMenuItem createIndex_item = new JMenuItem("Create Index");
            final JMenuItem procedures_item = new JMenuItem("Procedures");
            final JMenuItem triggers_item = new JMenuItem("Triggers");
            final JMenuItem users_item = new JMenuItem("Users");
            final JMenuItem views_item = new JMenuItem("Views");
            final JMenuItem checks_item = new JMenuItem("Checks");
            
            addTable_item.addActionListener(ev -> window.methodsWins.openAddTableAuthenticationWindow(path.getLastPathComponent().toString()));
            viewTables_item.addActionListener(ev -> window.methodsWins.openViewTableAuthenticationWindow(path.getLastPathComponent().toString(), window));
            createIndex_item.addActionListener(ev -> window.methodsWins.openCreateIndexAuthWindow(path.getLastPathComponent().toString()));
            viewIndex_item.addActionListener(ev -> window.methodsWins.openViewIndexAuthWindow(path.getLastPathComponent().toString()));
            refreshMenuItem.addActionListener(ev -> window.loadJTree());
            procedures_item.addActionListener(ev -> window.methodsWins.openProceduresAuthWindow(path.getLastPathComponent().toString()));
            triggers_item.addActionListener(ev -> window.methodsWins.openTriggersAuthWindow(path.getLastPathComponent().toString()));
            deleteMenuItem.addActionListener(ev -> window.methodsDB.deleteConnectionFolderNonRecursive(window, path_));
            users_item.addActionListener(ev -> window.methodsWins.openUsersAuthWindow(path.getLastPathComponent().toString()));
            views_item.addActionListener(ev -> window.methodsWins.openViewAuthWindow(path.getLastPathComponent().toString()));
            

            popup.add(viewTables_item);
            popup.add(addTable_item);
            
            popup.add(new JSeparator());
            
            popup.add((viewIndex_item));
            popup.add(createIndex_item);
            
            popup.add(new JSeparator());
            
            popup.add(procedures_item);
            
            popup.add(new JSeparator());
            
            popup.add(triggers_item);
            
            popup.add(new JSeparator());
            
            popup.add(users_item);
            
            popup.add(new JSeparator());
            popup.add(views_item);
            popup.add(checks_item);
            
            popup.add(new JSeparator());
            popup.add(deleteMenuItem);
            
            popup.add(new JSeparator());
            
            popup.add(refreshMenuItem);
            
            popup.show(tree, x, y);
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.isPopupTrigger()) {
            myPopupEvent(e);
        }
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()) {
            myPopupEvent(e);
        }
    }
}