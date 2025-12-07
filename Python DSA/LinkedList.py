class Node:
    def __init__(self, val):
        self.val = val
        self.next = None

class LinkedList :
    def __init__(self):
        self.head = None

    def insert_head(self, val):
        new_node = Node(val)
        new_node.next = self.head
        self.head = new_node

    def insert_tail(self, val):
        new_node = Node(val)
        
        if self.head is None:
            self.head = new_node
            return
        
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = new_node

    def search(self, val):
        curr = self.head
        while curr:
            if curr.val == val:
                return True
            curr = curr.next
        return False
    
    def delete_value(self, val):
        if self.head is None:
            return
        
        if self.head.val == val:
            self.head = self.head.next
            return
        
        curr = self.head
        while curr:
            if curr.next.val == val:
                curr.next = curr.next.next
                return 
            curr = curr.next

    def print_list(self):
        curr = self.head
        elements = []
        while curr:
            elements.append(str(curr.val))
            curr = curr.next
        print(" -> ".join(elements))
