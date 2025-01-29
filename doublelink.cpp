#include <iostream>

using namespace std;
class node{
    public:
    int val;
    node *next;
    node *prev;
    node(int v)
    {
        this->val=v;
        this->next=NULL;
        this->prev=NULL;
    }
};

class dlist
{
    public:
    node *head;
    node *tail;
    dlist()
    {
        this->head=NULL;
        this->tail=NULL;
    }

    void add(int v)
    {
        node *newnode=new node(v);
        if(this->head==NULL)
        {
            this->head=newnode;
            this->tail=this->head;
        }
        else{
            this->tail->next=newnode;
            newnode->prev=tail;
            tail=tail->next;
        }
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

    void rdisplay()
    {
        // reverse display()
        node *temp=this->tail;
        while(temp!=NULL)
        {
            cout<<temp->val<<" ";
            temp=temp->prev;
        }
    }
};
int main()
{
    dlist dl;
    dl.add(1);
    dl.add(2);
    dl.add(3);
    dl.add(4);
    dl.display();
    cout<<endl;
    dl.rdisplay();
    cout<<endl;
}