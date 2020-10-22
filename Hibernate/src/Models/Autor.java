package Models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author luish
 */

@Entity
@Table(name="Autor")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PESSOA")
    private Integer Id;
    
    @Column(length=80, nullable=false)
    private String Nome;
    
    @OneToMany(
    cascade = CascadeType.ALL,
    orphanRemoval = true
    )
    @JoinColumn(name = "IDFK_AUTOR")
    public List<Email> Email;

    public Autor() {
        this.Email = new ArrayList<>();
    }
    
    public Integer getId() {
        return Id;
    }

   
    public void setId(Integer Id) {
        this.Id = Id;
    }

   
    public String getNome() {
        return Nome;
    }

    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Email
     */
    public List<Email> getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(List<Email> Email) {
        this.Email = Email;
    }

    

    
    
}
