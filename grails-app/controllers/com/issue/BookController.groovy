package com.issue

import com.issue.generic.Book
import com.issue.generic.BookDataService

class BookController {

    BookDataService bookDataService

    def insertBook(String title, String author) {
        if ( title == null || author == null ) {
            render "[ERROR] Title or author is NULL"
        } else {
            log.debug "[CALL] insertBook - with Title[$title] author[$author]"
            Book saveBook = bookDataService.save(title, author, new Date())
            log.debug "\n${saveBook} "
            render saveBook
        }
    }

    def updateBook(Integer id, String title, String serialNumber) {
        if (id == null) {
            render "[ERROR] Id is null"
        } else {
            if (title==null || serialNumber==null) {
                render "[ERROR] Title or serialNumber is NULL"
            } else {
                log.debug "[CALL] updateBook - Update book[$id] with title[$title], serialNumber[$serialNumber]"
                render bookDataService.update(id, title, serialNumber)
            }
        }
    }
}