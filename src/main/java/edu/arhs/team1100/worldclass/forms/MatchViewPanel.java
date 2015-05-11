package edu.arhs.team1100.worldclass.forms;

import edu.arhs.team1100.worldclass.objects.Match;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eddie
 */
public class MatchViewPanel extends javax.swing.JPanel {

    /** Creates new form TeamViewPanel */
    public MatchViewPanel(List<Match> teamMatches) {
        initComponents();
        loadTeams(teamMatches);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teamMatchesTab = new javax.swing.JScrollPane();
        teamMatchTable = new javax.swing.JTable();

        teamMatchTable.setBorder(javax.swing.BorderFactory.createTitledBorder("Yellow"));
        teamMatchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Match Number", "Team Number", "null"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        teamMatchTable.getTableHeader().setReorderingAllowed(false);
        teamMatchesTab.setViewportView(teamMatchTable);
        if (teamMatchTable.getColumnModel().getColumnCount() > 0) {
            teamMatchTable.getColumnModel().getColumn(2).setMinWidth(0);
            teamMatchTable.getColumnModel().getColumn(2).setPreferredWidth(0);
            teamMatchTable.getColumnModel().getColumn(2).setMaxWidth(0);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teamMatchesTab, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teamMatchesTab, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable teamMatchTable;
    private javax.swing.JScrollPane teamMatchesTab;
    // End of variables declaration//GEN-END:variables

    private void loadTeams(List<Match> teamMatches) {
        
        DefaultTableModel model = (DefaultTableModel) teamMatchTable.getModel();
        for (Match teamMatch: teamMatches){
            model.addRow(new Object[]{teamMatch.getMatchNumber(), teamMatch.getTeamNumber(),  teamMatch});
        }
    }

}