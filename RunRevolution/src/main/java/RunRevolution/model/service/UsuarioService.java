package RunRevolution.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RunRevolution.model.domain.Usuario;
import RunRevolution.model.repositories.UsuarioRepository;
import RunRevolution.exceptions.UsuarioNaoEncontradoException;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void incluir(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public Collection<Usuario> obterLista(){
        return (Collection<Usuario>) usuarioRepository.findAll();
    }

    public void excluir(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public void atualizar(Usuario usuario) {
        Optional<Usuario> usuarioExistente = usuarioRepository.findById(usuario.getId());

        if (usuarioExistente.isPresent()) {
            Usuario usuarioAtualizado = usuarioExistente.get();
            usuarioRepository.save(usuarioAtualizado);
        } else
            throw new UsuarioNaoEncontradoException("Usuario com ID " + usuario.getId() + " não encontrado.");
    }
}
