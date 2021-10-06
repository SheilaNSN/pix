package matera.bootcamp.pix.domain.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< HEAD
    @Column(nullable = false)
    private Long nome;

    @Column(nullable = false)
    private Long sobrenome;

    @OneToOne(optional = false)
    private ContaCorrente contaCorrente;
=======
    @Column
    private String nome;

    @Column
    private String sobrenome;

    @OneToOne(optional = false, cascade = { CascadeType.ALL })
    private ContaCorrente contaCorrente;

>>>>>>> feature/api-conta-corrente
}
