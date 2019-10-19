package br.com.gustavomonteiro.corecontracts.featurefoo.domain

import br.com.gustavomonteiro.corecontracts.featurefoo.domain.model.SubscriptionInfo

interface FeatureFooUseCase {
    interface HasSubscription {
        operator fun invoke(): Boolean
    }

    interface LoadSubscriptionInfo {
        operator fun invoke(): SubscriptionInfo?
    }
}