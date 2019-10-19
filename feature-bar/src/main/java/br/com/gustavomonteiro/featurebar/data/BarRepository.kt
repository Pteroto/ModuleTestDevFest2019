package br.com.gustavomonteiro.featurebar.data

import android.app.Activity
import br.com.gustavomonteiro.corecontracts.featurebar.data.FeatureBarRepository

class BarRepository(private val activity: Activity) : FeatureBarRepository {
    override suspend fun getSomeInfo(): Int {
        return 0
    }

    override suspend fun getSomeAnotherInfo(): Boolean {
        return true
    }
}