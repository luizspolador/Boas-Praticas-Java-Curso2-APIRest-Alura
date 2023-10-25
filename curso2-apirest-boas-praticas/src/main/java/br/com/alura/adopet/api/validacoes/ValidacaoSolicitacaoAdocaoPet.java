package br.com.alura.adopet.api.validacoes;

import br.com.alura.adopet.api.dto.SolicitacaoAdocaoDto;

public interface ValidacaoSolicitacaoAdocaoPet {
    void validarPet(SolicitacaoAdocaoDto dto);
}
