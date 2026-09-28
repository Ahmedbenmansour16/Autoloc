package tn.esprit.autoloc.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idContrat;
    LocalDate dateSigniature;
    BigDecimal montantTotal;
     boolean valide;

     //les relation
    @OneToOne
    Reservation reservation;
    @OneToMany(mappedBy = "contrat",cascade = CascadeType.ALL)
    List<Paiement> paiements = new ArrayList<>();

}
