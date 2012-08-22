class IMC{
public static void main(String[] arguments) {
	
	System.out.println("porfavor responde las sigientes ?");
	System.out.println("cual es tu nombre?");
    	String nombre = System.console().readLine();
	System.out.println("cual es tu estatura?");
	double estatura = Double.parseDouble(System.console().readLine());
	System.out.println("cual es tu peso?");
	double  peso = Double.parseDouble(System.console().readLine());
	double imc = peso/(estatura*estatura);
    	
	if (imc<15.50) {
	System.out.println("infrapeso");
	}
	if (imc<16.00) {
		System.out.println("su imc="+imc+"delgadez severa");
	}
	if (imc>=16.00&&imc<16.99) {
		System.out.println("su imc="+imc+"delgadez moderada");
	}
	if (imc>=17.00&&imc<18.49) {
	System.out.println("su imc="+imc+"delgadez no muy 	pronunciada");
	}
	if (imc>=18.5&&imc<24.99) {
		System.out.println("su imc="+imc+"normal");
	}
	if (imc>=25.00) {
		System.out.println("su imc="+imc+"sobrepeso");
	}
	if (imc>=25.00&&imc<=29.99) {
		System.out.println("su imc="+imc+"preobeso");
	}
	if (imc>=30.00) {
		System.out.println("su imc="+imc+"obeso");
	}
	if (imc>=30.00&&imc<=34.99) {
		System.out.println("su imc="+imc+"obeso tipo I");
	}
	if (imc>=35.00&&imc<=39.99) {
		System.out.println("su imc="+imc+"obeso tipo II");
	}
	if (imc>=40.00) {
		System.out.println("su imc="+imc+"obeso tipo III");
	}
}
}