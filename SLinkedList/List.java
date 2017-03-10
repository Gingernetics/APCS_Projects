interface List{
    int size();
    boolean add(String obj); 
    //void add(int index, String obj);
    String get(int index);
    String set(int index, String obj);
    String remove(int index);
    SLinkedList append(SLinkedList L);
    Node getNode(int index);
    void swap(Node x, Node y);
}
