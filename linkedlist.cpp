#include <iostream>

using namespace std;

class node
{
public:
    int val;
    node *next;

    node(int v)
    {
        this->val = v;
        this->next = NULL;
    }
};

class list
{
public:
    node *head;
    list()
    {
        this->head = NULL;
    }

    void add(int v)
    {
        node *newnode = new node(v);
        if (this->head == NULL)
        {
            this->head = newnode;
            return;
        }
        node *temp = head;

        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = newnode;
    }
    void display()
    {
  
        node *temp1=head;
        while(temp1!=NULL)
        {
            cout<<temp1->val<<endl;
            temp1=temp1->next;
        }
    }
};

int main()
{
    list l;
    l.add(1);
    l.add(2);
    l.add(3);
    l.display();


    return 0;
}