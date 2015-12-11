package com.navent.demo

import grails.transaction.Transactional

@Transactional
class BookService {

    def booksOfAuthor(Author author) {

		return Book.findAllByAuthor(author)
    }
	
	def createBook(String title, Author author) {
		
		def book = new Book(titulo: title, fechaPublicacion: new Date(), author: author).save(flush: true, failOnError: true)
		return book
	}
	
	def bookByTitle(String title) {
		
		return Book.findByTitulo(title)
	}
}
