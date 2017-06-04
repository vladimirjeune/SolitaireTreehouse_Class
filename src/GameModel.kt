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

    fun onWasteTap() {
        if (wastePile.size > 0) {
            val card = wastePile.last()
            if (playCard(card)) {  // If this card is playable we will play it
                wastePile.remove(card)
            }
        }
    }

    fun onFoundationTap(foundationIndex: Int) {
        val foundationPile = foundationPiles[foundationIndex]
        if (foundationPile.cards.size > 0) {
            val card = foundationPile.cards.last()
            if (playCard(card)) {  // If this card is playable we will play it
                foundationPile.removeCard(card)
            }
        }
    }

    private fun  playCard(card: Card): Boolean {
        foundationPiles.forEach {
            if ( it.addCard(card)) {  // If we can do this we have found a match
                return true
            }
        }
        tableauPiles.forEach {
            if (it.addCards(mutableListOf(card))) {  // TableauPiles takes mutableList
                return true
            }
        }
        return false
    }


}


