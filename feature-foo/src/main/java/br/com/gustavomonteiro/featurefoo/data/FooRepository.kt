package br.com.gustavomonteiro.featurefoo.data

import android.app.Activity
import br.com.gustavomonteiro.corecontracts.featurefoo.data.FeatureFooRepository
import br.com.gustavomonteiro.corecontracts.featurefoo.domain.model.Subscription

class FooRepository(private val activity: Activity) : FeatureFooRepository {
    override suspend fun getSubscriptionInfo(): Subscription? {
        return Subscription(312313, "RealImplementedSubscription", 3213, false)
    }
}