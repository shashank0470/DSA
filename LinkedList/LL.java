package LinkedList;

 class Node<T> {
    T data;
    Node next;

    //default constructor
    Node() {
        this.next = null;
    }

    //parameterised constructor
    Node(T data) {
        this.data = data;
        this.next = null;
    }
}


public class LL {

    public static void main(String[] args){
        LL l = new LL();
        l.insernodeAtTail(22);
        l.inserAtHead(45);
        l.inserAtHead(40);
        l.insernode(23, 4);
        l.insernode(33, 5);
        l.insernode(12, 2);
        l.insernodeAtTail(99);
        l.printList();
        l.deleteHead();
        l.printList();
        l.deleteNode(2);
        l.printList();
        l.deleteTail();
        l.printList();
        l.updateNode(4,100);
        l.printList();

    }

    Node<Integer> head;
    //we are taking the size to know the size of the linkedlist
    int size;
    LL(){
        this.head = null;
        this.size =0 ;
    }

    public void printList(){
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.println("data is -> " + temp.data);
            temp = temp.next;
        }
    }

    public void insernode(int data,int position){
        /// we are using 1 based insdexing here thats why we have taken <=0 and taking 0 as a wrong value
            if(position>size+1 || position<0){
                System.out.println("Wrong value input");
            }
            if(position == 1){
                inserAtHead(data);
            }else if( position == size + 1){
                insernodeAtTail(data);
            }
            else{
                int counter = 1;
                Node<Integer> newNode = new Node<>(data);
                Node<Integer> temp = head;
                //we are running the loop till the 1 piche wali value then the position where we have to insert the value.
                while(counter<position -1 && temp!=null){
                    counter++;
                    temp = temp.next;
                };
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
            }
        System.out.println("Insertion successful at position ");
    }

    public void insernodeAtTail(int data){
            Node<Integer> newNode = new Node(data);
            if(head == null){
                head = newNode;
                size++;
                return;
            }
            Node<Integer> temp = head;
            while(temp.next!= null){
                temp = temp.next;
            }
            temp.next = newNode;
        System.out.println("Insertion at tail(end) is done");
        size++;
    }

    public void inserAtHead(int data){
        Node<Integer> newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        System.out.println("Insertion at head is done");
        size++;
    }

    public void deleteHead(){
        if(head == null){
            System.out.println("Head is successfully deleted");
            return;
        }
        Node<Integer> temp = head;
        head = head.next;
        temp.next = null;
        System.out.println("Head is successfully deleted");
        size--;
    }

    public void deleteTail(){
        if(head == null){
            System.out.println("The linked list is already empty, noting to delete");
            return;
        }
        //here we have to consider a condition where there is a single node present, so that node is the last and the first node so:
        if(head.next == null){
            head = null;
        }

        Node<Integer> temp = head;
        Node<Integer> previous = null;
        while(temp.next!= null){
            previous = temp;
            temp = temp.next;
        }

        previous.next = null;
        System.out.println("Deletion of tail(end) is done");
        size--;
    }

    public void deleteNode(int position){
        /// we are using 1 based insdexing here thats why we have taken <=0 and taking 0 as a wrong value
        if(position>=size || position<0){
            System.out.println("Wrong value input");
        }
        if(position == 1){
            deleteHead();
        }else if( position == size){
            deleteTail();
        }
        else{
            int counter = 1;
            Node<Integer> previous = null;
            Node<Integer> temp = head;
            //we are running the loop till the 1 piche wali value then the position where we have to insert the value.
            while(counter<position && temp!=null){
                counter++;
                previous = temp;
                temp = temp.next;
            };
            previous.next = temp.next;
            temp.next = null;
            size--;
        System.out.println("Deletion successful at position: " +position );
        }
    }

    public void updateNode(int position, int updatedValue){
        if(head == null){
            System.out.println("Linked list is empty");
        }
        Node<Integer> temp = head;
        int counter = 1;
        while(counter<position && temp!= null){
            counter++;
            temp = temp.next;
        }
        if(temp!=null && counter == position){
            temp.data = updatedValue;
        }else {
            System.out.println("linkedlist is smaller than position: " + position);
            return;
        }
        System.out.println("Updated at position: "+ position + " successfully");
    }

    public boolean searchNode(int updatedValue){
        if(head == null){
            System.out.println("Linked list is empty");
        }
        Node<Integer> temp = head;
        int counter = 1;
        while(temp!= null){
            if(temp.data == updatedValue){
                System.out.println("Updated at position: "+ counter + " successfully");
                return true;
            }
            counter++;
            temp = temp.next;
        }
        System.out.println("Serached value is not found  in the linked list");
        return false;


    }



}
