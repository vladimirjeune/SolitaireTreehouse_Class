/**
 * Created by vladimirjeune on 5/29/17.
 */

/**
 * These properties belong to the entire package.  Not the Card class.
 * They are placed here because that makes logical sense.  But they are
 * not related to Card in any way.  They can now be referenced by name
 * in any code in the package without prefacing them with any class name.
 */
val clubs = "Clubs"
val diamonds = "Diamonds"
val hearts = "Hearts"
val spades = "Spades"

class Card (val value: Int, val suit: String, var faceUp: Boolean = false) {

}