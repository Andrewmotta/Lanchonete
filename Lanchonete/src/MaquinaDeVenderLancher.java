	import java.util.Scanner;

public class MaquinaDeVenderLancher {


		private Lanche lanche;
		private double valorTotal;
		private int QTD;
		
		
		Lanche l1 = new Lanche(2.50);
		Scanner teclado = new Scanner(System.in);
		
		public Lanche getLanche() {
			return lanche;
		}
		public void setLanche(Lanche lanche) {
			this.lanche = lanche;
		}
		public double getValorTotal() {
			return valorTotal;
		}
		public void setValorTotal(double valorTotal) {
			this.valorTotal = valorTotal;
		}
		
		
		public void venderLanche(){
			
			System.out.println("O Lanche Custa Apenas: "+l1.getPreco());
			
			System.out.println("Qual A Quadidade de lanches que voce deseja ?");
		
			QTD = teclado.nextInt();
			
			valorTotal = l1.getPreco() * QTD;
			
			System.out.println("Valor Total Da Compra :"+getValorTotal());
		
			
			System.out.println("Deseja finaliza A compra (1)Sim (2)Nao");
			
			int op = teclado.nextInt();
			
			if(op == 1 ){
			
				
				System.out.println("insira o dinheiro");	
				double valorinse = teclado.nextDouble();
			
				
			        if(valorinse < getValorTotal()){
			        	
			          System.out.println("saldo insuficiente");
			          
			          
			          
			        	
			        }if(valorinse >= getValorTotal()){
			        	
			        	System.out.println("Compra realizada com sucesso!");
			        	
			        	double ops = (valorinse - getValorTotal());
			        	
			        	System.out.println("Voce tem "+ ops +" reais de troco");
			        }
				
				
			}else if(op == 2 ){
				System.out.println("Compra Cancelada");
				 
				return;
			}
			
			
			System.out.println("Volte Sempre !!!");
			
			
			
		}
	}

