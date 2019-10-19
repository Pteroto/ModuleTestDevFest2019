package br.com.gustavomonteiro.corecontracts.featurebar.domain

interface FeatureBarUseCase {
    interface GetParsedInfo {
        operator fun invoke(): String
    }
}