class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String ,List<String>> map=new HashMap<>();
    
    for(String st:strs){
    char [] arr=st.toCharArray();
    // creates an array for each string i.e why it is inside the loop
    Arrays.sort(arr);
    String key=new String(arr);
    map.putIfAbsent(key,new ArrayList<>());
    // gets the list and then adds new elment to the list
    map.get(key).add(st);

    }
    return new ArrayList<>(map.values());
        
    }
}