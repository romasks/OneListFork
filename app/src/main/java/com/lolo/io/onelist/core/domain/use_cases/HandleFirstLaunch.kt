package com.lolo.io.onelist.core.domain.use_cases

import com.lolo.io.onelist.core.data.reporitory.OneListRepository
import com.lolo.io.onelist.core.data.shared_preferences.SharedPreferencesHelper
import com.lolo.io.onelist.core.model.ItemList
import kotlinx.coroutines.delay
import javax.inject.Inject

class HandleFirstLaunch @Inject constructor(
    private val repository: OneListRepository,
    private val preferencesHelper: SharedPreferencesHelper
) {
    suspend operator fun invoke(lists: List<ItemList>): Boolean {
        delay(200)

        val firstLaunch = preferencesHelper.firstLaunch
        if (firstLaunch) {
            lists.forEach {
                repository.createList(it)
            }
            preferencesHelper.firstLaunch = false
        }
        return firstLaunch
    }
}