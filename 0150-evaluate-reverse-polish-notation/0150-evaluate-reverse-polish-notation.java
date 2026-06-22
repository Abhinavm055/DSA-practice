class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String ch : tokens) {
            if (!ch.equals("+") && !ch.equals("-") &&
                !ch.equals("*") && !ch.equals("/")) {
                st.push(Integer.parseInt(ch));
            } else {
                int val1 = st.pop();
                int val2 = st.pop();
                switch (ch) {
                    case "+":
                        st.push(val2 + val1);
                        break;
                    case "-":
                        st.push(val2 - val1);
                        break;
                    case "*":
                        st.push(val2 * val1);
                        break;
                    case "/":
                        st.push(val2 / val1);
                        break;
                }
            }
        }
        return st.pop();
    }
}