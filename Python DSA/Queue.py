class Node:
    def __init__(self, val):
        self.val = val
        self.next = None

class Queue:
    def __init__(self):
        self.head = None
        self.tail = None

    def enqueue(self, val):
        new_node = Node(val)
        if not self.tail:  # empty queue
            self.head = self.tail = new_node
            return
        self.tail.next = new_node
        self.tail = new_node

    def dequeue(self):
        if not self.head:  # empty
            return None
        val = self.head.val
        self.head = self.head.next
        if not self.head:  # queue became empty
            self.tail = None
        return val

    def is_empty(self):
        return self.head is None
