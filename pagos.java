class Pagos {
public static void main(String[] arguments) {
double horas ;
	double paga2 = 9.5;
	double paga1 = 8.0;
	System.out.println("Bienvenido ");
	System.out.println ("porfavor digite el numero de horas trabajadas:");
	horas  = Double.parseDouble(System.console().readLine());
	if  ( horas > 39 && horas < 60) {
	System.out.println( "Total a pagar:"+(paga2*horas)); 
	} else if (horas < 39 ) { 
	System.out.println( "Total a pagar:"+(paga1*horas));
	} if (horas > 60){
	System.out.println( "lo sentimos ud a exedido el nuemro de horas digite u numero de horas menor"); 
	}
}
}