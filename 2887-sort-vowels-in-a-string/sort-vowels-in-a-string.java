class Solution {
    public String sortVowels(String s) {
        char[] arr = s.toCharArray();
        int count =0;
        for(int i=0;i<s.length();i++){
            if(vow(arr[i])){
                count++;
            }
        }
        int k=0;
        char[] vowarr = new char[count];
        for(int i=0;i<arr.length;i++){
            if(vow(arr[i])){
                vowarr[k++] = arr[i];
            }
        }k=0;
        Arrays.sort(vowarr);
        for(int i=0;i<arr.length;i++){
            if(vow(arr[i])){
                arr[i]=vowarr[k++];
            }
        }
        
        return new String(arr);
    }
    boolean vow(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}