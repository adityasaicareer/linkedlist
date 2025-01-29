class node:
    def __init__(self,val):
        self.val=val
        self.next=None

class linked:
    def __init__(self):
        self.head=None
        self.tail=None
    
    def add(self,val):
        if(self.head==None):
            self.head=node(val)
            self.tail=self.head
        else:
            self.tail.next=node(val)
            self.tail=self.tail.next
    def display(self):

        temp=self.head
        while(temp!=None):
            print(temp.val)
            temp=temp.next

l=linked()
l.add(1)
l.add(2)
l.add(3)
l.display()



