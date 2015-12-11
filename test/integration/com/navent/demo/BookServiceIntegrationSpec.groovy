package com.navent.demo

import grails.test.spock.IntegrationSpec

class BookServiceIntegrationSpec extends IntegrationSpec {

	def bookService
	
    def setup() {
    }

    def cleanup() {
    }

    void "test libros por autor"() {
		
		setup:
			def author = Author.get(1)
		when:
			def books = bookService.booksOfAuthor(author)
		then:
			books != null
			!books.empty
			books.size() == 2
    }
}
