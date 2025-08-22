//count length of last word in string leetcode:58
class Solution {
    public int lengthOfLastWord(String s) {
        int length=s.length();
        int cnt=0;
        for(int i=length-1;i>=0;i--)
        {char ch=s.charAt(i);
            if(ch!=' ')
            {
                cnt++;
            }
            else if(cnt>0) return cnt;
            else cnt=cnt;
        }
        return cnt;
    }
}
//roman to integer leetcode:13
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int total=0;
    int length=s.length();
    for(int i=0;i<length;i++){
        if(i<length-1 && hm.get(s.charAt(i))<hm.get(s.charAt(i+1))){
            total-=hm.get(s.charAt(i));
        } else {
            total+=hm.get(s.charAt(i));
        }
    }
    return total;

    }
}
// palindrome number leetcode:9
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int dup=x;
        int lastdigit;
        long rev=0;
        while(x>0)
        {
            lastdigit=x%10;
            x=x/10;
            rev=rev*10+lastdigit;
        }
        if(rev==dup)
        {
         return true;
        }
        else
        {
         return false;
        }
   }
}