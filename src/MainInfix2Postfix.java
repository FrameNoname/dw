public class MainInfix2Postfix { 
 
    public static void main(String[] args) { 
        String operator = "+-*/"; 
        String expression = "(a+b-c)*d-(e+f)"; 
 
        System.out.println("Infix: " + expression); 
        // Create a char stack 
        ArrayStackChar stack = new ArrayStackChar(); 
        // split String to array of characters 
        char[] exp = expression.toCharArray(); 
 
        StringBuilder postfix = new StringBuilder(); 
 
        // For each character in the array 
        for (char c : exp) { 
            if (Character.isLetterOrDigit(c)) { 
                postfix.append(c);  
            }  
 
            else if (c == '(') { 
                stack.push(c); 
            }  
 
            else if (c == ')') { 
 
                while (!stack.isEmpty() && stack.peek() != '(') { 
                    postfix.append(stack.pop()); 
                } 
                stack.pop(); 
            }  
 
            else if (operator.indexOf(c) != -1) { 
                
                while (!stack.isEmpty() && precedence(stack.peek()) >= 
precedence(c)) { 
                    postfix.append(stack.pop()); 
                } 
                stack.push(c);  
            } 
        } 
 
        while (!stack.isEmpty()) { 
            postfix.append(stack.pop()); 
        } 
 
        System.out.println("\nPostfix: " + postfix.toString()); 
    } 
 
    public static int precedence(char operator) { 
        switch (operator) { 
case '+': 
case '-': 
return 1; 
case '*': 
case '/': 
return 2; 
default: 
return 0; 
} 
} 
}