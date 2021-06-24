package es.webapp.eventosgo.controller;

import es.webapp.eventosgo.entity.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/estudios")
public class EstudioController {

    @GetMapping("/")
    public String  doListarEstudios(Model model, HttpSession session) {
        Usuario u = (Usuario) session.getAttribute("usuario");

        return "estudios";
    }


    @GetMapping("/crear")
    public String doCrearEstudio(Model model) {
        return "crearEstudio";
    }

    public String doGuardarEstudio(Model model, @RequestParam("titulo") String titulo, @RequestParam("")) {

    }
}
