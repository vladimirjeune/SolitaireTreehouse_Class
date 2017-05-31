/**
 * Created by vladimirjeune on 5/30/17.
 */

// You can define either whole function here, or anon fn, or lambda in Array ctor
val cards: Array<Card> = Array(52,
        fun (i : Int) : Card {
            return Card(i % 13, getSuit(i))
        }
)

fun getSuit(i: Int): String = when(i / 13) {  // Function was just one expr so just used '='
        0 -> "Clubs"
        1 -> "Diamonds"
        2 -> "Hearts"
        else -> "Spades"
    }
