package br.com.gustavomonteiro.featurefoo.domain

import br.com.gustavomonteiro.corecontracts.featurefoo.data.FeatureFooRepository
import br.com.gustavomonteiro.corecontracts.featurefoo.domain.FeatureFooUseCase
import br.com.gustavomonteiro.corecontracts.featurefoo.domain.model.Subscription
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class HasSubscriptionUseCase(private val repository: FeatureFooRepository) : FeatureFooUseCase.HasSubscription {
    override fun invoke(): Boolean {
        var subscription: Subscription? = null

        GlobalScope.launch {
            subscription = repository.getSubscriptionInfo()
        }

        return subscription != null
    }
}