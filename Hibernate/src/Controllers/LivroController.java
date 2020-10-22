package Controllers;


import Models.Livro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


/**
 *
 * @author luish
 */
public class LivroController {
    EntityManagerFactory emf;
    EntityManager em;
    
    public LivroController() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }
    
    public void salvarLivro(Livro _livro) {
        em.getTransaction().begin();
        em.merge(_livro);
        try {
            em.getTransaction().commit();
            System.out.println("Livro inserido com sucesso");
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        em.close();
        emf.close();
    }
     
    public List listarLivro(int id) {
        em.getTransaction().begin();
        String consulta = ("select livro from Livro livro where id_livro=" + id);
        Query q = em.createQuery(consulta);
        List resultado = q.getResultList();
        return resultado;
    }

}
