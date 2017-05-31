/**
 * Created by vladimirjeune on 5/30/17.
 */

val fn = fun (i : Int) : Card {  // Anonymous functs can be passed, but not regular.  rm name and assign.
    val value = i % 13
    val suit = when(i / 13) {  // This will result in an Int
        0 -> "Clubs"
        1 -> "Diamonds"
        2 -> "Hearts"
        else -> "Spades"
    }

    return Card(value, suit)
}

val cards: Array<Card> = Array(52, fn)  // Anonymous functions can be put here, or lambdas