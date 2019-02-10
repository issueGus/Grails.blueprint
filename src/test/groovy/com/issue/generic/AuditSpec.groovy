package com.issue.generic

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class AuditSpec extends Specification implements DomainUnitTest<Audit> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
