package br.com.gustavomonteiro.featurefoo.domain

import br.com.gustavomonteiro.corecontracts.featurefoo.data.FeatureFooRepository
import br.com.gustavomonteiro.corecontracts.featurefoo.domain.FeatureFooUseCase
import br.com.gustavomonteiro.corecontracts.featurefoo.domain.model.Subscription
import br.com.gustavomonteiro.corecontracts.featurefoo.domain.model.SubscriptionInfo
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class LoadSubscriptionInfoUseCase(private val repository: FeatureFooRepository) :
    FeatureFooUseCase.LoadSubscriptionInfo {
    override fun invoke(): SubscriptionInfo? {
        var subscription: Subscription? = null

        GlobalScope.launch {
            subscription = repository.getSubscriptionInfo()
        }

        subscription?.let {
            return SubscriptionInfo(it.subscriptionTime, it.subscriptionName)
        } ?: run {
            return null
        }
    }
}