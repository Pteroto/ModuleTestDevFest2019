package br.com.gustavomonteiro.moduletestdevfest.featurefoo

import android.app.Activity
import br.com.gustavomonteiro.featurefoo.data.FooRepository
import br.com.gustavomonteiro.featurefoo.di.FeatureFooInjection
import br.com.gustavomonteiro.featurefoo.domain.HasSubscriptionUseCase
import br.com.gustavomonteiro.featurefoo.domain.LoadSubscriptionInfoUseCase
import br.com.gustavomonteiro.corecontracts.featurefoo.data.FeatureFooRepository
import br.com.gustavomonteiro.corecontracts.featurefoo.domain.FeatureFooUseCase

class AppFeatureFooInjection(private val activity: Activity) : FeatureFooInjection {
    override val fooRepository: FeatureFooRepository
        get() = FooRepository(activity)
    override val loadSubscriptionInfo: FeatureFooUseCase.LoadSubscriptionInfo
        get() = LoadSubscriptionInfoUseCase(fooRepository)
    override val hasSubscription: FeatureFooUseCase.HasSubscription
        get() = HasSubscriptionUseCase(fooRepository)
}