package `in`.zeromod.ksonbin

object Ksonbin {
    var root: String = "https://api.jsonbin.io/"
    lateinit var key: String
        private set

    fun init(secretKey: String) {
        key = secretKey
    }
}