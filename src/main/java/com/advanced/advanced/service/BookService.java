package com.advanced.advanced.service;

import com.advanced.advanced.dto.BookDTO;
import com.advanced.advanced.entity.Author;
import com.advanced.advanced.entity.Book;
import com.advanced.advanced.mapper.BookMapper;
import com.advanced.advanced.repository.AuthorRepository;
import com.advanced.advanced.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository repository;
    private final AuthorRepository authorRepository;
    private final BookMapper mapper;


    public BookDTO getByIdPersonalizedQuery(Long id) {
        return this.repository.findBookByIdPersonalizedQuery(id);

    }

    public List<BookDTO> getAllBocksBesseler() {
        List<BookDTO> bocks = this.repository.getAllBocksBesseller();

        return bocks;
    }

    public List<BookDTO> getAllBocksMultilenguaje() {
        List<BookDTO> bocksMultilenguaje = this.repository.getAllBocksMultilenguaje();

        return bocksMultilenguaje;
    }

    public List<BookDTO> letterAO() {
        List<Book> allBooks = this.repository.findAll();
        List<BookDTO> result = new ArrayList<>();

        for (int i = 0; i < allBooks.size(); i++) {
            Book currentBook = allBooks.get(i);
            String title = currentBook.getTitle();

            if (!containsLetterA(title)) {
                BookDTO dto = new BookDTO(
                        currentBook.getId(),
                        currentBook.getTitle(),
                        currentBook.getAuthor().getId(),
                        currentBook.getPages(),
                        currentBook.getEditorial(),
                        currentBook.getSize(),
                        currentBook.getIsBestSeller(),
                        currentBook.getIsMultilanguage()
                );
                result.add(dto);
            }
        }
        return result;
    }
    private boolean containsLetterA(String title) {
        for (int i = 0; i < title.length(); i++) {
            char letter = title.charAt(i);
            if (letter == 'a' || letter == 'A') {
                return true;
            }
        }
        return false;
    }

    public List<BookDTO> getSizeBook(String size){
        List<Book> allBook = this.repository.findAll();
        List<BookDTO> result = new ArrayList<>();

        for (int i = 0; i <allBook.size() ; i++) {

            Book currentBook = allBook.get(i);
            String currentSize = currentBook.getSize();

            if (currentSize != null && currentSize.equalsIgnoreCase(size)) {
                BookDTO dto = new BookDTO(
                        currentBook.getId(),
                        currentBook.getTitle(),
                        currentBook.getAuthor().getId(),
                        currentBook.getPages(),
                        currentBook.getEditorial(),
                        currentBook.getSize(),
                        currentBook.getIsBestSeller(),
                        currentBook.getIsMultilanguage()
                );
                result.add(dto);
            }
        }

        return result;
    }
    public List<BookDTO> getPagesBook(Integer maxPages, String size){
        List<Book> allBooks = this.repository.findAll();
        List<BookDTO> result = new ArrayList<>();

        for (int i = 0; i < allBooks.size(); i++) {
            Book currentBook = allBooks.get(i);
            Integer currentPages = currentBook.getPages();
            String currentSize = currentBook.getSize();

            boolean cumplePaginas = currentPages != null && currentPages <= maxPages;
            boolean cumpleTamanio = currentSize != null && currentSize.equalsIgnoreCase(size);

            if (cumplePaginas && cumpleTamanio) {
                BookDTO dto = new BookDTO(
                        currentBook.getId(),
                        currentBook.getTitle(),
                        currentBook.getAuthor().getId(),
                        currentBook.getPages(),
                        currentBook.getEditorial(),
                        currentBook.getSize(),
                        currentBook.getIsBestSeller(),
                        currentBook.getIsMultilanguage()
                );
                result.add(dto);
            }
        }

        return result;
    }
}