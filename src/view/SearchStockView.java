package view;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.IController;
import controller.SearchStockController;

public class SearchStockView implements IView {
	
	private JTable table;
	private SearchStockController ssCont;

	
	public void switchContext(SearchStockController ssCont)
	{
		this.ssCont = ssCont;
		frame.getContentPane().removeAll();
		frame.setLayout(new FlowLayout());
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		JTextField field = new JTextField();
		GhostText ghostText = new GhostText(field, "Enter stock name or Ticker here...");
		JButton button = new JButton();
		button.setText("Search!");
		setActionListenerForButton(button);
		
		table = new JTable(this.ssCont.getData(), this.ssCont.getColumns());
		
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		panel.add(field, c);
		c.gridx = 1;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		panel.add(button, c);
		
		c.gridx = 0;
		c.gridy = 1;
		c.weightx = 1;
		c.weighty = 1;
		panel.add(table, c);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	private void setActionListenerForButton(JButton button)
	{
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	@Override
	public IController getController() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setController(IController some) {
		// TODO Auto-generated method stub
		
	}
}
