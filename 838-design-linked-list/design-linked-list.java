class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
    }
    public Node(int val,Node next){
       this.val = val;
        this.next = next;
    }
}

class MyLinkedList {
    Node head ;
    Node tail ;
    int size =0;

    public MyLinkedList() {
        head = null;
        tail = null;
    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp.val;
        
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
        size++;
        
    }
    
    public void addAtTail(int val) {
        Node node = new Node(val);
        if(tail == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
           
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index <0 || index>size) return;
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == size){
            addAtTail(val);
            return;
        }
        Node node = new Node(val);
        Node curr = head;
        Node prev = null;
        for(int i=0;i<index;i++){
            prev = curr;
            curr = curr.next;
        }
        
        node.next = curr;
        prev.next = node;
        size++;

    }
    
     public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            Node prev = null;
            Node curr = head;
            for (int i = 0; i < index; i++) {
                prev = curr;
                curr = curr.next;
            }
            prev.next = curr.next;
            if (curr == tail) {
                tail = prev;
            }
        }
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */