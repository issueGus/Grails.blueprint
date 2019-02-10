package com.issue.generic

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Book {

    Integer id
    String author
    String title
    Date createdDate
    String serialNumber

	static mapping = {
		version false
		id generator: 'identity'
	}

    static constraints = {
        serialNumber nullable: true
        title nullable: false
    }

}
