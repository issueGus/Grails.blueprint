package com.issue.generic

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Audit {

    Integer id
	Long bookId
    String event
    Date createdDate
	Date lastUpdated

    static mapping = {
        version false
        id generator: 'identity'
    }

    static constraints = {
	    bookId nullable: false
	    event nullable: false, blank: false
    }
}
