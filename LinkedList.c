#include<stdio.h>

//Creating a node of integer
struct ListNode{
    int data;
    struct ListNode *next;
}

void print(struct ListNode *head){
    struct ListNode *curr = head;
    for(curr=head; curr!=NULL; curr=curr->next){
        printf("%d", curr->data);
    }

}


void createNode(struct Node *temp, int data){
    
    struct Node* head = NULL;

    if(head == NULL){
        head=temp;
        temp->data=data;
    }

}


int main(){

    struct ListNode *temp;
    temp=(struct ListNode *)malloc(sizeof(struct ListNode));
    temp->data=0;
    temp->next=NULL;

    createNode(temp, 5);
    print(temp);
    // createNode(head, 7);


}