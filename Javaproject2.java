import java.util.LinkedList;
import javax.swing.*;

public class Javaproject2 {
    public static class NewJFrame extends javax.swing.JFrame {
        public NewJFrame() {
            initComponents();
        }
        static LinkedList<Integer> ll = new LinkedList<>();
        static int size = 10;

        private void initComponents() {
            jRadioButton1 = new javax.swing.JRadioButton();
            jRadioButton2 = new javax.swing.JRadioButton();
            JButton jButton1 = new JButton();
            JButton jButton2 = new JButton();
            JButton jButton3 = new JButton();
            JButton jButton4 = new JButton();
            jTextField1 = new javax.swing.JTextField();
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            jRadioButton1.setText("Stack");
            jRadioButton1.addActionListener(this::jRadioButton1ActionPerformed);
            jRadioButton2.setText("Queue");
            jButton1.setText("ADD");
            jButton1.addActionListener(this::jButton1ActionPerformed);
            jButton2.setText("PUSH");
            jButton2.addActionListener(this::jButton2ActionPerformed);
            jButton3.setText("DELETE");
            jButton3.addActionListener(this::jButton3ActionPerformed);
            jButton4.setText("POP");
            jButton4.addActionListener(this::jButton4ActionPerformed);
            jTextField1.setText("OUTPUT OF LINKED LIST IS: "+ ll);
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(71, 71, 71)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(42, 42, 42)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                    .addGap(49, 49, 49)
                                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 65, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jRadioButton1)
                                            .addComponent(jButton2)
                                            .addComponent(jButton4))
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton3)
                                            .addComponent(jButton1)
                                            .addComponent(jRadioButton2))
                                    .addContainerGap(78, Short.MAX_VALUE))
            );

            pack();
        }
        private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        }
        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
            if(jRadioButton1.isSelected() && !jRadioButton2.isSelected())
            {
                if(!ll.isEmpty()){
                    int x = ll.removeLast();
                    jTextField1.setText("OUTPUT OF LINKED LIST IS: "+ll);
                    JOptionPane.showMessageDialog(null,x +" is popped");
                }
                else
                    JOptionPane.showMessageDialog(null, "Cannot pop elements from an empty linked list");
            }
            else
                JOptionPane.showMessageDialog(null, "INVALID OPTION");
        }
        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
            if(jRadioButton1.isSelected() && !jRadioButton2.isSelected() )
            {
                if(ll.size() == size)
                {
                    JOptionPane.showMessageDialog(null,"Cannot push elements in a full linked list");
                }
                else
                {
                    int x = (int)(Math.random() * 100);
                    ll.addLast(x);
                    jTextField1.setText("OUTPUT OF LINKED LIST IS: "+ll);
                    JOptionPane.showMessageDialog(null,x+ " pushed in the linked list");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "INVALID OPTION");
            }
        }
        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
            if(jRadioButton2.isSelected() && !jRadioButton1.isSelected())
            {
                if(ll.size()==size){
                    JOptionPane.showMessageDialog(null, "Cannot add element in a full linked list");
                }
                else
                {
                    int x = (int)(Math.random() *100);
                    ll.addLast(x);
                    jTextField1.setText("OUTPUT OF LINKED LIST IS: "+ll);
                    JOptionPane.showMessageDialog(null, x+ " is added in the linked list");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"INVALID OPTION");
            }
        }
        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
            if(jRadioButton2.isSelected() && !jRadioButton1.isSelected())
            {
                if(ll.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Cannot delete element in an empty linked list");
                }
                else
                {
                    int x = ll.remove(0);
                    jTextField1.setText("OUTPUT OF LINKED LIST IS: "+ll);
                    JOptionPane.showMessageDialog(null, x+ " is removed from the linked list");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"INVALID OPTION");
            }
        }
        public static void main(String[] args) {
            for(int i=0;i<10;i++)
                ll.add((int)(Math.random() * 100)+1);
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            java.awt.EventQueue.invokeLater(() -> new NewJFrame().setVisible(true));
        }

        private javax.swing.JRadioButton jRadioButton1;
        private javax.swing.JRadioButton jRadioButton2;
        private javax.swing.JTextField jTextField1;
    }

}
