package com.navent.demo

import grails.rest.Resource
import groovy.transform.ToString

@ToString(includeNames=true)
@Resource(uri='/authors', formats=['json', 'xml'])
class Author {

	Integer id
	String nombre
	
	static hasMany = [books: Book]
	
    static constraints = {
    }
	
	static mapping = {
		books column: 'book_id', joinTable: false
	}
}
