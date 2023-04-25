package br.com.niles.webservice.service;

import br.com.niles.webservice.domain.Obras;
import br.com.niles.webservice.domain.ObrasCadastroDTO;
import br.com.niles.webservice.domain.ObrasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ObraService {

    @Autowired
    ObrasRepository repository;

    public void cadastrarObra (@RequestBody ObrasCadastroDTO obra){
        var novaObra = new Obras(obra);
        repository.save(novaObra);
    }

}
