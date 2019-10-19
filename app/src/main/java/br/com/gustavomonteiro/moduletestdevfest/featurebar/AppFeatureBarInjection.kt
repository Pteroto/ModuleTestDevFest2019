package br.com.gustavomonteiro.moduletestdevfest.featurebar

import android.app.Activity
import br.com.gustavomonteiro.featurebar.data.BarRepository
import br.com.gustavomonteiro.featurebar.di.FeatureBarInjection
import br.com.gustavomonteiro.featurebar.domain.GetParsedInfoUseCase
import br.com.gustavomonteiro.corecontracts.featurebar.data.FeatureBarRepository
import br.com.gustavomonteiro.corecontracts.featurebar.domain.FeatureBarUseCase
import br.com.gustavomonteiro.corecontracts.featurefoo.domain.model.SubscriptionInfo

class AppFeatureBarInjection(private val activity: Activity) :
    FeatureBarInjection {
    override val barRepository: FeatureBarRepository
        get() = BarRepository(activity)

    override val getParsedInfo: FeatureBarUseCase.GetParsedInfo
        //received from another source
        get() = GetParsedInfoUseCase(SubscriptionInfo(321321, "testSub"))
}