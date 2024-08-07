class Solution {
public:

    stack<char> s;
    bool isMatchingParenthesis(char c1,char c2){
        if(c1 == '(' && c2 == ')'){
            return true;
        }else if(c1 == '{' && c2 == '}'){
            return true;
        }else if(c1 == '[' && c2 == ']'){
            return true;
        }else{
            return false;
        }
    }

   
    bool isValid(string str) {
        for (int i = 0; i < str.length(); i++) {
            if (str[i] == '(' || str[i] == '{' || str[i] == '[') {
                s.push(str[i]);
            } else if (str[i] == ')' || str[i] == '}' || str[i] == ']') {
                if (s.empty()) {
                    return false;
                } else if (!isMatchingParenthesis(s.top(), str[i])) {
                    return false;
                } else {
                    s.pop(); // Only pop if it's a matching parenthesis
                }
            }
        }
        return s.empty(); // Check if stack is empty at the end
    }
};