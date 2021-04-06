package everis.com.login.login.states

import everis.com.login.login.model.KeyboardItem

sealed class LoginStates {
    data class GetSessionResult(val keyboard: ArrayList<KeyboardItem>): LoginStates()
    data class GetSessionError(val exception: Exception): LoginStates()

    data class AuthenticateResult(val result: Boolean): LoginStates()
    data class AuthenticateError(val exception: Exception): LoginStates()
}