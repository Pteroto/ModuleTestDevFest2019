package br.com.gustavomonteiro.featurebarapp

import android.app.Activity
import br.com.gustavomonteiro.featurebar.data.BarRepository
import br.com.gustavomonteiro.featurebar.di.FeatureBarInjection
import br.com.gustavomonteiro.featurebar.domain.GetParsedInfoUseCase
import br.com.gustavomonteiro.featurebarapp.mock.MockLoadSubscriptionInfo
import br.com.gustavomonteiro.corecontracts.featurebar.data.FeatureBarRepository
import br.com.gustavomonteiro.corecontracts.featurebar.domain.FeatureBarUseCase

class AppFeatureBarInjection(private val activity: Activity) : FeatureBarInjection {
    override val barRepository: FeatureBarRepository by lazy {
        BarRepository(activity)
    }
    override val getParsedInfo: FeatureBarUseCase.GetParsedInfo by lazy {
        GetParsedInfoUseCase(MockLoadSubscriptionInfo().invoke())
    }

}