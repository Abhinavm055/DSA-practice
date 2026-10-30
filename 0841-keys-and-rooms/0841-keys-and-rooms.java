class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
           Stack<Integer> st=new Stack<>();
           st.push(0);
           HashSet<Integer> set=new HashSet<>();
           set.add(0);
           while(!st.isEmpty()){
            int i=st.pop();
            for(int j:rooms.get(i)){
                if(!set.contains(j)){
                    st.push(j);
                    set.add(j);
                    if(rooms.size()==set.size()){
                        return true;
                    }
                }
            }
           }
           return rooms.size()==set.size();
    }
}