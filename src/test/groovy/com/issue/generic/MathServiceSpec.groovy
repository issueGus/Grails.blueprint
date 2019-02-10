package com.issue.generic

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class MathServiceSpec extends Specification implements ServiceUnitTest<MathService> {

	def setup() {
	}

	def cleanup() {
	}

	void "test something"() {
		expect: "fix me"
		true == false
	}
}
