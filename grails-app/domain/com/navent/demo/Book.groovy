package com.navent.demo

import grails.rest.Resource

class Book {

	Integer id
	String titulo
	Date fechaPublicacion
	
	static belongsTo = [author: Author]
	
    static constraints = {
		fechaPublicacion nullable:true
    }
	
	static mapping = {
		table name: "book_table"
		id column: "id", generator: 'increment'
	}
}
