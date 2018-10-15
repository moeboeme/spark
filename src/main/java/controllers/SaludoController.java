package controllers;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class SaludoController {
	
	public ModelAndView saludar(Request request, Response response) {
		 Map<String, Object> model=new HashMap<>();
		 //defino la variabl nombreDeLaPersona, y pido el parametro "nombre" del request
		 model.put("nombreDeLaPersona", request.params("nombre"));
		 //model matchea con la vista que en este caso es saludo.hbs
		 return new ModelAndView(model, "saludo.hbs");
	}
	
}
