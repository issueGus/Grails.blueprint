package com.issue.generic

import grails.testing.services.ServiceUnitTest
import org.grails.datastore.mapping.engine.event.PostDeleteEvent
import org.grails.datastore.mapping.engine.event.PostInsertEvent
import org.grails.datastore.mapping.engine.event.PostUpdateEvent
import spock.lang.Specification

class AuditListenerServiceSpec extends Specification implements ServiceUnitTest<AuditListenerService>{


//    oid setupSpec() {
//        mockDomains Book
//    }

    void "Book.PostInsertEvent triggers auditDataService.save"(){
        given:
        service.auditDataService = Mock(AuditDataService)

        Book book = new Book(title: 'Practical Grails 3',
                author: 'Eric Helgeson',
                pages: 1).save()
        PostInsertEvent event = new PostInsertEvent(dataStore, book)

        when:
        service.afterInsert(event)

        then:
        1 * service.auditDataService.save(_, _)
    }

    void "Book.PostUpdateEvent triggers auditDataService.save"(){
        given:
        service.auditDataService = Mock(AuditDataService)

        Book book = new Book(title: 'Practical Grails 3',
                author: 'Eric Helgeson',
                pages: 1).save()
        PostUpdateEvent event = new PostUpdateEvent(dataStore, book)

        when:
        service.afterUpdate(event)

        then:
        1 * service.auditDataService.save(_, _)
    }

    void "Book.PostDeleteEvent triggers auditDataService.save"(){
        given:
        service.auditDataService = Mock(AuditDataService)

        Book book = new Book(title: 'Practical Grails 3',
                author: 'Eric Helgeson',
                pages: 1).save()
        PostDeleteEvent event = new PostDeleteEvent(dataStore, book)

        when:
        service.afterDelete(event)

        then:
        1 * service.auditDataService.save(_, _)
    }
}
