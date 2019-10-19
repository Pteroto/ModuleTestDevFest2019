package br.com.gustavomonteiro.corecontracts.featurefoo.data

import br.com.gustavomonteiro.corecontracts.featurefoo.domain.model.Subscription

interface FeatureFooRepository {
    suspend fun getSubscriptionInfo(): Subscription?
}