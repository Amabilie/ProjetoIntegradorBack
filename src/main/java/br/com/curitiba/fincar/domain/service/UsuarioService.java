package br.com.curitiba.fincar.domain.service;

import br.com.curitiba.fincar.domain.Usuario;
import br.com.curitiba.fincar.domain.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository rep;

    public Usuario save(Usuario usuario) {
        return rep.save(usuario);
    }
}
