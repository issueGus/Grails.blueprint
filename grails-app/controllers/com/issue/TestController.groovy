package com.issue

import net.logstash.logback.encoder.org.apache.commons.lang.exception.ExceptionUtils
import net.logstash.logback.encoder.org.apache.commons.lang.math.NumberUtils

class TestController {

    def mathService

    def index() {
        log.error('This is a message')
        String response = "Hello user ! " + new Date();
        log.info "$response"

        try {

            String[] stringInput = [ "0.90", "256.345", "1200.00" ]
            // Integer a = Integer.parseInt(stringInput[0])
            log.info ""
            stringInput.each {
                log.info "${it} createDouble: ${NumberUtils.createDouble(it).toString()}"
                def number = NumberUtils.createNumber(it)
                log.info "${it} createNumber: ${number} class: ${number.class}"
                log.info "doubleValue[${number.doubleValue()}] floatValue[${number.floatValue()}] intValue[${number.intValue()}]"
                log.info ""
            }


//			log.info NumberUtils.createInteger(test).toString()

        } catch (Exception ex) {
            println ex.getMessage()
            log.error ExceptionUtils.getStackTrace(ex);
        }

        render 'This is AnotherController.index()'
    }

    def testException() {
        log.error('This is an exception')
        String response = "Hello user ! " + new Date();
        log.info "$response"
//		LOG.log(Level.INFO, "/elkdemo - &gt; " + response);

        render 'This is an exception'
    }

    def plus(def input1, def input2) {
//		LOG.info('This is plus operation')
//		LOG.info('Input1: ' + input1)
//		LOG.info('Input2: ' + input2)
//		LOG.info('Result: ' + input1 + input2)
        render 'success'
    }

    def process() {
//		LOG.error('Start process calculation from server')
        render 'success'
    }

    def testUrlEncode() {
        println "params.message: ${params.message}"
        render "params.message [${params.message}]"
    }
}
