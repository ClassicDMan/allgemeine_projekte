package Lesson917_Bro;

import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenu searchMenu;
	
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	ImageIcon loadIcon;
	ImageIcon saveIcon;
	ImageIcon exitIcon;
	
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		
		loadIcon = new ImageIcon("loadIcon.png");
		saveIcon = new ImageIcon("saveIcon.png");
		exitIcon = new ImageIcon("exitIcon.png");
		
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		searchMenu = new JMenu("Search");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		fileMenu.setMnemonic(KeyEvent.VK_F);	// Alt + f for file		if you type Alt + f on the Keyboard it will open fileMenu
		editMenu.setMnemonic(KeyEvent.VK_E);	// Alt + e for edit		if you type Alt + e on the Keyboard it will open editMenu
		helpMenu.setMnemonic(KeyEvent.VK_H);	// Alt + h for help		if you type Alt + e on the Keyboard it will open helpMenu
		
		loadItem.setMnemonic(KeyEvent.VK_L);	// l for load		if you type l on the Keyboard it will load
		saveItem.setMnemonic(KeyEvent.VK_S);	// s for save		if you type s on the Keyboard it will save
		exitItem.setMnemonic(KeyEvent.VK_E);	// e for exit		if you type e on the Keyboard it will exit
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		menuBar.add(searchMenu);
		
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == loadItem) {
			System.out.println("beep boop you loaded a file");
		}
		if(e.getSource() == saveItem) {
			System.out.println("beep boop you saved a file");
		}
		if(e.getSource() == exitItem) {
			System.exit(0);
		}
		
		
	}

}
