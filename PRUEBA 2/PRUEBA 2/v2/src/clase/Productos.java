package clase;
import java.util.Date;
public class Productos {
private String marcaString;
private String proveedorString;
private int cantidad;
private Date fecha;

public Productos( String marcaString,String proveedorString, int cantidad, Date fecha) {

	this.marcaString = marcaString;
	this.proveedorString = proveedorString;
	this.cantidad = cantidad;
	this.fecha = fecha;

}


public Productos(String marcaString, String proveedorString) {
	super();
	this.marcaString = marcaString;
	this.proveedorString = proveedorString;
}


public String getProveedorString() {
	return proveedorString;
}
public void setProveedorString(String proveedorString) {
	this.proveedorString = proveedorString;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
public Date getFecha() {
	return fecha;
}
public void setFecha(Date fecha) {
	this.fecha = fecha;
}
public String getMarcaString() {
	return marcaString;
}
public void setMarcaString(String marcaString) {
	this.marcaString = marcaString;
}


}
