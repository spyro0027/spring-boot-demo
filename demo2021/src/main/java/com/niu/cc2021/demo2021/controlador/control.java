package com.niu.cc2021.demo2021.controlador;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class control {
	@GetMapping("/")
	//creacion de objeto para envio de mensajes desde este metodo

	public String inicio(Model modelomsg) {
		//mensaje enviado por control  de objeto 
		modelomsg.addAttribute("mensajeinicio", "hola este un mensaje como cadena de texto");
		//agregar atributo tipo date llamar variable de  tipo model llamado date de java util este es un atributo con un objeto interno
		 //renderizado desde controlador 
         String nombre ="Auxiliar de contabilidad";
         Date fechapub =new Date();
         double salario =9000.0;
         boolean vigente =true;
         modelomsg.addAttribute("nombre",nombre);
         modelomsg.addAttribute("fecha",fechapub);
         modelomsg.addAttribute("salario",salario);
         modelomsg.addAttribute("vigente",vigente);

		modelomsg.addAttribute("fecha", new Date());
		return "inicio";
    }
		//--------------------------------------------------------------------------------
        //------datos tipos list ----------
        @GetMapping("/listado")
        public String mostrarInicio(Model modelolist){
//----crear objeto tipo list   detalles de linkedlist https://www.redeszone.net/2012/03/05/curso-de-java-estructuras-de-datos-arraylist-y-linkedlist/

List<String> lista = new LinkedList<>();// es menos eficiente que arraylist usa menos memoria uso para listas de tamaño determinado que no cambian de tamaño

lista.add("ingeniero en sistemas"); // primer campo       
lista.add("cajero"); // segundo campo
lista.add("contador"); // 
lista.add("vendedor "); // 

modelolist.addAttribute("empleos", lista);// llamamos el objeto modelolist creado antes y le pasamos el objeto tipo list y lo renombramos como empleo asi podemos llamarlo desde la vista listado
return "listado";
}
	}

