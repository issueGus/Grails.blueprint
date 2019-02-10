package com.issue.interceptor

import grails.converters.JSON


class RequestInterceptor {

    private Long startedTime = null
    private Long finishedTime = null

    private static final String HEADER_PRAGMA = "Pragma";
    private static final String HEADER_EXPIRES = "Expires";
    private static final String HEADER_CACHE_CONTROL = "Cache-Control";

    RequestInterceptor() {
        /** match(uri: "/api/customer/**")
                .excludes(uri: "/api/customer/login_with_facebook_id")
                .excludes(uri: "/api/customer/login")
                .excludes(uri: "/api/customer/send_otp")
                .excludes(uri: "/api/customer/verify_otp")
                .excludes(uri: "/api/dropdown/**")
                .excludes(uri: "/api/contact_support/**")
                .excludes(uri: "/api/postal/**") **/
        matchAll()
    }

    boolean before() {
        startedTime = System.currentTimeMillis()
        log.info "Receive: ${request.getMethod()} ${request.forwardURI} With params: $params ,request.JSON:${request.JSON}"
        if (request.JSON) {
            log.debug "Populating parsed json to params"
            params << request.JSON
        }

        /**
        if ( params.accessToken == null || params.encryptedCustomerId == null ) {
            log.error "accessToken: ${params.accessToken}, encryptedCustomerId: ${params.encryptedCustomerId}"
            return false
        }

        ClientAuthenCommand command = new ClientAuthenCommand()
        command.accessToken = params.accessToken
        command.encryptedCustomerId = params.encryptedCustomerId
        def result = clientAuthService.validateToken(command)
        if ( result.status ) {
            response.setHeader(HEADER_PRAGMA, "no-cache");
            response.setDateHeader(HEADER_EXPIRES, 1L);
            response.setHeader(HEADER_CACHE_CONTROL, "no-cache");
            response.addHeader(HEADER_CACHE_CONTROL, "no-store");
            return true
        } else {
            return false
        }
         **/
        return true
    }

    boolean after() {
        if (flash.message) {
            String flashString = flash as JSON
            response.getWriter().print(flashString)
            response.flushBuffer()
        }
        finishedTime = System.currentTimeMillis()
        return true
    }

    void afterView() {
        log.info "Response: ${response.getStatus()}, Execution Time: ${finishedTime - startedTime} Milliseconds"
    }
}
