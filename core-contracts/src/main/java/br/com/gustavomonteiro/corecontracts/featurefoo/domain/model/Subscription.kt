package br.com.gustavomonteiro.corecontracts.featurefoo.domain.model

data class Subscription(
    val subscriptionTime: Long,
    val subscriptionName: String,
    val userId: Int,
    val isTrial: Boolean
)