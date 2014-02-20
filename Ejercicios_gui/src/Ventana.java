import javax.swing.JFrame;
import javax.swing.JButton;


public class Ventana extends JFrame {
	private int altura = 0;
	private int ancho = 0;
	private String titulo = "";
	JButton btn;
	
	public Ventana(int altura,int ancho,String titulo)
	{
		this.setSize(ancho,altura);
		this.setTitle(titulo);
		this.setVisible(true);	
		//finaliza la aplicacion.
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		btn  = new  JButton("hola mundo grafico");
		this.add(btn);
	}
	public Ventana()
	{			
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		btn  = new  JButton("Hola Mundo Grafico");
		this.add(btn);
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void mostrar()
	{
		this.setSize(this.ancho,this.altura);
		this.setVisible(true);
		this.setTitle(titulo);
	}
	
	

}
