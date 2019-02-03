package allancslima.view.performance.talk

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
    }

    private fun setupView() {
        pokemonList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        pokemonList.adapter = PokemonAdapter(getPokemons())
    }

    private fun getPokemons(): List<Pokemon> {
        return listOf(
            Pokemon(R.drawable.bulbasaur, "Bulbasaur", 49, 49, "Grass"),
            Pokemon(R.drawable.charmander, "Charmander", 52, 43, "Fire"),
            Pokemon(R.drawable.caterpie, "Caterpie", 30, 35, "Bug"),
            Pokemon(0, "Pidgey", 45, 40, "Normal"),
            Pokemon(R.drawable.squirtle, "Squirtle", 48, 65, "Water"),
            Pokemon(R.drawable.ponyta, "Ponyta", 85, 55, "Fire"),
            Pokemon(0, "Bellsprout", 75, 35, "Grass"),
            Pokemon(R.drawable.pikachu, "Pikachu", 55, 40, "Electric"),
            Pokemon(0, "Zubat", 45, 35, "Poison"),
            Pokemon(R.drawable.psyduck, "Psyduck", 52, 48, "Water")
        )
    }

}
