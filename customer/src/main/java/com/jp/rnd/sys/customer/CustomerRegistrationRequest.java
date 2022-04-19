package com.jp.rnd.sys.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
