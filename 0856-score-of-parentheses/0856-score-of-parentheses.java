class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (char c : s.toCharArray()) {

            if (c == '(') {
                st.push(0);
            } else {
                int currentScore = st.pop();

                int points = (currentScore == 0)
                        ? 1
                        : 2 * currentScore;

                st.push(st.pop()+points);
            }
        }

        return st.peek();
    }
}