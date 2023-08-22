package Stack

class StackImpl<T : Any> : Stack<T> {

    private var stack = arrayListOf<T>()

    override fun pop(): T? {
        return stack.removeLastOrNull()
    }

    override fun peak(): T? {
//      return stack.elementAt(stack.size-1)
        return stack.lastOrNull()
    }

    override fun push(element: T) {
        stack.add(element)
    }

    override val count: Int
        get() = stack.size

}

fun String.validParantheses(): Boolean {
    val stack = StackImpl<Char>()

    for (char in this) {
        when (char) {
            '(' ->
                stack.push(char)

            ')' -> {
                if (stack.isEmpty) {
                    return false
                } else {
                    stack.pop()
                }
            }
        }
    }
    return stack.isEmpty
}
