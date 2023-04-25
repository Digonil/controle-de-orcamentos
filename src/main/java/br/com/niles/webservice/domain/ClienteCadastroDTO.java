package br.com.niles.webservice.domain;

import jakarta.validation.constraints.NotNull;

public record ClienteCadastroDTO(
        @NotNull
        String nomeCliente,
        String nomeSolicitante,
        String telefone,
        String email
) {
}
