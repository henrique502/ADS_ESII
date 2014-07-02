package casarimrieger.binominal;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class CalcularBinomioControle  {

	private IBinomioEntidade e;
	
	public CalcularBinomioControle(IBinomioEntidade e) {
		this.e = e;
	}


	public int calcular(int n, int k) {
		e.setN(n);
		e.setK(k);
		return e.getCoeficiente();
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					IBinomioEntidade e = new BinomioEntidade();
					CalcularBinomioControle controler = new CalcularBinomioControle(e);
				} catch(Exception e){
					e.printStackTrace();
				}
			}
		});
	}
}