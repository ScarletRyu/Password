
public class Password {

	private int longitud;
	private String contrasena;
	
	
	
	
	
	
	
	//Generar Getters & Setters
	
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
	//Constructor por defecto
	
		public  Password() {
			
		}
	
	//METODOS
		
		//Generar Password
		public String generarPassword() {
			String password="";
			for (int i=0; i<longitud; i++) {
				int generar=((int)Math.floor(Math.random()*3+1));
				
				if(generar==1) {
					char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
					password+=minusculas;
				}else {
					if(generar==2) {
						char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
						password+=mayusculas;
					}else {
						char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
						password+=numeros;
					}
				}
			}
			return password;
		}
		
		//esFuerte
		
		public boolean esFuerte() {
			int contNumeros=0;
			int contMinusculas=0;
			int contMayusculas=0;
			
			for(int i=0; i<contrasena.length(); i++) {
				if(contrasena.charAt(i)>=97 && contrasena.charAt(i)<=122) {
					contMinusculas++;
				}else {
					if(contrasena.charAt(i)>=65 && contrasena.charAt(i)<=90) {
						contMayusculas++;
					}else {
						contNumeros++;
					}
				}
			}
			if (contNumeros>5 && contMinusculas>1 && contMayusculas>2) {
				return true;
			}else {
				return false;
			}
		}
	
		
	
	
	
	
	
}
