package com.librarysystem.service;

import com.librarysystem.repository.LibraryRepository;

public class LibraryService {
    private LibraryRepository libraryRepository;

    public void setLibraryRepository(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public void addBook(String title) {
        libraryRepository.saveBook(title);
    }
}
