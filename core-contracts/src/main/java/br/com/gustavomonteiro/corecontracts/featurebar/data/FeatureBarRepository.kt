package br.com.gustavomonteiro.corecontracts.featurebar.data

interface FeatureBarRepository {
    suspend fun getSomeInfo(): Int
    suspend fun getSomeAnotherInfo(): Boolean
}