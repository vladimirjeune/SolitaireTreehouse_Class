/**
 * Created by vladimirjeune on 6/4/17.
 */
interface GameView {
    // Any class impl interface is notified when mdl updates.  Can use mdl param to update UI
    fun update(model: GameModel)
}