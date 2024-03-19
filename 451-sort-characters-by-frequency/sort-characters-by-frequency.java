class Solution {
    public String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // 2
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        //3
        for(int i =0;i<list.size();i++){
            char ch = list.get(i);
            sb.append(String.valueOf(ch).repeat(map.get(ch)));
        }
        return sb.toString();
    }
}