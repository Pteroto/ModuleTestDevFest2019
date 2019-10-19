package br.com.gustavomonteiro.featurebar.domain

import br.com.gustavomonteiro.corecontracts.featurebar.domain.FeatureBarUseCase
import br.com.gustavomonteiro.corecontracts.featurefoo.domain.model.SubscriptionInfo

class GetParsedInfoUseCase(private val subscriptionInfo: SubscriptionInfo?) : FeatureBarUseCase.GetParsedInfo {
    override fun invoke(): String {
        return subscriptionInfo?.subscriptionName ?: ""
    }
}