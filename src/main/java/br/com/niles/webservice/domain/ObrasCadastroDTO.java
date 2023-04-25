package br.com.niles.webservice.domain;

import java.time.LocalDate;

public record ObrasCadastroDTO(
        String nomeObra,
        LocalDate dataDeSolicitacao,
        LocalDate dataDeEntrega,
        ClienteCadastroDTO cliente,
        Status status
)  {
}
