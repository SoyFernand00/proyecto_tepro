package arreglo;

import java.security.PublicKey;
import java.util.ArrayList;

import clase.Empleado;
import clase.Productos;

public class ArregloProductos {
ArrayList<Productos>productos;
public ArregloProductos(){
	productos=new ArrayList<Productos>();
}
public void AgregarPro(Productos x) {
	productos.add(x);
}
public int Tamaño() {
	return productos.size();

}
public Productos Obtener (int x) {
	return productos.get(x);
}

public void Eliminar(Productos x) {
	productos.remove(x);
}
public Productos BuscarPro(String marca) {
	for (int i = 0; i < Tamaño(); i++) {
		if(Obtener(i).getMarcaString().equals(marca))return Obtener(i);
	}
	return null;
}
public Productos BuscarPro1(String provee) {
	for (int i = 0; i < Tamaño(); i++) {
		if(Obtener(i).getProveedorString().equals(provee))return Obtener(i);
	}
	return null;
}
public ArrayList<Productos> getProductos() {
    return productos;
}


}
