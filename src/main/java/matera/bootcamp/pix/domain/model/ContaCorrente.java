package matera.bootcamp.pix.domain.model;

<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonIgnore;
>>>>>>> feature/api-conta-corrente
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class ContaCorrente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    private Long id;

    @Column (nullable = false)
=======
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
>>>>>>> feature/api-conta-corrente
    private Long agencia;

    @Column(nullable = false)
    private Long conta;

<<<<<<< HEAD
    @Column(precision = 18, scale =2, nullable = false)
    private BigDecimal saldo = new BigDecimal(val= "0,");
}
=======
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal saldo = new BigDecimal("0.00");

    @OneToOne(mappedBy = "contaCorrente")
    @JsonIgnore
    private Usuario usuario;

}
>>>>>>> feature/api-conta-corrente
