package br.com.niles.webservice.domain;

public record ClienteCadastroDTO(
        String nomeCliente,
        String nomeSolicitante,
        String telefone,
        String email
) {
}
