package clase;

public class Empleado {
	private String nom;
	private String ape;
	private int num;
	private int dni;
	private String correo;
	public Empleado(String nom, String ape, int num, int dni, String correo) {

		this.nom = nom;
		this.ape = ape;
		this.num = num;
		this.dni = dni;
		this.correo = correo;
	}
	
	public Empleado(int dni) {

		this.dni = dni;
	}
	

	public Empleado(String nom, int dni, boolean ola) {

		this.nom = nom;
		this.dni = dni;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getApe() {
		return ape;
	}
	public void setApe(String ape) {
		this.ape = ape;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}

		public Empleado(String nom, String ape, int dni) {

			this.nom = nom;
			this.ape = ape;
			this.dni = dni;
		}
		
		public Empleado(String nom, int num) {
			
			this.nom = nom;
			this.num = num;
		}
		public Empleado(String ape) {
			
			this.ape = ape;
		}
		public Empleado(String correo, boolean tr) {
			
			this.correo = correo;
		}
		
		
		
}
