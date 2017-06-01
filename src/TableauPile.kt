/**
 * Created by vladimirjeune on 6/1/17.
 */
class TableauPile(var cards: MutableList<Card>) {

    init {
        cards.last().faceUp = true  // The last card in deck is to be face up
    }

    fun addCard(newCards: MutableList<Card>) :Boolean {
        if ((newCards.first().value == cards.last().value - 1)
        && (suitCheck(newCards.first(), cards.last())) ) {

        }
    }

    /**
     * Will check to see if params are different suit colors
     *
     */
    private fun  suitCheck(c1: Card, c2: Card): Boolean {

    }
}