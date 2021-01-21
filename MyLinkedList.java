package bag;
public class MyLinkedList<AnyType> 
{
    private Node<AnyType> head;
    private Node<AnyType> tail;
    private int theSize;
    
    public MyLinkedList()//Her yeni açılan instance bize yeni boş bir liste veriyor.
    {
        clear();
    }
    
    public AnyType get(int idx)//n. indexteki elemanın valuesunu veriyor.
    {
        if(idx < 0 || idx >= theSize)
            throw new IndexOutOfBoundsException("Index " + idx + "; size " + theSize);
        
        return getNode(idx).data;
    }
        
    public AnyType set(int idx, AnyType newVal)//n. indexteki elemanı update ediyor.(eleman var ise yoksa null pointer exception hatası verir.)
    {
        if(idx < 0 || idx >= theSize)
            throw new IndexOutOfBoundsException("Index " + idx + "; size " + theSize);
        
        Node<AnyType> p = getNode(idx);
        AnyType oldVal = p.data;     
        p.data = newVal;   
        return oldVal;
    }
    
    public boolean add(AnyType x)//listedeki ilk boş yere yeni gelen elemanı ekliyor.
    {
        add(theSize, x);   
        return true;         
    }
    
    public void add(int idx, AnyType x)//add fonksiyonu tafarından çağırılıyor.Yukarıdaki...
    {
        if(idx < 0 || idx > theSize)
            throw new IndexOutOfBoundsException("Index " + idx + "; size " + theSize);
        
        Node<AnyType> p = getNode(idx);
        Node<AnyType> newNode = new Node<>( p.prev, x, p );
        newNode.prev.next = newNode;
        p.prev = newNode; 
        
        theSize++;
    }
         
    public AnyType remove(int idx)//n. inxdexteki elemanı siliyor.
    {
        if(idx < 0 || idx >= theSize)
            throw new IndexOutOfBoundsException("Index " + idx + "; size " + theSize);
        
        Node<AnyType> p = getNode(idx);
        p.prev.next = p.next;
        p.next.prev = p.prev;
        
        theSize--;
        
        return p.data;
    }
    
    public int size()//varsayım: size() fonksiyonu bana listenin boyutunu veriyor.
    {
        return theSize;
    }
    
    public boolean isEmpty()//listenin boş olup olmadğıını söylüyor.
    {
        return theSize == 0;
    }
    
    public void clear()//Listeyi boşaltır.
    {
        head = new Node<>(null, null, null);
        tail = new Node<>(head, null, null);
        head.next = tail;
        
        theSize = 0;
    }
      
    @Override
    public String toString()//string'e dönüştürme.
    {
        String rStr = "{<";

        Node<AnyType> temp = head.next;
        for(int i=0; i<theSize; i++)
        {    
            rStr = rStr + temp.data + " ";
            temp = temp.next;
        }    
        rStr = rStr + ">}";

        return rStr;
    }
   
    private Node<AnyType> getNode(int idx)//nodu'n sonucunu veriyor.
    {
        Node<AnyType> p;
            
        if( idx <= theSize / 2 )
        {
            p = head.next;
            for( int i = 0; i < idx; i++ )
                p = p.next;            
        }
        else
        {
            p = tail;
            for( int i = theSize; i > idx; i-- )
                p = p.prev;
        } 
        
        return p;
    }
       
    private class Node<AnyType>//nodu'n yapısı.
    {
        private Node<AnyType> prev;
        private AnyType data;
        private Node<AnyType> next;
        
        public Node(Node<AnyType> p, AnyType d, Node<AnyType> n)
        { 
            prev = p;
            data = d;
            next = n;
        }
    }
boolean equals(Object obje,MyLinkedList list){
            int size0 = list.size();
            size0 = size0-1;
            int count = 0;
                while(size0 >= 0){
                if(list.get(size0).equals(obje)){
                    
                    count = 1;   
                    }
            
    size0--;
}
            if(count == 1)
                return true;
            else
                return false;
}
}