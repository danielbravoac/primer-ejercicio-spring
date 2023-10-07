package com.proyectoEjemplo.MiPrimerProyecto.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyectoEjemplo.MiPrimerProyecto.modelo.pojos.Usuarios;
import com.proyectoEjemplo.MiPrimerProyecto.modelo.servicio.ServiceDemo;

@RestController
public class ServiceController {

    @Autowired
    public ServiceDemo serviceDemo;

    @PostMapping("/registrar-usuario")
    public ResponseEntity<?> registroUsuario(@RequestBody Usuarios usuario) throws Exception {
        try {
            serviceDemo.registrarUsuario(usuario);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    /*
     * public ViewResolver holaMundo() {
     * ThymeleafViewResolver resolver = new ThymeleafViewResolver();
     * resolver.setTemplateEngine(templateEngine());
     * resolver.setCharacterEncoding("UTF-8");
     * resolver.setContentType("text/html;charset=UTF-8");
     * return resolver;
     * }
     * 
     * public TemplateEngine templateEngine() {
     * SpringTemplateEngine engine = new SpringTemplateEngine();
     * engine.setTemplateResolver(templateResolver());
     * return engine;
     * }
     * 
     * public ITemplateResolver templateResolver() {
     * SpringResourceTemplateResolver resolver = new
     * SpringResourceTemplateResolver();
     * resolver.setApplicationContext(applicationContext);
     * resolver.setPrefix("/views/");
     * resolver.setSuffix(".html");
     * resolver.setTemplateMode(TemplateMode.HTML);
     * resolver.setCharacterEncoding("UTF-8");
     * return resolver;
     * }
     * 
     * @GetMapping("/")
     * public String inicio() {
     * return "holaMundo";
     * }
     */

}
