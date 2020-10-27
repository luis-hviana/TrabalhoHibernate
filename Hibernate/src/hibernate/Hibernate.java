package hibernate;

import Controllers.AutorController;
import Controllers.EditoraController;
import Controllers.LivroController;
import Models.Autor;
import Models.Editora;
import Models.Email;
import Models.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luish
 */
public class Hibernate {


    public static void main(String[] args) {
        AutorController acon = new AutorController();
        EditoraController econ = new EditoraController();
        LivroController lcon = new LivroController();

        
        Email em1 = new Email();
        em1.setEmail("luis@gmail.com");
        Autor a1 = new Autor();
        a1.setNome("Luis henrique");
        a1.Email = new ArrayList<>();
        a1.Email.add(em1);
        
        Email em2 = new Email();
        em2.setEmail("danilo@gmail.com");
        Autor a2 = new Autor();
        a2.setNome("Danilo Oliveira");
        a2.Email = new ArrayList<>();
        a2.Email.add(em2);
        
        Email em3 = new Email();
        em3.setEmail("vinicius@gmail.com");
        Autor a3 = new Autor();
        a3.setNome("Vinicius Matheus");
        a3.Email = new ArrayList<>();
        a3.Email.add(em3);
        
        Email em4 = new Email();
        em4.setEmail("gabriel@gmail.com");
        Autor a4 = new Autor();
        a4.setNome("Gabriel Mina");
        a4.Email = new ArrayList<>();
        a4.Email.add(em4);
        
        Email em5 = new Email();
        em5.setEmail("paloma@gmail.com");
        Autor a5 = new Autor();
        a5.setNome("Paloma Viana");
        a5.Email = new ArrayList<>();
        a5.Email.add(em5);
        
        //acon.salvarAutor(a2);
 
        
        /*
        List<Autor> autor = acon.listarAutor(1);
        
        for (int i = 0; i < autor.size(); i++) {
            System.out.println("ID: " + autor.get(i).getId() + " - Nome: " + autor.get(i).getNome());
        }
         */
        
        /*
        List<Autor> autorHQL = acon.consultaTodosAutoresHQL();
        
        for (int i = 0; i < autorHQL.size(); i++) {
            System.out.println("ID: " + autorHQL.get(i).getId() + " - Nome: " + autorHQL.get(i).getNome());
        }
        */
        
        /*
        List<Autor> autorHQL = acon.consultaAutor25HQL();
        
        for (int i = 0; i < autorHQL.size(); i++) {
            System.out.println("ID: " + autorHQL.get(i).getId() + " - Nome: " + autorHQL.get(i).getNome());
        }
        */
        // _____________________________________EDITORA____________________________
        Editora e1 = new Editora();
        e1.setNome("Livros S.A");
        
        Editora e2 = new Editora();
        e2.setNome("Pearson");
        
        Editora e3 = new Editora();
        e3.setNome("Grupo Planeta");
        
        
        Editora e4 = new Editora();
        e4.setNome("Manchete Livre");
        
        Editora e5 = new Editora();
        e5.setNome("Bertelsmann");
        
        //econ.salvarEditora(e5);
        
         /*
        List<Editora> editora = econ.listarEditora(1);
        
        for (int i = 0; i < editora.size(); i++) {
            System.out.println("ID: " + editora.get(i).getId() + " - Nome: " + editora.get(i).getNome());
        }
         */
        
        
        // _____________________________________EDITORA____________________________
        

        Livro l1 = new Livro();
        l1.setTitulo("Sherlock Holmes");
        l1.setPreco(100000);
        l1.setEdicao("Pedro das Neves");
        l1.setEditora(e1);
        l1.Autor = new ArrayList<>();
        l1.Autor.add(a1);
        
        Livro l2 = new Livro();
        l2.setTitulo("O morro dos ventos uivantes");
        l2.setPreco(100000);
        l2.setEdicao("João Francisco");
        l2.setEditora(e1);
        l2.Autor = new ArrayList<>();
        l2.Autor.add(a1);
        l2.Autor.add(a2);
        
        Livro l3 = new Livro();
        l3.setTitulo("Mulheres que correm com os lobos");
        l3.setPreco(100000);
        l3.setEdicao("Maria de Paula");
        l3.setEditora(e1);
        l3.Autor = new ArrayList<>();
        l3.Autor.add(a1);
        
        Livro l4 = new Livro();
        l4.setTitulo("o Holocausto");
        l4.setPreco(100000);
        l4.setEdicao("Vania Aparecida");
        l4.setEditora(e1);
        l4.Autor = new ArrayList<>();
        l4.Autor.add(a1);
        
        Livro l5 = new Livro();
        l5.setTitulo("O poder do hábito");
        l5.setPreco(100000);
        l5.setEdicao("Danilo Guedes");
        l5.setEditora(e1);
        l5.Autor = new ArrayList<>();
        l5.Autor.add(a1);
        
        //lcon.salvarLivro(l1);
        
         /*
        List<Livro> livro = econ.listarLivro(1);
        
        for (int i = 0; i < livro.size(); i++) {
            System.out.println("ID: " + livro.get(i).getId() + " - Titulo: " + livro.get(i).getTitulo() + " - Preço: " + livro.get(i).getPreco());
        }
         */
    }
    
}
