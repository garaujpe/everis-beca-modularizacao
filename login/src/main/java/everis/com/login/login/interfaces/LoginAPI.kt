package everis.com.login.login.interfaces

import everis.com.login.login.constants.APIConstants.AUTHENTICATE
import everis.com.login.login.constants.APIConstants.GET_SESSION
import everis.com.login.login.model.GETSessionResponse
import everis.com.login.login.model.GETSessionRequest
import everis.com.login.login.model.AuthenticateResponse
import everis.com.login.login.model.AuthenticateRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginAPI {
    @POST(GET_SESSION)
    suspend fun getSession(
        @Body request: GETSessionRequest
    ): GETSessionResponse

    @POST(AUTHENTICATE)
    suspend fun authenticate(
        @Body request: AuthenticateRequest
    ): AuthenticateResponse
}