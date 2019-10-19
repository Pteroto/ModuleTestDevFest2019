package br.com.gustavomonteiro.moduletestdevfest.featurefoo

import br.com.gustavomonteiro.featurefoo.di.FeatureFooInjection
import br.com.gustavomonteiro.featurefoo.ui.FeatureFooActivity

class AppFeatureFooActivity : FeatureFooActivity() {
    override val featureFooInjection: FeatureFooInjection
        get() = AppFeatureFooInjection(this)
}