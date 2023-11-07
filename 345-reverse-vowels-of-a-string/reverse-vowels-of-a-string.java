class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char[] arr = s.toCharArray();
        while(i<j){
           while(i<j && !vow(arr[i])){
               i++;
           }
           while(i<j && !vow(arr[j])){
               j--;
           }
           if(i<j){
               char temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j--;
           }
        }
        return new String(arr);

    }
    boolean vow(char ch){
        return ch == 'a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}