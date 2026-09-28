package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Paiement
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPaiment;
    BigDecimal montant;
    LocalDate datePaiment;
    @Enumerated(EnumType.STRING)
    ModePaiement modePaiement;

    //les relation
    @ManyToOne
    Contrat contrat;

}
