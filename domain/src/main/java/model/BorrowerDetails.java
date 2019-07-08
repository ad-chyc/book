package model;

import javax.persistence.*;

@Entity
@Table(name = "borrower_details")
public class BorrowerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrower_details_id")
    private Long id;

    @Column(name = "adress")
    private String adress;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;
}
