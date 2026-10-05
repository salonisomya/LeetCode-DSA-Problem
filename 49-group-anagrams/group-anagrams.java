class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String newstr = new String(arr);

            if(!map.containsKey(newstr)){
                map.put(newstr, new ArrayList<>());
            }
            map.get(newstr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}