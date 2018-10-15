package controllers;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class InicioController {
	
	public ModelAndView inicio(Request request, Response response) {
		//debe estar definido en src/main/resources y en el paquete templates, sino NO ANDA
		return new ModelAndView(null, "inicio.hbs");
	}
}
