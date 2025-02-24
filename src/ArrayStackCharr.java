class ArrayStackCharr { 
    // ------------ Data ------------------- 
    private final static int CAPACITY = 10;  // default size 
    private char[] data;                    // array for stack data 
    private int size = 0;                    // stack's size 
 
    // ------------ Method ------------------- 
    // constructor with default capacity 
    public ArrayStackCharr() { 
        data = new char[CAPACITY]; 
    } 
 
    // constructor with a given capacity 
    public ArrayStackCharr(int capacity) { 
        data = new char[capacity]; 
    } 
 
    // current stack's size, not a capacity 
    public int getSize() { 
        return size; 
    } 
 
    // empty? 
    public boolean isEmpty() { 
        return size == 0;  
    } 
 
    // push 
    public void push(char e) { 
        if (size == data.length) { 
            resize(); 
        } 
        data[size] = e; 
        size++;  
    } 
 
    // peek 
    public char peek() { 
        if (size == 0) { 
            return '\0';  
        } 
        return data[size - 1];  
    } 
 
    // pop 
    public char pop() { 
        if (isEmpty()) { 
            return '\0';  
        } 
        char element = data[size - 1]; 
        size--; 
        return element; 
    } 
 
    // resize 
    public void resize() { 
        System.out.println("Doubling stack's size"); 
        // Create a new array of double the size 
        char[] temp = new char[2 * data.length]; 
        // Copy old array data to new array 
        System.arraycopy(data, 0, temp, 0, data.length); 
        // Assign the stack to the new array 
        data = temp; 
    } 
} 