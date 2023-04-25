package br.com.niles.webservice.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity(name = "Obras")
@Table(name = "TB_OBRAS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Obras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_obra")
    private String nomeObra;

    @Column(name = "data_de_solicitacao")
    private LocalDate dataDeSolicitao;

    @Column(name = "data_de_entrega")
    private LocalDate dataDeEntrega;

    @ManyToOne
    private Cliente cliente;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Override
    public String toString() {
        return "Obras{" +
                "id=" + id +
                ", nomeObra='" + nomeObra + '\'' +
                ", dataDeSolicitao=" + dataDeSolicitao +
                ", dataDeEntrega=" + dataDeEntrega +
                ", cliente=" + cliente +
                ", status=" + status +
                '}';
    }
}
