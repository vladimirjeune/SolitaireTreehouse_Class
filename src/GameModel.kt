/**
 * Created by vladimirjeune on 5/31/17.
 */
class GameModel {
    val deck = Deck()
    val wastePile : MutableList<Card> = mutableListOf()
    val foundationPiles : Array<FoundationPile> = arrayOf(
            FoundationPile(Card.clubs),
            FoundationPile(Card.diamonds),
            FoundationPile(Card.hearts),
            FoundationPile(Card.spades)
    )

}
