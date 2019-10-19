package br.com.gustavomonteiro.featurefoo.di

import br.com.gustavomonteiro.corecontracts.featurefoo.data.FeatureFooRepository
import br.com.gustavomonteiro.corecontracts.featurefoo.domain.FeatureFooUseCase

interface FeatureFooInjection {
    val fooRepository: FeatureFooRepository
    val loadSubscriptionInfo: FeatureFooUseCase.LoadSubscriptionInfo
    val hasSubscription: FeatureFooUseCase.HasSubscription
}