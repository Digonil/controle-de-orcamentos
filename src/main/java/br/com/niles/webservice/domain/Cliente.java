package br.com.niles.webservice.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

@Entity(name = "Cliente")
@Table(name = "TB_CLIENTE")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_cliente")
    private String nomeCliente;

    @Column(name = "nome_solicitante")
    private String nomeSolicitante;

    private String telefone;

    @Email
    private String email;

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nomeCliente='" + nomeCliente + '\'' +
                ", nomeSolicitante='" + nomeSolicitante + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
