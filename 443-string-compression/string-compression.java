class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        String str = "";
        int count =1;
        for(int i=0;i<n;i++){
            char ch = chars[i];
            while(i<n -1&& chars[i]==chars[i+1]){
                i++;
                count ++;
            }
            str = str+ch;
            if(count>1){
                str = str+count;
            }
            count =1;
        }
        System.out.println(str);
        char[] arr = str.toCharArray();
        for(int i=0;i<str.length();i++){
            chars[i] = arr[i];
        }
        return arr.length;

    }
}