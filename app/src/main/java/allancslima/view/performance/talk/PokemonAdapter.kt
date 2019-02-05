package allancslima.view.performance.talk

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class PokemonAdapter(private val pokemons: List<Pokemon>) : RecyclerView.Adapter<PokemonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.bad_item_pokemon, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(pokemons[position])
    }

    override fun getItemCount(): Int = pokemons.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var picture: ImageView? = null
        private var name: TextView? = null
        private var type: TextView? = null
        private var attack: TextView? = null
        private var defense: TextView? = null

        init {
            picture = itemView.findViewById(R.id.picture)
            name = itemView.findViewById(R.id.name)
            type = itemView.findViewById(R.id.type)
            attack = itemView.findViewById(R.id.attack)
            defense = itemView.findViewById(R.id.defense)
        }

        fun bind(pokemon: Pokemon) {
            val context = itemView.context
            if (pokemon.pictureRes != 0) {
                picture?.setImageResource(pokemon.pictureRes)
            }
            name?.text = pokemon.name
            type?.text = context.getString(R.string.type, pokemon.type)
            attack?.text = context.getString(R.string.attack, pokemon.attack)
            defense?.text = context.getString(R.string.defense, pokemon.defense)
        }

    }

}
