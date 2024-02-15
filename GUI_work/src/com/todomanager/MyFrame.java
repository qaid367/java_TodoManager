package com.todomanager;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	
	private JButton addTodoBtn = new JButton("Add Todo");
	private JButton removeTodoBtn = new JButton("Remove Todo");
	private JButton updateTodoBtn = new JButton("Update Todo");
	private JLabel alert = new JLabel("Alert Msg test");
	private JPanel pane = new JPanel();
	
	private int centerX = Main.SCREEN_WIDTH / 2;
	private int centerY = Main.SCREEN_HEIGHT / 2;
	
	public MyFrame() {
		this.setTitle("Swing GUI");
		this.setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		this.setResizable(false);

		this.getContentPane().setBackground(new Color(0,255,0));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		this.add(pane);
		pane.add(alert);
		
        initComponents();        
        initEvents();
        
        this.setVisible(true);
	}
	
	private void initComponents() {
		addTodoBtn.setBounds(getBtnX(100), getBtnY(25), 100, 25);
		removeTodoBtn.setBounds(getBtnX(100) - 110, getBtnY(25), 110, 25);
		updateTodoBtn.setBounds(getBtnX(100) + 110, getBtnY(25), 110, 25);
		updateTodoBtn.setForeground(Color.blue);
		removeTodoBtn.setForeground(Color.red);
		addTodoBtn.setForeground(Color.green);
		
		updateTodoBtn.setOpaque(true);
		removeTodoBtn.setOpaque(true);
		addTodoBtn.setOpaque(true);

		
		pane.setLayout(null);
		pane.add(addTodoBtn);
		pane.add(removeTodoBtn);
		pane.add(updateTodoBtn);
	}
	
	private void initEvents() {
        // Add action listeners to each button
        addTodoBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Add Todo button clicked.");
            }
        });

        removeTodoBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Remove Todo button clicked.");
            }
        });

        updateTodoBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Update Todo button clicked.");
            }
        });
    }
	
	public void alertMessage(String alertMsg) {
		alert.setText(alertMsg);
	}
	
	private int getBtnX(int width) {
		return centerX - width / 2;
	}
	
	private int getBtnY(int height) {
		return centerY - height / 2;
	}
}
