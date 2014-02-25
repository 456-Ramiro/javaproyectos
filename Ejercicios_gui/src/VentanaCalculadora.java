
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class VentanaCalculadora extends Ventana{

	private JTextArea areaTexto;
	private JButton suma;
	private JButton resta;
	private JButton div;
	private JButton mult;
	private JButton borrar;
	private JButton igual;
	private JButton punto;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton bac;
	
	public VentanaCalculadora(int altura,int ancho,String titulo)
	{	
		
		this.altura=altura;
		this.ancho=ancho;
		this.setSize(ancho,altura);
		this.setTitle(titulo);
		this.setVisible(true);	
		
		//ajusta la ventana ahicia el centro
		this.setLocationRelativeTo(null);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		
		areaTexto = new JTextArea();
		suma = new JButton("+");
		resta = new JButton("-");
		div = new JButton("/");
		mult = new JButton("x");
		borrar= new JButton("C");
		igual= new JButton("=");
		punto= new JButton(".");
		btn1= new JButton("1");
		btn2= new JButton("2");
		btn3= new JButton("3");
		btn4= new JButton("4");
		btn5= new JButton("5");
		btn6= new JButton("6");
		btn7= new JButton("7");
		btn8= new JButton("8");
		btn9= new JButton("9");
		btn0= new JButton("0");
		
		add(areaTexto);
		add(borrar);
				
		add(suma);
		add(resta);
		add(mult);
		add(div);	
	
		add(btn7);
		add(btn8);
		add(btn9);		
		add(btn4);
		add(btn5);
		add(btn6);			
		add(btn1);
		add(btn2);		
		add(btn3);		
		add(btn0);
		add(punto);
		add(igual);		
		
		setLayout(new GridLayout(6,4,10,10));		
		
		suma.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//aqui se le agrega un evento 
				areaTexto.append("+");				
			}
		});
		resta.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//aqui se le agrega un evento 
				areaTexto.append("-");				
			}
		});
		div.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//aqui se le agrega un evento 
				areaTexto.append("/");				
			}
		});
		mult.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//aqui se le agrega un evento 
				areaTexto.append("x");				
			}
		});
		punto.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//aqui se le agrega un evento 
				areaTexto.append(".");				
			}
		});	
		btn1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//aqui se le agrega un evento 
				areaTexto.append("1");				
			}
		});	
				
	}

}
