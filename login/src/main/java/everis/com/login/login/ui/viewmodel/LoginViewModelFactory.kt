package everis.com.login.login.ui.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import everis.com.login.login.repository.LoginRepository
import java.lang.IllegalArgumentException

class LoginViewModelFactory(
    private val context: Context,
    private val repository: LoginRepository,
    private val checkInternetConnection: Boolean = true
): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T =
        with(modelClass) {
            when {
                isAssignableFrom(LoginViewModel::class.java) ->
                    LoginViewModel(context, repository, checkInternetConnection)

                else ->
                    throw IllegalArgumentException("Unkown ViewModel class: ${modelClass.name}")
            }
        } as T
}