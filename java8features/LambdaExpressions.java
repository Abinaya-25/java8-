package bct.java8features;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaExpressions {

	public static void main(String[] args) {
		Frame frame=new Frame("ActionListener ");
		Button b=new Button("click here");
		b.setBounds(50,100,80,50);
		b.addActionListener(new ActionListener(){
			public void actionsPerformed(ActionEvent e) {
				
				
			}
			
			
		}

	}

}
