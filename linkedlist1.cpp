#include <iostream>
using namespace std;
class node
{
    public:
        int val;
        node *next;
        node(int v)
        {
            this->val=v;
            this->next=NULL;
        }
}; 
class list
{
    public:
    node *head;
    list()
    {
        this->head=NULL;
    }

    void add(int v)
    {
        node *newnode=new node(v);
        if(head==NULL)
        {
            this->head=newnode;
            return;
        }
        node *temp=this->head;
        while(temp->next!=NULL)
        {
            cout<<temp->val<<" ";
            temp=temp->next;

        }
        temp->next=newnode;



    }

    void display()
    {
        node *temp=this->head;
        while(temp!=NULL)
        {
            cout<<temp->val<<" ";
            temp=temp->next;
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
}