/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Models.Editora;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author luish
 */
public class EditoraController {
    EntityManagerFactory emf;
    EntityManager em;
    
    public EditoraController() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }
    
    public void salvarEditora(Editora _editora) {
        em.getTransaction().begin();
        em.merge(_editora);
        try {
            em.getTransaction().commit();
            System.out.println("Editora inserido com sucesso");
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
        em.close();
        emf.close();
    }
    
    public List listarEditora(int id) {
        em.getTransaction().begin();
        String consulta = ("select editora from Editora Editora where id_editora =" + id);
        javax.persistence.Query q = em.createQuery(consulta);
        List resultado = q.getResultList();
        return resultado;
    }
    
    
}
