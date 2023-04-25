package br.com.niles.webservice.domain;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record ObrasCadastroDTO(
        @NotNull
        String nomeObra,
        @NotNull
        LocalDate dataDeSolicitacao,
        LocalDate dataDeEntrega,
        @NotNull
        ClienteCadastroDTO cliente,
        @NotNull
        Status status
)  {
}
