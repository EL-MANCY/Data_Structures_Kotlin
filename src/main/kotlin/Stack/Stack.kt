package Stack

interface Stack <T:Any> {
    fun pop():T?

    fun push(element:T)

    fun peak():T?

    val count : Int

    val isEmpty:Boolean
        get() = count == 0
}