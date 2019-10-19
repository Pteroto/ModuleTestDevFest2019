package br.com.gustavomonteiro.featurebarapp

import android.os.Bundle
import android.util.Log
import br.com.gustavomonteiro.featurebar.di.FeatureBarInjection
import br.com.gustavomonteiro.featurebar.ui.FeatureBarActivity

class MainActivity : FeatureBarActivity() {
    override val featureBarInjection: FeatureBarInjection by lazy {
        AppFeatureBarInjection(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(this.packageName, featureBarInjection.getParsedInfo())
    }
}
