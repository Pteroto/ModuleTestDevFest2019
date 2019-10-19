package br.com.gustavomonteiro.moduletestdevfest.featurebar

import br.com.gustavomonteiro.featurebar.di.FeatureBarInjection
import br.com.gustavomonteiro.featurebar.ui.FeatureBarActivity

class AppFeatureBarActivity: FeatureBarActivity() {

    override val featureBarInjection: FeatureBarInjection
        get() = AppFeatureBarInjection(this)
}