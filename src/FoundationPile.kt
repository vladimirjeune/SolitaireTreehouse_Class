/**
 * Created by vladimirjeune on 5/31/17.
 * Foundation is a pile of cards of a single suit that starts out empty
 * and then accumulates cards in order from lowest(Ace) to highest(King).
 * Cards may be added or removed.
 */
class FoundationPile( val suit: String ) {  // CTOR
    val cards: MutableList<Card> = mutableListOf()

    fun reset() {
        cards.clear()
    }

    fun removeCard(card: Card) {
        cards.remove(card)
    }

    fun addCard(card: Card) : Boolean {
        var nextValue = 0

        if (cards.size > 0) {
            nextValue = cards.last().value + 1
        }
        if (card.suit == suit && card.value == nextValue) {
            cards.add(card)
            return true
        }
        return false

    }
}