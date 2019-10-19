package br.com.gustavomonteiro.featurebar.di

import br.com.gustavomonteiro.corecontracts.featurebar.data.FeatureBarRepository
import br.com.gustavomonteiro.corecontracts.featurebar.domain.FeatureBarUseCase

interface FeatureBarInjection {
    val barRepository: FeatureBarRepository
    val getParsedInfo: FeatureBarUseCase.GetParsedInfo
}