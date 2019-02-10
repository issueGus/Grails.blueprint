package com.issue.generic

import grails.gorm.services.Service
import groovy.transform.CompileStatic

@CompileStatic
@Service(Book)
interface BookDataService {

	Book save(String title, String author, Date createdDate)

	List<Book> findAll()

	Book update(Serializable id, String title, String serialNumber)

	void delete(Serializable id)

}