package com.navent.demo

import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(BookService)
@Mock([Book, Author])
class BookServiceSpec extends Specification {
	
    def setup() {
		
    }

    def cleanup() {
    }
	
	void "test crear libro"() {
		
		setup:
			def author = new Author(nombre: 'test')
		when:
			def book = service.createBook("prueba", author)
		then:
			book != null
			book.titulo == 'prueba'
	}

	
    void "test libro por titulo"() {
		
		setup:
			def author = new Author(nombre: 'test')
			service.createBook("prueba", author)
		when:
			def book = service.bookByTitle("prueba")
		then:
			book != null
			book.titulo == 'prueba'
    }
}
