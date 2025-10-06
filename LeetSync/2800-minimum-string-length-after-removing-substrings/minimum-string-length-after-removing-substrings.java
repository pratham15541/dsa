class Solution {
    public int minLength(String s) {
      Stack<Character>box=new Stack<>();
        for(char c:s.toCharArray()){
            if(!box.isEmpty()&&((c=='B'&&box.peek()=='A')||(c=='D'&&box.peek()=='C'))){
                box.pop();
            }
            else{
                box.push(c);
            }
        }
        return box.size();
    }
}