//class Node<T> {
  //T val;
 // Node<T> next;
  
 // public Node(T val) {
  //  this.val = val;
 //   this.next = null;
 // }
//}

class ECSource {
  public static <T> T getNodeValue(Node<T> head, int index) {
    // todo - note the return type, but don't overthink it
    Node<T> temp = head;
    Node<T> temp1 = head;
    int lenght = 0;



    while(temp1 != null){
      lenght += 1;
      temp1 = temp1.next;
    }

    if(index > lenght){
      return null;
    }
    int p = 0;
// finding the value based on the index
    while(p < index){
      temp = head.next;
      p++;
    }
      assert temp != null;
      return temp.val;
  }
  
  public static void main(String[] args) {
    Node<String> node1 = new Node<>("banana");
    Node<String> node2 = new Node<>("mango");
    Node<String> node3 = new Node<>("kiwi");

    node1.next = node2;
    node2.next = node3;

    // banana -> mango -> kiwi

    System.out.println(ECSource.getNodeValue(node1, 1));
    System.out.println(ECSource.getNodeValue(node1, 20));
  }
}