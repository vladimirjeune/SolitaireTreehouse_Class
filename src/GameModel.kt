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
        deck.reset()

        tableauPiles.forEachIndexed { i, tableauPile ->
            val cardsInPile: MutableList<Card> = Array(i + 1, {deck.drawCards()}).toMutableList()
            tableauPiles[i] = TableauPile(cardsInPile)
        }
    }

    fun onDeckTap() {
        if (deck.cardsInDeck.size > 0) {
            val card = deck.drawCards()
            card.faceUp = true
            wastePile.add(card)
        } else {
            deck.cardsInDeck = wastePile.toMutableList()  // This call creates a copy of the wastepile instead of orig
            wastePile.clear()
        }
    }

}


