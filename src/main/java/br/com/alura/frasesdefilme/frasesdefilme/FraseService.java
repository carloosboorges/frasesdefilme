package br.com.alura.frasesdefilme.frasesdefilme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
    Frase frase = repositorio.buscaAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
