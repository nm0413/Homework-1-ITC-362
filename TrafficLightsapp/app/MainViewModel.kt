import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val isStop = ObservableBoolean(true)
    val isGo = ObservableBoolean(false)
    val isWait = ObservableBoolean(false)
    val buttonText = ObservableField("STOP")

    fun onButtonClick() {
        when {
            isStop.get() -> {
                isStop.set(false)
                isGo.set(true)
                isWait.set(false)
                buttonText.set("GO")
            }
            isGo.get() -> {
                isStop.set(false)
                isGo.set(false)
                isWait.set(true)
                buttonText.set("WAIT")
            }
            else -> {
                isStop.set(true)
                isGo.set(false)
                isWait.set(false)
                buttonText.set("STOP")
            }
        }
    }
}