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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author luish
 */

@Entity
@Table(name="Livro")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_LIVRO")
    private Integer Id;
    
    @Column(length=80, nullable=false)
    private String Titulo;
    
    @Column(length=80, nullable=false)
    private String Edicao;
    
    @Column(length=80, nullable=false)
    private double Preco;
    
    @OneToOne(cascade = javax.persistence.CascadeType.ALL)
    @JoinColumn(name = "IDFK_EDITORA", referencedColumnName = "ID_EDITORA")
    private Editora Editora = new Editora();
    
    @OneToMany(
    cascade = CascadeType.ALL,
    orphanRemoval = true
    )
    @JoinColumn(name = "IDFK_AUTOR")
    public List<Autor> Autor;
   
    public Livro() {
        this.Autor = new ArrayList<>();
    }
    
    
    /**
     * @return the Id
     */
    public Integer getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Edicao
     */
    public String getEdicao() {
        return Edicao;
    }

    /**
     * @param Edicao the Edicao to set
     */
    public void setEdicao(String Edicao) {
        this.Edicao = Edicao;
    }

    /**
     * @return the Preco
     */
    public double getPreco() {
        return Preco;
    }

    /**
     * @param Preco the Preco to set
     */
    public void setPreco(double Preco) {
        this.Preco = Preco;
    }
   
    /**
     * @return the Editora
     */
    public Editora getEditora() {
        return Editora;
    }

    /**
     * @param Editora the Editora to set
     */
    public void setEditora(Editora Editora) {
        this.Editora = Editora;
    }

    /**
     * @return the Autor
     */
    public List<Autor> getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(List<Autor> Autor) {
        this.Autor = Autor;
    }
    
}
