package Queue

class QueueImpl<T : Any> : Queue<T> {
    private val queue = arrayListOf<T>()

    override val count: Int
        get() = queue.size

    override fun dequeue(): T? {
        return if(queue.isEmpty()) null else queue.removeFirstOrNull()
    }

    override fun peek(): T? {
        return queue.firstOrNull()
    }

    override fun enqueue(element: T): Boolean {
        return queue.add(element)
    }
}