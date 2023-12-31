package com.dicoding.carebymom.UI_for_apps.health

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.dicoding.carebymom.data.model.UserModel
import com.dicoding.carebymom.data.response.PredictResponse
import com.dicoding.carebymom.repo.UserRepository

class HealthViewModel(private var repository: UserRepository) : ViewModel() {
    suspend fun checkup(
        age: Double,
        pregnancyDuration: Double,
        weight: Double,
        height: Double,
        bmi: Double,
        armCircum: Double,
        fundusHeight: Double,
        heartRate: Double,
    ): PredictResponse {
        return repository.checkup(age, pregnancyDuration, weight, height, bmi, armCircum, fundusHeight, heartRate)
    }

    fun getSession(): LiveData<UserModel> {
        return repository.getSession().asLiveData()
    }
}