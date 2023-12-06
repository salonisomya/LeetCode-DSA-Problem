class Solution {
    public int totalMoney(int n) {
        int week = n/7;
        int extra = n%7;

        int sum = ((week * (week -1))/2)*7;
        sum = sum + week *28;
        sum = sum + ((extra *(extra + 1))/2) +(week * extra);
        return sum;
    }
}