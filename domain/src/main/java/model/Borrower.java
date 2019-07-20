package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "borrower")
public class Borrower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrower_id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "borrower")
    private List<Borrow> borrow;

    @OneToOne
    @JoinColumn(name = "borrower_details_id")
    private BorrowerDetails borrowerDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Borrow> getBorrow() {
        return borrow;
    }

    public void setBorrow(List<Borrow> borrow) {
        this.borrow = borrow;
    }

    public BorrowerDetails getBorrowerDetails() {
        return borrowerDetails;
    }

    public void setBorrowerDetails(BorrowerDetails borrowerDetails) {
        this.borrowerDetails = borrowerDetails;
    }
}
