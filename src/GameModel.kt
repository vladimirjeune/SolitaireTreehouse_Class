/**
 * Created by vladimirjeune on 5/31/17.
 */
class GameModel {
    val deck = Deck()
    val wastePile: MutableList<Card> = mutableListOf()
    val foundationPiles: Array<FoundationPile> = arrayOf(
            FoundationPile(clubs),
            FoundationPile(diamonds),
            FoundationPile(hearts),
            FoundationPile(spades)
    )
    val tableauPiles = Array(7, { TableauPile() })

    fun resetGames() {
        wastePile.clear()

        // Also acceptable: foundationPiles.forEach( { it.reset() } )  // same meaning; shows lamnda just a param
        foundationPiles.forEach { it.reset() }

    }
}
    fun String.isLongerThan5(): Boolean {
        return this.length > 5
    }


