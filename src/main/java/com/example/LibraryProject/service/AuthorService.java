package com.example.LibraryProject.service;
import com.example.LibraryProject.entity.Author;
import com.example.LibraryProject.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorReposiotry;

    public List<Author> findAllAuthors(){
        return authorReposiotry.findAll();
    }

    public Author findAuthorById(Long id){
        Author author = authorReposiotry.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        return author;
    }

    public void createAuthor(Author author){
        authorReposiotry.save(author);
    }
    public void updateAuthor(Author author){
        authorReposiotry.save(author);
    }

    public void deleteAuthor(Long id){
        Author author = authorReposiotry.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        authorReposiotry.deleteById(author.getId());
    }
}
