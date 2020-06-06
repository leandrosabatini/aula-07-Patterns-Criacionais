package exercicio_7_1;

import javax.swing.JOptionPane;

public class TransformerTest {
	public static void main(String[] args) {
		TransformerStringTemplate tst;
		
		String s = JOptionPane.showInputDialog("Digita uma string");
		
		System.out.println("Transforma em Maiuscula");
		tst = new TransformerUppercase();
		tst.tranformar(s);
		System.out.println("");
		
		System.out.println("Transforma em Minuscula");
		tst = new TransformerLowercase();
		tst.tranformar(s);
		System.out.println("");
		
		System.out.println("Transforma em Duplicar");
		tst = new TransformerDuplicate();
		tst.tranformar(s);
		System.out.println("");
		
		System.out.println("Transforma em Inverter");
		tst = new TransformerInvert();
		tst.tranformar(s);
		System.out.println("");
	}
}
