package server;

import controllers.InicioController;
import controllers.SaludoController;
import controllers.UsuarioController;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;
import spark.utils.BooleanHelper;
import spark.utils.HandlebarsTemplateEngineBuilder;

public class Router {
	private static HandlebarsTemplateEngine engine;
	
	private static void initEngine() {
		Router.engine = HandlebarsTemplateEngineBuilder
				.create()
				.withDefaultHelpers()
				.withHelper("isTrue", BooleanHelper.isTrue)
				.build();
	}
	
	public static void init() {
		Router.initEngine();
		//?
		Spark.staticFileLocation("/public");
		Router.configure();
	}
	
	private static void configure(){
		//hay que levantar los controllers cuando laburams con spark, con new
		InicioController inicioController 	= new InicioController();
		SaludoController saludoController 	= new SaludoController();
		UsuarioController usuarioController = new UsuarioController();
		//el metodo sin parámetros, por más que el método si los reciba
		Spark.get("/", inicioController::inicio, Router.engine);
		
		Spark.get("/saludo/:nombre",saludoController::saludar, Router.engine);
		
		Spark.get("/saludo/*/:nombre", (req,res) -> "Hola "+req.splat()[0]+" "+req.params("nombre"));
		
		Spark.get("/saludo", (req,res) -> "Hola "+req.queryParams("nombre")+" "+req.queryParams("apellido"));
		
		Spark.get("/usuarios", usuarioController::usuarios, Router.engine);
		
		Spark.get("/usuario/:nombreDeUsuario", usuarioController::editar, Router.engine) ;
		
		Spark.get("/usuario", usuarioController::crear, Router.engine);
		
		Spark.post("/usuario", usuarioController::guardar, Router.engine);
	}
}
