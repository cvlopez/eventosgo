package es.webapp.eventosgo.service;

import es.webapp.eventosgo.dao.UsuarioRepository;
import es.webapp.eventosgo.dto.UsuarioDTO;
import es.webapp.eventosgo.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    @Autowired
    public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioDTO comprobarCredenciales(String correo, String pass){
        Usuario user = this.usuarioRepository.findByCorreoPass(correo, pass);
        if(user!=null){
            return user.getDTO();
        } else{
            return null;
        }
    }

    public UsuarioDTO buscarUsuarioId(Integer id){
        Usuario user = this.usuarioRepository.findById(id).orElse(null);
        if(user != null){
            return user.getDTO();
        } else{
            return null;
        }
    }

    public Integer guardarUsuario(UsuarioDTO dto){

        Usuario usuario;
        if(dto.getId() == null){
            usuario = new Usuario();
        } else{
            usuario = this.usuarioRepository.findById(dto.getId()).orElse(new Usuario());
        }

        usuario.setRol(dto.getRol());
        usuario.setCorreo(dto.getCorreo());
        usuario.setContrasena(dto.getContrasena());
        usuario.setNombre(dto.getNombre());

        this.usuarioRepository.save(usuario);

        return usuario.getId();
    }
}
