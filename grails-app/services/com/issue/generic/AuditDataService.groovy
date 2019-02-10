package com.issue.generic

import grails.gorm.services.Service
import grails.gorm.services.Where
import groovy.transform.CompileStatic

@CompileStatic
@Service(Audit)
interface AuditDataService {

	Audit save(String event, Long bookId, Date createdDate, Date lastUpdated)

	Number count()

	List<Audit> findAll(Map args)

	@Where({ bookId == id })
	void deleteByBookId(Long id)
}