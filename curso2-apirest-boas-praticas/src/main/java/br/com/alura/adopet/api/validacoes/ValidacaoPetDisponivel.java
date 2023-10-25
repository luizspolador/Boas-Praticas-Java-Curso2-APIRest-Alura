package br.com.alura.adopet.api.validacoes;

import br.com.alura.adopet.api.dto.SolicitacaoAdocaoDto;
import br.com.alura.adopet.api.exception.ValidacaoException;
import br.com.alura.adopet.api.model.Pet;
import br.com.alura.adopet.api.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidacaoPetDisponivel implements ValidacaoSolicitacaoAdocaoPet{

    @Autowired
    private PetRepository petRepository;

    @Override
    public void validarPet(SolicitacaoAdocaoDto dto){
        Pet pet = petRepository.getReferenceById(dto.idPet()); // carrega o pet do db
        if (pet.getAdotado()) { // se ja estiver adotad
            throw new ValidacaoException("Pet já foi adotado!");
        }
    }
}
