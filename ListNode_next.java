public class ListNode_next{
    public static void main(String[] args) {
        //[3] --> [7] --> [19] --> [15]
        ListNode  a = new ListNode();
        a.data = 3; // [3]

        a.next = new ListNode(); // [null];
        a.next.data = 7;  // [7]

        a.next.next = new ListNode(); // [null]
        a.next.next.data = 0           // [19]
        
        a.next.next.next = new ListNode();//[null]
        a.next.next.next.data = 15; // [15]

        //ListNode current = a.next; // [7 , 19, 15] 
        //current = null; 
        //current = current.next; in the box of current has a value is 19
        //System.out.println(current.data);

        ListNode  b = new ListNode();
        b.data = 37;
        b.next = new ListNode(); //[null]
        b.next = a;

        System.out.println(b.next.next.data);
    }
}

class ListNode{
    public int data = 3 ;
    public ListNode next;
} 


/*class ListNode{
    public int date = ;
}*/