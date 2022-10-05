package net.fathonix.mvvmrepository.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import net.fathonix.mvvmrepository.data.repositories.ShoppingRepository

class ShoppingViewModelFactory(private val repository: ShoppingRepository) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ShoppingViewModel(repository) as T
    }
}