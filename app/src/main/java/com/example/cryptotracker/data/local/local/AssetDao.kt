package com.example.cryptotracker.data.local.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.cryptotracker.data.local.local.AssetEntity

@Dao
interface AssetDao {
    @Insert
    suspend fun insertAssets(assets: List<AssetEntity>)

    @Query("SELECT * FROM assets")
    suspend fun getAllAssets(): List<AssetEntity>

    @Query("SELECT * FROM assets WHERE id = :id")
    suspend fun getAssetById(id: String): AssetEntity
}
