package br.edu.famper.livro.model;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "tbl_livro")
@Data
public class Livro {

    @Id
    @GeneratedValue
    @Column(name = "livro_id")
    private Long id;

    @Column(name = "titulo", length = 100)
    private String titulo;

    @Column(name = "autor", length = 75)
    private String autor;

    @Column(name = "ano_publicacao")
    private String ano_publicacao;

    @Column(name = "preco")
    private BigDecimal preco;
}
