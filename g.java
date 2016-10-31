class Solution {
    public int solution(int X) {
        String s;
        StringBuilder sb = new StringBuilder();
        s = Integer.toString(X);
        int num1 = 0, num2 = 0;
        int avg = 0;
        int max = 0, temp = 0;
        for (int i=0; i<s.length()-1; i++) {
            sb = new StringBuilder();
            num1 = Integer.parseInt(s.substring(i,i+1));
            num2 = Integer.parseInt(s.substring(i+1,i+2));
            avg = (int)Math.ceil((num1 + num2)/2.0);
            sb.append(s.substring(0,i)).append(Integer.toString(avg)).append(s.substring(i+2,s.length()));
            temp = Integer.parseInt(sb.toString());
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
