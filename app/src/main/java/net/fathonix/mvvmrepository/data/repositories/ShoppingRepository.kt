package net.fathonix.mvvmrepository.data.repositories

import net.fathonix.mvvmrepository.data.db.entities.ShoppingItem
import net.fathonix.mvvmrepository.data.db.ShoppingDatabase

class ShoppingRepository(private val db: ShoppingDatabase) {

    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()

}