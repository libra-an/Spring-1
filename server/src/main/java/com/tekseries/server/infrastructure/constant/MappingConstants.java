package com.tekseries.server.infrastructure.constant;

import org.springframework.beans.factory.annotation.Value;

public final class MappingConstants {

    @Value("${ws.topicPrefix}")
    private String TOPIC_PREFIX;

    /* API BASE ROLE */
    public static final String ADMIN = "/admin";
    public static final String USER = "/user";

    /* API VERSION PREFIX */
    public static final String API_VERSION_PREFIX = "/api/v1";

//    /* AUTHENTICATION */
//    public static final String API_AUTH_PREFIX = API_VERSION_PREFIX + "/auth";

    /* API COMMON */
    public static final String API_COMMON = API_VERSION_PREFIX + "/common";

//    /* API FOR ROLE ADMIN */
//    public static final String API_ADMIN_PREFIX = API_VERSION_PREFIX + ADMIN;
//
//    public static final String API_ADMIN_SYNC = API_ADMIN_PREFIX + "/sync";
//
//    public static final String API_ADMIN_STUDENT = API_ADMIN_PREFIX + "/students";


    /* API FOR COMMON */
    public static final String API_COMMON_HOME = API_COMMON + "/home";


//    /* API FOR ROLE USER */
//    public static final String API_USER_PREFIX = API_VERSION_PREFIX + USER;
//
//    public static final String API_USER_STUDENT = API_USER_PREFIX + "/details";
}