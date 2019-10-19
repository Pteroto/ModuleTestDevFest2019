package br.com.gustavomonteiro.featurebarapp.mock

import br.com.gustavomonteiro.corecontracts.featurefoo.domain.FeatureFooUseCase
import br.com.gustavomonteiro.corecontracts.featurefoo.domain.model.SubscriptionInfo

class MockLoadSubscriptionInfo : FeatureFooUseCase.LoadSubscriptionInfo {
    override fun invoke(): SubscriptionInfo =
        SubscriptionInfo(12344, "superVip")
}