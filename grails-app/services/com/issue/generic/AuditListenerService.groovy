package com.issue.generic

import grails.events.annotation.Subscriber
import grails.gorm.transactions.Transactional
import org.grails.datastore.mapping.engine.event.AbstractPersistenceEvent
import org.grails.datastore.mapping.engine.event.PostDeleteEvent
import org.grails.datastore.mapping.engine.event.PostInsertEvent
import org.grails.datastore.mapping.engine.event.PostUpdateEvent

@Transactional
class AuditListenerService {

    AuditDataService auditDataService

    Long bookId(AbstractPersistenceEvent event) {
        if ( event.entityObject instanceof Book ) {
            return ((Book) event.entityObject).id
        }
        null
    }

    @Subscriber
    void afterInsert(PostInsertEvent event) {
        Long bookId = bookId(event)
        if ( bookId ) {
            log.info 'After book save...'
            auditDataService.save("New book saved with id[$bookId]", bookId, new Date(), new Date())
        }
    }

    @Subscriber
    void afterUpdate(PostUpdateEvent event) {
        Long bookId = bookId(event)
        if ( bookId ) {
            log.info "After book update..."
            auditDataService.save("Book id[$bookId] get updated", bookId, new Date(), new Date())
        }
    }

    @Subscriber
    void afterDelete(PostDeleteEvent event) {
        Long bookId = bookId(event)
        if ( bookId ) {
            log.info 'After book delete ...'
            auditDataService.save("Delete book with id[$bookId]", bookId, new Date(), new Date())
        }
    }
}
