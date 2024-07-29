package biblioteca.service;

import biblioteca.model.Livro;
import biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> getAllLivros() {
        return livroRepository.findAll();
    }

    public Optional<Livro> getLivroById(Long id) {
        return livroRepository.findById(id);
    }

    public Livro saveLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public void deleteLivro(Long id) {
        livroRepository.deleteById(id);
    }
}
