package allancslima.view.performance.talk

import android.support.annotation.DrawableRes

data class Pokemon(
    @DrawableRes var pictureRes: Int,
    var name: String,
    var attack: Int,
    var defense: Int,
    var type: String
)
