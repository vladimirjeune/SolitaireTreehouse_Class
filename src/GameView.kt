/**
 * Created by vladimirjeune on 6/4/17.
 */
interface GameView {
    // Any class impl interface is notified when mdl updates.  Can use mdl param to update UI
    fun update(model: GameModel = GameModel)  // Setting a default value so no need to keep passing in
}