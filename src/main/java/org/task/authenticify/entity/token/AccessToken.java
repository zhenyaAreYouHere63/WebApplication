package org.task.authenticify.entity.token;


import io.jsonwebtoken.Header;

public record AccessToken(
        Header header,
        AccessTokenClaims tokenClaims
) {
}
