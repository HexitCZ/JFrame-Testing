package Core;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main
{

	public static void main(String[] args)
	{

		JFrame frame2 = new JFrame();
		JFrame frame = new JFrame();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(300, 370);

		frame.setVisible(true);

		JButton openSWindow = new JButton("Open");

		openSWindow.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JFrame tempframe = new JFrame();

				tempframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

				tempframe.setSize(300, 370);

				tempframe.setVisible(true);
			}
		});

		frame.add(openSWindow, BorderLayout.WEST);

		frame2.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		frame2.setSize(300, 370);

	}
}
