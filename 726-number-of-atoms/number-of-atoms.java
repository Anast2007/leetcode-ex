class Solution {
    public String countOfAtoms(String formula) {
        Stack<Map<String,Integer>> stack=new Stack<>();
        stack.push(new TreeMap<>());
        int i=0;
        while(i<formula.length()){
            char c=formula.charAt(i);
             if(c=='('){
                stack.push(new TreeMap<>());
                i++;
            }
            else if(c==')'){
                i++;
                int num=0;
                while(i<formula.length()&&Character.isDigit(formula.charAt(i))){
                    num=num*10+formula.charAt(i)-'0';
                    i++;
                }
                if(num==0) num=1;
                 Map<String,Integer> map=stack.pop();
                 for(String key:map.keySet()){
                    map.put(key,map.get(key)*num);
                }
                for(String key:map.keySet()){
                    stack.peek().put(key,stack.peek().getOrDefault(key,0)+map.get(key));
                }
            }
            else{
                String atom="";
                atom+=c;
                i++;
                while(i<formula.length()&&Character.isLowerCase(formula.charAt(i))){
                    atom+=formula.charAt(i);
                    i++;
                }
                int num=0;
                while(i<formula.length()&&Character.isDigit(formula.charAt(i))){
                    num=num*10+formula.charAt(i)-'0';
                    i++;
                }
                if(num==0) num=1;
                 stack.peek().put(atom,stack.peek().getOrDefault(atom,0)+num);
            }
        }
         StringBuilder ans=new StringBuilder();
        for(String atom:stack.peek().keySet()){
            ans.append(atom);
            int count=stack.peek().get(atom);
            if(count>1)
                ans.append(count);
        }
        return ans.toString();
    }
}