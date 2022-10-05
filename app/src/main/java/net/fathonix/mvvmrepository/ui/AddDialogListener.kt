package net.fathonix.mvvmrepository.ui

import net.fathonix.mvvmrepository.data.db.entities.ShoppingItem

interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}