package gui;

import java.awt.BorderLayout;
import clase.Productos;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import arreglo.ArregloProductos;
import arreglo.ArregloEmpleado;
import clase.Empleado;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JSpinner;

public class Ven extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ven frame = new Ven();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Ven() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		{
			contentPane.setLayout(null);
		}
		{
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(0, 0, 690, 510);
			contentPane.add(tabbedPane);
			//PANEL DE INICIO
			{
				panel = new JPanel();
				tabbedPane.addTab("INICIO", null, panel, null);
				panel.setLayout(null);
				{
					scrollPane = new JScrollPane();
					scrollPane.setBounds(25, 216, 549, 179);
					panel.add(scrollPane);
					{
						txtS = new JTextArea();
						txtS.setFont(new Font("Monospaced", Font.PLAIN, 12));
						scrollPane.setViewportView(txtS);
					}
				}
				{
					lblNombre = new JLabel("NOMBRE:");
					lblNombre.setFont(new Font("Dialog", Font.BOLD, 12));
					lblNombre.setBounds(38, 28, 56, 24);
					panel.add(lblNombre);
				}
				{
					txtNom = new JTextField();
					txtNom.setColumns(10);
					txtNom.setBounds(105, 31, 86, 20);
					panel.add(txtNom);
				}
				{
					lblCorreo = new JLabel("CORREO:");
					lblCorreo.setFont(new Font("Dialog", Font.BOLD, 12));
					lblCorreo.setBounds(201, 30, 67, 21);
					panel.add(lblCorreo);
				}
				{
					btnBuscar = new JButton("BUSCAR");
					btnBuscar.addActionListener(this);
					btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 10));
					btnBuscar.setBounds(443, 30, 111, 23);
					panel.add(btnBuscar);
				}
				{
					lblApellido = new JLabel("APELLIDO:");
					lblApellido.setFont(new Font("Dialog", Font.BOLD, 12));
					lblApellido.setBounds(38, 48, 76, 37);
					panel.add(lblApellido);
				}
				{
					txtApe = new JTextField();
					txtApe.setColumns(10);
					txtApe.setBounds(105, 57, 86, 20);
					panel.add(txtApe);
				}
				{
					txtCorreo = new JTextField();
					txtCorreo.setColumns(10);
					txtCorreo.setBounds(201, 57, 165, 20);
					panel.add(txtCorreo);
				}
				{
					btnQuitar = new JButton("ELIMINAR");
					btnQuitar.addActionListener(this);
					btnQuitar.setFont(new Font("Tahoma", Font.BOLD, 10));
					btnQuitar.setBounds(443, 56, 111, 23);
					panel.add(btnQuitar);
				}
				{
					lblDni = new JLabel("DNI:");
					lblDni.setFont(new Font("Dialog", Font.BOLD, 12));
					lblDni.setBounds(38, 72, 46, 43);
					panel.add(lblDni);
				}
				{
					txtDNI = new JTextField();
					txtDNI.setColumns(10);
					txtDNI.setBounds(105, 88, 86, 20);
					panel.add(txtDNI);
				}
				{
					lblTelefono = new JLabel("TELEFONO:");
					lblTelefono.setFont(new Font("Dialog", Font.BOLD, 12));
					lblTelefono.setBounds(38, 119, 76, 18);
					panel.add(lblTelefono);
				}
				{
					txtNum = new JTextField();
					txtNum.setColumns(10);
					txtNum.setBounds(105, 119, 86, 20);
					panel.add(txtNum);
				}
				{
					btnAgregar = new JButton("AGREGAR");
					btnAgregar.addActionListener(this);
					btnAgregar.setFont(new Font("Tahoma", Font.BOLD, 10));
					btnAgregar.setBounds(443, 83, 111, 23);
					panel.add(btnAgregar);
				}
				{
					btnRegistro = new JButton("IR A REGISTRO");
					btnRegistro.addActionListener(this);
					btnRegistro.setBounds(443, 166, 111, 23);
					panel.add(btnRegistro);
					btnRegistro.setEnabled(false);
				}
			}
			//PANEL DE REGISTRO (STOCK)
			{
				panel_1 = new JPanel();
				tabbedPane.addTab("REGISTRO", null, panel_1, null);
				panel_1.setLayout(null);
				{
					lblNombre_1 = new JLabel("MARCA:");
					lblNombre_1.setFont(new Font("Dialog", Font.BOLD, 12));
					lblNombre_1.setBounds(25, 11, 56, 24);
					panel_1.add(lblNombre_1);
				}
				{
					txtMarca = new JTextField();
					txtMarca.setColumns(10);
					txtMarca.setBounds(92, 14, 86, 20);
					panel_1.add(txtMarca);
				}
				{
					btnBsq = new JButton("BUSCAR");
					btnBsq.addActionListener(this);
					btnBsq.setFont(new Font("Tahoma", Font.BOLD, 10));
					btnBsq.setBounds(0, 197, 111, 23);
					panel_1.add(btnBsq);
				}
				{
					lblApellido_1 = new JLabel("PROVEEDOR:");
					lblApellido_1.setFont(new Font("Dialog", Font.BOLD, 12));
					lblApellido_1.setBounds(25, 31, 76, 37);
					panel_1.add(lblApellido_1);
				}
				{
					txtProvee = new JTextField();
					txtProvee.setColumns(10);
					txtProvee.setBounds(102, 40, 86, 20);
					panel_1.add(txtProvee);
				}
				{
					btnEliminar = new JButton("ELIMINAR");
					btnEliminar.addActionListener(this);
					btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 10));
					btnEliminar.setBounds(0, 231, 111, 23);
					panel_1.add(btnEliminar);
				}
				{
					lblDni_1 = new JLabel("CANTIDAD:");
					lblDni_1.setFont(new Font("Dialog", Font.BOLD, 12));
					lblDni_1.setBounds(25, 55, 67, 43);
					panel_1.add(lblDni_1);
				}
				{
					txtCanti = new JTextField();
					txtCanti.setColumns(10);
					txtCanti.setBounds(92, 71, 86, 20);
					panel_1.add(txtCanti);
				}
				
				{
					btnModiReg = new JButton("MODIFICAR");
					btnModiReg.addActionListener(this);
					btnModiReg.setFont(new Font("Tahoma", Font.BOLD, 10));
					btnModiReg.setBounds(121, 231, 111, 23);
					panel_1.add(btnModiReg);
				}
				{
					lblTelefono_1 = new JLabel("F.V:");
					lblTelefono_1.setFont(new Font("Dialog", Font.BOLD, 12));
					lblTelefono_1.setBounds(25, 102, 30, 18);
					panel_1.add(lblTelefono_1);
				}
				{
					btnAgre = new JButton("AGREGAR");
					btnAgre.addActionListener(this);
					btnAgre.setFont(new Font("Tahoma", Font.BOLD, 10));
					btnAgre.setBounds(59, 163, 111, 23);
					panel_1.add(btnAgre);
				}
				{
					btnListar = new JButton("REPORTAR");
					btnListar.addActionListener(this);
					btnListar.setFont(new Font("Tahoma", Font.BOLD, 10));
					btnListar.setBounds(121, 197, 111, 23);
					panel_1.add(btnListar);
				}
				{
					btnOrde = new JButton("ORDENAR");
					btnOrde.addActionListener(this);
					btnOrde.setFont(new Font("Tahoma", Font.BOLD, 10));
					btnOrde.setBounds(59, 263, 111, 23);
					panel_1.add(btnOrde);
				}
				{
					tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
					tabbedPane_1.setBackground(new Color(192, 192, 192));
					tabbedPane_1.setBounds(286, 11, 395, 465);
					panel_1.add(tabbedPane_1);
					{
						panel_2 = new JPanel();
						tabbedPane_1.addTab("STOCK", null, panel_2, null);
						panel_2.setLayout(new BorderLayout(0, 0));
						{
							scrollPane_2 = new JScrollPane();
							panel_2.add(scrollPane_2, BorderLayout.CENTER);
							{
								txtStock = new JTextArea();
								txtStock.setFont(new Font("Monospaced", Font.PLAIN, 12));
								scrollPane_2.setViewportView(txtStock);
							}
						}
					}
					{
						panel_3 = new JPanel();
						tabbedPane_1.addTab("VENCIMIENTOS", null, panel_3, null);
						panel_3.setLayout(null);
						{
							scrollPane_3 = new JScrollPane();
							scrollPane_3.setBounds(0, 0, 380, 437);
							panel_3.add(scrollPane_3);
							{
								textVence = new JTextArea();
								textVence.setFont(new Font("Monospaced", Font.PLAIN, 12));
								scrollPane_3.setViewportView(textVence);
							}
						}
					}
				}
				{
					 spinner = new JSpinner(new javax.swing.SpinnerDateModel());

					    JSpinner.DateEditor editor =
					            new JSpinner.DateEditor(spinner, "dd/MM/yyyy");

					    spinner.setEditor(editor);

					    spinner.setBounds(92, 102, 120, 25);

					    panel_1.add(spinner);
				}
				{
					btnInicio = new JButton("VOLVER A INICIO");
					btnInicio.addActionListener(this);
					btnInicio.setBounds(51, 376, 127, 23);
					panel_1.add(btnInicio);
				}
			}
			btnRegistro.setEnabled(false);

			tabbedPane.remove(panel_1);
		}
		
	}

	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JLabel lblNombre;
	private JTextField txtNom;
	private JLabel lblCorreo;
	private JButton btnBuscar;
	private JLabel lblApellido;
	private JTextField txtApe;
	private JTextField txtCorreo;
	private JButton btnQuitar;
	private JLabel lblDni;
	private JTextField txtDNI;
	private JLabel lblTelefono;
	private JTextField txtNum;
	private JButton btnAgregar;
	private JPanel panel_1;
	private JLabel lblNombre_1;
	private JTextField txtMarca;
	private JButton btnBsq;
	private JLabel lblApellido_1;
	private JTextField txtProvee;
	private JButton btnEliminar;
	private JLabel lblDni_1;
	private JTextField txtCanti;
	private JButton btnModiReg;
	private JLabel lblTelefono_1;
	private JButton btnAgre;
	private JButton btnListar;
	private JButton btnOrde;
	private JTabbedPane tabbedPane_1;
	private JPanel panel_2;
	private JScrollPane scrollPane_2;
	private JTextArea txtStock;
	private JSpinner spinner;
	private JButton btnRegistro;
	private JButton btnInicio;
	private JPanel panel_3;
	private JScrollPane scrollPane_3;
	private JTextArea textVence;
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnListar) {
			do_btnListar_actionPerformed(e);
		}
		if (e.getSource() == btnBsq) {
			do_btnBsq_actionPerformed(e);
		}
		if (e.getSource() == btnAgregar) {
			do_btnAgregar_actionPerformed(e);
		}
		if (e.getSource() == btnModiReg) {
			do_btnModiReg_actionPerformed(e);
		}
		if (e.getSource() == btnQuitar) {
			do_btnQuitar_actionPerformed(e);
		}
		if (e.getSource() == btnOrde) {
			do_btnOrde_actionPerformed(e);
		}
		if (e.getSource() == btnInicio) {
			do_btnInicio_actionPerformed(e);
		}
		if (e.getSource() == btnRegistro) {
			do_btnRegistro_actionPerformed(e);
		}
		if (e.getSource() == btnAgre) {
			do_btnAgre_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
	}

	//METODOS Y BOTONES

	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	void Listado() {
		txtS.setText("");

		String cabecera = String.format("%-15s %-15s %-10s %-20s %-10s","Nombre","Apellido","DNI","Correo","Telefono");
		Imprimir(cabecera);
		for (int i = 0; i < ae.Tamaño(); i++) {
			Empleado e = ae.Obtener(i);
			String fila = String.format("%-15s %-15s %-10d %-20s %-10d",e.getNom(),e.getApe(),e.getDni(),e.getCorreo(),e.getNum());
			Imprimir(fila);
		}
	}
	void Imprimir1(String s) {
		txtStock.append(s+"\n");
	}
	void Listado1() {
		txtStock.setText("");
		String cabeceraString=String.format("%-15s %-15s %-10s %-20s","Marca","Proveedor","Cantidad","Fecha");
		Imprimir1(cabeceraString);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		for (int i = 0; i < ap.Tamaño(); i++) {
			Productos pr=ap.Obtener(i);
			String fechaFormateada=sdf.format(pr.getFecha());
			String fila1=String.format("%-15s %-15s %-10d %-20s",pr.getMarcaString(),pr.getProveedorString(),pr.getCantidad(),fechaFormateada);
			Imprimir1(fila1);
		}
	}
	void Imprimir2(String s) {
		textVence.append(s+"\n");
	}
	void Listado2() {
		textVence.setText("");
		String cabeceraString=String.format("%-15s %-15s %-10s %-20s","Marca","Proveedor","Cantidad","Fecha");
		Imprimir2(cabeceraString);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		for (int i = 0; i < ap.Tamaño(); i++) {
			Productos pr=ap.Obtener(i);
			String fechaFormateada=sdf.format(pr.getFecha());
			String fila2=String.format("%-15s %-15s %-10d %-20s",pr.getMarcaString(),pr.getProveedorString(),pr.getCantidad(),fechaFormateada);
			Imprimir2(fila2);
		}
	}
	ArregloEmpleado ae= new ArregloEmpleado();
	ArrayList<String>dato=new ArrayList<>();
	ArregloProductos ap=new ArregloProductos();
	int ultimaCantidad = -1;
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
		try {
			String dniTexto = txtDNI.getText();
			if (!dniTexto.isEmpty()) {
				int dni = Integer.parseInt(dniTexto);
				Empleado emp = ae.Buscar(dni);
				if (emp != null) {
					JOptionPane.showMessageDialog(null,"Empleado encontrado\n\n" +"Nombre: " + emp.getNom() +"\nApellido: " + emp.getApe() +"\nDNI: " + emp.getDni() +
							"\nCorreo: " + emp.getCorreo() +"\nTelefono: " + emp.getNum());
				} else {
					JOptionPane.showMessageDialog(null,"No se registró el usuario");
				}
			} else {
				JOptionPane.showMessageDialog(null,"Ingresa un DNI");
			}
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null,"Error: " + e2.getMessage());
		}
	}
	protected void do_btnAgre_actionPerformed(ActionEvent e) {
		try {
			// CAPTURAR DATOS
			String marca = txtMarca.getText();
			String proveedor = txtProvee.getText();
			String cantidadTexto = txtCanti.getText();
			// FECHA DEL JSPINNER
			Date fecha = (Date) spinner.getValue();
			// VALIDAR CAMPOS
			if(marca.isEmpty() || proveedor.isEmpty() || cantidadTexto.isEmpty()) {

				JOptionPane.showMessageDialog(null, "Complete todos los campos");
				return;
			}
			// CONVERTIR CANTIDAD
			int cantidad = Integer.parseInt(cantidadTexto);
			// CREAR OBJETO
			Productos p = new Productos(marca, proveedor, cantidad, fecha);
			// AGREGAR AL ARRAYLIST
			ap.AgregarPro(p);
			JOptionPane.showMessageDialog(null, "Producto agregado correctamente");
			// LIMPIAR CAMPOS
			txtMarca.setText("");
			txtProvee.setText("");
			txtCanti.setText("");
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null,
					"La cantidad debe ser numérica");
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null,"Error: " + ex.getMessage());
		}
	}
	protected void do_btnRegistro_actionPerformed(ActionEvent e) {
		if(tabbedPane.indexOfComponent(panel_1) == -1) {
			tabbedPane.addTab("REGISTRO", panel_1);
		}
		tabbedPane.setSelectedComponent(panel_1);
	}
	protected void do_btnInicio_actionPerformed(ActionEvent e) {
		tabbedPane.setSelectedIndex(0);
	}
	protected void do_btnOrde_actionPerformed(ActionEvent e) {
		 ap.getProductos().sort(Comparator.comparing(Productos::getFecha));
		 Listado2();
		 tabbedPane_1.setSelectedComponent(panel_3);
	}
	protected void do_btnQuitar_actionPerformed(ActionEvent e) {
		try {
	        String dni = txtDNI.getText();
	        if (!dni.isEmpty()) {
	            int dniint = Integer.parseInt(dni);
	            boolean ola = false;
	            Empleado emp = ae.Buscar(dniint);
	            if (emp != null) {
	                ae.Eliminar(emp);
	                txtS.setText("");
	                Listado();
	                JOptionPane.showMessageDialog(null, "Registro Eliminado ");
	                ola = true;
	            }
	            if (!ola) {
	                JOptionPane.showMessageDialog(null, "No se registró el usuario");
	            }
	        } else {
	            JOptionPane.showMessageDialog(null, "Ingresa un dato en la casilla");
	        }
	    } catch (Exception e2) {
	        JOptionPane.showMessageDialog(null, "Error: " + e2.getMessage());
	    }
	}
	protected void do_btnModiReg_actionPerformed(ActionEvent e) {
		try {

	        // 🔎 1. BUSCAR
	        String marcaBuscada = txtMarca.getText();
	        String proveedorBuscado = txtProvee.getText();

	        Productos pro = null;

	        if(!marcaBuscada.isEmpty()) {
	            pro = ap.BuscarPro(marcaBuscada);
	        }
	        else if(!proveedorBuscado.isEmpty()) {
	            pro = ap.BuscarPro1(proveedorBuscado);
	        }
	        else {
	            JOptionPane.showMessageDialog(null, "Ingrese marca o proveedor para buscar");
	            return;
	        }
	        // ❌ NO ENCONTRADO
	        if(pro == null) {
	            JOptionPane.showMessageDialog(null, "Producto no encontrado");
	            return;
	        }
	        // ✏️ 2. TOMAR NUEVOS DATOS (EDICIÓN)
	        String nuevaMarca = txtMarca.getText();
	        String nuevoProveedor = txtProvee.getText();
	        int nuevaCantidad;
	        try {
	            nuevaCantidad = Integer.parseInt(txtCanti.getText());
	        } catch(Exception ex) {
	            JOptionPane.showMessageDialog(null, "Cantidad inválida");
	            return;
	        }
	        Date nuevaFecha = (Date) spinner.getValue();
	        // 🔁 3. MODIFICAR OBJETO ENCONTRADO
	        pro.setMarcaString(nuevaMarca);
	        pro.setProveedorString(nuevoProveedor);
	        pro.setCantidad(nuevaCantidad);
	        pro.setFecha(nuevaFecha);
	        JOptionPane.showMessageDialog(null, "Producto modificado correctamente");

	    } catch(Exception ex) {
	        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
	    }
	}
	protected void do_btnAgregar_actionPerformed(ActionEvent e) {
		try {
			txtS.setText("");
			// CAPTURAR DATOS
			String nombre = txtNom.getText();
			String apellido = txtApe.getText();
			String correo = txtCorreo.getText();
			String dniTexto = txtDNI.getText();
			String telefonoTexto = txtNum.getText();
			// VALIDAR CAMPOS VACÍOS
			if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty()|| dniTexto.isEmpty() || telefonoTexto.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Complete todos los campos");
				return;
			}
			// CONVERTIR A ENTEROS
			int dni = Integer.parseInt(dniTexto);
			int telefono = Integer.parseInt(telefonoTexto);
			// VALIDAR SI YA EXISTE EL DNI
			Empleado buscado = ae.Buscar(dni);
			if (buscado != null) {
				JOptionPane.showMessageDialog(null, "El DNI ya está registrado");
				return;
			}
			// CREAR OBJETO
			Empleado emp = new Empleado(nombre,apellido,telefono,dni,correo);
			// AGREGAR AL ARRAYLIST
			ae.Adicionar(emp);
			btnRegistro.setEnabled(true);
			Listado();
			JOptionPane.showMessageDialog(null, "Empleado agregado correctamente");
			// LIMPIAR CAMPOS
			txtNom.setText("");
			txtApe.setText("");
			txtDNI.setText("");
			txtNum.setText("");
			txtCorreo.setText("");
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null,"DNI y teléfono deben ser números");
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null,"Error: " + ex.getMessage());
		}
	}
	protected void do_btnBsq_actionPerformed(ActionEvent e) {
		try {
			String marcaTexto = txtMarca.getText();
			if (!marcaTexto.isEmpty()) {
				Productos pro = ap.BuscarPro(marcaTexto);
				if (pro != null) {
					SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
					String fecha =sdf.format(pro.getFecha());
					JOptionPane.showMessageDialog(null,"Producto encontrado\n\n" +"Marca: " + pro.getMarcaString() +
							"\nProveedor: " + pro.getProveedorString() +"\nCantidad: " + pro.getCantidad() +"\nFecha: " + fecha);
				} else {
					JOptionPane.showMessageDialog(null,"No se registró el producto");
				}
			} else {
				JOptionPane.showMessageDialog(null,"Ingresa la marca para buscar en el Stock");
			}
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(null,"Error: " + e2.getMessage());
		}
	}
	protected void do_btnListar_actionPerformed(ActionEvent e) {
		 int cantidadActual = ap.Tamaño();
		    // 🔴 CASO 1: lista vacía
		    if(cantidadActual == 0) {
		        txtStock.setText("");
		        JOptionPane.showMessageDialog(null, "La lista está vacía");
		        return;
		    }
		    // ⚠️ CASO 2: ya está actualizada (no hubo cambios)
		    if(cantidadActual == ultimaCantidad) {
		        JOptionPane.showMessageDialog(null, "La lista ya está actualizada");
		        return;
		    }
		    // ✔ CASO 3: mostrar lista
		    Listado1();
		    // actualizar control
		    ultimaCantidad = cantidadActual;
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		try {
	        String marcaString = txtMarca.getText();
	        if (!marcaString.isEmpty()) {
	            boolean ola = false;
	            Productos prod = ap.BuscarPro(marcaString);
	            if (prod != null) {
	                ap.Eliminar(prod);
	                JOptionPane.showMessageDialog(null, "Producto Eliminado ");
	                ola = true;
	            }
	            if (!ola) {
	                JOptionPane.showMessageDialog(null, "No se registró el producto");
	            }
	        } else {
	            JOptionPane.showMessageDialog(null, "Ingresa la marca en la casilla");
	        }
	    } catch (Exception e2) {
	        JOptionPane.showMessageDialog(null, "Error: " + e2.getMessage());
	    }
	}
}
