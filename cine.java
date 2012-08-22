	class Cine {
	
		public static void main (String [] arguments){
			System.out.println ("Qué tipo de funcion quiere? (3D/2D)");
			String tipofuncion = System.console().readLine();	
			
			System.out.println ("Qué localidad quiere?");
			String localidad = System.console().readLine();
			

			System.out.println ("Cuántas boletas quiere?");
			int numboleta = Integer.parseInt(System.console().readLine());
			
			
			int numgafas = 0;
			if (tipofuncion.equals("3d")){
			
				do{
					System.out.println ("Cuántas gafas quiere?");
					numgafas = Integer.parseInt(System.console().readLine());
				}while(numgafas>numboleta);
				
			}
			
			int valorBoleta = 0;
			
			if (tipofuncion.equals("2d")){
				if (localidad.equals ("General")){
					valorBoleta = 8000;
				}else{
					valorBoleta = 11000;
				}
				
			}else{
				if (localidad.equals ("General")){
					valorBoleta = 12000;
				}else{
					valorBoleta = 15000;
				}
			}
				
			int valorTotalboletas = numboleta * valorBoleta;
			int valorTotalGafas = numgafas * 3000;
			
			int valorTotal = valorTotalboletas + valorTotalGafas;
			
			System.out.print ("Valor total a pagar ");
			System.out.println (valorTotal);
		}
	}