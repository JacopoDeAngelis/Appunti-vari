package guru.springframework.spring6webapp.bootstrap;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.domain.Publisher;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import guru.springframework.spring6webapp.repositories.BookRepository;
import guru.springframework.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) {
        var eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        var ddd = new Book();
        ddd.setIsbn("123456");
        ddd.setTitle("Domain Driven Design");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        var rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        var notEjb = new Book();
        notEjb.setIsbn("654321");
        notEjb.setTitle("J2EE Development without EJB");


        Author rodSaved = authorRepository.save(rod);
        Book notEjbSaved = bookRepository.save(notEjb);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(notEjbSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);


        var firstPublisher = new Publisher();
        firstPublisher.setName("firstPublisher");
        firstPublisher.setZip("firstPublisherZip");
        firstPublisher.setAddress("firstPublisherAddress");
        firstPublisher.setCity("firstPublisherCity");
        firstPublisher.setState("firstPublisherState");

        var secondPublisher = new Publisher();
        secondPublisher.setName("secondPublisher");
        secondPublisher.setZip("secondPublisherZip");
        secondPublisher.setAddress("secondPublisherAddress");
        secondPublisher.setCity("secondPublisherCity");
        secondPublisher.setState("secondPublisherState");

        var thirdBook = new Book();
        thirdBook.setIsbn("7138964");
        thirdBook.setTitle("Third Book");

        firstPublisher.getPublishedBooks().add(dddSaved);
        secondPublisher.getPublishedBooks().add(notEjbSaved);
        secondPublisher.getPublishedBooks().add(thirdBook);
        publisherRepository.saveAll(List.of(firstPublisher, secondPublisher));

        System.out.println(firstPublisher);
        System.out.println(secondPublisher);
    }
}
