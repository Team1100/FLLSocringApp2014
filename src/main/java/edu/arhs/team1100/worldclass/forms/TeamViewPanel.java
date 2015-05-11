package edu.arhs.team1100.worldclass.forms;

import edu.arhs.team1100.worldclass.objects.Team;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eddie
 */
public class TeamViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form TeamSelectPanel
     */
    public TeamViewPanel(List<Team> teams) {
        initComponents();
        loadTeams(teams);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        teamTable = new javax.swing.JTable();

        teamTable.setAutoCreateRowSorter(true);
        teamTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Team Number", "Name", "Location", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        teamTable.getTableHeader().setReorderingAllowed(false);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        teamTable.setDefaultRenderer(String.class, centerRenderer);
        teamTable.setDefaultRenderer(Integer.class, centerRenderer);
        jScrollPane1.setViewportView(teamTable);
        if (teamTable.getColumnModel().getColumnCount() > 0) {
            teamTable.getColumnModel().getColumn(0).setResizable(false);
            teamTable.getColumnModel().getColumn(1).setResizable(false);
            teamTable.getColumnModel().getColumn(2).setResizable(false);
            teamTable.getColumnModel().getColumn(3).setMinWidth(0);
            teamTable.getColumnModel().getColumn(3).setPreferredWidth(0);
            teamTable.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public List<Team> getTeams() {
        ArrayList<Team> teams = new ArrayList();
        for (int i = 0; i < teamTable.getSelectedRowCount(); i++) {
            teams.add((Team) teamTable.getValueAt(teamTable.getSelectedRows()[i], 3));
        }
        return teams;
    }

    public void setSingularSelect() {
        teamTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    public Team getTeam() {
        if (teamTable.getSelectedRow() != -1) {
            return (Team) teamTable.getValueAt(teamTable.getSelectedRow(), 3);
        } else
            return null;
    }

    private void loadTeams(List<Team> teams) {
        DefaultTableModel model = (DefaultTableModel) teamTable.getModel();
        for (Team team : teams) {
            model.addRow(new Object[]{team.getTeamNumber(), team.getName(), team.getLocation(), team});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable teamTable;
    // End of variables declaration//GEN-END:variables

    
    
}
